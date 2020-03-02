# Splitit Web API SDK for Java 1.7+

splitit-web-api-public-sdk
- API version: 1.0.0
  - Build date: 2020-03-02T08:02:37.421Z
- SDK Version: 1.3.16

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
        
        Configuration.addSandboxApiKey("_YOUR_API_KEY_");

        LoginApi loginApi = new LoginApi(Configuration.sandbox());
        LoginRequest request = new LoginRequest()
            .userName("_YOUR_USERNAME_")
            .password("_YOUR_PASSWORD_");

        try{
            System.out.println("Invoking loginPost...");
            LoginResponse loginResult = loginApi.loginPost(request);
            System.out.println("Login completed. Result:");
            System.out.println(loginResult.toString());
            System.out.println("");

            InstallmentPlanApi installmentPlanApi = new InstallmentPlanApi(Configuration.sandbox()).withSessionId(loginResult.getSessionId());
            
            System.out.println("Invoking installmentPlanInitiate...");
            InitiateInstallmentsPlanResponse initResponse = installmentPlanApi.installmentPlanInitiate(new InitiateInstallmentPlanRequest()
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
            CreateInstallmentsPlanResponse createResponse = installmentPlanApi.installmentPlanCreate(new CreateInstallmentPlanRequest()
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
*InfrastructureApi* | [**infrastructureGetResources**](docs/InfrastructureApi.md#infrastructureGetResources) | **POST** /api/Infrastructure/GetResources | 
*InstallmentPlanApi* | [**installmentPlanApprove**](docs/InstallmentPlanApi.md#installmentPlanApprove) | **POST** /api/InstallmentPlan/Approve | 
*InstallmentPlanApi* | [**installmentPlanCancel**](docs/InstallmentPlanApi.md#installmentPlanCancel) | **POST** /api/InstallmentPlan/Cancel | 
*InstallmentPlanApi* | [**installmentPlanCreate**](docs/InstallmentPlanApi.md#installmentPlanCreate) | **POST** /api/InstallmentPlan/Create | 
*InstallmentPlanApi* | [**installmentPlanGet**](docs/InstallmentPlanApi.md#installmentPlanGet) | **POST** /api/InstallmentPlan/Get | 
*InstallmentPlanApi* | [**installmentPlanGet3DSecureParameters**](docs/InstallmentPlanApi.md#installmentPlanGet3DSecureParameters) | **POST** /api/InstallmentPlan/Get3DSecureParameters | 
*InstallmentPlanApi* | [**installmentPlanGetExtended**](docs/InstallmentPlanApi.md#installmentPlanGetExtended) | **POST** /api/InstallmentPlan/GetExtended | 
*InstallmentPlanApi* | [**installmentPlanInitiate**](docs/InstallmentPlanApi.md#installmentPlanInitiate) | **POST** /api/InstallmentPlan/Initiate | 
*InstallmentPlanApi* | [**installmentPlanRefund**](docs/InstallmentPlanApi.md#installmentPlanRefund) | **POST** /api/InstallmentPlan/Refund | 
*InstallmentPlanApi* | [**installmentPlanStartInstallments**](docs/InstallmentPlanApi.md#installmentPlanStartInstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
*InstallmentPlanApi* | [**installmentPlanTermsAndConditions**](docs/InstallmentPlanApi.md#installmentPlanTermsAndConditions) | **POST** /api/InstallmentPlan/TermsAndConditions | 
*InstallmentPlanApi* | [**installmentPlanUpdate**](docs/InstallmentPlanApi.md#installmentPlanUpdate) | **POST** /api/InstallmentPlan/Update | 
*InstallmentPlanApi* | [**installmentPlanVerifyPayment**](docs/InstallmentPlanApi.md#installmentPlanVerifyPayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 
*LoginApi* | [**loginPost**](docs/LoginApi.md#loginPost) | **POST** /api/Login | 


## Documentation for Models

 - [AddressData2](docs/AddressData2.md)
 - [AmountDetails2](docs/AmountDetails2.md)
 - [ApproveInstallmentPlanRequest](docs/ApproveInstallmentPlanRequest.md)
 - [AuthenticationType](docs/AuthenticationType.md)
 - [CancelInstallmentPlanRequest](docs/CancelInstallmentPlanRequest.md)
 - [CardData](docs/CardData.md)
 - [CartData](docs/CartData.md)
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
 - [GetInstallmentsPlanResponse](docs/GetInstallmentsPlanResponse.md)
 - [GetInstallmentsPlanSearchCriteriaRequest](docs/GetInstallmentsPlanSearchCriteriaRequest.md)
 - [GetResourcesRequest](docs/GetResourcesRequest.md)
 - [GetResourcesRequestContext](docs/GetResourcesRequestContext.md)
 - [GetResourcesResponse](docs/GetResourcesResponse.md)
 - [InitiateInstallmentPlanRequest](docs/InitiateInstallmentPlanRequest.md)
 - [Installment](docs/Installment.md)
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
 - [LoginRequest](docs/LoginRequest.md)
 - [LoginResponse2](docs/LoginResponse2.md)
 - [Money](docs/Money.md)
 - [MoneyWithCurrencyCode](docs/MoneyWithCurrencyCode.md)
 - [PagingRequestHeader](docs/PagingRequestHeader.md)
 - [PagingResponseHeader](docs/PagingResponseHeader.md)
 - [PaymentToken](docs/PaymentToken.md)
 - [PaymentWizardData](docs/PaymentWizardData.md)
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
 - [ResponseError](docs/ResponseError.md)
 - [ResponseHeader](docs/ResponseHeader.md)
 - [ResponseStatus](docs/ResponseStatus.md)
 - [StartInstallmentsRequest](docs/StartInstallmentsRequest.md)
 - [SystemTextCategory](docs/SystemTextCategory.md)
 - [TermsAndConditions](docs/TermsAndConditions.md)
 - [TermsAndConditionsGetRequest](docs/TermsAndConditionsGetRequest.md)
 - [TermsAndConditionsGetResponse](docs/TermsAndConditionsGetResponse.md)
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
 - [BuRef](docs/BuRef.md)
 - [ConsumerData](docs/ConsumerData.md)
 - [CreateInstallmentsPlanResponse](docs/CreateInstallmentsPlanResponse.md)
 - [Currency](docs/Currency.md)
 - [ExtendedInstallmentPlan](docs/ExtendedInstallmentPlan.md)
 - [GetInstallmentsPlanExtendedResponse](docs/GetInstallmentsPlanExtendedResponse.md)
 - [InitiateInstallmentsPlanResponse](docs/InitiateInstallmentsPlanResponse.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [MerchantRef](docs/MerchantRef.md)
 - [RefundInstallmentPlanResponse](docs/RefundInstallmentPlanResponse.md)
 - [UpdateInstallmentPlanRequest](docs/UpdateInstallmentPlanRequest.md)
 - [UpdateInstallmentsPlanResponse](docs/UpdateInstallmentsPlanResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create each API instance for each thread in multithreaded environment to avoid potential issues.

## Author

[Splitit](https://www.splitit.com)
