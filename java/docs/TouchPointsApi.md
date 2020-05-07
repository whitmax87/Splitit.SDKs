# TouchPointsApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**touchPointsFlexFieldsData**](TouchPointsApi.md#touchPointsFlexFieldsData) | **GET** /api/TouchPoints/SetupData/FlexFieldsData | 


<a name="touchPointsFlexFieldsData"></a>
# **touchPointsFlexFieldsData**
> FlexFieldsDataResponse touchPointsFlexFieldsData(apiKey, requestedNumberOfInstallments)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.TouchPointsApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

TouchPointsApi apiInstance = new TouchPointsApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
String apiKey = "apiKey_example"; // String | 
String requestedNumberOfInstallments = "requestedNumberOfInstallments_example"; // String | 
try {
    FlexFieldsDataResponse result = apiInstance.touchPointsFlexFieldsData(apiKey, requestedNumberOfInstallments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TouchPointsApi#touchPointsFlexFieldsData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]
 **requestedNumberOfInstallments** | **String**|  | [optional]

### Return type

[**FlexFieldsDataResponse**](FlexFieldsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

