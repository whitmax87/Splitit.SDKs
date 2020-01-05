# Splitit.SDK.Client.Api.LoginApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LoginGet**](LoginApi.md#loginget) | **GET** /api/Login | 
[**LoginPost**](LoginApi.md#loginpost) | **POST** /api/Login | 


<a name="loginget"></a>
# **LoginGet**
> LoginResponse LoginGet (string userName = null, string password = null)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class LoginGetExample
    {
        public void main()
        {
            var apiInstance = new LoginApi();
            var userName = userName_example;  // string |  (optional) 
            var password = password_example;  // string |  (optional) 

            try
            {
                LoginResponse result = apiInstance.LoginGet(userName, password);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LoginApi.LoginGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **string**|  | [optional] 
 **password** | **string**|  | [optional] 

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="loginpost"></a>
# **LoginPost**
> LoginResponse LoginPost (LoginRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class LoginPostExample
    {
        public void main()
        {
            var apiInstance = new LoginApi();
            var request = new LoginRequest(); // LoginRequest | 

            try
            {
                LoginResponse result = apiInstance.LoginPost(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LoginApi.LoginPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LoginRequest**](LoginRequest.md)|  | 

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

