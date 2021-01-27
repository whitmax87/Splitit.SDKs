# splitit_async.CreateInstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_installment_plan_get**](CreateInstallmentPlanApi.md#create_installment_plan_get) | **GET** /api/CreateInstallmentPlan | 


# **create_installment_plan_get**
> CreateInstallmentPlanLegacyResponse create_installment_plan_get(amount_before_fees=amount_before_fees, api_key=api_key, avs_address=avs_address, avs_zip=avs_zip, card_cvv=card_cvv, card_exp_month=card_exp_month, card_exp_year=card_exp_year, card_holder=card_holder, card_number=card_number, card_type_id=card_type_id, consumer_full_name=consumer_full_name, country_id=country_id, email=email, installment_number=installment_number, param_x=param_x, session_id=session_id)



### Example
```python
from __future__ import print_function
import time
import splitit_async
from splitit_async.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_async.CreateInstallmentPlanApi()
amount_before_fees = 8.14 # float |  (optional)
api_key = 'api_key_example' # str |  (optional)
avs_address = 'avs_address_example' # str |  (optional)
avs_zip = 'avs_zip_example' # str |  (optional)
card_cvv = 'card_cvv_example' # str |  (optional)
card_exp_month = 'card_exp_month_example' # str |  (optional)
card_exp_year = 'card_exp_year_example' # str |  (optional)
card_holder = 'card_holder_example' # str |  (optional)
card_number = 'card_number_example' # str |  (optional)
card_type_id = 56 # int |  (optional)
consumer_full_name = 'consumer_full_name_example' # str |  (optional)
country_id = 56 # int |  (optional)
email = 'email_example' # str |  (optional)
installment_number = 56 # int |  (optional)
param_x = 'param_x_example' # str |  (optional)
session_id = 'session_id_example' # str |  (optional)

try:
    api_response = api_instance.create_installment_plan_get(amount_before_fees=amount_before_fees, api_key=api_key, avs_address=avs_address, avs_zip=avs_zip, card_cvv=card_cvv, card_exp_month=card_exp_month, card_exp_year=card_exp_year, card_holder=card_holder, card_number=card_number, card_type_id=card_type_id, consumer_full_name=consumer_full_name, country_id=country_id, email=email, installment_number=installment_number, param_x=param_x, session_id=session_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreateInstallmentPlanApi->create_installment_plan_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amount_before_fees** | **float**|  | [optional] 
 **api_key** | **str**|  | [optional] 
 **avs_address** | **str**|  | [optional] 
 **avs_zip** | **str**|  | [optional] 
 **card_cvv** | **str**|  | [optional] 
 **card_exp_month** | **str**|  | [optional] 
 **card_exp_year** | **str**|  | [optional] 
 **card_holder** | **str**|  | [optional] 
 **card_number** | **str**|  | [optional] 
 **card_type_id** | **int**|  | [optional] 
 **consumer_full_name** | **str**|  | [optional] 
 **country_id** | **int**|  | [optional] 
 **email** | **str**|  | [optional] 
 **installment_number** | **int**|  | [optional] 
 **param_x** | **str**|  | [optional] 
 **session_id** | **str**|  | [optional] 

### Return type

[**CreateInstallmentPlanLegacyResponse**](CreateInstallmentPlanLegacyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

