# Splitit Web API SDK for Java 1.7+

splitit-web-api-public-sdk
- API version: 1.0.0
  - Build date: 2021-08-02T10:18:45.756Z
- SDK Version: 1.6.9

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.splitit.sdk.model.*;

import java.math.BigDecimal;

import com.splitit.*;
import com.splitit.sdk.api.*;

public class SimpleFlowExample {

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient()
            .sandbox(true)
            .username("_YOUR_USERNAME_")
            .password("_YOUR_PASSWORD_")
            .apiKey("_YOUR_API_KEY_");

        try{
            // apiClient.cultureName("de-DE"); // optionally set culture for subsequent API calls.

            System.out.println("Invoking installmentPlanInitiate...");
            InitiateInstallmentsPlanResponse initResponse = apiClient.getInstallmentPlanApi().installmentPlanInitiate(new InitiateInstallmentPlanRequest()
                .planData(new PlanData()
                    .numberOfInstallments(3)
                    .amount(new MoneyWithCurrencyCode()
                        .value(new BigDecimal(1000))
                        .currencyCode("USD")
                    )
                )
                .billingAddress(new AddressData()
                    .addressLine("260 Madison Avenue.")
                    .addressLine2("Appartment 1")
                    .city("New York")
                    .state("NY")
                    .country("USA")
                    .zip("10016"))
                .consumerData(new ConsumerData()
                    .isLocked(false)
                    .isDataRestricted(false)
                    .fullName("John Smith")
                    .email("john@splitit.com")
                    .phoneNumber("1-844-775-4848")
                    .cultureName("en-us")
                )
            );
            System.out.println("installmentPlanInitiate completed. Result:");
            System.out.println(initResponse.toString());
            System.out.println("");

            System.out.println("Invoking installmentPlanCreate...");
            CreateInstallmentsPlanResponse createResponse = apiClient.getInstallmentPlanApi().installmentPlanCreate(new CreateInstallmentPlanRequest()
                .creditCardDetails(new CardData()
                    .cardNumber("411111111111111")
                    .cardCvv("123")
                    .cardHolderFullName("John Smith")
                    .cardExpMonth("12")
                    .cardExpYear("2022")
                )
                .installmentPlanNumber(initResponse.getInstallmentPlan().getInstallmentPlanNumber())
                .planApprovalEvidence(new PlanApprovalEvidence().areTermsAndConditionsApproved(true)));

            System.out.println("installmentPlanCreate completed. Result:");
            System.out.println(createResponse.toString());
            System.out.println("");

        } catch (Exception ex){
            System.out.println("Error calling Splitit Web API:");
            System.out.println(ex.getMessage());
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://webapi.production.splitit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CreateInstallmentPlanApi* | [**createInstallmentPlanGet**](docs/CreateInstallmentPlanApi.md#createInstallmentPlanGet) | **GET** /api/CreateInstallmentPlan | 
*InfoApi* | [**infoGetLearnMoreDetails**](docs/InfoApi.md#infoGetLearnMoreDetails) | **POST** /api/Merchant/GetLearnMoreDetails | 
*InfrastructureApi* | [**infrastructureGetResources**](docs/InfrastructureApi.md#infrastructureGetResources) | **POST** /api/Infrastructure/GetResources | 
*InfrastructureApi* | [**infrastructureGetResources2**](docs/InfrastructureApi.md#infrastructureGetResources2) | **GET** /api/Infrastructure/GetResources | 
*InstallmentPlanApi* | [**installmentPlanApprove**](docs/InstallmentPlanApi.md#installmentPlanApprove) | **POST** /api/InstallmentPlan/Approve | 
*InstallmentPlanApi* | [**installmentPlanCancel**](docs/InstallmentPlanApi.md#installmentPlanCancel) | **POST** /api/InstallmentPlan/Cancel | 
*InstallmentPlanApi* | [**installmentPlanChargeBack**](docs/InstallmentPlanApi.md#installmentPlanChargeBack) | **POST** /api/InstallmentPlan/ChargeBack | 
*InstallmentPlanApi* | [**installmentPlanCreate**](docs/InstallmentPlanApi.md#installmentPlanCreate) | **POST** /api/InstallmentPlan/Create | 
*InstallmentPlanApi* | [**installmentPlanGet**](docs/InstallmentPlanApi.md#installmentPlanGet) | **POST** /api/InstallmentPlan/Get | 
*InstallmentPlanApi* | [**installmentPlanGet3DSecureParameters**](docs/InstallmentPlanApi.md#installmentPlanGet3DSecureParameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
*InstallmentPlanApi* | [**installmentPlanGetExtended**](docs/InstallmentPlanApi.md#installmentPlanGetExtended) | **POST** /api/InstallmentPlan/GetExtended | 
*InstallmentPlanApi* | [**installmentPlanGetFraudStatusDisplay**](docs/InstallmentPlanApi.md#installmentPlanGetFraudStatusDisplay) | **POST** /api/InstallmentPlan/GetFraudStatusDisplay | 
*InstallmentPlanApi* | [**installmentPlanGetInitiatedInstallmentPlanRequest**](docs/InstallmentPlanApi.md#installmentPlanGetInitiatedInstallmentPlanRequest) | **POST** /api/InstallmentPlan/GetInitiatedInstallmentPlanRequest | 
*InstallmentPlanApi* | [**installmentPlanGetInitiatedUpdatePaymentData**](docs/InstallmentPlanApi.md#installmentPlanGetInitiatedUpdatePaymentData) | **GET** /api/InstallmentPlan/GetInitiatedUpdatePaymentData | 
*InstallmentPlanApi* | [**installmentPlanGetLearnMoreDetails**](docs/InstallmentPlanApi.md#installmentPlanGetLearnMoreDetails) | **POST** /api/InstallmentPlan/GetLearnMoreDetails | 
*InstallmentPlanApi* | [**installmentPlanGetPGTL**](docs/InstallmentPlanApi.md#installmentPlanGetPGTL) | **POST** /api/InstallmentPlan/GetPGTL | 
*InstallmentPlanApi* | [**installmentPlanGetSchedules**](docs/InstallmentPlanApi.md#installmentPlanGetSchedules) | **POST** /api/InstallmentPlan/GetSchedules | 
*InstallmentPlanApi* | [**installmentPlanInitiate**](docs/InstallmentPlanApi.md#installmentPlanInitiate) | **POST** /api/InstallmentPlan/Initiate | 
*InstallmentPlanApi* | [**installmentPlanRefund**](docs/InstallmentPlanApi.md#installmentPlanRefund) | **POST** /api/InstallmentPlan/Refund | 
*InstallmentPlanApi* | [**installmentPlanRequestPayment**](docs/InstallmentPlanApi.md#installmentPlanRequestPayment) | **POST** /api/InstallmentPlan/RequestPayment | 
*InstallmentPlanApi* | [**installmentPlanStartInstallments**](docs/InstallmentPlanApi.md#installmentPlanStartInstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
*InstallmentPlanApi* | [**installmentPlanTermsAndConditions**](docs/InstallmentPlanApi.md#installmentPlanTermsAndConditions) | **POST** /api/InstallmentPlan/TermsAndConditions | 
*InstallmentPlanApi* | [**installmentPlanTestCard**](docs/InstallmentPlanApi.md#installmentPlanTestCard) | **POST** /api/InstallmentPlan/TestCard | 
*InstallmentPlanApi* | [**installmentPlanUpdate**](docs/InstallmentPlanApi.md#installmentPlanUpdate) | **POST** /api/InstallmentPlan/Update | 
*InstallmentPlanApi* | [**installmentPlanVerifyPayment**](docs/InstallmentPlanApi.md#installmentPlanVerifyPayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 
*LoginApi* | [**loginPost**](docs/LoginApi.md#loginPost) | **POST** /api/Login | 


## Documentation for Models

 - [AddressData2](docs/AddressData2.md)
 - [AmountDetails2](docs/AmountDetails2.md)
 - [ApproveInstallmentPlanRequest](docs/ApproveInstallmentPlanRequest.md)
 - [AuthenticationType](docs/AuthenticationType.md)
 - [CancelInstallmentPlanRequest](docs/CancelInstallmentPlanRequest.md)
 - [CardBrand](docs/CardBrand.md)
 - [CardData](docs/CardData.md)
 - [CardResult](docs/CardResult.md)
 - [CardType](docs/CardType.md)
 - [CartData](docs/CartData.md)
 - [ChargebackRequest](docs/ChargebackRequest.md)
 - [CreateInstallmentPlanLegacyResponse](docs/CreateInstallmentPlanLegacyResponse.md)
 - [CreateInstallmentPlanRequest](docs/CreateInstallmentPlanRequest.md)
 - [DelayResolution](docs/DelayResolution.md)
 - [Error](docs/Error.md)
 - [EventsEndpoints](docs/EventsEndpoints.md)
 - [ExternalAuth](docs/ExternalAuth.md)
 - [FraudCheck](docs/FraudCheck.md)
 - [FraudCheckResult](docs/FraudCheckResult.md)
 - [Get3DSecureParametersRequest](docs/Get3DSecureParametersRequest.md)
 - [Get3DSecureParametersResponse](docs/Get3DSecureParametersResponse.md)
 - [GetFraudStatusDisplayRequest](docs/GetFraudStatusDisplayRequest.md)
 - [GetFraudStatusDisplayResponse](docs/GetFraudStatusDisplayResponse.md)
 - [GetInitiatedInstallmentPlanRequest](docs/GetInitiatedInstallmentPlanRequest.md)
 - [GetInitiatedInstallmentPlanResponse](docs/GetInitiatedInstallmentPlanResponse.md)
 - [GetInitiatedUpdatePaymentDataResponse](docs/GetInitiatedUpdatePaymentDataResponse.md)
 - [GetInstallmentSchedulesRequest](docs/GetInstallmentSchedulesRequest.md)
 - [GetInstallmentsPlanResponse](docs/GetInstallmentsPlanResponse.md)
 - [GetInstallmentsPlanSearchCriteriaRequest](docs/GetInstallmentsPlanSearchCriteriaRequest.md)
 - [GetInstallmentsScheduleResponse](docs/GetInstallmentsScheduleResponse.md)
 - [GetPGTLRequest](docs/GetPGTLRequest.md)
 - [GetPGTLResponse](docs/GetPGTLResponse.md)
 - [GetResourcesRequest](docs/GetResourcesRequest.md)
 - [GetResourcesRequestContext](docs/GetResourcesRequestContext.md)
 - [GetResourcesResponse](docs/GetResourcesResponse.md)
 - [InitiateInstallmentPlanRequest](docs/InitiateInstallmentPlanRequest.md)
 - [Installment](docs/Installment.md)
 - [Installment2](docs/Installment2.md)
 - [InstallmentPlan](docs/InstallmentPlan.md)
 - [InstallmentPlanActivityStatus](docs/InstallmentPlanActivityStatus.md)
 - [InstallmentPlanCancelationReason](docs/InstallmentPlanCancelationReason.md)
 - [InstallmentPlanDateInfo](docs/InstallmentPlanDateInfo.md)
 - [InstallmentPlanInitiatedStatuses](docs/InstallmentPlanInitiatedStatuses.md)
 - [InstallmentPlanQueryCriteria](docs/InstallmentPlanQueryCriteria.md)
 - [InstallmentPlanResponse](docs/InstallmentPlanResponse.md)
 - [InstallmentPlanStatus](docs/InstallmentPlanStatus.md)
 - [InstallmentsPlanDateType](docs/InstallmentsPlanDateType.md)
 - [ItemData](docs/ItemData.md)
 - [LearnMoreDetailsRequest](docs/LearnMoreDetailsRequest.md)
 - [LearnMoreDetailsResponse](docs/LearnMoreDetailsResponse.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [Money](docs/Money.md)
 - [MoneyFlows](docs/MoneyFlows.md)
 - [MoneyWithCurrencyCode](docs/MoneyWithCurrencyCode.md)
 - [OperationType](docs/OperationType.md)
 - [PagingRequestHeader](docs/PagingRequestHeader.md)
 - [PagingResponseHeader](docs/PagingResponseHeader.md)
 - [PaymentFormMessage](docs/PaymentFormMessage.md)
 - [PaymentFormMessageType](docs/PaymentFormMessageType.md)
 - [PaymentToken](docs/PaymentToken.md)
 - [PaymentWizardData](docs/PaymentWizardData.md)
 - [PgtlDto](docs/PgtlDto.md)
 - [PlanApprovalEvidence](docs/PlanApprovalEvidence.md)
 - [PlanData](docs/PlanData.md)
 - [PlanStrategy](docs/PlanStrategy.md)
 - [PurchaseMethod](docs/PurchaseMethod.md)
 - [ReAuthorization](docs/ReAuthorization.md)
 - [RedirectUrls](docs/RedirectUrls.md)
 - [ReferenceEntityBase](docs/ReferenceEntityBase.md)
 - [RefundPlanRequest](docs/RefundPlanRequest.md)
 - [RefundStrategy](docs/RefundStrategy.md)
 - [RefundUnderCancelation](docs/RefundUnderCancelation.md)
 - [RelationsLoad](docs/RelationsLoad.md)
 - [RequestHeader](docs/RequestHeader.md)
 - [RequestPaymentRequest](docs/RequestPaymentRequest.md)
 - [RequestPaymentResponse](docs/RequestPaymentResponse.md)
 - [ResponseHeader](docs/ResponseHeader.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleElements](docs/ScheduleElements.md)
 - [StartInstallmentsRequest](docs/StartInstallmentsRequest.md)
 - [SystemTextCategory](docs/SystemTextCategory.md)
 - [TermsAndConditions](docs/TermsAndConditions.md)
 - [TermsAndConditionsGetRequest](docs/TermsAndConditionsGetRequest.md)
 - [TermsAndConditionsGetResponse](docs/TermsAndConditionsGetResponse.md)
 - [TestCardRequest](docs/TestCardRequest.md)
 - [TestModes](docs/TestModes.md)
 - [TouchPoint](docs/TouchPoint.md)
 - [TransactionInfo](docs/TransactionInfo.md)
 - [TransactionResult](docs/TransactionResult.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionType](docs/TransactionType.md)
 - [User](docs/User.md)
 - [VerifyPaymentRequest](docs/VerifyPaymentRequest.md)
 - [VerifyPaymentResponse](docs/VerifyPaymentResponse.md)
 - [AddressData](docs/AddressData.md)
 - [AmountDetails](docs/AmountDetails.md)
 - [ConsumerData](docs/ConsumerData.md)
 - [CreateInstallmentsPlanResponse](docs/CreateInstallmentsPlanResponse.md)
 - [Currency](docs/Currency.md)
 - [GetInstallmentsPlanExtendedResponse](docs/GetInstallmentsPlanExtendedResponse.md)
 - [InitiateInstallmentsPlanResponse](docs/InitiateInstallmentsPlanResponse.md)
 - [MerchantRef](docs/MerchantRef.md)
 - [PaymentWizardDataResponse](docs/PaymentWizardDataResponse.md)
 - [RefundInstallmentPlanResponse](docs/RefundInstallmentPlanResponse.md)
 - [UpdateInstallmentPlanRequest](docs/UpdateInstallmentPlanRequest.md)
 - [UpdateInstallmentsPlanResponse](docs/UpdateInstallmentsPlanResponse.md)
 - [ExtendedCurrency](docs/ExtendedCurrency.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create each API instance for each thread in multithreaded environment to avoid potential issues.

## Author

[Splitit](https://www.splitit.com)
