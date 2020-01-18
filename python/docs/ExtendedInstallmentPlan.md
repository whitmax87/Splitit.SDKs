# ExtendedInstallmentPlan

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
**test_mode** | [**TestModes**](TestModes.md) |  | 
**creation_date_time** | **datetime** |  | 
**installments** | [**list[Installment]**](Installment.md) |  | [optional] 
**secure_authorizations** | [**list[ReAuthorization]**](ReAuthorization.md) |  | [optional] 
**business_unit** | [**BuRef**](BuRef.md) |  | [optional] 
**shopper_payment_request_time** | **datetime** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


