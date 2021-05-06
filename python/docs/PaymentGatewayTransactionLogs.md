# PaymentGatewayTransactionLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**avs_message_message_code** | **str** |  | [optional] 
**avs_message_message_text** | **str** |  | [optional] 
**cvv_message_message_code** | **str** |  | [optional] 
**cvv_message_message_text** | **str** |  | [optional] 
**expiry_date_message_message_code** | **str** |  | [optional] 
**expiry_date_message_message_text** | **str** |  | [optional] 
**result_message_message_code** | **str** |  | [optional] 
**result_message_message_text** | **str** |  | [optional] 
**result** | **bool** |  | 
**transaction_id** | **str** |  | [optional] 
**complete_response_xml** | **str** |  | [optional] 
**additional_data** | **str** |  | [optional] 
**requested_currency_code** | **str** |  | [optional] 
**terminal_gateway_data_id** | **int** |  | 
**reference_payment_gateway_transaction_log_id** | **int** |  | [optional] 
**processed_amount_amount** | **float** |  | 
**requested_amount_amount** | **float** |  | 
**installment_plan_id** | **int** |  | [optional] 
**is_chargeback** | **bool** |  | 
**is_async** | **bool** |  | [optional] 
**transfer_id** | **str** |  | [optional] 
**reference_payment_gateway_transaction_log** | [**PaymentGatewayTransactionLogs**](PaymentGatewayTransactionLogs.md) |  | [optional] 
**terminal_gateway_data** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  | [optional] 
**fraud_detection_logs** | [**list[FraudDetectionLogs]**](FraudDetectionLogs.md) |  | [optional] 
**installment_payment_gateway_transaction_logs** | [**list[InstallmentPaymentGatewayTransactionLogs]**](InstallmentPaymentGatewayTransactionLogs.md) |  | [optional] 
**inverse_reference_payment_gateway_transaction_log** | [**list[PaymentGatewayTransactionLogs]**](PaymentGatewayTransactionLogs.md) |  | [optional] 
**payment_gateway_transaction_async_logs** | [**list[PaymentGatewayTransactionAsyncLogs]**](PaymentGatewayTransactionAsyncLogs.md) |  | [optional] 
**re_authorization_payment_gateway_transaction_logs** | [**list[ReAuthorizationPaymentGatewayTransactionLogs]**](ReAuthorizationPaymentGatewayTransactionLogs.md) |  | [optional] 
**public_id** | **str** |  | [optional] 
**trace_id** | **str** |  | [optional] 
**type** | [**OperationType**](OperationType.md) |  | 
**avs_message** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**cvv_message** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**expiry_date_message** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**result_message** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**processed_amount** | [**Money2**](Money2.md) |  | [optional] 
**requested_amount** | [**Money2**](Money2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


