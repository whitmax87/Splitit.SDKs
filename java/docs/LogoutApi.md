# LogoutApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logoutPost**](LogoutApi.md#logoutPost) | **POST** /api/logout | 


<a name="logoutPost"></a>
# **logoutPost**
> LogoutResponse logoutPost(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.LogoutApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

LogoutApi apiInstance = new LogoutApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
LogoutRequest request = new LogoutRequest(); // LogoutRequest | 
try {
    LogoutResponse result = apiInstance.logoutPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutApi#logoutPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LogoutRequest**](LogoutRequest.md)|  |

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

