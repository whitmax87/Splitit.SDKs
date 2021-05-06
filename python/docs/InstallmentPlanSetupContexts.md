# InstallmentPlanSetupContexts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**public_installment_plan_session** | **str** |  | [optional] 
**billing_address_address_line** | **str** |  | [optional] 
**billing_address_zip** | **str** |  | [optional] 
**billing_address_address_line2** | **str** |  | [optional] 
**billing_address_city** | **str** |  | [optional] 
**requested_number_of_installments** | **str** |  | [optional] 
**success_exit_url** | **str** |  | [optional] 
**error_exit_url** | **str** |  | [optional] 
**cancel_exit_url** | **str** |  | [optional] 
**ab_test_query_string** | **str** |  | [optional] 
**requested_first_installment_amount** | **float** |  | 
**requested_first_scheduled_installment_date** | **datetime** |  | [optional] 
**send_shopper_approval_request** | **datetime** |  | [optional] 
**send_shopper_payment_request** | **datetime** |  | [optional] 
**requested_capture_on_creation** | **bool** |  | [optional] 
**billing_address_country_id** | **int** |  | [optional] 
**suggested_payment_tp_id** | **int** |  | [optional] 
**ab_testing_session_id** | **int** |  | [optional] 
**default_num_of_installments** | **int** |  | 
**billing_address_state_id** | **int** |  | [optional] 
**billing_address_legacy_full_address_line** | **str** |  | [optional] 
**requested_funding** | **bool** |  | [optional] 
**success_async_url** | **str** |  | [optional] 
**attempt3_dsecure** | **bool** |  | [optional] 
**view_name** | **str** |  | [optional] 
**is_opened_in_iframe** | **bool** |  | 
**is3d_secure_in_popup** | **bool** |  | [optional] 
**external_auth_unique_gateway_id** | **str** |  | [optional] 
**external_amount_details** | **float** |  | 
**external_auth_date** | **datetime** |  | 
**external_auth_transaction_log** | **str** |  | [optional] 
**payment_approval_phone** | **str** |  | [optional] 
**payment_approval_email** | **str** |  | [optional] 
**payment_message** | **str** |  | [optional] 
**terms_and_conditions_key** | **str** |  | [optional] 
**finger_print_id** | **str** |  | [optional] 
**request_update_card_phone** | **str** |  | [optional] 
**request_update_card_email** | **str** |  | [optional] 
**request_update_card_time** | **datetime** |  | [optional] 
**billing_address_first_time_populated_by** | **str** |  | [optional] 
**country** | [**Countries**](Countries.md) |  | [optional] 
**state** | [**CountrySubdivisions**](CountrySubdivisions.md) |  | [optional] 
**ab_testing_session** | [**PaymentFormTPABTestingDefinition**](PaymentFormTPABTestingDefinition.md) |  | [optional] 
**suggested_payment_tp** | [**VersionedTouchPoints**](VersionedTouchPoints.md) |  | [optional] 
**installment_plans** | [**list[InstallmentPlans]**](InstallmentPlans.md) |  | [optional] 
**requested_strategy** | [**PlanStrategy**](PlanStrategy.md) |  | [optional] 
**billing_address** | [**AddressData2**](AddressData2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


