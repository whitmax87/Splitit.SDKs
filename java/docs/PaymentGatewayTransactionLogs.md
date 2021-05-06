
# PaymentGatewayTransactionLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**avsMessageMessageCode** | **String** |  |  [optional]
**avsMessageMessageText** | **String** |  |  [optional]
**cvvMessageMessageCode** | **String** |  |  [optional]
**cvvMessageMessageText** | **String** |  |  [optional]
**expiryDateMessageMessageCode** | **String** |  |  [optional]
**expiryDateMessageMessageText** | **String** |  |  [optional]
**resultMessageMessageCode** | **String** |  |  [optional]
**resultMessageMessageText** | **String** |  |  [optional]
**result** | **Boolean** |  | 
**transactionId** | **String** |  |  [optional]
**completeResponseXml** | **String** |  |  [optional]
**additionalData** | **String** |  |  [optional]
**requestedCurrencyCode** | **String** |  |  [optional]
**terminalGatewayDataId** | **Long** |  | 
**referencePaymentGatewayTransactionLogId** | **Long** |  |  [optional]
**processedAmountAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**requestedAmountAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**installmentPlanId** | **Long** |  |  [optional]
**isChargeback** | **Boolean** |  | 
**isAsync** | **Boolean** |  |  [optional]
**transferId** | **String** |  |  [optional]
**referencePaymentGatewayTransactionLog** | [**PaymentGatewayTransactionLogs**](PaymentGatewayTransactionLogs.md) |  |  [optional]
**terminalGatewayData** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  |  [optional]
**fraudDetectionLogs** | [**List&lt;FraudDetectionLogs&gt;**](FraudDetectionLogs.md) |  |  [optional]
**installmentPaymentGatewayTransactionLogs** | [**List&lt;InstallmentPaymentGatewayTransactionLogs&gt;**](InstallmentPaymentGatewayTransactionLogs.md) |  |  [optional]
**inverseReferencePaymentGatewayTransactionLog** | [**List&lt;PaymentGatewayTransactionLogs&gt;**](PaymentGatewayTransactionLogs.md) |  |  [optional]
**paymentGatewayTransactionAsyncLogs** | [**List&lt;PaymentGatewayTransactionAsyncLogs&gt;**](PaymentGatewayTransactionAsyncLogs.md) |  |  [optional]
**reAuthorizationPaymentGatewayTransactionLogs** | [**List&lt;ReAuthorizationPaymentGatewayTransactionLogs&gt;**](ReAuthorizationPaymentGatewayTransactionLogs.md) |  |  [optional]
**publicId** | **String** |  |  [optional]
**traceId** | **String** |  |  [optional]
**type** | [**OperationType**](OperationType.md) |  | 
**avsMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  |  [optional]
**cvvMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  |  [optional]
**expiryDateMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  |  [optional]
**resultMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  |  [optional]
**processedAmount** | [**Money2**](Money2.md) |  |  [optional]
**requestedAmount** | [**Money2**](Money2.md) |  |  [optional]



