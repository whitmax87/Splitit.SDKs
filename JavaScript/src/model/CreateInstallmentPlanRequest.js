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

import ApiClient from '../ApiClient';
import AddressData from './AddressData';
import CardData from './CardData';
import CartData from './CartData';
import ConsumerData from './ConsumerData';
import EventsEndpoints from './EventsEndpoints';
import ExternalAuth from './ExternalAuth';
import PaymentToken from './PaymentToken';
import PlanApprovalEvidence from './PlanApprovalEvidence';
import PlanData from './PlanData';
import RedirectUrls from './RedirectUrls';

/**
 * The CreateInstallmentPlanRequest model module.
 * @module model/CreateInstallmentPlanRequest
 * @version 1.3.10
 */
class CreateInstallmentPlanRequest {
    /**
     * Constructs a new <code>CreateInstallmentPlanRequest</code>.
     * @alias module:model/CreateInstallmentPlanRequest
     */
    constructor() { 
        
        CreateInstallmentPlanRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateInstallmentPlanRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateInstallmentPlanRequest} obj Optional instance to populate.
     * @return {module:model/CreateInstallmentPlanRequest} The populated <code>CreateInstallmentPlanRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateInstallmentPlanRequest();

            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
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
            if (data.hasOwnProperty('CreditCardDetails')) {
                obj['CreditCardDetails'] = CardData.constructFromObject(data['CreditCardDetails']);
            }
            if (data.hasOwnProperty('PaymentToken')) {
                obj['PaymentToken'] = PaymentToken.constructFromObject(data['PaymentToken']);
            }
            if (data.hasOwnProperty('PlanApprovalEvidence')) {
                obj['PlanApprovalEvidence'] = PlanApprovalEvidence.constructFromObject(data['PlanApprovalEvidence']);
            }
            if (data.hasOwnProperty('RedirectUrls')) {
                obj['RedirectUrls'] = RedirectUrls.constructFromObject(data['RedirectUrls']);
            }
            if (data.hasOwnProperty('EventsEndpoints')) {
                obj['EventsEndpoints'] = EventsEndpoints.constructFromObject(data['EventsEndpoints']);
            }
            if (data.hasOwnProperty('ExternalAuth')) {
                obj['ExternalAuth'] = ExternalAuth.constructFromObject(data['ExternalAuth']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} InstallmentPlanNumber
 */
CreateInstallmentPlanRequest.prototype['InstallmentPlanNumber'] = undefined;

/**
 * @member {module:model/PlanData} PlanData
 */
CreateInstallmentPlanRequest.prototype['PlanData'] = undefined;

/**
 * @member {module:model/CartData} CartData
 */
CreateInstallmentPlanRequest.prototype['CartData'] = undefined;

/**
 * @member {module:model/ConsumerData} ConsumerData
 */
CreateInstallmentPlanRequest.prototype['ConsumerData'] = undefined;

/**
 * @member {module:model/AddressData} BillingAddress
 */
CreateInstallmentPlanRequest.prototype['BillingAddress'] = undefined;

/**
 * @member {module:model/CardData} CreditCardDetails
 */
CreateInstallmentPlanRequest.prototype['CreditCardDetails'] = undefined;

/**
 * @member {module:model/PaymentToken} PaymentToken
 */
CreateInstallmentPlanRequest.prototype['PaymentToken'] = undefined;

/**
 * @member {module:model/PlanApprovalEvidence} PlanApprovalEvidence
 */
CreateInstallmentPlanRequest.prototype['PlanApprovalEvidence'] = undefined;

/**
 * @member {module:model/RedirectUrls} RedirectUrls
 */
CreateInstallmentPlanRequest.prototype['RedirectUrls'] = undefined;

/**
 * @member {module:model/EventsEndpoints} EventsEndpoints
 */
CreateInstallmentPlanRequest.prototype['EventsEndpoints'] = undefined;

/**
 * @member {module:model/ExternalAuth} ExternalAuth
 */
CreateInstallmentPlanRequest.prototype['ExternalAuth'] = undefined;






export default CreateInstallmentPlanRequest;

