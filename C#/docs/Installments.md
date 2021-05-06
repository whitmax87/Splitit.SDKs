# Splitit.SDK.Client.Model.Installments
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long?** |  | 
**InstallmentPlanId** | **long?** |  | 
**InstallmentNumber** | **long?** |  | 
**ProcessorId** | **long?** |  | 
**OriginUtcOffset** | **double?** |  | 
**CreatedDateUtc** | **DateTime?** |  | 
**Amount** | **decimal?** |  | 
**ProcessDateTime** | **DateTime?** |  | [optional] 
**ProcessDateTimeUtc** | **DateTime?** |  | [optional] 
**IsRefund** | **bool?** |  | 
**CardStateId** | **long?** |  | [optional] 
**OriginalAmount** | **decimal?** |  | 
**RefundAmount** | **decimal?** |  | 
**IsFullCapture** | **bool?** |  | 
**AuthorizedAmount** | **decimal?** |  | 
**IsPreAuthorized** | **bool?** |  | 
**AmountForFunding** | **decimal?** |  | 
**CardState** | [**CardStateLogs**](CardStateLogs.md) |  | [optional] 
**InstallmentPlan** | [**InstallmentPlans**](InstallmentPlans.md) |  | [optional] 
**Processor** | [**Processors**](Processors.md) |  | [optional] 
**FeesDocuments** | [**List&lt;FeesDocuments&gt;**](FeesDocuments.md) |  | [optional] 
**FundingCollectDocumentDetails** | [**List&lt;FundingCollectDocumentDetails&gt;**](FundingCollectDocumentDetails.md) |  | [optional] 
**InstallmentPaymentGatewayTransactionLogs** | [**List&lt;InstallmentPaymentGatewayTransactionLogs&gt;**](InstallmentPaymentGatewayTransactionLogs.md) |  | [optional] 
**TransferDocumentDetails** | [**List&lt;TransferDocumentDetails&gt;**](TransferDocumentDetails.md) |  | [optional] 
**MerchantAccountType** | [**MerchantAccountType**](MerchantAccountType.md) |  | 
**Status** | [**InstallmentStatus**](InstallmentStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

