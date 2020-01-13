/* 
 * splitit-web-api-public-sdk
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp.Portable;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Splitit.SDK.Client.Portable.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICreateInstallmentPlanApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>CreateInstallmentPlanLegacyResponse</returns>
        CreateInstallmentPlanLegacyResponse CreateInstallmentPlanGet (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>ApiResponse of CreateInstallmentPlanLegacyResponse</returns>
        ApiResponse<CreateInstallmentPlanLegacyResponse> CreateInstallmentPlanGetWithHttpInfo (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>Task of CreateInstallmentPlanLegacyResponse</returns>
        System.Threading.Tasks.Task<CreateInstallmentPlanLegacyResponse> CreateInstallmentPlanGetAsync (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>Task of ApiResponse (CreateInstallmentPlanLegacyResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CreateInstallmentPlanLegacyResponse>> CreateInstallmentPlanGetAsyncWithHttpInfo (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CreateInstallmentPlanApi : ICreateInstallmentPlanApi
    {
        private Splitit.SDK.Client.Portable.Client.ExceptionFactory _exceptionFactory = (name, response) => null;
		private string _apiKey;
		private string _sessionId;

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateInstallmentPlanApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CreateInstallmentPlanApi(Splitit.SDK.Client.Portable.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Splitit.SDK.Client.Portable.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Splitit.SDK.Client.Portable.Client.Configuration.DefaultExceptionFactory;
			
			this._apiKey = this.Configuration.ApiKey;
        }
		
		/// <summary>
        /// Initializes a new instance of the <see cref="CreateInstallmentPlanApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CreateInstallmentPlanApi(
			Splitit.SDK.Client.Portable.Client.Configuration configuration = null,
			string sessionId = null)
			: this(configuration)
        {
			this._sessionId = sessionId;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Splitit.SDK.Client.Portable.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Splitit.SDK.Client.Portable.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>CreateInstallmentPlanLegacyResponse</returns>
        public CreateInstallmentPlanLegacyResponse CreateInstallmentPlanGet (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null)
        {
             ApiResponse<CreateInstallmentPlanLegacyResponse> localVarResponse = CreateInstallmentPlanGetWithHttpInfo(amountBeforeFees, apiKey, avsAddress, avsZip, cardCvv, cardExpMonth, cardExpYear, cardHolder, cardNumber, cardTypeId, consumerFullName, countryId, email, installmentNumber, paramX, sessionId);
             localVarResponse.Validate();
             return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>ApiResponse of CreateInstallmentPlanLegacyResponse</returns>
        public ApiResponse< CreateInstallmentPlanLegacyResponse > CreateInstallmentPlanGetWithHttpInfo (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null)
        {

            var localVarPath = "./api/CreateInstallmentPlan";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "text/plain",
                "application/json",
                "text/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (amountBeforeFees != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AmountBeforeFees", amountBeforeFees)); // query parameter
            if (apiKey != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ApiKey", apiKey)); // query parameter
            if (avsAddress != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AvsAddress", avsAddress)); // query parameter
            if (avsZip != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AvsZip", avsZip)); // query parameter
            if (cardCvv != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardCvv", cardCvv)); // query parameter
            if (cardExpMonth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardExpMonth", cardExpMonth)); // query parameter
            if (cardExpYear != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardExpYear", cardExpYear)); // query parameter
            if (cardHolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardHolder", cardHolder)); // query parameter
            if (cardNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardNumber", cardNumber)); // query parameter
            if (cardTypeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardTypeId", cardTypeId)); // query parameter
            if (consumerFullName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ConsumerFullName", consumerFullName)); // query parameter
            if (countryId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CountryId", countryId)); // query parameter
            if (email != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Email", email)); // query parameter
            if (installmentNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InstallmentNumber", installmentNumber)); // query parameter
            if (paramX != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParamX", paramX)); // query parameter
            if (sessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SessionId", sessionId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateInstallmentPlanGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CreateInstallmentPlanLegacyResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                (CreateInstallmentPlanLegacyResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(CreateInstallmentPlanLegacyResponse)));
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>Task of CreateInstallmentPlanLegacyResponse</returns>
        public async System.Threading.Tasks.Task<CreateInstallmentPlanLegacyResponse> CreateInstallmentPlanGetAsync (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null)
        {
             ApiResponse<CreateInstallmentPlanLegacyResponse> localVarResponse = await CreateInstallmentPlanGetAsyncWithHttpInfo(amountBeforeFees, apiKey, avsAddress, avsZip, cardCvv, cardExpMonth, cardExpYear, cardHolder, cardNumber, cardTypeId, consumerFullName, countryId, email, installmentNumber, paramX, sessionId);
             localVarResponse.Validate();
             return localVarResponse.Data;

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Portable.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="amountBeforeFees"> (optional)</param>
        /// <param name="apiKey"> (optional)</param>
        /// <param name="avsAddress"> (optional)</param>
        /// <param name="avsZip"> (optional)</param>
        /// <param name="cardCvv"> (optional)</param>
        /// <param name="cardExpMonth"> (optional)</param>
        /// <param name="cardExpYear"> (optional)</param>
        /// <param name="cardHolder"> (optional)</param>
        /// <param name="cardNumber"> (optional)</param>
        /// <param name="cardTypeId"> (optional)</param>
        /// <param name="consumerFullName"> (optional)</param>
        /// <param name="countryId"> (optional)</param>
        /// <param name="email"> (optional)</param>
        /// <param name="installmentNumber"> (optional)</param>
        /// <param name="paramX"> (optional)</param>
        /// <param name="sessionId"> (optional)</param>
        /// <returns>Task of ApiResponse (CreateInstallmentPlanLegacyResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<CreateInstallmentPlanLegacyResponse>> CreateInstallmentPlanGetAsyncWithHttpInfo (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null)
        {

            var localVarPath = "./api/CreateInstallmentPlan";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "text/plain",
                "application/json",
                "text/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (amountBeforeFees != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AmountBeforeFees", amountBeforeFees)); // query parameter
            if (apiKey != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ApiKey", apiKey)); // query parameter
            if (avsAddress != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AvsAddress", avsAddress)); // query parameter
            if (avsZip != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AvsZip", avsZip)); // query parameter
            if (cardCvv != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardCvv", cardCvv)); // query parameter
            if (cardExpMonth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardExpMonth", cardExpMonth)); // query parameter
            if (cardExpYear != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardExpYear", cardExpYear)); // query parameter
            if (cardHolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardHolder", cardHolder)); // query parameter
            if (cardNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardNumber", cardNumber)); // query parameter
            if (cardTypeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CardTypeId", cardTypeId)); // query parameter
            if (consumerFullName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ConsumerFullName", consumerFullName)); // query parameter
            if (countryId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CountryId", countryId)); // query parameter
            if (email != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Email", email)); // query parameter
            if (installmentNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InstallmentNumber", installmentNumber)); // query parameter
            if (paramX != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParamX", paramX)); // query parameter
            if (sessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SessionId", sessionId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateInstallmentPlanGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CreateInstallmentPlanLegacyResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                (CreateInstallmentPlanLegacyResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(CreateInstallmentPlanLegacyResponse)));
        }

    }
}