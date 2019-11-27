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
import CreateInstallmentsPlanResponseAllOf from './CreateInstallmentsPlanResponseAllOf';
import InstallmentPlan from './InstallmentPlan';
import InstallmentPlanResponse from './InstallmentPlanResponse';
import ResponseHeader from './ResponseHeader';

/**
 * The CreateInstallmentsPlanResponse model module.
 * @module model/CreateInstallmentsPlanResponse
 * @version 1.0.0
 */
class CreateInstallmentsPlanResponse {
    /**
     * Constructs a new <code>CreateInstallmentsPlanResponse</code>.
     * @alias module:model/CreateInstallmentsPlanResponse
     * @implements module:model/InstallmentPlanResponse
     * @implements module:model/CreateInstallmentsPlanResponseAllOf
     */
    constructor() { 
        InstallmentPlanResponse.initialize(this);CreateInstallmentsPlanResponseAllOf.initialize(this);
        CreateInstallmentsPlanResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateInstallmentsPlanResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateInstallmentsPlanResponse} obj Optional instance to populate.
     * @return {module:model/CreateInstallmentsPlanResponse} The populated <code>CreateInstallmentsPlanResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateInstallmentsPlanResponse();
            InstallmentPlanResponse.constructFromObject(data, obj);
            CreateInstallmentsPlanResponseAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('ResponseHeader')) {
                obj['ResponseHeader'] = ResponseHeader.constructFromObject(data['ResponseHeader']);
            }
            if (data.hasOwnProperty('InstallmentPlan')) {
                obj['InstallmentPlan'] = InstallmentPlan.constructFromObject(data['InstallmentPlan']);
            }
            if (data.hasOwnProperty('ApprovalUrl')) {
                obj['ApprovalUrl'] = ApiClient.convertToType(data['ApprovalUrl'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
CreateInstallmentsPlanResponse.prototype['ResponseHeader'] = undefined;

/**
 * @member {module:model/InstallmentPlan} InstallmentPlan
 */
CreateInstallmentsPlanResponse.prototype['InstallmentPlan'] = undefined;

/**
 * @member {String} ApprovalUrl
 */
CreateInstallmentsPlanResponse.prototype['ApprovalUrl'] = undefined;


// Implement InstallmentPlanResponse interface:
/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
InstallmentPlanResponse.prototype['ResponseHeader'] = undefined;
/**
 * @member {module:model/InstallmentPlan} InstallmentPlan
 */
InstallmentPlanResponse.prototype['InstallmentPlan'] = undefined;
// Implement CreateInstallmentsPlanResponseAllOf interface:
/**
 * @member {String} ApprovalUrl
 */
CreateInstallmentsPlanResponseAllOf.prototype['ApprovalUrl'] = undefined;




export default CreateInstallmentsPlanResponse;

