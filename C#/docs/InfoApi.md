# Splitit.SDK.Client.Api.InfoApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InfoGetLearnMoreDetails**](InfoApi.md#infogetlearnmoredetails) | **POST** /api/Merchant/GetLearnMoreDetails | 


<a name="infogetlearnmoredetails"></a>
# **InfoGetLearnMoreDetails**
> LearnMoreDetailsResponse InfoGetLearnMoreDetails (LearnMoreDetailsRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InfoGetLearnMoreDetailsExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InfoApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new LearnMoreDetailsRequest(); // LearnMoreDetailsRequest | 

            try
            {
                LearnMoreDetailsResponse result = apiInstance.InfoGetLearnMoreDetails(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InfoApi.InfoGetLearnMoreDetails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LearnMoreDetailsRequest**](LearnMoreDetailsRequest.md)|  | 

### Return type

[**LearnMoreDetailsResponse**](LearnMoreDetailsResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

