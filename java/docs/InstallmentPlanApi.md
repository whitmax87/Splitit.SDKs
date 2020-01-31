# InstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installmentPlanApprove**](InstallmentPlanApi.md#installmentPlanApprove) | **POST** /api/InstallmentPlan/Approve | 
[**installmentPlanCancel**](InstallmentPlanApi.md#installmentPlanCancel) | **POST** /api/InstallmentPlan/Cancel | 
[**installmentPlanCreate**](InstallmentPlanApi.md#installmentPlanCreate) | **POST** /api/InstallmentPlan/Create | 
[**installmentPlanGet**](InstallmentPlanApi.md#installmentPlanGet) | **POST** /api/InstallmentPlan/Get | 
[**installmentPlanGet3DSecureParameters**](InstallmentPlanApi.md#installmentPlanGet3DSecureParameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
[**installmentPlanGetExtended**](InstallmentPlanApi.md#installmentPlanGetExtended) | **POST** /api/InstallmentPlan/GetExtended | 
[**installmentPlanInitiate**](InstallmentPlanApi.md#installmentPlanInitiate) | **POST** /api/InstallmentPlan/Initiate | 
[**installmentPlanRefund**](InstallmentPlanApi.md#installmentPlanRefund) | **POST** /api/InstallmentPlan/Refund | 
[**installmentPlanStartInstallments**](InstallmentPlanApi.md#installmentPlanStartInstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**installmentPlanTermsAndConditions**](InstallmentPlanApi.md#installmentPlanTermsAndConditions) | **POST** /api/InstallmentPlan/TermsAndConditions | 
[**installmentPlanUpdate**](InstallmentPlanApi.md#installmentPlanUpdate) | **POST** /api/InstallmentPlan/Update | 
[**installmentPlanVerifyPayment**](InstallmentPlanApi.md#installmentPlanVerifyPayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 


<a name="installmentPlanApprove"></a>
# **installmentPlanApprove**
> InstallmentPlanResponse installmentPlanApprove(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
ApproveInstallmentPlanRequest request = new ApproveInstallmentPlanRequest(); // ApproveInstallmentPlanRequest | 
try {
    InstallmentPlanResponse result = apiInstance.installmentPlanApprove(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanApprove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ApproveInstallmentPlanRequest**](ApproveInstallmentPlanRequest.md)|  |

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanCancel"></a>
# **installmentPlanCancel**
> InstallmentPlanResponse installmentPlanCancel(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
CancelInstallmentPlanRequest request = new CancelInstallmentPlanRequest(); // CancelInstallmentPlanRequest | 
try {
    InstallmentPlanResponse result = apiInstance.installmentPlanCancel(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CancelInstallmentPlanRequest**](CancelInstallmentPlanRequest.md)|  |

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanCreate"></a>
# **installmentPlanCreate**
> CreateInstallmentsPlanResponse installmentPlanCreate(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
CreateInstallmentPlanRequest request = new CreateInstallmentPlanRequest(); // CreateInstallmentPlanRequest | 
try {
    CreateInstallmentsPlanResponse result = apiInstance.installmentPlanCreate(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateInstallmentPlanRequest**](CreateInstallmentPlanRequest.md)|  |

### Return type

[**CreateInstallmentsPlanResponse**](CreateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanGet"></a>
# **installmentPlanGet**
> GetInstallmentsPlanResponse installmentPlanGet(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
GetInstallmentsPlanSearchCriteriaRequest request = new GetInstallmentsPlanSearchCriteriaRequest(); // GetInstallmentsPlanSearchCriteriaRequest | 
try {
    GetInstallmentsPlanResponse result = apiInstance.installmentPlanGet(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentsPlanSearchCriteriaRequest**](GetInstallmentsPlanSearchCriteriaRequest.md)|  |

### Return type

[**GetInstallmentsPlanResponse**](GetInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanGet3DSecureParameters"></a>
# **installmentPlanGet3DSecureParameters**
> Get3DSecureParametersResponse installmentPlanGet3DSecureParameters(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
Get3DSecureParametersRequest request = new Get3DSecureParametersRequest(); // Get3DSecureParametersRequest | 
try {
    Get3DSecureParametersResponse result = apiInstance.installmentPlanGet3DSecureParameters(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanGet3DSecureParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Get3DSecureParametersRequest**](Get3DSecureParametersRequest.md)|  |

### Return type

[**Get3DSecureParametersResponse**](Get3DSecureParametersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanGetExtended"></a>
# **installmentPlanGetExtended**
> GetInstallmentsPlanExtendedResponse installmentPlanGetExtended(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
GetInstallmentsPlanSearchCriteriaRequest request = new GetInstallmentsPlanSearchCriteriaRequest(); // GetInstallmentsPlanSearchCriteriaRequest | 
try {
    GetInstallmentsPlanExtendedResponse result = apiInstance.installmentPlanGetExtended(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanGetExtended");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentsPlanSearchCriteriaRequest**](GetInstallmentsPlanSearchCriteriaRequest.md)|  |

### Return type

[**GetInstallmentsPlanExtendedResponse**](GetInstallmentsPlanExtendedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanInitiate"></a>
# **installmentPlanInitiate**
> InitiateInstallmentsPlanResponse installmentPlanInitiate(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
InitiateInstallmentPlanRequest request = new InitiateInstallmentPlanRequest(); // InitiateInstallmentPlanRequest | 
try {
    InitiateInstallmentsPlanResponse result = apiInstance.installmentPlanInitiate(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanInitiate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InitiateInstallmentPlanRequest**](InitiateInstallmentPlanRequest.md)|  |

### Return type

[**InitiateInstallmentsPlanResponse**](InitiateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanRefund"></a>
# **installmentPlanRefund**
> RefundInstallmentPlanResponse installmentPlanRefund(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
RefundPlanRequest request = new RefundPlanRequest(); // RefundPlanRequest | 
try {
    RefundInstallmentPlanResponse result = apiInstance.installmentPlanRefund(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RefundPlanRequest**](RefundPlanRequest.md)|  |

### Return type

[**RefundInstallmentPlanResponse**](RefundInstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanStartInstallments"></a>
# **installmentPlanStartInstallments**
> InstallmentPlanResponse installmentPlanStartInstallments(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
StartInstallmentsRequest request = new StartInstallmentsRequest(); // StartInstallmentsRequest | 
try {
    InstallmentPlanResponse result = apiInstance.installmentPlanStartInstallments(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanStartInstallments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StartInstallmentsRequest**](StartInstallmentsRequest.md)|  |

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanTermsAndConditions"></a>
# **installmentPlanTermsAndConditions**
> TermsAndConditionsGetResponse installmentPlanTermsAndConditions(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
TermsAndConditionsGetRequest request = new TermsAndConditionsGetRequest(); // TermsAndConditionsGetRequest | 
try {
    TermsAndConditionsGetResponse result = apiInstance.installmentPlanTermsAndConditions(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanTermsAndConditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TermsAndConditionsGetRequest**](TermsAndConditionsGetRequest.md)|  |

### Return type

[**TermsAndConditionsGetResponse**](TermsAndConditionsGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanUpdate"></a>
# **installmentPlanUpdate**
> UpdateInstallmentsPlanResponse installmentPlanUpdate(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
UpdateInstallmentPlanRequest request = new UpdateInstallmentPlanRequest(); // UpdateInstallmentPlanRequest | 
try {
    UpdateInstallmentsPlanResponse result = apiInstance.installmentPlanUpdate(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateInstallmentPlanRequest**](UpdateInstallmentPlanRequest.md)|  |

### Return type

[**UpdateInstallmentsPlanResponse**](UpdateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanVerifyPayment"></a>
# **installmentPlanVerifyPayment**
> VerifyPaymentResponse installmentPlanVerifyPayment(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;


InstallmentPlanApi apiInstance = new InstallmentPlanApi();
VerifyPaymentRequest request = new VerifyPaymentRequest(); // VerifyPaymentRequest | 
try {
    VerifyPaymentResponse result = apiInstance.installmentPlanVerifyPayment(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanVerifyPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VerifyPaymentRequest**](VerifyPaymentRequest.md)|  |

### Return type

[**VerifyPaymentResponse**](VerifyPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

