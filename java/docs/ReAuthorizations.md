
# ReAuthorizations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**installmentPlanId** | **Long** |  | 
**processorId** | **Long** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**processDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**isTest** | **Boolean** |  | 
**cardStateId** | **Long** |  |  [optional]
**cardState** | [**CardStateLogs**](CardStateLogs.md) |  |  [optional]
**installmentPlan** | [**InstallmentPlans**](InstallmentPlans.md) |  |  [optional]
**processor** | [**Processors**](Processors.md) |  |  [optional]
**reAuthorizationPaymentGatewayTransactionLogs** | [**List&lt;ReAuthorizationPaymentGatewayTransactionLogs&gt;**](ReAuthorizationPaymentGatewayTransactionLogs.md) |  |  [optional]
**status** | [**InstallmentStatus**](InstallmentStatus.md) |  | 



