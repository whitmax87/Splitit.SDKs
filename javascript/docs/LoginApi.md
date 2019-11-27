# SplititWebApiPublic.LoginApi

All URIs are relative to *https://webapi.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginGet**](LoginApi.md#loginGet) | **GET** /api/Login | 
[**loginPost**](LoginApi.md#loginPost) | **POST** /api/Login | 



## loginGet

> LoginResponse loginGet(opts)



### Example

```javascript
import SplititWebApiPublic from 'splitit_web_api_public';

let apiInstance = new SplititWebApiPublic.LoginApi();
let opts = {
  'userName': "userName_example", // String | 
  'password': "password_example" // String | 
};
apiInstance.loginGet(opts, (error, data, response) => {
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
 **userName** | **String**|  | [optional] 
 **password** | **String**|  | [optional] 

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## loginPost

> LoginResponse loginPost(request)



### Example

```javascript
import SplititWebApiPublic from 'splitit_web_api_public';

let apiInstance = new SplititWebApiPublic.LoginApi();
let request = new SplititWebApiPublic.LoginRequest(); // LoginRequest | 
apiInstance.loginPost(request, (error, data, response) => {
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
 **request** | [**LoginRequest**](LoginRequest.md)|  | 

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, application/_*+json
- **Accept**: text/plain, application/json, text/json

