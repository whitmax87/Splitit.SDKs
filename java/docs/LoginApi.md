# LoginApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginGet**](LoginApi.md#loginGet) | **GET** /api/Login | 
[**loginPost**](LoginApi.md#loginPost) | **POST** /api/Login | 


<a name="loginGet"></a>
# **loginGet**
> LoginResponse loginGet(userName, password)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.LoginApi;


LoginApi apiInstance = new LoginApi();
String userName = "userName_example"; // String | 
String password = "password_example"; // String | 
try {
    LoginResponse result = apiInstance.loginGet(userName, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  | [optional]
 **password** | **String**|  | [optional]

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="loginPost"></a>
# **loginPost**
> LoginResponse loginPost(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.LoginApi;


LoginApi apiInstance = new LoginApi();
LoginRequest request = new LoginRequest(); // LoginRequest | 
try {
    LoginResponse result = apiInstance.loginPost(request);
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

