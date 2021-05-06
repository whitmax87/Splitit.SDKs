# PayDocuments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**total_amount** | **float** |  | 
**scp_provider_id** | **int** |  | [optional] 
**business_unit_id** | **int** |  | [optional] 
**discriminator** | **str** |  | [optional] 
**currency_id** | **int** |  | [optional] 
**business_unit** | [**BusinessUnits**](BusinessUnits.md) |  | [optional] 
**currency** | [**Currencies**](Currencies.md) |  | [optional] 
**scp_provider** | **object** |  | [optional] 
**funding_pay_document_details** | [**list[FundingPayDocumentDetails]**](FundingPayDocumentDetails.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


