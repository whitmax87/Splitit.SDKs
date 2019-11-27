# Splitit.SDK.Client.Api.CreateInstallmentPlanApi

All URIs are relative to *https://webapi.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateInstallmentPlanGet**](CreateInstallmentPlanApi.md#createinstallmentplanget) | **GET** /api/CreateInstallmentPlan | 


<a name="createinstallmentplanget"></a>
# **CreateInstallmentPlanGet**
> CreateInstallmentPlanLegacyResponse CreateInstallmentPlanGet (decimal? amountBeforeFees = null, string apiKey = null, string avsAddress = null, string avsZip = null, string cardCvv = null, string cardExpMonth = null, string cardExpYear = null, string cardHolder = null, string cardNumber = null, int? cardTypeId = null, string consumerFullName = null, int? countryId = null, string email = null, int? installmentNumber = null, string paramX = null, string sessionId = null)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class CreateInstallmentPlanGetExample
    {
        public void main()
        {
            var apiInstance = new CreateInstallmentPlanApi();
            var amountBeforeFees = 8.14;  // decimal? |  (optional) 
            var apiKey = apiKey_example;  // string |  (optional) 
            var avsAddress = avsAddress_example;  // string |  (optional) 
            var avsZip = avsZip_example;  // string |  (optional) 
            var cardCvv = cardCvv_example;  // string |  (optional) 
            var cardExpMonth = cardExpMonth_example;  // string |  (optional) 
            var cardExpYear = cardExpYear_example;  // string |  (optional) 
            var cardHolder = cardHolder_example;  // string |  (optional) 
            var cardNumber = cardNumber_example;  // string |  (optional) 
            var cardTypeId = 56;  // int? |  (optional) 
            var consumerFullName = consumerFullName_example;  // string |  (optional) 
            var countryId = 56;  // int? |  (optional) 
            var email = email_example;  // string |  (optional) 
            var installmentNumber = 56;  // int? |  (optional) 
            var paramX = paramX_example;  // string |  (optional) 
            var sessionId = sessionId_example;  // string |  (optional) 

            try
            {
                CreateInstallmentPlanLegacyResponse result = apiInstance.CreateInstallmentPlanGet(amountBeforeFees, apiKey, avsAddress, avsZip, cardCvv, cardExpMonth, cardExpYear, cardHolder, cardNumber, cardTypeId, consumerFullName, countryId, email, installmentNumber, paramX, sessionId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CreateInstallmentPlanApi.CreateInstallmentPlanGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amountBeforeFees** | **decimal?**|  | [optional] 
 **apiKey** | **string**|  | [optional] 
 **avsAddress** | **string**|  | [optional] 
 **avsZip** | **string**|  | [optional] 
 **cardCvv** | **string**|  | [optional] 
 **cardExpMonth** | **string**|  | [optional] 
 **cardExpYear** | **string**|  | [optional] 
 **cardHolder** | **string**|  | [optional] 
 **cardNumber** | **string**|  | [optional] 
 **cardTypeId** | **int?**|  | [optional] 
 **consumerFullName** | **string**|  | [optional] 
 **countryId** | **int?**|  | [optional] 
 **email** | **string**|  | [optional] 
 **installmentNumber** | **int?**|  | [optional] 
 **paramX** | **string**|  | [optional] 
 **sessionId** | **string**|  | [optional] 

### Return type

[**CreateInstallmentPlanLegacyResponse**](CreateInstallmentPlanLegacyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

