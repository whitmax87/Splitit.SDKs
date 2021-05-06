# Processors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**name** | **str** |  | [optional] 
**api_url** | **str** |  | [optional] 
**max_number_of_retries** | **int** |  | 
**timeout_seconds** | **int** |  | 
**max_auth** | **int** |  | 
**grace_period** | **int** |  | 
**async_refund_grace_period_days** | **int** |  | [optional] 
**is_checked_mastercard** | **bool** |  | 
**is_checked_upi** | **bool** |  | 
**is_checked_visa** | **bool** |  | 
**is_checked_amex** | **bool** |  | 
**is_checked_maestro** | **bool** |  | 
**is_checked_jcb** | **bool** |  | 
**is_checked_discover** | **bool** |  | 
**is3ds2_supported** | **bool** |  | 
**gateway_apiassembly** | **str** |  | [optional] 
**display_name** | **str** |  | [optional] 
**gateway_apiimplementor_ns** | **str** |  | [optional] 
**is_token_supported** | **bool** |  | 
**consumer_update_cc_grace_period** | **str** |  | [optional] 
**is_void_supported** | **bool** |  | 
**is_void_after_fail_refund** | **bool** |  | 
**min_amount_allowed_for_auth** | **float** |  | 
**capture_delay_in_sec** | **int** |  | 
**void_delay_in_sec** | **int** |  | 
**allow_partial_void** | **bool** |  | 
**installments** | [**list[Installments]**](Installments.md) |  | [optional] 
**processor_authentication_parameters** | [**list[ProcessorAuthenticationParameters]**](ProcessorAuthenticationParameters.md) |  | [optional] 
**re_authorizations** | [**list[ReAuthorizations]**](ReAuthorizations.md) |  | [optional] 
**terminal_gateway_datas** | [**list[TerminalGatewayDatas]**](TerminalGatewayDatas.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


