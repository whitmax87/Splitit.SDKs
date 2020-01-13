# splitit_sdk_client.InstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installment_plan_approve**](InstallmentPlanApi.md#installment_plan_approve) | **POST** /api/InstallmentPlan/Approve | 
[**installment_plan_cancel**](InstallmentPlanApi.md#installment_plan_cancel) | **POST** /api/InstallmentPlan/Cancel | 
[**installment_plan_create**](InstallmentPlanApi.md#installment_plan_create) | **POST** /api/InstallmentPlan/Create | 
[**installment_plan_get**](InstallmentPlanApi.md#installment_plan_get) | **POST** /api/InstallmentPlan/Get | 
[**installment_plan_get3_d_secure_parameters**](InstallmentPlanApi.md#installment_plan_get3_d_secure_parameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
[**installment_plan_initiate**](InstallmentPlanApi.md#installment_plan_initiate) | **POST** /api/InstallmentPlan/Initiate | 
[**installment_plan_refund**](InstallmentPlanApi.md#installment_plan_refund) | **POST** /api/InstallmentPlan/Refund | 
[**installment_plan_start_installments**](InstallmentPlanApi.md#installment_plan_start_installments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**installment_plan_update**](InstallmentPlanApi.md#installment_plan_update) | **POST** /api/InstallmentPlan/Update | 
[**installment_plan_verify_payment**](InstallmentPlanApi.md#installment_plan_verify_payment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 


# **installment_plan_approve**
> InstallmentPlanResponse installment_plan_approve(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.ApproveInstallmentPlanRequest() # ApproveInstallmentPlanRequest | 

try:
    api_response = api_instance.installment_plan_approve(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_approve: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_cancel**
> InstallmentPlanResponse installment_plan_cancel(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.CancelInstallmentPlanRequest() # CancelInstallmentPlanRequest | 

try:
    api_response = api_instance.installment_plan_cancel(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_cancel: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_create**
> CreateInstallmentsPlanResponse installment_plan_create(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.CreateInstallmentPlanRequest() # CreateInstallmentPlanRequest | 

try:
    api_response = api_instance.installment_plan_create(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_create: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get**
> GetInstallmentsPlanResponse installment_plan_get(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.GetInstallmentsPlanSearchCriteriaRequest() # GetInstallmentsPlanSearchCriteriaRequest | 

try:
    api_response = api_instance.installment_plan_get(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get3_d_secure_parameters**
> Get3DSecureParametersResponse installment_plan_get3_d_secure_parameters(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.Get3DSecureParametersRequest() # Get3DSecureParametersRequest | 

try:
    api_response = api_instance.installment_plan_get3_d_secure_parameters(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get3_d_secure_parameters: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_initiate**
> InitiateInstallmentsPlanResponse installment_plan_initiate(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.InitiateInstallmentPlanRequest() # InitiateInstallmentPlanRequest | 

try:
    api_response = api_instance.installment_plan_initiate(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_initiate: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_refund**
> RefundInstallmentPlanResponse installment_plan_refund(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.RefundPlanRequest() # RefundPlanRequest | 

try:
    api_response = api_instance.installment_plan_refund(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_refund: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_start_installments**
> InstallmentPlanResponse installment_plan_start_installments(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.StartInstallmentsRequest() # StartInstallmentsRequest | 

try:
    api_response = api_instance.installment_plan_start_installments(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_start_installments: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_update**
> UpdateInstallmentsPlanResponse installment_plan_update(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.UpdateInstallmentPlanRequest() # UpdateInstallmentPlanRequest | 

try:
    api_response = api_instance.installment_plan_update(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_update: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_verify_payment**
> VerifyPaymentResponse installment_plan_verify_payment(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InstallmentPlanApi()
request = splitit_sdk_client.VerifyPaymentRequest() # VerifyPaymentRequest | 

try:
    api_response = api_instance.installment_plan_verify_payment(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_verify_payment: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

