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
 * The UpdateInstallmentPlanRequestAllOf model module.
 * @module model/UpdateInstallmentPlanRequestAllOf
 * @version 1.1.0
 */
class UpdateInstallmentPlanRequestAllOf {
    /**
     * Constructs a new <code>UpdateInstallmentPlanRequestAllOf</code>.
     * @alias module:model/UpdateInstallmentPlanRequestAllOf
     */
    constructor() { 
        
        UpdateInstallmentPlanRequestAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateInstallmentPlanRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateInstallmentPlanRequestAllOf} obj Optional instance to populate.
     * @return {module:model/UpdateInstallmentPlanRequestAllOf} The populated <code>UpdateInstallmentPlanRequestAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateInstallmentPlanRequestAllOf();

            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} InstallmentPlanNumber
 */
UpdateInstallmentPlanRequestAllOf.prototype['InstallmentPlanNumber'] = undefined;






export default UpdateInstallmentPlanRequestAllOf;

