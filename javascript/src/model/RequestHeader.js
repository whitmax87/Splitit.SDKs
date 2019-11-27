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
import AuthenticationType from './AuthenticationType';
import TouchPoint from './TouchPoint';

/**
 * The RequestHeader model module.
 * @module model/RequestHeader
 * @version 1.0.0
 */
class RequestHeader {
    /**
     * Constructs a new <code>RequestHeader</code>.
     * @alias module:model/RequestHeader
     */
    constructor() { 
        
        RequestHeader.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RequestHeader</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RequestHeader} obj Optional instance to populate.
     * @return {module:model/RequestHeader} The populated <code>RequestHeader</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RequestHeader();

            if (data.hasOwnProperty('TouchPoint')) {
                obj['TouchPoint'] = TouchPoint.constructFromObject(data['TouchPoint']);
            }
            if (data.hasOwnProperty('SessionId')) {
                obj['SessionId'] = ApiClient.convertToType(data['SessionId'], 'String');
            }
            if (data.hasOwnProperty('ApiKey')) {
                obj['ApiKey'] = ApiClient.convertToType(data['ApiKey'], 'String');
            }
            if (data.hasOwnProperty('CultureName')) {
                obj['CultureName'] = ApiClient.convertToType(data['CultureName'], 'String');
            }
            if (data.hasOwnProperty('AuthenticationType')) {
                obj['AuthenticationType'] = AuthenticationType.constructFromObject(data['AuthenticationType']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TouchPoint} TouchPoint
 */
RequestHeader.prototype['TouchPoint'] = undefined;

/**
 * @member {String} SessionId
 */
RequestHeader.prototype['SessionId'] = undefined;

/**
 * @member {String} ApiKey
 */
RequestHeader.prototype['ApiKey'] = undefined;

/**
 * @member {String} CultureName
 */
RequestHeader.prototype['CultureName'] = undefined;

/**
 * @member {module:model/AuthenticationType} AuthenticationType
 */
RequestHeader.prototype['AuthenticationType'] = undefined;






export default RequestHeader;

