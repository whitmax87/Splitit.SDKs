# Splitit.SDK.Client.Api.TouchPointsApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TouchPointsFlexFieldsData**](TouchPointsApi.md#touchpointsflexfieldsdata) | **GET** /api/TouchPoints/SetupData/FlexFieldsData | 


<a name="touchpointsflexfieldsdata"></a>
# **TouchPointsFlexFieldsData**
> FlexFieldsDataResponse TouchPointsFlexFieldsData (string apiKey = null, string requestedNumberOfInstallments = null)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class TouchPointsFlexFieldsDataExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new TouchPointsApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var apiKey = apiKey_example;  // string |  (optional) 
            var requestedNumberOfInstallments = requestedNumberOfInstallments_example;  // string |  (optional) 

            try
            {
                FlexFieldsDataResponse result = apiInstance.TouchPointsFlexFieldsData(apiKey, requestedNumberOfInstallments);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TouchPointsApi.TouchPointsFlexFieldsData: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**|  | [optional] 
 **requestedNumberOfInstallments** | **string**|  | [optional] 

### Return type

[**FlexFieldsDataResponse**](FlexFieldsDataResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

