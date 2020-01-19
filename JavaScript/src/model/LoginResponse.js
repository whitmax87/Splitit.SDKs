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
import LoginResponse2 from './LoginResponse2';
import LoginResponseAllOf from './LoginResponseAllOf';
import ResponseHeader from './ResponseHeader';
import ResponseStatus from './ResponseStatus';

/**
 * The LoginResponse model module.
 * @module model/LoginResponse
 * @version 1.3.10
 */
class LoginResponse {
    /**
     * Constructs a new <code>LoginResponse</code>.
     * @alias module:model/LoginResponse
     * @implements module:model/LoginResponse2
     * @implements module:model/LoginResponseAllOf
     * @param result {Number} 
     */
    constructor(result) { 
        LoginResponse2.initialize(this);LoginResponseAllOf.initialize(this, result);
        LoginResponse.initialize(this, result);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, result) { 
        obj['Result'] = result;
    }

    /**
     * Constructs a <code>LoginResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LoginResponse} obj Optional instance to populate.
     * @return {module:model/LoginResponse} The populated <code>LoginResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LoginResponse();
            LoginResponse2.constructFromObject(data, obj);
            LoginResponseAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('ResponseHeader')) {
                obj['ResponseHeader'] = ResponseHeader.constructFromObject(data['ResponseHeader']);
            }
            if (data.hasOwnProperty('SessionId')) {
                obj['SessionId'] = ApiClient.convertToType(data['SessionId'], 'String');
            }
            if (data.hasOwnProperty('Result')) {
                obj['Result'] = ApiClient.convertToType(data['Result'], 'Number');
            }
            if (data.hasOwnProperty('ResponseStatus')) {
                obj['ResponseStatus'] = ResponseStatus.constructFromObject(data['ResponseStatus']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
LoginResponse.prototype['ResponseHeader'] = undefined;

/**
 * @member {String} SessionId
 */
LoginResponse.prototype['SessionId'] = undefined;

/**
 * @member {Number} Result
 */
LoginResponse.prototype['Result'] = undefined;

/**
 * @member {module:model/ResponseStatus} ResponseStatus
 */
LoginResponse.prototype['ResponseStatus'] = undefined;


// Implement LoginResponse2 interface:
/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
LoginResponse2.prototype['ResponseHeader'] = undefined;
/**
 * @member {String} SessionId
 */
LoginResponse2.prototype['SessionId'] = undefined;
// Implement LoginResponseAllOf interface:
/**
 * @member {Number} Result
 */
LoginResponseAllOf.prototype['Result'] = undefined;
/**
 * @member {module:model/ResponseStatus} ResponseStatus
 */
LoginResponseAllOf.prototype['ResponseStatus'] = undefined;




export default LoginResponse;

