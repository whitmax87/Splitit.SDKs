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
import CardData from './CardData';
import Money from './Money';
import TransactionResult from './TransactionResult';

/**
 * The ReAuthorization model module.
 * @module model/ReAuthorization
 * @version 1.1.0
 */
class ReAuthorization {
    /**
     * Constructs a new <code>ReAuthorization</code>.
     * @alias module:model/ReAuthorization
     */
    constructor() { 
        
        ReAuthorization.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReAuthorization</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReAuthorization} obj Optional instance to populate.
     * @return {module:model/ReAuthorization} The populated <code>ReAuthorization</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReAuthorization();

            if (data.hasOwnProperty('ProcessingDate')) {
                obj['ProcessingDate'] = ApiClient.convertToType(data['ProcessingDate'], 'Date');
            }
            if (data.hasOwnProperty('Amount')) {
                obj['Amount'] = Money.constructFromObject(data['Amount']);
            }
            if (data.hasOwnProperty('TransactionResults')) {
                obj['TransactionResults'] = ApiClient.convertToType(data['TransactionResults'], [TransactionResult]);
            }
            if (data.hasOwnProperty('CardDetails')) {
                obj['CardDetails'] = CardData.constructFromObject(data['CardDetails']);
            }
            if (data.hasOwnProperty('Result')) {
                obj['Result'] = ApiClient.convertToType(data['Result'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Date} ProcessingDate
 */
ReAuthorization.prototype['ProcessingDate'] = undefined;

/**
 * @member {module:model/Money} Amount
 */
ReAuthorization.prototype['Amount'] = undefined;

/**
 * @member {Array.<module:model/TransactionResult>} TransactionResults
 */
ReAuthorization.prototype['TransactionResults'] = undefined;

/**
 * @member {module:model/CardData} CardDetails
 */
ReAuthorization.prototype['CardDetails'] = undefined;

/**
 * @member {Boolean} Result
 */
ReAuthorization.prototype['Result'] = undefined;






export default ReAuthorization;

