# Terminals

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**api_key** | **str** |  | [optional] 
**wizard_timeout** | **int** |  | 
**merchant_id** | **int** |  | 
**utc_offset** | **float** |  | 
**is_disabled** | **bool** |  | 
**charge_before_shipping** | **bool** |  | 
**terminal_id** | **str** |  | [optional] 
**agent_id** | **int** |  | 
**can_cancel_installments_plan** | **bool** |  | 
**crm_id** | **str** |  | [optional] 
**currency_id** | **int** |  | [optional] 
**pending_shipment_reminder_days** | **int** |  | 
**business_unit_id** | **int** |  | 
**keep_non_approved_plan_live** | **int** |  | 
**use_test_gateway** | **bool** |  | 
**agent** | [**Agents**](Agents.md) |  | [optional] 
**business_unit** | [**BusinessUnits**](BusinessUnits.md) |  | [optional] 
**currency** | [**Currencies**](Currencies.md) |  | [optional] 
**merchant** | [**Merchants**](Merchants.md) |  | [optional] 
**account_updater_subscribers_scopes** | [**list[AccountUpdaterSubscribersScopes]**](AccountUpdaterSubscribersScopes.md) |  | [optional] 
**installment_plans** | [**list[InstallmentPlans]**](InstallmentPlans.md) |  | [optional] 
**reconciliation_reports** | [**list[ReconciliationReports]**](ReconciliationReports.md) |  | [optional] 
**state_limit_rule_datas** | [**list[StateLimitRuleDatas]**](StateLimitRuleDatas.md) |  | [optional] 
**terminal_countries** | [**list[TerminalCountries]**](TerminalCountries.md) |  | [optional] 
**terminal_gateway_datas** | [**list[TerminalGatewayDatas]**](TerminalGatewayDatas.md) |  | [optional] 
**terminal_kvps** | [**list[TerminalKvps]**](TerminalKvps.md) |  | [optional] 
**continue_existing_plan_with_original_gateway** | **bool** |  | 
**active_terminal_data** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  | [optional] 
**chb_default_action** | [**ChbDefaultAction**](ChbDefaultAction.md) |  | 
**failure_under_frozen_installments_plan** | [**FailureUnderFrozenInstallmentsPlan**](FailureUnderFrozenInstallmentsPlan.md) |  | 
**refund_under_cancelation** | [**RefundUnderCancelation**](RefundUnderCancelation.md) |  | 
**integration_type** | [**IntegrationType**](IntegrationType.md) |  | 
**test_mode** | [**TestModes**](TestModes.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


