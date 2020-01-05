# SplititJsSdk.InstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installmentPlanApprove**](InstallmentPlanApi.md#installmentPlanApprove) | **POST** /api/InstallmentPlan/Approve | 
[**installmentPlanCancel**](InstallmentPlanApi.md#installmentPlanCancel) | **POST** /api/InstallmentPlan/Cancel | 
[**installmentPlanCreate**](InstallmentPlanApi.md#installmentPlanCreate) | **POST** /api/InstallmentPlan/Create | 
[**installmentPlanGet**](InstallmentPlanApi.md#installmentPlanGet) | **POST** /api/InstallmentPlan/Get | 
[**installmentPlanGet3DSecureParameters**](InstallmentPlanApi.md#installmentPlanGet3DSecureParameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
[**installmentPlanInitiate**](InstallmentPlanApi.md#installmentPlanInitiate) | **POST** /api/InstallmentPlan/Initiate | 
[**installmentPlanRefund**](InstallmentPlanApi.md#installmentPlanRefund) | **POST** /api/InstallmentPlan/Refund | 
[**installmentPlanStartInstallments**](InstallmentPlanApi.md#installmentPlanStartInstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**installmentPlanUpdate**](InstallmentPlanApi.md#installmentPlanUpdate) | **POST** /api/InstallmentPlan/Update | 
[**installmentPlanVerifyPayment**](InstallmentPlanApi.md#installmentPlanVerifyPayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 



## installmentPlanApprove

> InstallmentPlanResponse installmentPlanApprove(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.ApproveInstallmentPlanRequest(); // ApproveInstallmentPlanRequest | 
apiInstance.installmentPlanApprove(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanCancel

> InstallmentPlanResponse installmentPlanCancel(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.CancelInstallmentPlanRequest(); // CancelInstallmentPlanRequest | 
apiInstance.installmentPlanCancel(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanCreate

> CreateInstallmentsPlanResponse installmentPlanCreate(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.CreateInstallmentPlanRequest(); // CreateInstallmentPlanRequest | 
apiInstance.installmentPlanCreate(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanGet

> GetInstallmentsPlanResponse installmentPlanGet(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.GetInstallmentsPlanSearchCriteriaRequest(); // GetInstallmentsPlanSearchCriteriaRequest | 
apiInstance.installmentPlanGet(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanGet3DSecureParameters

> Get3DSecureParametersResponse installmentPlanGet3DSecureParameters(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.Get3DSecureParametersRequest(); // Get3DSecureParametersRequest | 
apiInstance.installmentPlanGet3DSecureParameters(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanInitiate

> InitiateInstallmentsPlanResponse installmentPlanInitiate(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.InitiateInstallmentPlanRequest(); // InitiateInstallmentPlanRequest | 
apiInstance.installmentPlanInitiate(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanRefund

> RefundInstallmentPlanResponse installmentPlanRefund(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.RefundPlanRequest(); // RefundPlanRequest | 
apiInstance.installmentPlanRefund(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanStartInstallments

> InstallmentPlanResponse installmentPlanStartInstallments(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.StartInstallmentsRequest(); // StartInstallmentsRequest | 
apiInstance.installmentPlanStartInstallments(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanUpdate

> UpdateInstallmentsPlanResponse installmentPlanUpdate(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.UpdateInstallmentPlanRequest(); // UpdateInstallmentPlanRequest | 
apiInstance.installmentPlanUpdate(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## installmentPlanVerifyPayment

> VerifyPaymentResponse installmentPlanVerifyPayment(request)



### Example

```javascript
import SplititJsSdk from 'splitit_js_sdk';

let apiInstance = new SplititJsSdk.InstallmentPlanApi();
let request = new SplititJsSdk.VerifyPaymentRequest(); // VerifyPaymentRequest | 
apiInstance.installmentPlanVerifyPayment(request, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

