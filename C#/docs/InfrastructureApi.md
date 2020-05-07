# Splitit.SDK.Client.Api.InfrastructureApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InfrastructureGetResources**](InfrastructureApi.md#infrastructuregetresources) | **POST** /api/Infrastructure/GetResources | 
[**InfrastructureGetResources2**](InfrastructureApi.md#infrastructuregetresources2) | **GET** /api/Infrastructure/GetResources | 


<a name="infrastructuregetresources"></a>
# **InfrastructureGetResources**
> GetResourcesResponse InfrastructureGetResources (GetResourcesRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InfrastructureGetResourcesExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InfrastructureApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetResourcesRequest(); // GetResourcesRequest | 

            try
            {
                GetResourcesResponse result = apiInstance.InfrastructureGetResources(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InfrastructureApi.InfrastructureGetResources: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetResourcesRequest**](GetResourcesRequest.md)|  | 

### Return type

[**GetResourcesResponse**](GetResourcesResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="infrastructuregetresources2"></a>
# **InfrastructureGetResources2**
> GetResourcesResponse InfrastructureGetResources2 (string apiKey = null, string sessionId = null, string merchantCode = null, string cultureName = null, string touchPointCode = null, List<SystemTextCategory> systemTextCategories = null)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InfrastructureGetResources2Example
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InfrastructureApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var apiKey = apiKey_example;  // string |  (optional) 
            var sessionId = sessionId_example;  // string |  (optional) 
            var merchantCode = merchantCode_example;  // string |  (optional) 
            var cultureName = cultureName_example;  // string |  (optional) 
            var touchPointCode = touchPointCode_example;  // string |  (optional) 
            var systemTextCategories = new List<SystemTextCategory>(); // List<SystemTextCategory> |  (optional) 

            try
            {
                GetResourcesResponse result = apiInstance.InfrastructureGetResources2(apiKey, sessionId, merchantCode, cultureName, touchPointCode, systemTextCategories);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InfrastructureApi.InfrastructureGetResources2: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**|  | [optional] 
 **sessionId** | **string**|  | [optional] 
 **merchantCode** | **string**|  | [optional] 
 **cultureName** | **string**|  | [optional] 
 **touchPointCode** | **string**|  | [optional] 
 **systemTextCategories** | [**List&lt;SystemTextCategory&gt;**](SystemTextCategory.md)|  | [optional] 

### Return type

[**GetResourcesResponse**](GetResourcesResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

