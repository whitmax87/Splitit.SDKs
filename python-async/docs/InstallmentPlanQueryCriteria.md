# InstallmentPlanQueryCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant_id** | **int** |  | 
**currency_id** | **int** |  | 
**installment_plan_id** | **int** |  | 
**installment_plan_number** | **str** |  | [optional] 
**ref_order_number** | **str** |  | [optional] 
**installment_plan_amount** | **float** |  | 
**card_number** | **str** |  | [optional] 
**consumer_name** | **str** |  | [optional] 
**consumer_email** | **str** |  | [optional] 
**card_holder** | **str** |  | [optional] 
**pis_member_id** | **int** |  | 
**any_filter** | **str** |  | [optional] 
**eula** | **bool** |  | 
**show_chargeback_plans** | **bool** |  | 
**is_in_auto_retry** | **bool** |  | [optional] 
**strategy** | [**PlanStrategy**](PlanStrategy.md) |  | [optional] 
**initiated_statuses** | [**InstallmentPlanInitiatedStatuses**](InstallmentPlanInitiatedStatuses.md) |  | [optional] 
**fraud_check_result** | [**FraudCheckResult**](FraudCheckResult.md) |  | [optional] 
**installments_plan_statuses** | [**list[InstallmentPlanStatus]**](InstallmentPlanStatus.md) |  | [optional] 
**test_modes** | [**list[TestModes]**](TestModes.md) |  | [optional] 
**delay_resolutions** | [**list[DelayResolution]**](DelayResolution.md) |  | [optional] 
**transaction_information** | [**TransactionInfo**](TransactionInfo.md) |  | [optional] 
**date_info** | [**InstallmentPlanDateInfo**](InstallmentPlanDateInfo.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


