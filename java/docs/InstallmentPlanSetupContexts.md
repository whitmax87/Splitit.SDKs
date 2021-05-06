
# InstallmentPlanSetupContexts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**publicInstallmentPlanSession** | **String** |  |  [optional]
**billingAddressAddressLine** | **String** |  |  [optional]
**billingAddressZip** | **String** |  |  [optional]
**billingAddressAddressLine2** | **String** |  |  [optional]
**billingAddressCity** | **String** |  |  [optional]
**requestedNumberOfInstallments** | **String** |  |  [optional]
**successExitUrl** | **String** |  |  [optional]
**errorExitUrl** | **String** |  |  [optional]
**cancelExitUrl** | **String** |  |  [optional]
**abTestQueryString** | **String** |  |  [optional]
**requestedFirstInstallmentAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**requestedFirstScheduledInstallmentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sendShopperApprovalRequest** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sendShopperPaymentRequest** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**requestedCaptureOnCreation** | **Boolean** |  |  [optional]
**billingAddressCountryId** | **Long** |  |  [optional]
**suggestedPaymentTPId** | **Long** |  |  [optional]
**abTestingSessionId** | **Long** |  |  [optional]
**defaultNumOfInstallments** | **Integer** |  | 
**billingAddressStateId** | **Long** |  |  [optional]
**billingAddressLegacyFullAddressLine** | **String** |  |  [optional]
**requestedFunding** | **Boolean** |  |  [optional]
**successAsyncUrl** | **String** |  |  [optional]
**attempt3Dsecure** | **Boolean** |  |  [optional]
**viewName** | **String** |  |  [optional]
**isOpenedInIframe** | **Boolean** |  | 
**is3dSecureInPopup** | **Boolean** |  |  [optional]
**externalAuthUniqueGatewayId** | **String** |  |  [optional]
**externalAmountDetails** | [**BigDecimal**](BigDecimal.md) |  | 
**externalAuthDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**externalAuthTransactionLog** | **String** |  |  [optional]
**paymentApprovalPhone** | **String** |  |  [optional]
**paymentApprovalEmail** | **String** |  |  [optional]
**paymentMessage** | **String** |  |  [optional]
**termsAndConditionsKey** | **String** |  |  [optional]
**fingerPrintId** | **String** |  |  [optional]
**requestUpdateCardPhone** | **String** |  |  [optional]
**requestUpdateCardEmail** | **String** |  |  [optional]
**requestUpdateCardTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**billingAddressFirstTimePopulatedBy** | **String** |  |  [optional]
**country** | [**Countries**](Countries.md) |  |  [optional]
**state** | [**CountrySubdivisions**](CountrySubdivisions.md) |  |  [optional]
**abTestingSession** | [**PaymentFormTPABTestingDefinition**](PaymentFormTPABTestingDefinition.md) |  |  [optional]
**suggestedPaymentTP** | [**VersionedTouchPoints**](VersionedTouchPoints.md) |  |  [optional]
**installmentPlans** | [**List&lt;InstallmentPlans&gt;**](InstallmentPlans.md) |  |  [optional]
**requestedStrategy** | [**PlanStrategy**](PlanStrategy.md) |  |  [optional]
**billingAddress** | [**AddressData2**](AddressData2.md) |  |  [optional]



