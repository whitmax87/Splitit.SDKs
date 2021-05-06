# InstallmentPlans

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**terminal_id** | **int** |  | 
**number_of_installments** | **int** |  | 
**amount** | **float** |  | 
**amount_before_fees** | **float** |  | 
**eula** | **bool** |  | 
**installment_plan_number** | **str** |  | [optional] 
**is_full_captured** | **bool** |  | 
**begin_lock_time** | **datetime** |  | [optional] 
**merchant_financed_date** | **datetime** |  | [optional] 
**merchant_reserve_returned_date** | **datetime** |  | [optional] 
**planned_full_capture** | **datetime** |  | [optional] 
**installment_plan_terminal_data_id** | **int** |  | 
**currency_id** | **int** |  | 
**ref_order_number** | **str** |  | [optional] 
**active_card_id** | **int** |  | [optional] 
**base64_png_signature** | **str** |  | [optional] 
**is_charged_back** | **bool** |  | 
**are_charges_held** | **bool** |  | 
**auto_retry** | **bool** |  | 
**pis_member_unique_id** | **str** |  | [optional] 
**pis_member_id** | **int** |  | [optional] 
**subtotal** | **float** |  | 
**tax** | **float** |  | 
**shipping** | **float** |  | 
**setup_context_id** | **int** |  | 
**original_amount** | **float** |  | 
**refund_amount** | **float** |  | 
**reserve_pool_amount** | **float** |  | 
**shopper_approval_date_time** | **datetime** |  | [optional] 
**cancellation_date_time** | **datetime** |  | [optional] 
**activated_date** | **datetime** |  | [optional] 
**de_activated_date** | **datetime** |  | [optional] 
**amount_for_funding** | **float** |  | 
**amount_for_funding_currency** | [**Currencies**](Currencies.md) |  | [optional] 
**amount_for_funding_exchange_rate** | **float** |  | 
**amount_for_funding_transaction_currency** | **float** |  | 
**active_card** | [**Cards**](Cards.md) |  | [optional] 
**currency** | [**Currencies**](Currencies.md) |  | [optional] 
**installment_plan_terminal_data** | [**InstallmentPlanTerminalDatas**](InstallmentPlanTerminalDatas.md) |  | [optional] 
**pis_member** | **object** |  | [optional] 
**setup_context** | [**InstallmentPlanSetupContexts**](InstallmentPlanSetupContexts.md) |  | [optional] 
**terminal** | [**Terminals**](Terminals.md) |  | [optional] 
**cart_items** | [**list[CartItems]**](CartItems.md) |  | [optional] 
**email_audit_logs** | [**list[EmailAuditLogs]**](EmailAuditLogs.md) |  | [optional] 
**fees_documents** | [**list[FeesDocuments]**](FeesDocuments.md) |  | [optional] 
**fraud_detection_logs** | [**list[FraudDetectionLogs]**](FraudDetectionLogs.md) |  | [optional] 
**funding_collect_document_details** | [**list[FundingCollectDocumentDetails]**](FundingCollectDocumentDetails.md) |  | [optional] 
**installment_plan_audit_logs** | [**list[InstallmentPlanAuditLogs]**](InstallmentPlanAuditLogs.md) |  | [optional] 
**installment_plan_events** | [**list[InstallmentPlanEvents]**](InstallmentPlanEvents.md) |  | [optional] 
**installment_plan_status_log_entries** | [**list[InstallmentPlanStatusLogEntries]**](InstallmentPlanStatusLogEntries.md) |  | [optional] 
**installments** | [**list[Installments]**](Installments.md) |  | [optional] 
**re_authorizations** | [**list[ReAuthorizations]**](ReAuthorizations.md) |  | [optional] 
**refund_log_entries** | [**list[RefundLogEntries]**](RefundLogEntries.md) |  | [optional] 
**transfer_document_details** | [**list[TransferDocumentDetails]**](TransferDocumentDetails.md) |  | [optional] 
**active_terminal_data_id** | **int** |  | [optional] 
**active_terminal_data** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  | [optional] 
**delay_resolution** | [**DelayResolution**](DelayResolution.md) |  | [optional] 
**test_mode** | [**TestModes**](TestModes.md) |  | 
**funding_types_id** | [**MoneyFlows**](MoneyFlows.md) |  | 
**strategy** | [**PlanStrategy**](PlanStrategy.md) |  | 
**status** | [**InstallmentPlanStatus**](InstallmentPlanStatus.md) |  | 
**purchase_method** | [**PurchaseMethod**](PurchaseMethod.md) |  | 
**extended_params_serialized_data** | **str** |  | [optional] 
**extended_params** | **dict(str, str)** |  | [optional] 
**auto_capture** | **bool** |  | 
**items** | [**list[CartItems]**](CartItems.md) |  | [optional] 
**amount_details** | [**AmountDetails2**](AmountDetails2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


