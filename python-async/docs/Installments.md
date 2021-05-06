# Installments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**installment_plan_id** | **int** |  | 
**installment_number** | **int** |  | 
**processor_id** | **int** |  | 
**origin_utc_offset** | **float** |  | 
**created_date_utc** | **datetime** |  | 
**amount** | **float** |  | 
**process_date_time** | **datetime** |  | [optional] 
**process_date_time_utc** | **datetime** |  | [optional] 
**is_refund** | **bool** |  | 
**card_state_id** | **int** |  | [optional] 
**original_amount** | **float** |  | 
**refund_amount** | **float** |  | 
**is_full_capture** | **bool** |  | 
**authorized_amount** | **float** |  | 
**is_pre_authorized** | **bool** |  | 
**amount_for_funding** | **float** |  | 
**card_state** | [**CardStateLogs**](CardStateLogs.md) |  | [optional] 
**installment_plan** | [**InstallmentPlans**](InstallmentPlans.md) |  | [optional] 
**processor** | [**Processors**](Processors.md) |  | [optional] 
**fees_documents** | [**list[FeesDocuments]**](FeesDocuments.md) |  | [optional] 
**funding_collect_document_details** | [**list[FundingCollectDocumentDetails]**](FundingCollectDocumentDetails.md) |  | [optional] 
**installment_payment_gateway_transaction_logs** | [**list[InstallmentPaymentGatewayTransactionLogs]**](InstallmentPaymentGatewayTransactionLogs.md) |  | [optional] 
**transfer_document_details** | [**list[TransferDocumentDetails]**](TransferDocumentDetails.md) |  | [optional] 
**merchant_account_type** | [**MerchantAccountType**](MerchantAccountType.md) |  | 
**status** | [**InstallmentStatus**](InstallmentStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


