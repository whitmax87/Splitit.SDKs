
# Installments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**installmentPlanId** | **Long** |  | 
**installmentNumber** | **Long** |  | 
**processorId** | **Long** |  | 
**originUtcOffset** | **Double** |  | 
**createdDateUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**processDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**processDateTimeUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**isRefund** | **Boolean** |  | 
**cardStateId** | **Long** |  |  [optional]
**originalAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**refundAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**isFullCapture** | **Boolean** |  | 
**authorizedAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**isPreAuthorized** | **Boolean** |  | 
**amountForFunding** | [**BigDecimal**](BigDecimal.md) |  | 
**cardState** | [**CardStateLogs**](CardStateLogs.md) |  |  [optional]
**installmentPlan** | [**InstallmentPlans**](InstallmentPlans.md) |  |  [optional]
**processor** | [**Processors**](Processors.md) |  |  [optional]
**feesDocuments** | [**List&lt;FeesDocuments&gt;**](FeesDocuments.md) |  |  [optional]
**fundingCollectDocumentDetails** | [**List&lt;FundingCollectDocumentDetails&gt;**](FundingCollectDocumentDetails.md) |  |  [optional]
**installmentPaymentGatewayTransactionLogs** | [**List&lt;InstallmentPaymentGatewayTransactionLogs&gt;**](InstallmentPaymentGatewayTransactionLogs.md) |  |  [optional]
**transferDocumentDetails** | [**List&lt;TransferDocumentDetails&gt;**](TransferDocumentDetails.md) |  |  [optional]
**merchantAccountType** | [**MerchantAccountType**](MerchantAccountType.md) |  | 
**status** | [**InstallmentStatus**](InstallmentStatus.md) |  | 



