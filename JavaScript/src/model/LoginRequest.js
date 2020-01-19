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
import TouchPoint from './TouchPoint';

/**
 * The LoginRequest model module.
 * @module model/LoginRequest
 * @version 1.3.10
 */
class LoginRequest {
    /**
     * Constructs a new <code>LoginRequest</code>.
     * @alias module:model/LoginRequest
     */
    constructor() { 
        
        LoginRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LoginRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LoginRequest} obj Optional instance to populate.
     * @return {module:model/LoginRequest} The populated <code>LoginRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LoginRequest();

            if (data.hasOwnProperty('UserName')) {
                obj['UserName'] = ApiClient.convertToType(data['UserName'], 'String');
            }
            if (data.hasOwnProperty('Password')) {
                obj['Password'] = ApiClient.convertToType(data['Password'], 'String');
            }
            if (data.hasOwnProperty('TouchPoint')) {
                obj['TouchPoint'] = TouchPoint.constructFromObject(data['TouchPoint']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} UserName
 */
LoginRequest.prototype['UserName'] = undefined;

/**
 * @member {String} Password
 */
LoginRequest.prototype['Password'] = undefined;

/**
 * @member {module:model/TouchPoint} TouchPoint
 */
LoginRequest.prototype['TouchPoint'] = undefined;






export default LoginRequest;

