# InstallmentPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**installment_plan_number** | **str** |  | [optional] 
**installment_plan_status** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**amount** | [**Money**](Money.md) |  | [optional] 
**outstanding_amount** | [**Money**](Money.md) |  | [optional] 
**number_of_installments** | **int** |  | 
**number_of_processed_installments** | **int** |  | 
**original_amount** | [**Money**](Money.md) |  | [optional] 
**refund_amount** | [**Money**](Money.md) |  | [optional] 
**consumer** | [**ConsumerData**](ConsumerData.md) |  | [optional] 
**active_card** | [**CardData**](CardData.md) |  | [optional] 
**fraud_check** | [**FraudCheck**](FraudCheck.md) |  | [optional] 
**merchant** | [**MerchantRef**](MerchantRef.md) |  | [optional] 
**ref_order_number** | **str** |  | [optional] 
**purchase_method** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**strategy** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**delay_resolution** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**extended_params** | **dict(str, str)** |  | [optional] 
**is_full_captured** | **bool** |  | 
**is_charged_back** | **bool** |  | 
**are_payments_on_hold** | **bool** |  | 
**scp_funding_percent** | **float** |  | 
**funding_status** | [**MoneyFlows**](MoneyFlows.md) |  | 
**test_mode** | [**TestModes**](TestModes.md) |  | 
**creation_date_time** | **datetime** |  | 
**life_time_url_expiration_time** | **datetime** |  | 
**installments** | [**list[Installment2]**](Installment2.md) |  | [optional] 
**secure_authorizations** | [**list[ReAuthorization]**](ReAuthorization.md) |  | [optional] 
**logo_url** | **str** |  | [optional] 
**is_in_auto_retry** | **bool** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


