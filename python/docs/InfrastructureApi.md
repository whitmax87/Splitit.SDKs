# splitit_sdk_client.InfrastructureApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infrastructure_get_resources**](InfrastructureApi.md#infrastructure_get_resources) | **POST** /api/Infrastructure/GetResources | 


# **infrastructure_get_resources**
> GetResourcesResponse infrastructure_get_resources(request)



### Example
```python
from __future__ import print_function
import time
import splitit_sdk_client
from splitit_sdk_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = splitit_sdk_client.InfrastructureApi()
request = splitit_sdk_client.GetResourcesRequest() # GetResourcesRequest | 

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

