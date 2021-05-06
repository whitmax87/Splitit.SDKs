# CollectDocuments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**amount** | **float** |  | 
**currency_id** | **int** |  | 
**business_unit_id** | **int** |  | 
**approval_date** | **datetime** |  | [optional] 
**discriminator** | **str** |  | [optional] 
**lender_id** | **int** |  | [optional] 
**exclude_from_emails** | **bool** |  | [optional] 
**business_unit** | [**BusinessUnits**](BusinessUnits.md) |  | [optional] 
**currency** | [**Currencies**](Currencies.md) |  | [optional] 
**lender** | [**ScpProviders**](ScpProviders.md) |  | [optional] 
**funding_collect_document_details** | [**list[FundingCollectDocumentDetails]**](FundingCollectDocumentDetails.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


