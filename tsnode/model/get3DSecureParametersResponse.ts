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
import { ResponseHeader } from './responseHeader';

export class Get3DSecureParametersResponse {
    'responseHeader'?: ResponseHeader;
    'issuerRedirectUrl'?: string;
    'paReq'?: string;
    'md'?: string;
    'termUrl'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "responseHeader",
            "baseName": "ResponseHeader",
            "type": "ResponseHeader"
        },
        {
            "name": "issuerRedirectUrl",
            "baseName": "IssuerRedirectUrl",
            "type": "string"
        },
        {
            "name": "paReq",
            "baseName": "PaReq",
            "type": "string"
        },
        {
            "name": "md",
            "baseName": "Md",
            "type": "string"
        },
        {
            "name": "termUrl",
            "baseName": "TermUrl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Get3DSecureParametersResponse.attributeTypeMap;
    }
}
