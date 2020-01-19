/**
 * splitit-web-api-public-sdk
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import AddressData from './model/AddressData';
import AddressData2 from './model/AddressData2';
import AmountDetails from './model/AmountDetails';
import AmountDetails2 from './model/AmountDetails2';
import ApproveInstallmentPlanRequest from './model/ApproveInstallmentPlanRequest';
import AuthenticationType from './model/AuthenticationType';
import BuRef from './model/BuRef';
import CancelInstallmentPlanRequest from './model/CancelInstallmentPlanRequest';
import CardData from './model/CardData';
import CartData from './model/CartData';
import ConsumerData from './model/ConsumerData';
import CreateInstallmentPlanLegacyResponse from './model/CreateInstallmentPlanLegacyResponse';
import CreateInstallmentPlanRequest from './model/CreateInstallmentPlanRequest';
import CreateInstallmentsPlanResponse from './model/CreateInstallmentsPlanResponse';
import CreateInstallmentsPlanResponseAllOf from './model/CreateInstallmentsPlanResponseAllOf';
import Currency from './model/Currency';
import CurrencyAllOf from './model/CurrencyAllOf';
import DelayResolution from './model/DelayResolution';
import Error from './model/Error';
import EventsEndpoints from './model/EventsEndpoints';
import ExtendedInstallmentPlan from './model/ExtendedInstallmentPlan';
import ExtendedInstallmentPlanAllOf from './model/ExtendedInstallmentPlanAllOf';
import ExternalAuth from './model/ExternalAuth';
import FraudCheck from './model/FraudCheck';
import FraudCheckResult from './model/FraudCheckResult';
import Get3DSecureParametersRequest from './model/Get3DSecureParametersRequest';
import Get3DSecureParametersResponse from './model/Get3DSecureParametersResponse';
import GetInstallmentsPlanExtendedResponse from './model/GetInstallmentsPlanExtendedResponse';
import GetInstallmentsPlanExtendedResponseAllOf from './model/GetInstallmentsPlanExtendedResponseAllOf';
import GetInstallmentsPlanResponse from './model/GetInstallmentsPlanResponse';
import GetInstallmentsPlanSearchCriteriaRequest from './model/GetInstallmentsPlanSearchCriteriaRequest';
import InitiateInstallmentPlanRequest from './model/InitiateInstallmentPlanRequest';
import InitiateInstallmentsPlanResponse from './model/InitiateInstallmentsPlanResponse';
import InitiateInstallmentsPlanResponseAllOf from './model/InitiateInstallmentsPlanResponseAllOf';
import Installment from './model/Installment';
import InstallmentPlan from './model/InstallmentPlan';
import InstallmentPlanActivityStatus from './model/InstallmentPlanActivityStatus';
import InstallmentPlanCancelationReason from './model/InstallmentPlanCancelationReason';
import InstallmentPlanDateInfo from './model/InstallmentPlanDateInfo';
import InstallmentPlanInitiatedStatuses from './model/InstallmentPlanInitiatedStatuses';
import InstallmentPlanQueryCriteria from './model/InstallmentPlanQueryCriteria';
import InstallmentPlanResponse from './model/InstallmentPlanResponse';
import InstallmentPlanStatus from './model/InstallmentPlanStatus';
import InstallmentsPlanDateType from './model/InstallmentsPlanDateType';
import ItemData from './model/ItemData';
import LoginRequest from './model/LoginRequest';
import LoginResponse from './model/LoginResponse';
import LoginResponse2 from './model/LoginResponse2';
import LoginResponseAllOf from './model/LoginResponseAllOf';
import MerchantRef from './model/MerchantRef';
import Money from './model/Money';
import MoneyWithCurrencyCode from './model/MoneyWithCurrencyCode';
import PagingRequestHeader from './model/PagingRequestHeader';
import PagingResponseHeader from './model/PagingResponseHeader';
import PaymentToken from './model/PaymentToken';
import PaymentWizardData from './model/PaymentWizardData';
import PlanApprovalEvidence from './model/PlanApprovalEvidence';
import PlanData from './model/PlanData';
import PlanStrategy from './model/PlanStrategy';
import PurchaseMethod from './model/PurchaseMethod';
import ReAuthorization from './model/ReAuthorization';
import RedirectUrls from './model/RedirectUrls';
import ReferenceEntityBase from './model/ReferenceEntityBase';
import RefundInstallmentPlanResponse from './model/RefundInstallmentPlanResponse';
import RefundInstallmentPlanResponseAllOf from './model/RefundInstallmentPlanResponseAllOf';
import RefundPlanRequest from './model/RefundPlanRequest';
import RefundStrategy from './model/RefundStrategy';
import RefundUnderCancelation from './model/RefundUnderCancelation';
import RelationsLoad from './model/RelationsLoad';
import RequestHeader from './model/RequestHeader';
import ResponseError from './model/ResponseError';
import ResponseHeader from './model/ResponseHeader';
import ResponseStatus from './model/ResponseStatus';
import StartInstallmentsRequest from './model/StartInstallmentsRequest';
import TestModes from './model/TestModes';
import TouchPoint from './model/TouchPoint';
import TransactionInfo from './model/TransactionInfo';
import TransactionResult from './model/TransactionResult';
import TransactionStatus from './model/TransactionStatus';
import TransactionType from './model/TransactionType';
import UpdateInstallmentPlanRequest from './model/UpdateInstallmentPlanRequest';
import UpdateInstallmentPlanRequestAllOf from './model/UpdateInstallmentPlanRequestAllOf';
import UpdateInstallmentsPlanResponse from './model/UpdateInstallmentsPlanResponse';
import User from './model/User';
import VerifyPaymentRequest from './model/VerifyPaymentRequest';
import VerifyPaymentResponse from './model/VerifyPaymentResponse';
import CreateInstallmentPlanApi from './api/CreateInstallmentPlanApi';
import InstallmentPlanApi from './api/InstallmentPlanApi';
import LoginApi from './api/LoginApi';


/**
* Splitit Javascript SDK.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var SplititJsSdk = require('index'); // See note below*.
* var xxxSvc = new SplititJsSdk.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new SplititJsSdk.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new SplititJsSdk.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new SplititJsSdk.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.3.10
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The AddressData model constructor.
     * @property {module:model/AddressData}
     */
    AddressData,

    /**
     * The AddressData2 model constructor.
     * @property {module:model/AddressData2}
     */
    AddressData2,

    /**
     * The AmountDetails model constructor.
     * @property {module:model/AmountDetails}
     */
    AmountDetails,

    /**
     * The AmountDetails2 model constructor.
     * @property {module:model/AmountDetails2}
     */
    AmountDetails2,

    /**
     * The ApproveInstallmentPlanRequest model constructor.
     * @property {module:model/ApproveInstallmentPlanRequest}
     */
    ApproveInstallmentPlanRequest,

    /**
     * The AuthenticationType model constructor.
     * @property {module:model/AuthenticationType}
     */
    AuthenticationType,

    /**
     * The BuRef model constructor.
     * @property {module:model/BuRef}
     */
    BuRef,

    /**
     * The CancelInstallmentPlanRequest model constructor.
     * @property {module:model/CancelInstallmentPlanRequest}
     */
    CancelInstallmentPlanRequest,

    /**
     * The CardData model constructor.
     * @property {module:model/CardData}
     */
    CardData,

    /**
     * The CartData model constructor.
     * @property {module:model/CartData}
     */
    CartData,

    /**
     * The ConsumerData model constructor.
     * @property {module:model/ConsumerData}
     */
    ConsumerData,

    /**
     * The CreateInstallmentPlanLegacyResponse model constructor.
     * @property {module:model/CreateInstallmentPlanLegacyResponse}
     */
    CreateInstallmentPlanLegacyResponse,

    /**
     * The CreateInstallmentPlanRequest model constructor.
     * @property {module:model/CreateInstallmentPlanRequest}
     */
    CreateInstallmentPlanRequest,

    /**
     * The CreateInstallmentsPlanResponse model constructor.
     * @property {module:model/CreateInstallmentsPlanResponse}
     */
    CreateInstallmentsPlanResponse,

    /**
     * The CreateInstallmentsPlanResponseAllOf model constructor.
     * @property {module:model/CreateInstallmentsPlanResponseAllOf}
     */
    CreateInstallmentsPlanResponseAllOf,

    /**
     * The Currency model constructor.
     * @property {module:model/Currency}
     */
    Currency,

    /**
     * The CurrencyAllOf model constructor.
     * @property {module:model/CurrencyAllOf}
     */
    CurrencyAllOf,

    /**
     * The DelayResolution model constructor.
     * @property {module:model/DelayResolution}
     */
    DelayResolution,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The EventsEndpoints model constructor.
     * @property {module:model/EventsEndpoints}
     */
    EventsEndpoints,

    /**
     * The ExtendedInstallmentPlan model constructor.
     * @property {module:model/ExtendedInstallmentPlan}
     */
    ExtendedInstallmentPlan,

    /**
     * The ExtendedInstallmentPlanAllOf model constructor.
     * @property {module:model/ExtendedInstallmentPlanAllOf}
     */
    ExtendedInstallmentPlanAllOf,

    /**
     * The ExternalAuth model constructor.
     * @property {module:model/ExternalAuth}
     */
    ExternalAuth,

    /**
     * The FraudCheck model constructor.
     * @property {module:model/FraudCheck}
     */
    FraudCheck,

    /**
     * The FraudCheckResult model constructor.
     * @property {module:model/FraudCheckResult}
     */
    FraudCheckResult,

    /**
     * The Get3DSecureParametersRequest model constructor.
     * @property {module:model/Get3DSecureParametersRequest}
     */
    Get3DSecureParametersRequest,

    /**
     * The Get3DSecureParametersResponse model constructor.
     * @property {module:model/Get3DSecureParametersResponse}
     */
    Get3DSecureParametersResponse,

    /**
     * The GetInstallmentsPlanExtendedResponse model constructor.
     * @property {module:model/GetInstallmentsPlanExtendedResponse}
     */
    GetInstallmentsPlanExtendedResponse,

    /**
     * The GetInstallmentsPlanExtendedResponseAllOf model constructor.
     * @property {module:model/GetInstallmentsPlanExtendedResponseAllOf}
     */
    GetInstallmentsPlanExtendedResponseAllOf,

    /**
     * The GetInstallmentsPlanResponse model constructor.
     * @property {module:model/GetInstallmentsPlanResponse}
     */
    GetInstallmentsPlanResponse,

    /**
     * The GetInstallmentsPlanSearchCriteriaRequest model constructor.
     * @property {module:model/GetInstallmentsPlanSearchCriteriaRequest}
     */
    GetInstallmentsPlanSearchCriteriaRequest,

    /**
     * The InitiateInstallmentPlanRequest model constructor.
     * @property {module:model/InitiateInstallmentPlanRequest}
     */
    InitiateInstallmentPlanRequest,

    /**
     * The InitiateInstallmentsPlanResponse model constructor.
     * @property {module:model/InitiateInstallmentsPlanResponse}
     */
    InitiateInstallmentsPlanResponse,

    /**
     * The InitiateInstallmentsPlanResponseAllOf model constructor.
     * @property {module:model/InitiateInstallmentsPlanResponseAllOf}
     */
    InitiateInstallmentsPlanResponseAllOf,

    /**
     * The Installment model constructor.
     * @property {module:model/Installment}
     */
    Installment,

    /**
     * The InstallmentPlan model constructor.
     * @property {module:model/InstallmentPlan}
     */
    InstallmentPlan,

    /**
     * The InstallmentPlanActivityStatus model constructor.
     * @property {module:model/InstallmentPlanActivityStatus}
     */
    InstallmentPlanActivityStatus,

    /**
     * The InstallmentPlanCancelationReason model constructor.
     * @property {module:model/InstallmentPlanCancelationReason}
     */
    InstallmentPlanCancelationReason,

    /**
     * The InstallmentPlanDateInfo model constructor.
     * @property {module:model/InstallmentPlanDateInfo}
     */
    InstallmentPlanDateInfo,

    /**
     * The InstallmentPlanInitiatedStatuses model constructor.
     * @property {module:model/InstallmentPlanInitiatedStatuses}
     */
    InstallmentPlanInitiatedStatuses,

    /**
     * The InstallmentPlanQueryCriteria model constructor.
     * @property {module:model/InstallmentPlanQueryCriteria}
     */
    InstallmentPlanQueryCriteria,

    /**
     * The InstallmentPlanResponse model constructor.
     * @property {module:model/InstallmentPlanResponse}
     */
    InstallmentPlanResponse,

    /**
     * The InstallmentPlanStatus model constructor.
     * @property {module:model/InstallmentPlanStatus}
     */
    InstallmentPlanStatus,

    /**
     * The InstallmentsPlanDateType model constructor.
     * @property {module:model/InstallmentsPlanDateType}
     */
    InstallmentsPlanDateType,

    /**
     * The ItemData model constructor.
     * @property {module:model/ItemData}
     */
    ItemData,

    /**
     * The LoginRequest model constructor.
     * @property {module:model/LoginRequest}
     */
    LoginRequest,

    /**
     * The LoginResponse model constructor.
     * @property {module:model/LoginResponse}
     */
    LoginResponse,

    /**
     * The LoginResponse2 model constructor.
     * @property {module:model/LoginResponse2}
     */
    LoginResponse2,

    /**
     * The LoginResponseAllOf model constructor.
     * @property {module:model/LoginResponseAllOf}
     */
    LoginResponseAllOf,

    /**
     * The MerchantRef model constructor.
     * @property {module:model/MerchantRef}
     */
    MerchantRef,

    /**
     * The Money model constructor.
     * @property {module:model/Money}
     */
    Money,

    /**
     * The MoneyWithCurrencyCode model constructor.
     * @property {module:model/MoneyWithCurrencyCode}
     */
    MoneyWithCurrencyCode,

    /**
     * The PagingRequestHeader model constructor.
     * @property {module:model/PagingRequestHeader}
     */
    PagingRequestHeader,

    /**
     * The PagingResponseHeader model constructor.
     * @property {module:model/PagingResponseHeader}
     */
    PagingResponseHeader,

    /**
     * The PaymentToken model constructor.
     * @property {module:model/PaymentToken}
     */
    PaymentToken,

    /**
     * The PaymentWizardData model constructor.
     * @property {module:model/PaymentWizardData}
     */
    PaymentWizardData,

    /**
     * The PlanApprovalEvidence model constructor.
     * @property {module:model/PlanApprovalEvidence}
     */
    PlanApprovalEvidence,

    /**
     * The PlanData model constructor.
     * @property {module:model/PlanData}
     */
    PlanData,

    /**
     * The PlanStrategy model constructor.
     * @property {module:model/PlanStrategy}
     */
    PlanStrategy,

    /**
     * The PurchaseMethod model constructor.
     * @property {module:model/PurchaseMethod}
     */
    PurchaseMethod,

    /**
     * The ReAuthorization model constructor.
     * @property {module:model/ReAuthorization}
     */
    ReAuthorization,

    /**
     * The RedirectUrls model constructor.
     * @property {module:model/RedirectUrls}
     */
    RedirectUrls,

    /**
     * The ReferenceEntityBase model constructor.
     * @property {module:model/ReferenceEntityBase}
     */
    ReferenceEntityBase,

    /**
     * The RefundInstallmentPlanResponse model constructor.
     * @property {module:model/RefundInstallmentPlanResponse}
     */
    RefundInstallmentPlanResponse,

    /**
     * The RefundInstallmentPlanResponseAllOf model constructor.
     * @property {module:model/RefundInstallmentPlanResponseAllOf}
     */
    RefundInstallmentPlanResponseAllOf,

    /**
     * The RefundPlanRequest model constructor.
     * @property {module:model/RefundPlanRequest}
     */
    RefundPlanRequest,

    /**
     * The RefundStrategy model constructor.
     * @property {module:model/RefundStrategy}
     */
    RefundStrategy,

    /**
     * The RefundUnderCancelation model constructor.
     * @property {module:model/RefundUnderCancelation}
     */
    RefundUnderCancelation,

    /**
     * The RelationsLoad model constructor.
     * @property {module:model/RelationsLoad}
     */
    RelationsLoad,

    /**
     * The RequestHeader model constructor.
     * @property {module:model/RequestHeader}
     */
    RequestHeader,

    /**
     * The ResponseError model constructor.
     * @property {module:model/ResponseError}
     */
    ResponseError,

    /**
     * The ResponseHeader model constructor.
     * @property {module:model/ResponseHeader}
     */
    ResponseHeader,

    /**
     * The ResponseStatus model constructor.
     * @property {module:model/ResponseStatus}
     */
    ResponseStatus,

    /**
     * The StartInstallmentsRequest model constructor.
     * @property {module:model/StartInstallmentsRequest}
     */
    StartInstallmentsRequest,

    /**
     * The TestModes model constructor.
     * @property {module:model/TestModes}
     */
    TestModes,

    /**
     * The TouchPoint model constructor.
     * @property {module:model/TouchPoint}
     */
    TouchPoint,

    /**
     * The TransactionInfo model constructor.
     * @property {module:model/TransactionInfo}
     */
    TransactionInfo,

    /**
     * The TransactionResult model constructor.
     * @property {module:model/TransactionResult}
     */
    TransactionResult,

    /**
     * The TransactionStatus model constructor.
     * @property {module:model/TransactionStatus}
     */
    TransactionStatus,

    /**
     * The TransactionType model constructor.
     * @property {module:model/TransactionType}
     */
    TransactionType,

    /**
     * The UpdateInstallmentPlanRequest model constructor.
     * @property {module:model/UpdateInstallmentPlanRequest}
     */
    UpdateInstallmentPlanRequest,

    /**
     * The UpdateInstallmentPlanRequestAllOf model constructor.
     * @property {module:model/UpdateInstallmentPlanRequestAllOf}
     */
    UpdateInstallmentPlanRequestAllOf,

    /**
     * The UpdateInstallmentsPlanResponse model constructor.
     * @property {module:model/UpdateInstallmentsPlanResponse}
     */
    UpdateInstallmentsPlanResponse,

    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
     * The VerifyPaymentRequest model constructor.
     * @property {module:model/VerifyPaymentRequest}
     */
    VerifyPaymentRequest,

    /**
     * The VerifyPaymentResponse model constructor.
     * @property {module:model/VerifyPaymentResponse}
     */
    VerifyPaymentResponse,

    /**
    * The CreateInstallmentPlanApi service constructor.
    * @property {module:api/CreateInstallmentPlanApi}
    */
    CreateInstallmentPlanApi,

    /**
    * The InstallmentPlanApi service constructor.
    * @property {module:api/InstallmentPlanApi}
    */
    InstallmentPlanApi,

    /**
    * The LoginApi service constructor.
    * @property {module:api/LoginApi}
    */
    LoginApi
};
