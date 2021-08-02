# Splitit.SDK.Client.Model.InstallmentPlanQueryCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MerchantId** | **long?** |  | 
**CurrencyId** | **long?** |  | 
**InstallmentPlanId** | **long?** |  | 
**InstallmentPlanNumber** | **string** |  | [optional] 
**RefOrderNumber** | **string** |  | [optional] 
**InstallmentPlanAmount** | **decimal?** |  | 
**CardNumber** | **string** |  | [optional] 
**ConsumerName** | **string** |  | [optional] 
**ConsumerEmail** | **string** |  | [optional] 
**CardHolder** | **string** |  | [optional] 
**PisMemberId** | **long?** |  | 
**AnyFilter** | **string** |  | [optional] 
**Eula** | **bool?** |  | 
**ShowChargebackPlans** | **bool?** |  | 
**IsInAutoRetry** | **bool?** |  | [optional] 
**Strategy** | **PlanStrategy** |  | [optional] 
**InitiatedStatuses** | [**InstallmentPlanInitiatedStatuses**](InstallmentPlanInitiatedStatuses.md) |  | [optional] 
**FraudCheckResult** | **FraudCheckResult** |  | [optional] 
**InstallmentsPlanStatuses** | [**List&lt;InstallmentPlanStatus&gt;**](InstallmentPlanStatus.md) |  | [optional] 
**TestModes** | [**List&lt;TestModes&gt;**](TestModes.md) |  | [optional] 
**DelayResolutions** | [**List&lt;DelayResolution&gt;**](DelayResolution.md) |  | [optional] 
**TransactionInformation** | [**TransactionInfo**](TransactionInfo.md) |  | [optional] 
**DateInfo** | [**InstallmentPlanDateInfo**](InstallmentPlanDateInfo.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

