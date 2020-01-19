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
import ReferenceEntityBase from './ReferenceEntityBase';

/**
 * The CardData model module.
 * @module model/CardData
 * @version 1.3.10
 */
class CardData {
    /**
     * Constructs a new <code>CardData</code>.
     * @alias module:model/CardData
     */
    constructor() { 
        
        CardData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CardData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CardData} obj Optional instance to populate.
     * @return {module:model/CardData} The populated <code>CardData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CardData();

            if (data.hasOwnProperty('CardId')) {
                obj['CardId'] = ApiClient.convertToType(data['CardId'], 'String');
            }
            if (data.hasOwnProperty('CardNumber')) {
                obj['CardNumber'] = ApiClient.convertToType(data['CardNumber'], 'String');
            }
            if (data.hasOwnProperty('CardExpMonth')) {
                obj['CardExpMonth'] = ApiClient.convertToType(data['CardExpMonth'], 'String');
            }
            if (data.hasOwnProperty('CardExpYear')) {
                obj['CardExpYear'] = ApiClient.convertToType(data['CardExpYear'], 'String');
            }
            if (data.hasOwnProperty('CardBrand')) {
                obj['CardBrand'] = ReferenceEntityBase.constructFromObject(data['CardBrand']);
            }
            if (data.hasOwnProperty('CardType')) {
                obj['CardType'] = ReferenceEntityBase.constructFromObject(data['CardType']);
            }
            if (data.hasOwnProperty('Bin')) {
                obj['Bin'] = ApiClient.convertToType(data['Bin'], 'String');
            }
            if (data.hasOwnProperty('CardHolderFullName')) {
                obj['CardHolderFullName'] = ApiClient.convertToType(data['CardHolderFullName'], 'String');
            }
            if (data.hasOwnProperty('CardCvv')) {
                obj['CardCvv'] = ApiClient.convertToType(data['CardCvv'], 'String');
            }
            if (data.hasOwnProperty('Address')) {
                obj['Address'] = AddressData.constructFromObject(data['Address']);
            }
            if (data.hasOwnProperty('Token')) {
                obj['Token'] = ApiClient.convertToType(data['Token'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} CardId
 */
CardData.prototype['CardId'] = undefined;

/**
 * @member {String} CardNumber
 */
CardData.prototype['CardNumber'] = undefined;

/**
 * @member {String} CardExpMonth
 */
CardData.prototype['CardExpMonth'] = undefined;

/**
 * @member {String} CardExpYear
 */
CardData.prototype['CardExpYear'] = undefined;

/**
 * @member {module:model/ReferenceEntityBase} CardBrand
 */
CardData.prototype['CardBrand'] = undefined;

/**
 * @member {module:model/ReferenceEntityBase} CardType
 */
CardData.prototype['CardType'] = undefined;

/**
 * @member {String} Bin
 */
CardData.prototype['Bin'] = undefined;

/**
 * @member {String} CardHolderFullName
 */
CardData.prototype['CardHolderFullName'] = undefined;

/**
 * @member {String} CardCvv
 */
CardData.prototype['CardCvv'] = undefined;

/**
 * @member {module:model/AddressData} Address
 */
CardData.prototype['Address'] = undefined;

/**
 * @member {String} Token
 */
CardData.prototype['Token'] = undefined;






export default CardData;

