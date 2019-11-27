/**
 * splitit-web-api-public
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

import ApiClient from '../ApiClient';
import AddressData from './AddressData';
import CardData from './CardData';
import CartData from './CartData';
import ConsumerData from './ConsumerData';
import EventsEndpoints from './EventsEndpoints';
import PaymentWizardData from './PaymentWizardData';
import PlanData from './PlanData';
import RedirectUrls from './RedirectUrls';
import RequestHeader from './RequestHeader';

/**
 * The InitiateInstallmentPlanRequest model module.
 * @module model/InitiateInstallmentPlanRequest
 * @version 1.0.0
 */
class InitiateInstallmentPlanRequest {
    /**
     * Constructs a new <code>InitiateInstallmentPlanRequest</code>.
     * @alias module:model/InitiateInstallmentPlanRequest
     */
    constructor() { 
        
        InitiateInstallmentPlanRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InitiateInstallmentPlanRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InitiateInstallmentPlanRequest} obj Optional instance to populate.
     * @return {module:model/InitiateInstallmentPlanRequest} The populated <code>InitiateInstallmentPlanRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InitiateInstallmentPlanRequest();

            if (data.hasOwnProperty('RequestHeader')) {
                obj['RequestHeader'] = RequestHeader.constructFromObject(data['RequestHeader']);
            }
            if (data.hasOwnProperty('PlanData')) {
                obj['PlanData'] = PlanData.constructFromObject(data['PlanData']);
            }
            if (data.hasOwnProperty('CartData')) {
                obj['CartData'] = CartData.constructFromObject(data['CartData']);
            }
            if (data.hasOwnProperty('ConsumerData')) {
                obj['ConsumerData'] = ConsumerData.constructFromObject(data['ConsumerData']);
            }
            if (data.hasOwnProperty('BillingAddress')) {
                obj['BillingAddress'] = AddressData.constructFromObject(data['BillingAddress']);
            }
            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
            }
            if (data.hasOwnProperty('PaymentWizardData')) {
                obj['PaymentWizardData'] = PaymentWizardData.constructFromObject(data['PaymentWizardData']);
            }
            if (data.hasOwnProperty('RedirectUrls')) {
                obj['RedirectUrls'] = RedirectUrls.constructFromObject(data['RedirectUrls']);
            }
            if (data.hasOwnProperty('EventsEndpoints')) {
                obj['EventsEndpoints'] = EventsEndpoints.constructFromObject(data['EventsEndpoints']);
            }
            if (data.hasOwnProperty('CreditCardDetails')) {
                obj['CreditCardDetails'] = CardData.constructFromObject(data['CreditCardDetails']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/RequestHeader} RequestHeader
 */
InitiateInstallmentPlanRequest.prototype['RequestHeader'] = undefined;

/**
 * @member {module:model/PlanData} PlanData
 */
InitiateInstallmentPlanRequest.prototype['PlanData'] = undefined;

/**
 * @member {module:model/CartData} CartData
 */
InitiateInstallmentPlanRequest.prototype['CartData'] = undefined;

/**
 * @member {module:model/ConsumerData} ConsumerData
 */
InitiateInstallmentPlanRequest.prototype['ConsumerData'] = undefined;

/**
 * @member {module:model/AddressData} BillingAddress
 */
InitiateInstallmentPlanRequest.prototype['BillingAddress'] = undefined;

/**
 * @member {String} InstallmentPlanNumber
 */
InitiateInstallmentPlanRequest.prototype['InstallmentPlanNumber'] = undefined;

/**
 * @member {module:model/PaymentWizardData} PaymentWizardData
 */
InitiateInstallmentPlanRequest.prototype['PaymentWizardData'] = undefined;

/**
 * @member {module:model/RedirectUrls} RedirectUrls
 */
InitiateInstallmentPlanRequest.prototype['RedirectUrls'] = undefined;

/**
 * @member {module:model/EventsEndpoints} EventsEndpoints
 */
InitiateInstallmentPlanRequest.prototype['EventsEndpoints'] = undefined;

/**
 * @member {module:model/CardData} CreditCardDetails
 */
InitiateInstallmentPlanRequest.prototype['CreditCardDetails'] = undefined;






export default InitiateInstallmentPlanRequest;

