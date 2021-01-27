# splitit_async.LogoutApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logout_post**](LogoutApi.md#logout_post) | **POST** /api/logout | 


# **logout_post**
> LogoutResponse logout_post(request)



### Example
```python
from __future__ import print_function
import time
import splitit_async
from splitit_async.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_async.LogoutApi()
request = splitit_async.LogoutRequest() # LogoutRequest | 

try:
    api_response = api_instance.logout_post(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LogoutApi->logout_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LogoutRequest**](LogoutRequest.md)|  | 

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

