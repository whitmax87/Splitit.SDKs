# InstallmentPlanAuditLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**activity_execution_date** | **datetime** |  | 
**user_id** | **int** |  | [optional] 
**user_unique_id** | **str** |  | [optional] 
**business_activity** | [**BusinessActivity**](BusinessActivity.md) |  | 
**trace_id** | **str** |  | [optional] 
**result** | **bool** |  | 
**versioned_touch_point** | [**VersionedTouchPoints**](VersionedTouchPoints.md) |  | [optional] 
**versioned_touch_point_id** | **int** |  | [optional] 
**discriminator** | **str** |  | [optional] 
**additional_info** | **str** |  | [optional] 
**user_type** | [**UserType**](UserType.md) |  | [optional] 
**installment_plan_id** | **int** |  | [optional] 
**creating_ip_address** | **str** |  | [optional] 
**card_id** | **int** |  | [optional] 
**card** | [**Cards**](Cards.md) |  | [optional] 
**installment_plan** | [**InstallmentPlans**](InstallmentPlans.md) |  | [optional] 
**error_code** | [**PisErrorCodes**](PisErrorCodes.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


