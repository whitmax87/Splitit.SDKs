# SplititWebApiPublic.CreateInstallmentPlanApi

All URIs are relative to *https://webapi.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInstallmentPlanGet**](CreateInstallmentPlanApi.md#createInstallmentPlanGet) | **GET** /api/CreateInstallmentPlan | 



## createInstallmentPlanGet

> CreateInstallmentPlanLegacyResponse createInstallmentPlanGet(opts)



### Example

```javascript
import SplititWebApiPublic from 'splitit_web_api_public';

let apiInstance = new SplititWebApiPublic.CreateInstallmentPlanApi();
let opts = {
  'amountBeforeFees': 3.4, // Number | 
  'apiKey': "apiKey_example", // String | 
  'avsAddress': "avsAddress_example", // String | 
  'avsZip': "avsZip_example", // String | 
  'cardCvv': "cardCvv_example", // String | 
  'cardExpMonth': "cardExpMonth_example", // String | 
  'cardExpYear': "cardExpYear_example", // String | 
  'cardHolder': "cardHolder_example", // String | 
  'cardNumber': "cardNumber_example", // String | 
  'cardTypeId': 56, // Number | 
  'consumerFullName': "consumerFullName_example", // String | 
  'countryId': 56, // Number | 
  'email': "email_example", // String | 
  'installmentNumber': 56, // Number | 
  'paramX': "paramX_example", // String | 
  'sessionId': "sessionId_example" // String | 
};
apiInstance.createInstallmentPlanGet(opts, (error, data, response) => {
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
 **amountBeforeFees** | **Number**|  | [optional] 
 **apiKey** | **String**|  | [optional] 
 **avsAddress** | **String**|  | [optional] 
 **avsZip** | **String**|  | [optional] 
 **cardCvv** | **String**|  | [optional] 
 **cardExpMonth** | **String**|  | [optional] 
 **cardExpYear** | **String**|  | [optional] 
 **cardHolder** | **String**|  | [optional] 
 **cardNumber** | **String**|  | [optional] 
 **cardTypeId** | **Number**|  | [optional] 
 **consumerFullName** | **String**|  | [optional] 
 **countryId** | **Number**|  | [optional] 
 **email** | **String**|  | [optional] 
 **installmentNumber** | **Number**|  | [optional] 
 **paramX** | **String**|  | [optional] 
 **sessionId** | **String**|  | [optional] 

### Return type

[**CreateInstallmentPlanLegacyResponse**](CreateInstallmentPlanLegacyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

