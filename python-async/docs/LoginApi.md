# splitit_async.LoginApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login_post**](LoginApi.md#login_post) | **POST** /api/login | 


# **login_post**
> LoginResponse login_post(request)



### Example
```python
from __future__ import print_function
import time
import splitit_async
from splitit_async.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_async.LoginApi()
request = splitit_async.LoginRequest() # LoginRequest | 

try:
    api_response = api_instance.login_post(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LoginApi->login_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LoginRequest**](LoginRequest.md)|  | 

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

