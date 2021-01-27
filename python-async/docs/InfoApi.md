# splitit_async.InfoApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**info_get_learn_more_details**](InfoApi.md#info_get_learn_more_details) | **POST** /api/Merchant/GetLearnMoreDetails | 


# **info_get_learn_more_details**
> LearnMoreDetailsResponse info_get_learn_more_details(request)



### Example
```python
from __future__ import print_function
import time
import splitit_async
from splitit_async.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_async.InfoApi()
request = splitit_async.LearnMoreDetailsRequest() # LearnMoreDetailsRequest | 

try:
    api_response = api_instance.info_get_learn_more_details(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InfoApi->info_get_learn_more_details: %s\n" % e)
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

