using Splitit.SDK.Client.Model;
using Splitit.SDK.Client.Api;
using System.Collections.Generic;
using System;

namespace Splitit.SDK.Client.Client
{
    public class FlexFields
    {
        private InstallmentPlanApi _api;
        private Configuration _env;

        private InitiateInstallmentPlanRequest _request = new InitiateInstallmentPlanRequest(){
            PlanData = new PlanData()
        };


        public static FlexFields Authenticate(Configuration env, string username, string password)
        {
            var ff = new FlexFields();
            ff._env = env;
            ff._api = new InstallmentPlanApi(env, sessionId: ff.GetSessionId(username, password));
            return ff;
        }
        public static FlexFields Authenticate(string apiKey, string username, string password, bool sandbox = false)
        {
            var env = sandbox ? Configuration.Sandbox : Configuration.Default;
            env.AddApiKey(apiKey);

            var ff = new FlexFields();
            ff._env = env;
            ff._api = new InstallmentPlanApi(env, sessionId: ff.GetSessionId(username, password));
            return ff;
        }

        public FlexFields AddCulture(string culture)
        {
            this._api.Culture = culture;
            return this;
        }

        public FlexFields AddInstallments(List<int> installmentOptions, int? defaultNumInstallments = null)
        {
            this._request.PlanData.NumberOfInstallments = defaultNumInstallments;

            if (this._request.PaymentWizardData == null)
            {
                this._request.PaymentWizardData = new PaymentWizardData();
            }

            this._request.PaymentWizardData.RequestedNumberOfInstallments = string.Join(",", installmentOptions);
            return this;
        }

        public FlexFields AddBillingInformation(AddressData addressData = null, ConsumerData consumerData = null)
        {
            this._request.BillingAddress = addressData;
            this._request.ConsumerData = consumerData;
            return this;
        }

        public FlexFields Add3DSecure(RedirectUrls redirectUrls)
        {
            this._request.PlanData.Attempt3DSecure = true;
            this._request.RedirectUrls = redirectUrls;
            return this;
        }

        public FlexFields AddCaptureSettings(
            bool? autoCapture = null, 
            decimal? firstInstallmentAmount = null,
            string currencyCode = null,
            DateTime? firstChargeDate = null)
        {
            this._request.PlanData.AutoCapture = autoCapture;
            
            if (firstInstallmentAmount != null){
                this._request.PlanData.FirstInstallmentAmount = new MoneyWithCurrencyCode(firstInstallmentAmount.Value, currencyCode);
            }
            
            this._request.PlanData.FirstChargeDate = firstChargeDate;
            return this;
        }

        public string GetPublicToken(decimal amount, string currencyCode)
        {
            this._request.PlanData.Amount = new MoneyWithCurrencyCode(amount, currencyCode);

            var initResponse = this._api.InstallmentPlanInitiate(this._request);
            return initResponse.PublicToken;
        }

        public bool VerifyPayment(string planNumber, decimal orderAmount)
        {
            var paymentVerificationResponse = this._api.InstallmentPlanVerifyPayment(new VerifyPaymentRequest(planNumber));
            if (paymentVerificationResponse.IsPaid == true && paymentVerificationResponse.OriginalAmountPaid == orderAmount)
            {
                return true;
            }

            return false;
        }

        private string GetSessionId(string username, string pass)
        {
            var loginApi = new LoginApi(this._env);
            var request = new LoginRequest(userName: username, password: pass);

            var loginResult = loginApi.LoginPost(request);
            return loginResult.SessionId;
            
        }
    }
}
