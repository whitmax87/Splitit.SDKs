
# InstallmentPlans

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**terminalId** | **Long** |  | 
**numberOfInstallments** | **Long** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**amountBeforeFees** | [**BigDecimal**](BigDecimal.md) |  | 
**eula** | **Boolean** |  | 
**installmentPlanNumber** | **String** |  |  [optional]
**isFullCaptured** | **Boolean** |  | 
**beginLockTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**merchantFinancedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**merchantReserveReturnedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**plannedFullCapture** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**installmentPlanTerminalDataId** | **Long** |  | 
**currencyId** | **Long** |  | 
**refOrderNumber** | **String** |  |  [optional]
**activeCardId** | **Long** |  |  [optional]
**base64PngSignature** | **String** |  |  [optional]
**isChargedBack** | **Boolean** |  | 
**areChargesHeld** | **Boolean** |  | 
**autoRetry** | **Boolean** |  | 
**pisMemberUniqueId** | **String** |  |  [optional]
**pisMemberId** | **Long** |  |  [optional]
**subtotal** | [**BigDecimal**](BigDecimal.md) |  | 
**tax** | [**BigDecimal**](BigDecimal.md) |  | 
**shipping** | [**BigDecimal**](BigDecimal.md) |  | 
**setupContextId** | **Long** |  | 
**originalAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**refundAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**reservePoolAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**shopperApprovalDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**cancellationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**activatedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**deActivatedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**amountForFunding** | [**BigDecimal**](BigDecimal.md) |  | 
**amountForFundingCurrency** | [**Currencies**](Currencies.md) |  |  [optional]
**amountForFundingExchangeRate** | [**BigDecimal**](BigDecimal.md) |  | 
**amountForFundingTransactionCurrency** | [**BigDecimal**](BigDecimal.md) |  | 
**activeCard** | [**Cards**](Cards.md) |  |  [optional]
**currency** | [**Currencies**](Currencies.md) |  |  [optional]
**installmentPlanTerminalData** | [**InstallmentPlanTerminalDatas**](InstallmentPlanTerminalDatas.md) |  |  [optional]
**pisMember** | **Object** |  |  [optional]
**setupContext** | [**InstallmentPlanSetupContexts**](InstallmentPlanSetupContexts.md) |  |  [optional]
**terminal** | [**Terminals**](Terminals.md) |  |  [optional]
**cartItems** | [**List&lt;CartItems&gt;**](CartItems.md) |  |  [optional]
**emailAuditLogs** | [**List&lt;EmailAuditLogs&gt;**](EmailAuditLogs.md) |  |  [optional]
**feesDocuments** | [**List&lt;FeesDocuments&gt;**](FeesDocuments.md) |  |  [optional]
**fraudDetectionLogs** | [**List&lt;FraudDetectionLogs&gt;**](FraudDetectionLogs.md) |  |  [optional]
**fundingCollectDocumentDetails** | [**List&lt;FundingCollectDocumentDetails&gt;**](FundingCollectDocumentDetails.md) |  |  [optional]
**installmentPlanAuditLogs** | [**List&lt;InstallmentPlanAuditLogs&gt;**](InstallmentPlanAuditLogs.md) |  |  [optional]
**installmentPlanEvents** | [**List&lt;InstallmentPlanEvents&gt;**](InstallmentPlanEvents.md) |  |  [optional]
**installmentPlanStatusLogEntries** | [**List&lt;InstallmentPlanStatusLogEntries&gt;**](InstallmentPlanStatusLogEntries.md) |  |  [optional]
**installments** | [**List&lt;Installments&gt;**](Installments.md) |  |  [optional]
**reAuthorizations** | [**List&lt;ReAuthorizations&gt;**](ReAuthorizations.md) |  |  [optional]
**refundLogEntries** | [**List&lt;RefundLogEntries&gt;**](RefundLogEntries.md) |  |  [optional]
**transferDocumentDetails** | [**List&lt;TransferDocumentDetails&gt;**](TransferDocumentDetails.md) |  |  [optional]
**activeTerminalDataId** | **Long** |  |  [optional]
**activeTerminalData** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  |  [optional]
**delayResolution** | [**DelayResolution**](DelayResolution.md) |  |  [optional]
**testMode** | [**TestModes**](TestModes.md) |  | 
**fundingTypesId** | [**MoneyFlows**](MoneyFlows.md) |  | 
**strategy** | [**PlanStrategy**](PlanStrategy.md) |  | 
**status** | [**InstallmentPlanStatus**](InstallmentPlanStatus.md) |  | 
**purchaseMethod** | [**PurchaseMethod**](PurchaseMethod.md) |  | 
**extendedParamsSerializedData** | **String** |  |  [optional]
**extendedParams** | **Map&lt;String, String&gt;** |  |  [optional]
**autoCapture** | **Boolean** |  | 
**items** | [**List&lt;CartItems&gt;**](CartItems.md) |  |  [optional]
**amountDetails** | [**AmountDetails2**](AmountDetails2.md) |  |  [optional]



