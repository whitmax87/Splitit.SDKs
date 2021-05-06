# Splitit.SDK.Client.Model.PaymentGatewayTransactionLogs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long?** |  | 
**AvsMessageMessageCode** | **string** |  | [optional] 
**AvsMessageMessageText** | **string** |  | [optional] 
**CvvMessageMessageCode** | **string** |  | [optional] 
**CvvMessageMessageText** | **string** |  | [optional] 
**ExpiryDateMessageMessageCode** | **string** |  | [optional] 
**ExpiryDateMessageMessageText** | **string** |  | [optional] 
**ResultMessageMessageCode** | **string** |  | [optional] 
**ResultMessageMessageText** | **string** |  | [optional] 
**Result** | **bool?** |  | 
**TransactionId** | **string** |  | [optional] 
**CompleteResponseXml** | **string** |  | [optional] 
**AdditionalData** | **string** |  | [optional] 
**RequestedCurrencyCode** | **string** |  | [optional] 
**TerminalGatewayDataId** | **long?** |  | 
**ReferencePaymentGatewayTransactionLogId** | **long?** |  | [optional] 
**ProcessedAmountAmount** | **decimal?** |  | 
**RequestedAmountAmount** | **decimal?** |  | 
**InstallmentPlanId** | **long?** |  | [optional] 
**IsChargeback** | **bool?** |  | 
**IsAsync** | **bool?** |  | [optional] 
**TransferId** | **string** |  | [optional] 
**ReferencePaymentGatewayTransactionLog** | [**PaymentGatewayTransactionLogs**](PaymentGatewayTransactionLogs.md) |  | [optional] 
**TerminalGatewayData** | [**TerminalGatewayDatas**](TerminalGatewayDatas.md) |  | [optional] 
**FraudDetectionLogs** | [**List&lt;FraudDetectionLogs&gt;**](FraudDetectionLogs.md) |  | [optional] 
**InstallmentPaymentGatewayTransactionLogs** | [**List&lt;InstallmentPaymentGatewayTransactionLogs&gt;**](InstallmentPaymentGatewayTransactionLogs.md) |  | [optional] 
**InverseReferencePaymentGatewayTransactionLog** | [**List&lt;PaymentGatewayTransactionLogs&gt;**](PaymentGatewayTransactionLogs.md) |  | [optional] 
**PaymentGatewayTransactionAsyncLogs** | [**List&lt;PaymentGatewayTransactionAsyncLogs&gt;**](PaymentGatewayTransactionAsyncLogs.md) |  | [optional] 
**ReAuthorizationPaymentGatewayTransactionLogs** | [**List&lt;ReAuthorizationPaymentGatewayTransactionLogs&gt;**](ReAuthorizationPaymentGatewayTransactionLogs.md) |  | [optional] 
**PublicId** | **string** |  | [optional] 
**TraceId** | **string** |  | [optional] 
**Type** | [**OperationType**](OperationType.md) |  | 
**AvsMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**CvvMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**ExpiryDateMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**ResultMessage** | [**PaymentGatewayMessage**](PaymentGatewayMessage.md) |  | [optional] 
**ProcessedAmount** | [**Money2**](Money2.md) |  | [optional] 
**RequestedAmount** | [**Money2**](Money2.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

