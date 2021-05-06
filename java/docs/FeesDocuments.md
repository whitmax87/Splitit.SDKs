
# FeesDocuments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**feeAmountInEffectiveCurrencyAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**feeAmountInTransactionCurrencyAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**feeAmountInUniformCurrencyAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**effectiveCurrencyId** | **Long** |  | 
**transactionCurrencyId** | **Long** |  |  [optional]
**uniformCurrencyId** | **Long** |  | 
**referenceFeesDocumentId** | **Long** |  |  [optional]
**installmentId** | **Long** |  |  [optional]
**planId** | **Long** |  |  [optional]
**businessUnitId** | **Long** |  |  [optional]
**effectiveDateUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**feeRuleDataId** | **Long** |  |  [optional]
**feeRuleData** | [**FeesRuleDatas**](FeesRuleDatas.md) |  |  [optional]
**businessUnit** | [**BusinessUnits**](BusinessUnits.md) |  |  [optional]
**effectiveCurrency** | [**Currencies**](Currencies.md) |  |  [optional]
**installment** | [**Installments**](Installments.md) |  |  [optional]
**plan** | [**InstallmentPlans**](InstallmentPlans.md) |  |  [optional]
**referenceFeesDocument** | [**FeesDocuments**](FeesDocuments.md) |  |  [optional]
**transactionCurrency** | [**Currencies**](Currencies.md) |  |  [optional]
**uniformCurrency** | [**Currencies**](Currencies.md) |  |  [optional]
**inverseReferenceFeesDocument** | [**List&lt;FeesDocuments&gt;**](FeesDocuments.md) |  |  [optional]
**feeEntity** | [**AccountingParty**](AccountingParty.md) |  | 
**feeType** | [**FeesTypes**](FeesTypes.md) |  | 
**rangeType** | [**RangeType**](RangeType.md) |  |  [optional]
**feeAmountInEffectiveCurrency** | [**Money2**](Money2.md) |  |  [optional]
**feeAmountInTransactionCurrency** | [**Money2**](Money2.md) |  |  [optional]
**feeAmountInUniformCurrency** | [**Money2**](Money2.md) |  |  [optional]



