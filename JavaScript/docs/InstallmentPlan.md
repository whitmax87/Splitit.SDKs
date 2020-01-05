# SplititJsSdk.InstallmentPlan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**installmentPlanNumber** | **String** |  | [optional] 
**installmentPlanStatus** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**amount** | [**Money**](Money.md) |  | [optional] 
**outstandingAmount** | [**Money**](Money.md) |  | [optional] 
**numberOfInstallments** | **Number** |  | 
**numberOfProcessedInstallments** | **Number** |  | 
**originalAmount** | [**Money**](Money.md) |  | [optional] 
**refundAmount** | [**Money**](Money.md) |  | [optional] 
**consumer** | [**ConsumerData**](ConsumerData.md) |  | [optional] 
**activeCard** | [**CardData**](CardData.md) |  | [optional] 
**fraudCheck** | [**FraudCheck**](FraudCheck.md) |  | [optional] 
**merchant** | [**MerchantRef**](MerchantRef.md) |  | [optional] 
**refOrderNumber** | **String** |  | [optional] 
**purchaseMethod** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**strategy** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**delayResolution** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**extendedParams** | **{String: String}** |  | [optional] 
**isFullCaptured** | **Boolean** |  | 
**isChargedBack** | **Boolean** |  | 
**arePaymentsOnHold** | **Boolean** |  | 
**scpFundingPercent** | **Number** |  | 
**testMode** | [**TestModes**](TestModes.md) |  | 
**creationDateTime** | **Date** |  | 
**installments** | [**[Installment]**](Installment.md) |  | [optional] 
**secureAuthorizations** | [**[ReAuthorization]**](ReAuthorization.md) |  | [optional] 


