# splitit.InstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installment_plan_approve**](InstallmentPlanApi.md#installment_plan_approve) | **POST** /api/InstallmentPlan/Approve | 
[**installment_plan_cancel**](InstallmentPlanApi.md#installment_plan_cancel) | **POST** /api/InstallmentPlan/Cancel | 
[**installment_plan_charge_back**](InstallmentPlanApi.md#installment_plan_charge_back) | **POST** /api/InstallmentPlan/ChargeBack | 
[**installment_plan_create**](InstallmentPlanApi.md#installment_plan_create) | **POST** /api/InstallmentPlan/Create | 
[**installment_plan_get**](InstallmentPlanApi.md#installment_plan_get) | **POST** /api/InstallmentPlan/Get | 
[**installment_plan_get3_d_secure_parameters**](InstallmentPlanApi.md#installment_plan_get3_d_secure_parameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
[**installment_plan_get_extended**](InstallmentPlanApi.md#installment_plan_get_extended) | **POST** /api/InstallmentPlan/GetExtended | 
[**installment_plan_get_fraud_status_display**](InstallmentPlanApi.md#installment_plan_get_fraud_status_display) | **POST** /api/InstallmentPlan/GetFraudStatusDisplay | 
[**installment_plan_get_initiated_installment_plan_request**](InstallmentPlanApi.md#installment_plan_get_initiated_installment_plan_request) | **POST** /api/InstallmentPlan/GetInitiatedInstallmentPlanRequest | 
[**installment_plan_get_initiated_update_payment_data**](InstallmentPlanApi.md#installment_plan_get_initiated_update_payment_data) | **GET** /api/InstallmentPlan/GetInitiatedUpdatePaymentData | 
[**installment_plan_get_learn_more_details**](InstallmentPlanApi.md#installment_plan_get_learn_more_details) | **POST** /api/InstallmentPlan/GetLearnMoreDetails | 
[**installment_plan_get_pgtl**](InstallmentPlanApi.md#installment_plan_get_pgtl) | **POST** /api/InstallmentPlan/GetPGTL | 
[**installment_plan_get_schedules**](InstallmentPlanApi.md#installment_plan_get_schedules) | **POST** /api/InstallmentPlan/GetSchedules | 
[**installment_plan_initiate**](InstallmentPlanApi.md#installment_plan_initiate) | **POST** /api/InstallmentPlan/Initiate | 
[**installment_plan_refund**](InstallmentPlanApi.md#installment_plan_refund) | **POST** /api/InstallmentPlan/Refund | 
[**installment_plan_start_installments**](InstallmentPlanApi.md#installment_plan_start_installments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**installment_plan_terms_and_conditions**](InstallmentPlanApi.md#installment_plan_terms_and_conditions) | **POST** /api/InstallmentPlan/TermsAndConditions | 
[**installment_plan_test_card**](InstallmentPlanApi.md#installment_plan_test_card) | **POST** /api/InstallmentPlan/TestCard | 
[**installment_plan_update**](InstallmentPlanApi.md#installment_plan_update) | **POST** /api/InstallmentPlan/Update | 
[**installment_plan_verify_payment**](InstallmentPlanApi.md#installment_plan_verify_payment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 


# **installment_plan_approve**
> InstallmentPlanResponse installment_plan_approve(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.ApproveInstallmentPlanRequest() # ApproveInstallmentPlanRequest | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.CancelInstallmentPlanRequest() # CancelInstallmentPlanRequest | 

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

# **installment_plan_charge_back**
> InstallmentPlanResponse installment_plan_charge_back(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.ChargebackRequest() # ChargebackRequest | 

try:
    api_response = api_instance.installment_plan_charge_back(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_charge_back: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_create**
> CreateInstallmentsPlanResponse installment_plan_create(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.CreateInstallmentPlanRequest() # CreateInstallmentPlanRequest | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.GetInstallmentsPlanSearchCriteriaRequest() # GetInstallmentsPlanSearchCriteriaRequest | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.Get3DSecureParametersRequest() # Get3DSecureParametersRequest | 

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

# **installment_plan_get_extended**
> GetInstallmentsPlanExtendedResponse installment_plan_get_extended(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.GetInstallmentsPlanSearchCriteriaRequest() # GetInstallmentsPlanSearchCriteriaRequest | 

try:
    api_response = api_instance.installment_plan_get_extended(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_extended: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get_fraud_status_display**
> GetFraudStatusDisplayResponse installment_plan_get_fraud_status_display(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.GetFraudStatusDisplayRequest() # GetFraudStatusDisplayRequest | 

try:
    api_response = api_instance.installment_plan_get_fraud_status_display(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_fraud_status_display: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get_initiated_installment_plan_request**
> GetInitiatedInstallmentPlanResponse installment_plan_get_initiated_installment_plan_request(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.GetInitiatedInstallmentPlanRequest() # GetInitiatedInstallmentPlanRequest | 

try:
    api_response = api_instance.installment_plan_get_initiated_installment_plan_request(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_initiated_installment_plan_request: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get_initiated_update_payment_data**
> GetInitiatedUpdatePaymentDataResponse installment_plan_get_initiated_update_payment_data()



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()

try:
    api_response = api_instance.installment_plan_get_initiated_update_payment_data()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_initiated_update_payment_data: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInitiatedUpdatePaymentDataResponse**](GetInitiatedUpdatePaymentDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get_learn_more_details**
> LearnMoreDetailsResponse installment_plan_get_learn_more_details(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.LearnMoreDetailsRequest() # LearnMoreDetailsRequest | 

try:
    api_response = api_instance.installment_plan_get_learn_more_details(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_learn_more_details: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get_pgtl**
> GetPGTLResponse installment_plan_get_pgtl(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.GetPGTLRequest() # GetPGTLRequest | 

try:
    api_response = api_instance.installment_plan_get_pgtl(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_pgtl: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetPGTLRequest**](GetPGTLRequest.md)|  | 

### Return type

[**GetPGTLResponse**](GetPGTLResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_get_schedules**
> GetInstallmentsScheduleResponse installment_plan_get_schedules(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.GetInstallmentSchedulesRequest() # GetInstallmentSchedulesRequest | 

try:
    api_response = api_instance.installment_plan_get_schedules(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_get_schedules: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentSchedulesRequest**](GetInstallmentSchedulesRequest.md)|  | 

### Return type

[**GetInstallmentsScheduleResponse**](GetInstallmentsScheduleResponse.md)

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.InitiateInstallmentPlanRequest() # InitiateInstallmentPlanRequest | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.RefundPlanRequest() # RefundPlanRequest | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.StartInstallmentsRequest() # StartInstallmentsRequest | 

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

# **installment_plan_terms_and_conditions**
> TermsAndConditionsGetResponse installment_plan_terms_and_conditions(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.TermsAndConditionsGetRequest() # TermsAndConditionsGetRequest | 

try:
    api_response = api_instance.installment_plan_terms_and_conditions(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_terms_and_conditions: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **installment_plan_test_card**
> InstallmentPlanResponse installment_plan_test_card(request)



### Example
```python
from __future__ import print_function
import time
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.TestCardRequest() # TestCardRequest | 

try:
    api_response = api_instance.installment_plan_test_card(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi->installment_plan_test_card: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TestCardRequest**](TestCardRequest.md)|  | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.UpdateInstallmentPlanRequest() # UpdateInstallmentPlanRequest | 

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
import splitit
from splitit.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit.InstallmentPlanApi()
request = splitit.VerifyPaymentRequest() # VerifyPaymentRequest | 

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

