
# InstallmentPlanAuditLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**activityExecutionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**userId** | **Long** |  |  [optional]
**userUniqueId** | **String** |  |  [optional]
**businessActivity** | [**BusinessActivity**](BusinessActivity.md) |  | 
**traceId** | **String** |  |  [optional]
**result** | **Boolean** |  | 
**versionedTouchPoint** | [**VersionedTouchPoints**](VersionedTouchPoints.md) |  |  [optional]
**versionedTouchPointId** | **Long** |  |  [optional]
**discriminator** | **String** |  |  [optional]
**additionalInfo** | **String** |  |  [optional]
**userType** | [**UserType**](UserType.md) |  |  [optional]
**installmentPlanId** | **Long** |  |  [optional]
**creatingIPAddress** | **String** |  |  [optional]
**cardId** | **Long** |  |  [optional]
**card** | [**Cards**](Cards.md) |  |  [optional]
**installmentPlan** | [**InstallmentPlans**](InstallmentPlans.md) |  |  [optional]
**errorCode** | [**PisErrorCodes**](PisErrorCodes.md) |  |  [optional]



