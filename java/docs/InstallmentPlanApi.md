# InstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installmentPlanApprove**](InstallmentPlanApi.md#installmentPlanApprove) | **POST** /api/InstallmentPlan/Approve | 
[**installmentPlanCancel**](InstallmentPlanApi.md#installmentPlanCancel) | **POST** /api/InstallmentPlan/Cancel | 
[**installmentPlanChargeBack**](InstallmentPlanApi.md#installmentPlanChargeBack) | **POST** /api/InstallmentPlan/ChargeBack | 
[**installmentPlanCreate**](InstallmentPlanApi.md#installmentPlanCreate) | **POST** /api/InstallmentPlan/Create | 
[**installmentPlanGet**](InstallmentPlanApi.md#installmentPlanGet) | **POST** /api/InstallmentPlan/Get | 
[**installmentPlanGet3DSecureParameters**](InstallmentPlanApi.md#installmentPlanGet3DSecureParameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
[**installmentPlanGetExtended**](InstallmentPlanApi.md#installmentPlanGetExtended) | **POST** /api/InstallmentPlan/GetExtended | 
[**installmentPlanGetFraudStatusDisplay**](InstallmentPlanApi.md#installmentPlanGetFraudStatusDisplay) | **POST** /api/InstallmentPlan/GetFraudStatusDisplay | 
[**installmentPlanGetInitiatedInstallmentPlanRequest**](InstallmentPlanApi.md#installmentPlanGetInitiatedInstallmentPlanRequest) | **POST** /api/InstallmentPlan/GetInitiatedInstallmentPlanRequest | 
[**installmentPlanGetLearnMoreDetails**](InstallmentPlanApi.md#installmentPlanGetLearnMoreDetails) | **POST** /api/InstallmentPlan/GetLearnMoreDetails | 
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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

<a name="installmentPlanChargeBack"></a>
# **installmentPlanChargeBack**
> InstallmentPlanResponse installmentPlanChargeBack(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
ChargebackRequest request = new ChargebackRequest(); // ChargebackRequest | 
try {
    InstallmentPlanResponse result = apiInstance.installmentPlanChargeBack(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanChargeBack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ChargebackRequest**](ChargebackRequest.md)|  |

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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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

<a name="installmentPlanGetFraudStatusDisplay"></a>
# **installmentPlanGetFraudStatusDisplay**
> GetFraudStatusDisplayResponse installmentPlanGetFraudStatusDisplay(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
GetFraudStatusDisplayRequest request = new GetFraudStatusDisplayRequest(); // GetFraudStatusDisplayRequest | 
try {
    GetFraudStatusDisplayResponse result = apiInstance.installmentPlanGetFraudStatusDisplay(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanGetFraudStatusDisplay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetFraudStatusDisplayRequest**](GetFraudStatusDisplayRequest.md)|  |

### Return type

[**GetFraudStatusDisplayResponse**](GetFraudStatusDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanGetInitiatedInstallmentPlanRequest"></a>
# **installmentPlanGetInitiatedInstallmentPlanRequest**
> GetInitiatedInstallmentPlanResponse installmentPlanGetInitiatedInstallmentPlanRequest(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
GetInitiatedInstallmentPlanRequest request = new GetInitiatedInstallmentPlanRequest(); // GetInitiatedInstallmentPlanRequest | 
try {
    GetInitiatedInstallmentPlanResponse result = apiInstance.installmentPlanGetInitiatedInstallmentPlanRequest(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanGetInitiatedInstallmentPlanRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInitiatedInstallmentPlanRequest**](GetInitiatedInstallmentPlanRequest.md)|  |

### Return type

[**GetInitiatedInstallmentPlanResponse**](GetInitiatedInstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="installmentPlanGetLearnMoreDetails"></a>
# **installmentPlanGetLearnMoreDetails**
> LearnMoreDetailsResponse installmentPlanGetLearnMoreDetails(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
LearnMoreDetailsRequest request = new LearnMoreDetailsRequest(); // LearnMoreDetailsRequest | 
try {
    LearnMoreDetailsResponse result = apiInstance.installmentPlanGetLearnMoreDetails(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanApi#installmentPlanGetLearnMoreDetails");
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

<a name="installmentPlanInitiate"></a>
# **installmentPlanInitiate**
> InitiateInstallmentsPlanResponse installmentPlanInitiate(request)



### Example
```java
// Import classes:
//import com.splitit.ApiException;
//import com.splitit.sdk.api.InstallmentPlanApi;
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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
import com.splitit.Configuration;
import com.splitit.sdk.api.LoginApi;

Configuration.addSandboxApiKey("_YOUR_API_KEY_");

LoginApi loginApi = new LoginApi(Configuration.sandbox());
LoginRequest loginReq = new LoginRequest()
    .userName("_YOUR_USERNAME_")
    .password("_YOUR_PASSWORD_");

LoginResponse loginResponse = loginApi.loginPost(loginReq);

InstallmentPlanApi apiInstance = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResponse.getSessionId());
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

