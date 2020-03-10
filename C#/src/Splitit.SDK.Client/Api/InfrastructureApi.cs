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
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Splitit.SDK.Client.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IInfrastructureApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>GetResourcesResponse</returns>
        GetResourcesResponse InfrastructureGetResources (GetResourcesRequest request);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>ApiResponse of GetResourcesResponse</returns>
        ApiResponse<GetResourcesResponse> InfrastructureGetResourcesWithHttpInfo (GetResourcesRequest request);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>Task of GetResourcesResponse</returns>
        System.Threading.Tasks.Task<GetResourcesResponse> InfrastructureGetResourcesAsync (GetResourcesRequest request);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>Task of ApiResponse (GetResourcesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetResourcesResponse>> InfrastructureGetResourcesAsyncWithHttpInfo (GetResourcesRequest request);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class InfrastructureApi : IInfrastructureApi
    {
        private Splitit.SDK.Client.Client.ExceptionFactory _exceptionFactory = (name, response) => null;
		private string _apiKey;
		private string _sessionId;

        public string Culture { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="InfrastructureApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public InfrastructureApi(Splitit.SDK.Client.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Splitit.SDK.Client.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Splitit.SDK.Client.Client.Configuration.DefaultExceptionFactory;
			
			this._apiKey = this.Configuration.ApiKey;
        }
		
		/// <summary>
        /// Initializes a new instance of the <see cref="InfrastructureApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public InfrastructureApi(
			Splitit.SDK.Client.Client.Configuration configuration = null,
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
        public Splitit.SDK.Client.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Splitit.SDK.Client.Client.ExceptionFactory ExceptionFactory
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
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>GetResourcesResponse</returns>
        public GetResourcesResponse InfrastructureGetResources (GetResourcesRequest request)
        {
             ApiResponse<GetResourcesResponse> localVarResponse = InfrastructureGetResourcesWithHttpInfo(request);
             localVarResponse.Validate();
             return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>ApiResponse of GetResourcesResponse</returns>
        public ApiResponse< GetResourcesResponse > InfrastructureGetResourcesWithHttpInfo (GetResourcesRequest request)
        {
            // verify the required parameter 'request' is set
            if (request == null)
                throw new ApiException(400, "Missing required parameter 'request' when calling InfrastructureApi->InfrastructureGetResources");

            var localVarPath = "./api/Infrastructure/GetResources";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json-patch+json", 
                "application/json", 
                "text/json", 
                "application/_*+json"
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

            if (request != null && request.GetType() != typeof(byte[]))
            {
				this.Configuration.ApiClient.InjectAuthIfNotExists(apiKey: this._apiKey, sessionId: this._sessionId, culture: this.Culture, request: request);
                localVarPostBody = this.Configuration.ApiClient.Serialize(request); // http body (model) parameter
            }
            else
            {
                localVarPostBody = request; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("InfrastructureGetResources", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<GetResourcesResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                (GetResourcesResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(GetResourcesResponse)));
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>Task of GetResourcesResponse</returns>
        public async System.Threading.Tasks.Task<GetResourcesResponse> InfrastructureGetResourcesAsync (GetResourcesRequest request)
        {
             ApiResponse<GetResourcesResponse> localVarResponse = await InfrastructureGetResourcesAsyncWithHttpInfo(request);
             localVarResponse.Validate();
             return localVarResponse.Data;

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Splitit.SDK.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="request"></param>
        /// <returns>Task of ApiResponse (GetResourcesResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<GetResourcesResponse>> InfrastructureGetResourcesAsyncWithHttpInfo (GetResourcesRequest request)
        {
            // verify the required parameter 'request' is set
            if (request == null)
                throw new ApiException(400, "Missing required parameter 'request' when calling InfrastructureApi->InfrastructureGetResources");

            var localVarPath = "./api/Infrastructure/GetResources";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json-patch+json", 
                "application/json", 
                "text/json", 
                "application/_*+json"
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

            if (request != null && request.GetType() != typeof(byte[]))
            {
				this.Configuration.ApiClient.InjectAuthIfNotExists(apiKey: this._apiKey, sessionId: this._sessionId, culture: this.Culture, request: request);
                localVarPostBody = this.Configuration.ApiClient.Serialize(request); // http body (model) parameter
            }
            else
            {
                localVarPostBody = request; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("InfrastructureGetResources", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<GetResourcesResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                (GetResourcesResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(GetResourcesResponse)));
        }

    }
}
