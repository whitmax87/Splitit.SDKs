# LoginApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](LoginApi.md#loginPost) | **POST** /api/Login | 

<a name="loginPost"></a>
# **loginPost**
> LoginResponse loginPost(request)

### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.LoginApi;


Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest request = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

try {
    LoginResponse loginResponse = apiInstance.loginPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LoginRequest**](LoginRequest.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

Provide Username, Password and Api key. Later on, sessionId will be used combined with API key to access other resources.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

