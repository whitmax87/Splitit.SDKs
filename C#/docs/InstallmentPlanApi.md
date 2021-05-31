# Splitit.SDK.Client.Api.InstallmentPlanApi

All URIs are relative to *https://webapi.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InstallmentPlanApprove**](InstallmentPlanApi.md#installmentplanapprove) | **POST** /api/InstallmentPlan/Approve | 
[**InstallmentPlanCancel**](InstallmentPlanApi.md#installmentplancancel) | **POST** /api/InstallmentPlan/Cancel | 
[**InstallmentPlanChargeBack**](InstallmentPlanApi.md#installmentplanchargeback) | **POST** /api/InstallmentPlan/ChargeBack | 
[**InstallmentPlanCreate**](InstallmentPlanApi.md#installmentplancreate) | **POST** /api/InstallmentPlan/Create | 
[**InstallmentPlanGet**](InstallmentPlanApi.md#installmentplanget) | **POST** /api/InstallmentPlan/Get | 
[**InstallmentPlanGet3DSecureParameters**](InstallmentPlanApi.md#installmentplanget3dsecureparameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
[**InstallmentPlanGetExtended**](InstallmentPlanApi.md#installmentplangetextended) | **POST** /api/InstallmentPlan/GetExtended | 
[**InstallmentPlanGetFraudStatusDisplay**](InstallmentPlanApi.md#installmentplangetfraudstatusdisplay) | **POST** /api/InstallmentPlan/GetFraudStatusDisplay | 
[**InstallmentPlanGetInitiatedInstallmentPlanRequest**](InstallmentPlanApi.md#installmentplangetinitiatedinstallmentplanrequest) | **POST** /api/InstallmentPlan/GetInitiatedInstallmentPlanRequest | 
[**InstallmentPlanGetInitiatedUpdatePaymentData**](InstallmentPlanApi.md#installmentplangetinitiatedupdatepaymentdata) | **GET** /api/InstallmentPlan/GetInitiatedUpdatePaymentData | 
[**InstallmentPlanGetLearnMoreDetails**](InstallmentPlanApi.md#installmentplangetlearnmoredetails) | **POST** /api/InstallmentPlan/GetLearnMoreDetails | 
[**InstallmentPlanGetPGTL**](InstallmentPlanApi.md#installmentplangetpgtl) | **POST** /api/InstallmentPlan/GetPGTL | 
[**InstallmentPlanGetSchedules**](InstallmentPlanApi.md#installmentplangetschedules) | **POST** /api/InstallmentPlan/GetSchedules | 
[**InstallmentPlanInitiate**](InstallmentPlanApi.md#installmentplaninitiate) | **POST** /api/InstallmentPlan/Initiate | 
[**InstallmentPlanRefund**](InstallmentPlanApi.md#installmentplanrefund) | **POST** /api/InstallmentPlan/Refund | 
[**InstallmentPlanRequestPayment**](InstallmentPlanApi.md#installmentplanrequestpayment) | **POST** /api/InstallmentPlan/RequestPayment | 
[**InstallmentPlanStartInstallments**](InstallmentPlanApi.md#installmentplanstartinstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**InstallmentPlanTermsAndConditions**](InstallmentPlanApi.md#installmentplantermsandconditions) | **POST** /api/InstallmentPlan/TermsAndConditions | 
[**InstallmentPlanTestCard**](InstallmentPlanApi.md#installmentplantestcard) | **POST** /api/InstallmentPlan/TestCard | 
[**InstallmentPlanUpdate**](InstallmentPlanApi.md#installmentplanupdate) | **POST** /api/InstallmentPlan/Update | 
[**InstallmentPlanVerifyPayment**](InstallmentPlanApi.md#installmentplanverifypayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 


<a name="installmentplanapprove"></a>
# **InstallmentPlanApprove**
> InstallmentPlanResponse InstallmentPlanApprove (ApproveInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanApproveExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new ApproveInstallmentPlanRequest(); // ApproveInstallmentPlanRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanApprove(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanApprove: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ApproveInstallmentPlanRequest**](ApproveInstallmentPlanRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplancancel"></a>
# **InstallmentPlanCancel**
> InstallmentPlanResponse InstallmentPlanCancel (CancelInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanCancelExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new CancelInstallmentPlanRequest(); // CancelInstallmentPlanRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanCancel(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanCancel: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CancelInstallmentPlanRequest**](CancelInstallmentPlanRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanchargeback"></a>
# **InstallmentPlanChargeBack**
> InstallmentPlanResponse InstallmentPlanChargeBack (ChargebackRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanChargeBackExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new ChargebackRequest(); // ChargebackRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanChargeBack(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanChargeBack: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ChargebackRequest**](ChargebackRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplancreate"></a>
# **InstallmentPlanCreate**
> CreateInstallmentsPlanResponse InstallmentPlanCreate (CreateInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanCreateExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new CreateInstallmentPlanRequest(); // CreateInstallmentPlanRequest | 

            try
            {
                CreateInstallmentsPlanResponse result = apiInstance.InstallmentPlanCreate(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanCreate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateInstallmentPlanRequest**](CreateInstallmentPlanRequest.md)|  | 

### Return type

[**CreateInstallmentsPlanResponse**](CreateInstallmentsPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanget"></a>
# **InstallmentPlanGet**
> GetInstallmentsPlanResponse InstallmentPlanGet (GetInstallmentsPlanSearchCriteriaRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetInstallmentsPlanSearchCriteriaRequest(); // GetInstallmentsPlanSearchCriteriaRequest | 

            try
            {
                GetInstallmentsPlanResponse result = apiInstance.InstallmentPlanGet(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentsPlanSearchCriteriaRequest**](GetInstallmentsPlanSearchCriteriaRequest.md)|  | 

### Return type

[**GetInstallmentsPlanResponse**](GetInstallmentsPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanget3dsecureparameters"></a>
# **InstallmentPlanGet3DSecureParameters**
> Get3DSecureParametersResponse InstallmentPlanGet3DSecureParameters (Get3DSecureParametersRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGet3DSecureParametersExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new Get3DSecureParametersRequest(); // Get3DSecureParametersRequest | 

            try
            {
                Get3DSecureParametersResponse result = apiInstance.InstallmentPlanGet3DSecureParameters(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGet3DSecureParameters: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**Get3DSecureParametersRequest**](Get3DSecureParametersRequest.md)|  | 

### Return type

[**Get3DSecureParametersResponse**](Get3DSecureParametersResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetextended"></a>
# **InstallmentPlanGetExtended**
> GetInstallmentsPlanExtendedResponse InstallmentPlanGetExtended (GetInstallmentsPlanSearchCriteriaRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetExtendedExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetInstallmentsPlanSearchCriteriaRequest(); // GetInstallmentsPlanSearchCriteriaRequest | 

            try
            {
                GetInstallmentsPlanExtendedResponse result = apiInstance.InstallmentPlanGetExtended(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetExtended: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentsPlanSearchCriteriaRequest**](GetInstallmentsPlanSearchCriteriaRequest.md)|  | 

### Return type

[**GetInstallmentsPlanExtendedResponse**](GetInstallmentsPlanExtendedResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetfraudstatusdisplay"></a>
# **InstallmentPlanGetFraudStatusDisplay**
> GetFraudStatusDisplayResponse InstallmentPlanGetFraudStatusDisplay (GetFraudStatusDisplayRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetFraudStatusDisplayExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetFraudStatusDisplayRequest(); // GetFraudStatusDisplayRequest | 

            try
            {
                GetFraudStatusDisplayResponse result = apiInstance.InstallmentPlanGetFraudStatusDisplay(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetFraudStatusDisplay: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetFraudStatusDisplayRequest**](GetFraudStatusDisplayRequest.md)|  | 

### Return type

[**GetFraudStatusDisplayResponse**](GetFraudStatusDisplayResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetinitiatedinstallmentplanrequest"></a>
# **InstallmentPlanGetInitiatedInstallmentPlanRequest**
> GetInitiatedInstallmentPlanResponse InstallmentPlanGetInitiatedInstallmentPlanRequest (GetInitiatedInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetInitiatedInstallmentPlanRequestExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetInitiatedInstallmentPlanRequest(); // GetInitiatedInstallmentPlanRequest | 

            try
            {
                GetInitiatedInstallmentPlanResponse result = apiInstance.InstallmentPlanGetInitiatedInstallmentPlanRequest(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetInitiatedInstallmentPlanRequest: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInitiatedInstallmentPlanRequest**](GetInitiatedInstallmentPlanRequest.md)|  | 

### Return type

[**GetInitiatedInstallmentPlanResponse**](GetInitiatedInstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetinitiatedupdatepaymentdata"></a>
# **InstallmentPlanGetInitiatedUpdatePaymentData**
> GetInitiatedUpdatePaymentDataResponse InstallmentPlanGetInitiatedUpdatePaymentData ()



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetInitiatedUpdatePaymentDataExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);

            try
            {
                GetInitiatedUpdatePaymentDataResponse result = apiInstance.InstallmentPlanGetInitiatedUpdatePaymentData();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetInitiatedUpdatePaymentData: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInitiatedUpdatePaymentDataResponse**](GetInitiatedUpdatePaymentDataResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetlearnmoredetails"></a>
# **InstallmentPlanGetLearnMoreDetails**
> LearnMoreDetailsResponse InstallmentPlanGetLearnMoreDetails (LearnMoreDetailsRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetLearnMoreDetailsExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new LearnMoreDetailsRequest(); // LearnMoreDetailsRequest | 

            try
            {
                LearnMoreDetailsResponse result = apiInstance.InstallmentPlanGetLearnMoreDetails(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetLearnMoreDetails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LearnMoreDetailsRequest**](LearnMoreDetailsRequest.md)|  | 

### Return type

[**LearnMoreDetailsResponse**](LearnMoreDetailsResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetpgtl"></a>
# **InstallmentPlanGetPGTL**
> GetPGTLResponse InstallmentPlanGetPGTL (GetPGTLRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetPGTLExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetPGTLRequest(); // GetPGTLRequest | 

            try
            {
                GetPGTLResponse result = apiInstance.InstallmentPlanGetPGTL(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetPGTL: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetPGTLRequest**](GetPGTLRequest.md)|  | 

### Return type

[**GetPGTLResponse**](GetPGTLResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplangetschedules"></a>
# **InstallmentPlanGetSchedules**
> GetInstallmentsScheduleResponse InstallmentPlanGetSchedules (GetInstallmentSchedulesRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanGetSchedulesExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new GetInstallmentSchedulesRequest(); // GetInstallmentSchedulesRequest | 

            try
            {
                GetInstallmentsScheduleResponse result = apiInstance.InstallmentPlanGetSchedules(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGetSchedules: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentSchedulesRequest**](GetInstallmentSchedulesRequest.md)|  | 

### Return type

[**GetInstallmentsScheduleResponse**](GetInstallmentsScheduleResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplaninitiate"></a>
# **InstallmentPlanInitiate**
> InitiateInstallmentsPlanResponse InstallmentPlanInitiate (InitiateInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanInitiateExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new InitiateInstallmentPlanRequest(); // InitiateInstallmentPlanRequest | 

            try
            {
                InitiateInstallmentsPlanResponse result = apiInstance.InstallmentPlanInitiate(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanInitiate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InitiateInstallmentPlanRequest**](InitiateInstallmentPlanRequest.md)|  | 

### Return type

[**InitiateInstallmentsPlanResponse**](InitiateInstallmentsPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanrefund"></a>
# **InstallmentPlanRefund**
> RefundInstallmentPlanResponse InstallmentPlanRefund (RefundPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanRefundExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new RefundPlanRequest(); // RefundPlanRequest | 

            try
            {
                RefundInstallmentPlanResponse result = apiInstance.InstallmentPlanRefund(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanRefund: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RefundPlanRequest**](RefundPlanRequest.md)|  | 

### Return type

[**RefundInstallmentPlanResponse**](RefundInstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanrequestpayment"></a>
# **InstallmentPlanRequestPayment**
> RequestPaymentResponse InstallmentPlanRequestPayment (RequestPaymentRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanRequestPaymentExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new RequestPaymentRequest(); // RequestPaymentRequest | 

            try
            {
                RequestPaymentResponse result = apiInstance.InstallmentPlanRequestPayment(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanRequestPayment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RequestPaymentRequest**](RequestPaymentRequest.md)|  | 

### Return type

[**RequestPaymentResponse**](RequestPaymentResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanstartinstallments"></a>
# **InstallmentPlanStartInstallments**
> InstallmentPlanResponse InstallmentPlanStartInstallments (StartInstallmentsRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanStartInstallmentsExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new StartInstallmentsRequest(); // StartInstallmentsRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanStartInstallments(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanStartInstallments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StartInstallmentsRequest**](StartInstallmentsRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplantermsandconditions"></a>
# **InstallmentPlanTermsAndConditions**
> TermsAndConditionsGetResponse InstallmentPlanTermsAndConditions (TermsAndConditionsGetRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanTermsAndConditionsExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new TermsAndConditionsGetRequest(); // TermsAndConditionsGetRequest | 

            try
            {
                TermsAndConditionsGetResponse result = apiInstance.InstallmentPlanTermsAndConditions(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanTermsAndConditions: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TermsAndConditionsGetRequest**](TermsAndConditionsGetRequest.md)|  | 

### Return type

[**TermsAndConditionsGetResponse**](TermsAndConditionsGetResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplantestcard"></a>
# **InstallmentPlanTestCard**
> InstallmentPlanResponse InstallmentPlanTestCard (TestCardRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanTestCardExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new TestCardRequest(); // TestCardRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanTestCard(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanTestCard: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TestCardRequest**](TestCardRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanupdate"></a>
# **InstallmentPlanUpdate**
> UpdateInstallmentsPlanResponse InstallmentPlanUpdate (UpdateInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanUpdateExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new UpdateInstallmentPlanRequest(); // UpdateInstallmentPlanRequest | 

            try
            {
                UpdateInstallmentsPlanResponse result = apiInstance.InstallmentPlanUpdate(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanUpdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateInstallmentPlanRequest**](UpdateInstallmentPlanRequest.md)|  | 

### Return type

[**UpdateInstallmentsPlanResponse**](UpdateInstallmentsPlanResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanverifypayment"></a>
# **InstallmentPlanVerifyPayment**
> VerifyPaymentResponse InstallmentPlanVerifyPayment (VerifyPaymentRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Api;
using Splitit.SDK.Client.Client;
using Splitit.SDK.Client.Model;

namespace Example
{
    public class InstallmentPlanVerifyPaymentExample
    {
        public void main()
        {
            Configuration.Sandbox.AddApiKey("_YOUR_API_KEY_");

            var loginApi = new LoginApi(Configuration.Sandbox);
            var request = new LoginRequest(userName: "_YOUR_USERNAME_", password: "_YOUR_PASSWORD_");

            // Each method also has Async alternative, example: await loginApi.LoginPostAsync(...)
            var loginResult = loginApi.LoginPost(request);
            
            var apiInstance = new InstallmentPlanApi(Configuration.Sandbox, sessionId: loginResult.SessionId);
            var request = new VerifyPaymentRequest(); // VerifyPaymentRequest | 

            try
            {
                VerifyPaymentResponse result = apiInstance.InstallmentPlanVerifyPayment(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanVerifyPayment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VerifyPaymentRequest**](VerifyPaymentRequest.md)|  | 

### Return type

[**VerifyPaymentResponse**](VerifyPaymentResponse.md)

### Authorization

Authorization is done through SessionId obtained from LoginApi and ApiKey.

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

