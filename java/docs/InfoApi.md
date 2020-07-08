# InfoApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoGetLearnMoreDetails**](InfoApi.md#infoGetLearnMoreDetails) | **POST** /api/Merchant/GetLearnMoreDetails | 


<a name="infoGetLearnMoreDetails"></a>
# **infoGetLearnMoreDetails**
> LearnMoreDetailsResponse infoGetLearnMoreDetails(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InfoApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InfoApi apiInstance = new InfoApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
LearnMoreDetailsRequest request = new LearnMoreDetailsRequest(); // LearnMoreDetailsRequest | 
try {
    LearnMoreDetailsResponse result = apiInstance.infoGetLearnMoreDetails(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#infoGetLearnMoreDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LearnMoreDetailsRequest**](LearnMoreDetailsRequest.md)|  |

### Return type

[**LearnMoreDetailsResponse**](LearnMoreDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

