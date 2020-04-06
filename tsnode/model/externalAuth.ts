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
 */

import { RequestFile } from '../api';
import { MoneyWithCurrencyCode } from './moneyWithCurrencyCode';

export class ExternalAuth {
    'uniqueGatewayAuthID'?: string;
    'date': Date;
    'amount'?: MoneyWithCurrencyCode;
    'transactionFullLog'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "uniqueGatewayAuthID",
            "baseName": "UniqueGatewayAuthID",
            "type": "string"
        },
        {
            "name": "date",
            "baseName": "Date",
            "type": "Date"
        },
        {
            "name": "amount",
            "baseName": "Amount",
            "type": "MoneyWithCurrencyCode"
        },
        {
            "name": "transactionFullLog",
            "baseName": "TransactionFullLog",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ExternalAuth.attributeTypeMap;
    }
}

