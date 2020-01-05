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

/**
 * The PlanApprovalEvidence model module.
 * @module model/PlanApprovalEvidence
 * @version 1.1.0
 */
class PlanApprovalEvidence {
    /**
     * Constructs a new <code>PlanApprovalEvidence</code>.
     * @alias module:model/PlanApprovalEvidence
     * @param areTermsAndConditionsApproved {Boolean} 
     */
    constructor(areTermsAndConditionsApproved) { 
        
        PlanApprovalEvidence.initialize(this, areTermsAndConditionsApproved);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, areTermsAndConditionsApproved) { 
        obj['AreTermsAndConditionsApproved'] = areTermsAndConditionsApproved;
    }

    /**
     * Constructs a <code>PlanApprovalEvidence</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PlanApprovalEvidence} obj Optional instance to populate.
     * @return {module:model/PlanApprovalEvidence} The populated <code>PlanApprovalEvidence</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlanApprovalEvidence();

            if (data.hasOwnProperty('CustomerSignaturePngAsBase64')) {
                obj['CustomerSignaturePngAsBase64'] = ApiClient.convertToType(data['CustomerSignaturePngAsBase64'], 'String');
            }
            if (data.hasOwnProperty('AreTermsAndConditionsApproved')) {
                obj['AreTermsAndConditionsApproved'] = ApiClient.convertToType(data['AreTermsAndConditionsApproved'], 'Boolean');
            }
            if (data.hasOwnProperty('ShopperApprovalDateTime')) {
                obj['ShopperApprovalDateTime'] = ApiClient.convertToType(data['ShopperApprovalDateTime'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * @member {String} CustomerSignaturePngAsBase64
 */
PlanApprovalEvidence.prototype['CustomerSignaturePngAsBase64'] = undefined;

/**
 * @member {Boolean} AreTermsAndConditionsApproved
 */
PlanApprovalEvidence.prototype['AreTermsAndConditionsApproved'] = undefined;

/**
 * @member {Date} ShopperApprovalDateTime
 */
PlanApprovalEvidence.prototype['ShopperApprovalDateTime'] = undefined;






export default PlanApprovalEvidence;

