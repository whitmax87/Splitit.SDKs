import * as api from './api/apis';
import * as model from './model/models';
import {Configuration} from './runtime';

export class FlexFields
{
    private _configuration: Configuration;

    private _request: model.InitiateInstallmentPlanRequest;
    private _api?: api.InstallmentPlanApi;

    constructor(configuration: Configuration){
        this._configuration = configuration;

        this._request = {
            planData: {}
        };
    }

    public static async authenticate(env: Configuration, username: string, password: string, apiKey?: string) : Promise<FlexFields> {
        if (apiKey){
            env.addApiKey(apiKey!);
        }

        let ff = new FlexFields(env);
        let sessionId = await ff.getSessionId(username, password);
        ff._api = new api.InstallmentPlanApi(env, sessionId);
        return ff;
    }

    public addCulture(culture: string){
        this._api!.setCulture(culture);
        return this;
    }

    public addInstallments(installmentOptions: Array<number>, defaultNumInstallments?: number) : FlexFields
    {
        this._request.planData!.numberOfInstallments = defaultNumInstallments;

        if (this._request.paymentWizardData == null)
        {
            this._request.paymentWizardData = <model.PaymentWizardData>{};
        }

        this._request.paymentWizardData.requestedNumberOfInstallments = installmentOptions.join(',');
        return this;
    }

    public addBillingInformation(billingAddress: model.AddressData, consumerData: model.ConsumerData) : FlexFields
    {
        this._request.billingAddress = billingAddress;
        this._request.consumerData = consumerData;
        return this;
    }

    public add3DSecure(redirectUrls: model.RedirectUrls) : FlexFields
    {
        let attempt3d = <any>true;
        this._request.planData!.attempt3DSecure = attempt3d;
        this._request.redirectUrls = redirectUrls;
        return this;
    }

    public addCaptureSettings(
        autoCapture?: boolean, 
        firstInstallmentAmount?: number,
        currencyCode?: string,
        firstChargeDate?: Date) : FlexFields
    {
        this._request.planData!.autoCapture = autoCapture;
        
        if (firstInstallmentAmount != null){
            this._request.planData!.firstInstallmentAmount = <model.MoneyWithCurrencyCode>{ value: firstInstallmentAmount, currencyCode: currencyCode };
        }
        
        this._request.planData!.firstChargeDate = firstChargeDate;
        return this;
    }

    public async getPublicToken(amount: number, currencyCode: string) : Promise<string> {
        this._request.planData!.amount = <model.MoneyWithCurrencyCode>{ value: amount, currencyCode: currencyCode };
        var initPlanResponse = await this._api!.installmentPlanInitiate(this._request);

        return initPlanResponse.body.publicToken!;
    }

    public async verifyPayment(planNumber: string, orderAmount: number) : Promise<boolean>
    {
        var paymentVerificationResponse = await this._api!.installmentPlanVerifyPayment(<model.VerifyPaymentRequest>{ 
            installmentPlanNumber: planNumber 
        });
        
        if (paymentVerificationResponse.body.isPaid && paymentVerificationResponse.body.originalAmountPaid == orderAmount)
        {
            return true;
        }

        return false;
    }


    private async getSessionId(username: string, pass: string) : Promise<string> {
        var loginApi = new api.LoginApi(this._configuration!);
        var request = <model.LoginRequest>{ userName: username, password: pass };

        var loginResult = await loginApi.loginPost(request);
        return loginResult.body.sessionId!;
    }
}