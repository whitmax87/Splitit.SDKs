/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import {
    BusinessUnitRef,
    BusinessUnitRefFromJSON,
    BusinessUnitRefFromJSONTyped,
    BusinessUnitRefToJSON,
    ContactPersonType,
    ContactPersonTypeFromJSON,
    ContactPersonTypeFromJSONTyped,
    ContactPersonTypeToJSON,
} from './';

/**
 * 
 * @export
 * @interface ContactPerson
 */
export interface ContactPerson {
    /**
     * 
     * @type {number}
     * @memberof ContactPerson
     */
    id: number;
    /**
     * 
     * @type {string}
     * @memberof ContactPerson
     */
    fullName?: string;
    /**
     * 
     * @type {ContactPersonType}
     * @memberof ContactPerson
     */
    type: ContactPersonType;
    /**
     * 
     * @type {string}
     * @memberof ContactPerson
     */
    emailAddress?: string;
    /**
     * 
     * @type {string}
     * @memberof ContactPerson
     */
    mobilePhoneNumber?: string;
    /**
     * 
     * @type {string}
     * @memberof ContactPerson
     */
    officePhoneNumber?: string;
    /**
     * 
     * @type {BusinessUnitRef}
     * @memberof ContactPerson
     */
    businessUnit?: BusinessUnitRef;
}

export function ContactPersonFromJSON(json: any): ContactPerson {
    return ContactPersonFromJSONTyped(json, false);
}

export function ContactPersonFromJSONTyped(json: any, ignoreDiscriminator: boolean): ContactPerson {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['Id'],
        'fullName': !exists(json, 'FullName') ? undefined : json['FullName'],
        'type': ContactPersonTypeFromJSON(json['Type']),
        'emailAddress': !exists(json, 'EmailAddress') ? undefined : json['EmailAddress'],
        'mobilePhoneNumber': !exists(json, 'MobilePhoneNumber') ? undefined : json['MobilePhoneNumber'],
        'officePhoneNumber': !exists(json, 'OfficePhoneNumber') ? undefined : json['OfficePhoneNumber'],
        'businessUnit': !exists(json, 'BusinessUnit') ? undefined : BusinessUnitRefFromJSON(json['BusinessUnit']),
    };
}

export function ContactPersonToJSON(value?: ContactPerson | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'Id': value.id,
        'FullName': value.fullName,
        'Type': ContactPersonTypeToJSON(value.type),
        'EmailAddress': value.emailAddress,
        'MobilePhoneNumber': value.mobilePhoneNumber,
        'OfficePhoneNumber': value.officePhoneNumber,
        'BusinessUnit': BusinessUnitRefToJSON(value.businessUnit),
    };
}

