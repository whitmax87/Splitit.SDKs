# ApiUsers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**culture** | **str** |  | [optional] 
**user_full_name** | **str** |  | [optional] 
**phone_number** | **str** |  | [optional] 
**role** | [**Roles**](Roles.md) |  | [optional] 
**user_name** | **str** |  | [optional] 
**unique_id** | **str** |  | [optional] 
**login_attempt** | **int** |  | 
**max_invalid_login_attempts** | **int** |  | 
**status** | [**UserStatus**](UserStatus.md) |  | 
**is_locked** | **bool** |  | 
**email** | **str** |  | [optional] 
**culture_name** | **str** |  | [optional] 
**role_id** | **int** |  | 
**login_user_name** | **str** |  | [optional] 
**crm_id** | **str** |  | [optional] 
**merchant** | [**Merchants**](Merchants.md) |  | [optional] 
**api_user_password_histories** | [**list[ApiUserPasswordHistories]**](ApiUserPasswordHistories.md) |  | [optional] 
**merchant_id** | **int** |  | 
**merchant_name** | **str** |  | [optional] 
**password** | [**IUserPasswordHistory**](IUserPasswordHistory.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


