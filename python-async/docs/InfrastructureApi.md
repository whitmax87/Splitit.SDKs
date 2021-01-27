# splitit_async.InfrastructureApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infrastructure_get_resources**](InfrastructureApi.md#infrastructure_get_resources) | **POST** /api/Infrastructure/GetResources | 
[**infrastructure_get_resources2**](InfrastructureApi.md#infrastructure_get_resources2) | **GET** /api/Infrastructure/GetResources | 


# **infrastructure_get_resources**
> GetResourcesResponse infrastructure_get_resources(request)



### Example
```python
from __future__ import print_function
import time
import splitit_async
from splitit_async.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_async.InfrastructureApi()
request = splitit_async.GetResourcesRequest() # GetResourcesRequest | 

try:
    api_response = api_instance.infrastructure_get_resources(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InfrastructureApi->infrastructure_get_resources: %s\n" % e)
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **infrastructure_get_resources2**
> GetResourcesResponse infrastructure_get_resources2(api_key=api_key, session_id=session_id, merchant_code=merchant_code, culture_name=culture_name, touch_point_code=touch_point_code, system_text_categories=system_text_categories)



### Example
```python
from __future__ import print_function
import time
import splitit_async
from splitit_async.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_async.InfrastructureApi()
api_key = 'api_key_example' # str |  (optional)
session_id = 'session_id_example' # str |  (optional)
merchant_code = 'merchant_code_example' # str |  (optional)
culture_name = 'culture_name_example' # str |  (optional)
touch_point_code = 'touch_point_code_example' # str |  (optional)
system_text_categories = [splitit_async.SystemTextCategory()] # list[SystemTextCategory] |  (optional)

try:
    api_response = api_instance.infrastructure_get_resources2(api_key=api_key, session_id=session_id, merchant_code=merchant_code, culture_name=culture_name, touch_point_code=touch_point_code, system_text_categories=system_text_categories)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InfrastructureApi->infrastructure_get_resources2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**|  | [optional] 
 **session_id** | **str**|  | [optional] 
 **merchant_code** | **str**|  | [optional] 
 **culture_name** | **str**|  | [optional] 
 **touch_point_code** | **str**|  | [optional] 
 **system_text_categories** | [**list[SystemTextCategory]**](SystemTextCategory.md)|  | [optional] 

### Return type

[**GetResourcesResponse**](GetResourcesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

