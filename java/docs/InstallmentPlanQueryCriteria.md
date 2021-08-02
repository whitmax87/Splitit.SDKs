
# InstallmentPlanQueryCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantId** | **Long** |  | 
**currencyId** | **Long** |  | 
**installmentPlanId** | **Long** |  | 
**installmentPlanNumber** | **String** |  |  [optional]
**refOrderNumber** | **String** |  |  [optional]
**installmentPlanAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**cardNumber** | **String** |  |  [optional]
**consumerName** | **String** |  |  [optional]
**consumerEmail** | **String** |  |  [optional]
**cardHolder** | **String** |  |  [optional]
**pisMemberId** | **Long** |  | 
**anyFilter** | **String** |  |  [optional]
**eula** | **Boolean** |  | 
**showChargebackPlans** | **Boolean** |  | 
**isInAutoRetry** | **Boolean** |  |  [optional]
**strategy** | [**PlanStrategy**](PlanStrategy.md) |  |  [optional]
**initiatedStatuses** | [**InstallmentPlanInitiatedStatuses**](InstallmentPlanInitiatedStatuses.md) |  |  [optional]
**fraudCheckResult** | [**FraudCheckResult**](FraudCheckResult.md) |  |  [optional]
**installmentsPlanStatuses** | [**List&lt;InstallmentPlanStatus&gt;**](InstallmentPlanStatus.md) |  |  [optional]
**testModes** | [**List&lt;TestModes&gt;**](TestModes.md) |  |  [optional]
**delayResolutions** | [**List&lt;DelayResolution&gt;**](DelayResolution.md) |  |  [optional]
**transactionInformation** | [**TransactionInfo**](TransactionInfo.md) |  |  [optional]
**dateInfo** | [**InstallmentPlanDateInfo**](InstallmentPlanDateInfo.md) |  |  [optional]



