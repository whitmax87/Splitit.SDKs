using Splitit.SDK.Client.Model;
using Splitit.SDK.Client.Api;

namespace Splitit.SDK.Client.Client
{
    public class FlexFields
    {
        private Configuration _configuration;
        private string _sessionId;

        public static FlexFields Authenticate(Configuration env, string username, string password)
        {
            var ff = new FlexFields();
            ff._configuration = env;
            ff._sessionId = ff.GetSessionId(username, password);
            return ff;
        }
        public static FlexFields Authenticate(string apiKey, string username, string password, bool sandbox = false)
        {
            var ff = new FlexFields();
            ff._configuration = sandbox ? Configuration.Sandbox : Configuration.Default;
            ff._configuration.AddApiKey(apiKey);

            ff._sessionId = ff.GetSessionId(username, password);
            return ff;
        }

        public string GetPublicToken(decimal amount, string currencyCode, string culture = null)
        {
            var installmentPlanApi = new InstallmentPlanApi(this._configuration, sessionId: this._sessionId);

            if (culture != null)
            {
                installmentPlanApi.Culture = culture;
            }

            var claimTokenResponse = installmentPlanApi.InstallmentPlanCreatePublicToken(new PublicTokenRequest(){
                Amount = new MoneyWithCurrencyCode(amount, currencyCode)
            });

            return claimTokenResponse.PublicToken;
        }

        public bool VerifyPayment(string planNumber, decimal orderAmount)
        {
            var installmentPlanApi = new InstallmentPlanApi(this._configuration, sessionId: this._sessionId);

            var paymentVerificationResponse = installmentPlanApi.InstallmentPlanVerifyPayment(new VerifyPaymentRequest(planNumber));
            if (paymentVerificationResponse.IsPaid == true && paymentVerificationResponse.OriginalAmountPaid == orderAmount)
            {
                return true;
            }

            return false;
        }

        private string GetSessionId(string username, string pass)
        {
            var loginApi = new LoginApi(this._configuration);
            var request = new LoginRequest(userName: username, password: pass);

            var loginResult = loginApi.LoginPost(request);
            return loginResult.SessionId;
            
        }
    }
}
