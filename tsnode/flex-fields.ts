import * as api from './api/apis';
import * as model from './model/models';
import {Configuration} from './runtime';

export class FlexFields
{
    private _configuration: Configuration;
    private _sessionId?: string;

    constructor(configuration: Configuration){
        this._configuration = configuration;
    }

    public static async authenticate(env: Configuration, username: string, password: string, apiKey?: string) : Promise<FlexFields> {
        if (apiKey){
            env.addApiKey(apiKey!);
        }

        let ff = new FlexFields(env);
        ff._sessionId = await ff.getSessionId(username, password);
        return ff;
    }

    public async getPublicToken(amount: number, currencyCode: string, culture?: string) : Promise<string> {
        var installmentPlanApi = new api.InstallmentPlanApi(this._configuration, this._sessionId);

        if (culture != null)
        {
            installmentPlanApi.setCulture(culture);
        }

        var claimTokenResponse = await installmentPlanApi.installmentPlanCreatePublicToken(<model.PublicTokenRequest>{
            amount: <model.MoneyWithCurrencyCode>{ value: amount, currencyCode: currencyCode }
        });

        return claimTokenResponse.body.publicToken!;
    }

    public async verifyPayment(planNumber: string, orderAmount: number) : Promise<boolean>
    {
        var installmentPlanApi = new api.InstallmentPlanApi(this._configuration, this._sessionId);

        var paymentVerificationResponse = await installmentPlanApi.installmentPlanVerifyPayment(<model.VerifyPaymentRequest>{ 
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