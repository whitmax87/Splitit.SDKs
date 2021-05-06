# ReAuthorizations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**installment_plan_id** | **int** |  | 
**processor_id** | **int** |  | 
**amount** | **float** |  | 
**process_date_time** | **datetime** |  | [optional] 
**is_test** | **bool** |  | 
**card_state_id** | **int** |  | [optional] 
**card_state** | [**CardStateLogs**](CardStateLogs.md) |  | [optional] 
**installment_plan** | [**InstallmentPlans**](InstallmentPlans.md) |  | [optional] 
**processor** | [**Processors**](Processors.md) |  | [optional] 
**re_authorization_payment_gateway_transaction_logs** | [**list[ReAuthorizationPaymentGatewayTransactionLogs]**](ReAuthorizationPaymentGatewayTransactionLogs.md) |  | [optional] 
**status** | [**InstallmentStatus**](InstallmentStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


