# Splitit.SDK.Client.Api.LogoutApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LogoutPost**](LogoutApi.md#logoutpost) | **POST** /api/logout | 


<a name="logoutpost"></a>
# **LogoutPost**
> LogoutResponse LogoutPost (LogoutRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class LogoutPostExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new LogoutApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new LogoutRequest(); // LogoutRequest | 

            try
            {
                LogoutResponse result = apiInstance.LogoutPost(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LogoutApi.LogoutPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LogoutRequest**](LogoutRequest.md)|  | 

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

