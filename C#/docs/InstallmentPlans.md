# Splitit.SDK.Client.Model.InstallmentPlans
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long?** |  | 
**TerminalId** | **long?** |  | 
**NumberOfInstallments** | **long?** |  | 
**Amount** | **decimal?** |  | 
**AmountBeforeFees** | **decimal?** |  | 
**Eula** | **bool?** |  | 
**InstallmentPlanNumber** | **string** |  | [optional] 
**IsFullCaptured** | **bool?** |  | 
**BeginLockTime** | **DateTime?** |  | [optional] 
**MerchantFinancedDate** | **DateTime?** |  | [optional] 
**MerchantReserveReturnedDate** | **DateTime?** |  | [optional] 
**PlannedFullCapture** | **DateTime?** |  | [optional] 
**InstallmentPlanTerminalDataId** | **long?** |  | 
**CurrencyId** | **long?** |  | 
**RefOrderNumber** | **string** |  | [optional] 
**ActiveCardId** | **long?** |  | [optional] 
**Base64PngSignature** | **string** |  | [optional] 
**IsChargedBack** | **bool?** |  | 
**AreChargesHeld** | **bool?** |  | 
**AutoRetry** | **bool?** |  | 
**PisMemberUniqueId** | **string** |  | [optional] 
**PisMemberId** | **long?** |  | [optional] 
**Subtotal** | **decimal?** |  | 
**Tax** | **decimal?** |  | 
**Shipping** | **decimal?** |  | 
**SetupContextId** | **long?** |  | 
**OriginalAmount** | **decimal?** |  | 
**RefundAmount** | **decimal?** |  | 
**ReservePoolAmount** | **decimal?** |  | 
**ShopperApprovalDateTime** | **DateTime?** |  | [optional] 
**CancellationDateTime** | **DateTime?** |  | [optional] 
**ActivatedDate** | **DateTime?** |  | [optional] 
**DeActivatedDate** | **DateTime?** |  | [optional] 
**AmountForFunding** | **decimal?** |  | 
**AmountForFundingCurrency** | [**Currencies**](Currencies.md) |  | [optional] 
**AmountForFundingExchangeRate** | **decimal?** |  | 
**AmountForFundingTransactionCurrency** | **decimal?** |  | 
**ActiveCard** | [**Cards**](Cards.md) |  | [optional] 
**Currency** | [**Currencies**](Currencies.md) |  | [optional] 
**InstallmentPlanTerminalData** | [**InstallmentPlanTerminalDatas**](InstallmentPlanTerminalDatas.md) |  | [optional] 
**PisMember** | **Object** |  | [optional] 
**SetupContext** | [**InstallmentPlanSetupContexts**](InstallmentPlanSetupContexts.md) |  | [optional] 
**Terminal** | [**Terminals**](Terminals.md) |  | [optional] 
**CartItems** | [**List&lt;CartItems&gt;**](CartItems.md) |  | [optional] 
**EmailAuditLogs** | [**List&lt;EmailAuditLogs&gt;**](EmailAuditLogs.md) |  | [optional] 
**FeesDocuments** | [**List&lt;FeesDocuments&gt;**](FeesDocuments.md) |  | [optional] 
**FraudDetectionLogs** | [**List&lt;FraudDetectionLogs&gt;**](FraudDetectionLogs.md) |  | [optional] 
**FundingCollectDocumentDetails** | [**List&lt;FundingCollectDocumentDetails&gt;**](FundingCollectDocumentDetails.md) |  | [optional] 
**InstallmentPlanAuditLogs** | [**List&lt;InstallmentPlanAuditLogs&gt;**](InstallmentPlanAuditLogs.md) |  | [optional] 
**InstallmentPlanEvents** | [**List&lt;InstallmentPlanEvents&gt;**](InstallmentPlanEvents.md) |  | [optional] 
**InstallmentPlanStatusLogEntries** | [**List&lt;InstallmentPlanStatusLogEntries&gt;**](InstallmentPlanStatusLogEntries.md) |  | [optional] 
**Installments** | [**List&lt;Installments&gt;**](Installments.md) |  | [optional] 
**ReAuthorizations** | [**List&lt;ReAuthorizations&gt;**](ReAuthorizations.md) |  | [optional] 
**RefundLogEntries** | [**List&lt;RefundLogEntries&gt;**](RefundLogEntries.md) |  | [optional] 
**TransferDocumentDetails** | [**List&lt;TransferDocumentDetails&gt;**](TransferDocumentDetails.md) |  | [optional] 
**ActiveTerminalDataId** | **long?** |  | [optional] 
**ActiveTerminalData** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  | [optional] 
**DelayResolution** | [**DelayResolution**](DelayResolution.md) |  | [optional] 
**TestMode** | [**TestModes**](TestModes.md) |  | 
**FundingTypesId** | [**MoneyFlows**](MoneyFlows.md) |  | 
**Strategy** | [**PlanStrategy**](PlanStrategy.md) |  | 
**Status** | [**InstallmentPlanStatus**](InstallmentPlanStatus.md) |  | 
**PurchaseMethod** | [**PurchaseMethod**](PurchaseMethod.md) |  | 
**ExtendedParamsSerializedData** | **string** |  | [optional] 
**ExtendedParams** | **Dictionary&lt;string, string&gt;** |  | [optional] 
**AutoCapture** | **bool?** |  | 
**Items** | [**List&lt;CartItems&gt;**](CartItems.md) |  | [optional] 
**AmountDetails** | [**AmountDetails2**](AmountDetails2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

