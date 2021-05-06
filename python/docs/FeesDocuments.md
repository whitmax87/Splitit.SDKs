# FeesDocuments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**fee_amount_in_effective_currency_amount** | **float** |  | 
**fee_amount_in_transaction_currency_amount** | **float** |  | 
**fee_amount_in_uniform_currency_amount** | **float** |  | 
**effective_currency_id** | **int** |  | 
**transaction_currency_id** | **int** |  | [optional] 
**uniform_currency_id** | **int** |  | 
**reference_fees_document_id** | **int** |  | [optional] 
**installment_id** | **int** |  | [optional] 
**plan_id** | **int** |  | [optional] 
**business_unit_id** | **int** |  | [optional] 
**effective_date_utc** | **datetime** |  | 
**fee_rule_data_id** | **int** |  | [optional] 
**fee_rule_data** | [**FeesRuleDatas**](FeesRuleDatas.md) |  | [optional] 
**business_unit** | [**BusinessUnits**](BusinessUnits.md) |  | [optional] 
**effective_currency** | [**Currencies**](Currencies.md) |  | [optional] 
**installment** | [**Installments**](Installments.md) |  | [optional] 
**plan** | [**InstallmentPlans**](InstallmentPlans.md) |  | [optional] 
**reference_fees_document** | [**FeesDocuments**](FeesDocuments.md) |  | [optional] 
**transaction_currency** | [**Currencies**](Currencies.md) |  | [optional] 
**uniform_currency** | [**Currencies**](Currencies.md) |  | [optional] 
**inverse_reference_fees_document** | [**list[FeesDocuments]**](FeesDocuments.md) |  | [optional] 
**fee_entity** | [**AccountingParty**](AccountingParty.md) |  | 
**fee_type** | [**FeesTypes**](FeesTypes.md) |  | 
**range_type** | [**RangeType**](RangeType.md) |  | [optional] 
**fee_amount_in_effective_currency** | [**Money2**](Money2.md) |  | [optional] 
**fee_amount_in_transaction_currency** | [**Money2**](Money2.md) |  | [optional] 
**fee_amount_in_uniform_currency** | [**Money2**](Money2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


