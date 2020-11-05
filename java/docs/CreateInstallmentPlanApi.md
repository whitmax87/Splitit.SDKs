# CreateInstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInstallmentPlanGet**](CreateInstallmentPlanApi.md#createInstallmentPlanGet) | **GET** /api/CreateInstallmentPlan | 


<a name="createInstallmentPlanGet"></a>
# **createInstallmentPlanGet**
> CreateInstallmentPlanLegacyResponse createInstallmentPlanGet(amountBeforeFees, apiKey, avsAddress, avsZip, cardCvv, cardExpMonth, cardExpYear, cardHolder, cardNumber, cardTypeId, consumerFullName, countryId, email, installmentNumber, paramX, sessionId)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.CreateInstallmentPlanApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

CreateInstallmentPlanApi apiInstance = new CreateInstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
BigDecimal amountBeforeFees = new BigDecimal(); // BigDecimal | 
String apiKey = "apiKey_example"; // String | 
String avsAddress = "avsAddress_example"; // String | 
String avsZip = "avsZip_example"; // String | 
String cardCvv = "cardCvv_example"; // String | 
String cardExpMonth = "cardExpMonth_example"; // String | 
String cardExpYear = "cardExpYear_example"; // String | 
String cardHolder = "cardHolder_example"; // String | 
String cardNumber = "cardNumber_example"; // String | 
Integer cardTypeId = 56; // Integer | 
String consumerFullName = "consumerFullName_example"; // String | 
Integer countryId = 56; // Integer | 
String email = "email_example"; // String | 
Integer installmentNumber = 56; // Integer | 
String paramX = "paramX_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    CreateInstallmentPlanLegacyResponse result = apiInstance.createInstallmentPlanGet(amountBeforeFees, apiKey, avsAddress, avsZip, cardCvv, cardExpMonth, cardExpYear, cardHolder, cardNumber, cardTypeId, consumerFullName, countryId, email, installmentNumber, paramX, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateInstallmentPlanApi#createInstallmentPlanGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amountBeforeFees** | **BigDecimal**|  | [optional]
 **apiKey** | **String**|  | [optional]
 **avsAddress** | **String**|  | [optional]
 **avsZip** | **String**|  | [optional]
 **cardCvv** | **String**|  | [optional]
 **cardExpMonth** | **String**|  | [optional]
 **cardExpYear** | **String**|  | [optional]
 **cardHolder** | **String**|  | [optional]
 **cardNumber** | **String**|  | [optional]
 **cardTypeId** | **Integer**|  | [optional]
 **consumerFullName** | **String**|  | [optional]
 **countryId** | **Integer**|  | [optional]
 **email** | **String**|  | [optional]
 **installmentNumber** | **Integer**|  | [optional]
 **paramX** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**CreateInstallmentPlanLegacyResponse**](CreateInstallmentPlanLegacyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

