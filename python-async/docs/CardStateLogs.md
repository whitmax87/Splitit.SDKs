# CardStateLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**card_id** | **int** |  | 
**expiration_month** | **int** |  | 
**expiration_year** | **int** |  | 
**card_holder_name** | **str** |  | [optional] 
**address_data_address_line** | **str** |  | [optional] 
**address_data_zip** | **str** |  | [optional] 
**version** | **int** |  | 
**is_verified** | **bool** |  | 
**change_source** | **str** |  | [optional] 
**address_data_address_line2** | **str** |  | [optional] 
**address_data_city** | **str** |  | [optional] 
**address_data_country_id** | **int** |  | [optional] 
**address_data_state_id** | **int** |  | [optional] 
**address_data_legacy_full_address_line** | **str** |  | [optional] 
**card** | [**Cards**](Cards.md) |  | [optional] 
**country** | [**Countries**](Countries.md) |  | [optional] 
**state** | [**CountrySubdivisions**](CountrySubdivisions.md) |  | [optional] 
**installments** | [**list[Installments]**](Installments.md) |  | [optional] 
**re_authorizations** | [**list[ReAuthorizations]**](ReAuthorizations.md) |  | [optional] 
**address_data** | [**AddressData2**](AddressData2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


