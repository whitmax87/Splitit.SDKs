
# Processors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**name** | **String** |  |  [optional]
**apiUrl** | **String** |  |  [optional]
**maxNumberOfRetries** | **Integer** |  | 
**timeoutSeconds** | **Integer** |  | 
**maxAuth** | **Integer** |  | 
**gracePeriod** | **Integer** |  | 
**asyncRefundGracePeriodDays** | **Integer** |  |  [optional]
**isCheckedMastercard** | **Boolean** |  | 
**isCheckedUpi** | **Boolean** |  | 
**isCheckedVisa** | **Boolean** |  | 
**isCheckedAmex** | **Boolean** |  | 
**isCheckedMaestro** | **Boolean** |  | 
**isCheckedJcb** | **Boolean** |  | 
**isCheckedDiscover** | **Boolean** |  | 
**is3ds2Supported** | **Boolean** |  | 
**gatewayApiassembly** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**gatewayApiimplementorNs** | **String** |  |  [optional]
**isTokenSupported** | **Boolean** |  | 
**consumerUpdateCcGracePeriod** | **String** |  |  [optional]
**isVoidSupported** | **Boolean** |  | 
**isVoidAfterFailRefund** | **Boolean** |  | 
**minAmountAllowedForAuth** | [**BigDecimal**](BigDecimal.md) |  | 
**captureDelayInSec** | **Integer** |  | 
**voidDelayInSec** | **Integer** |  | 
**allowPartialVoid** | **Boolean** |  | 
**installments** | [**List&lt;Installments&gt;**](Installments.md) |  |  [optional]
**processorAuthenticationParameters** | [**List&lt;ProcessorAuthenticationParameters&gt;**](ProcessorAuthenticationParameters.md) |  |  [optional]
**reAuthorizations** | [**List&lt;ReAuthorizations&gt;**](ReAuthorizations.md) |  |  [optional]
**terminalGatewayDatas** | [**List&lt;TerminalGatewayDatas&gt;**](TerminalGatewayDatas.md) |  |  [optional]



