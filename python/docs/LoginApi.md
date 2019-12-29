# splitit_sdk_client.LoginApi

All URIs are relative to *https://webapi.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login_get**](LoginApi.md#login_get) | **GET** /api/Login | 
[**login_post**](LoginApi.md#login_post) | **POST** /api/Login | 


# **login_get**
> LoginResponse login_get(user_name=user_name, password=password)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.LoginApi()
user_name = 'user_name_example' # str |  (optional)
password = 'password_example' # str |  (optional)

try:
    api_response = api_instance.login_get(user_name=user_name, password=password)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LoginApi->login_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_name** | **str**|  | [optional] 
 **password** | **str**|  | [optional] 

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **login_post**
> LoginResponse login_post(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.LoginApi()
request = splitit_sdk_client.LoginRequest() # LoginRequest | 

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

