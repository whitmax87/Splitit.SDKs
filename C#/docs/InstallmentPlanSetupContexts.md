# Splitit.SDK.Client.Model.InstallmentPlanSetupContexts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long?** |  | 
**PublicInstallmentPlanSession** | **string** |  | [optional] 
**BillingAddressAddressLine** | **string** |  | [optional] 
**BillingAddressZip** | **string** |  | [optional] 
**BillingAddressAddressLine2** | **string** |  | [optional] 
**BillingAddressCity** | **string** |  | [optional] 
**RequestedNumberOfInstallments** | **string** |  | [optional] 
**SuccessExitUrl** | **string** |  | [optional] 
**ErrorExitUrl** | **string** |  | [optional] 
**CancelExitUrl** | **string** |  | [optional] 
**AbTestQueryString** | **string** |  | [optional] 
**RequestedFirstInstallmentAmount** | **decimal?** |  | 
**RequestedFirstScheduledInstallmentDate** | **DateTime?** |  | [optional] 
**SendShopperApprovalRequest** | **DateTime?** |  | [optional] 
**SendShopperPaymentRequest** | **DateTime?** |  | [optional] 
**RequestedCaptureOnCreation** | **bool?** |  | [optional] 
**BillingAddressCountryId** | **long?** |  | [optional] 
**SuggestedPaymentTPId** | **long?** |  | [optional] 
**ABTestingSessionId** | **long?** |  | [optional] 
**DefaultNumOfInstallments** | **int?** |  | 
**BillingAddressStateId** | **long?** |  | [optional] 
**BillingAddressLegacyFullAddressLine** | **string** |  | [optional] 
**RequestedFunding** | **bool?** |  | [optional] 
**SuccessAsyncUrl** | **string** |  | [optional] 
**Attempt3Dsecure** | **bool?** |  | [optional] 
**ViewName** | **string** |  | [optional] 
**IsOpenedInIframe** | **bool?** |  | 
**Is3dSecureInPopup** | **bool?** |  | [optional] 
**ExternalAuthUniqueGatewayId** | **string** |  | [optional] 
**ExternalAmountDetails** | **decimal?** |  | 
**ExternalAuthDate** | **DateTime?** |  | 
**ExternalAuthTransactionLog** | **string** |  | [optional] 
**PaymentApprovalPhone** | **string** |  | [optional] 
**PaymentApprovalEmail** | **string** |  | [optional] 
**PaymentMessage** | **string** |  | [optional] 
**TermsAndConditionsKey** | **string** |  | [optional] 
**FingerPrintId** | **string** |  | [optional] 
**RequestUpdateCardPhone** | **string** |  | [optional] 
**RequestUpdateCardEmail** | **string** |  | [optional] 
**RequestUpdateCardTime** | **DateTime?** |  | [optional] 
**BillingAddressFirstTimePopulatedBy** | **string** |  | [optional] 
**Country** | [**Countries**](Countries.md) |  | [optional] 
**State** | [**CountrySubdivisions**](CountrySubdivisions.md) |  | [optional] 
**ABTestingSession** | [**PaymentFormTPABTestingDefinition**](PaymentFormTPABTestingDefinition.md) |  | [optional] 
**SuggestedPaymentTP** | [**VersionedTouchPoints**](VersionedTouchPoints.md) |  | [optional] 
**InstallmentPlans** | [**List&lt;InstallmentPlans&gt;**](InstallmentPlans.md) |  | [optional] 
**RequestedStrategy** | [**PlanStrategy**](PlanStrategy.md) |  | [optional] 
**BillingAddress** | [**AddressData2**](AddressData2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

