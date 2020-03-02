# InfrastructureApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infrastructureGetResources**](InfrastructureApi.md#infrastructureGetResources) | **POST** /api/Infrastructure/GetResources | 


<a name="infrastructureGetResources"></a>
# **infrastructureGetResources**
> GetResourcesResponse infrastructureGetResources(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InfrastructureApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InfrastructureApi apiInstance = new InfrastructureApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
GetResourcesRequest request = new GetResourcesRequest(); // GetResourcesRequest | 
try {
    GetResourcesResponse result = apiInstance.infrastructureGetResources(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfrastructureApi#infrastructureGetResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetResourcesRequest**](GetResourcesRequest.md)|  |

### Return type

[**GetResourcesResponse**](GetResourcesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

