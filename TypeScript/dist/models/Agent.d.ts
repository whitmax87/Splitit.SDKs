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
/**
 *
 * @export
 * @interface Agent
 */
export interface Agent {
    /**
     *
     * @type {number}
     * @memberof Agent
     */
    pisUserId: number;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    id?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    agentNumber?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    email?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    userName?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    firstName?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    lastName?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    jobTitle?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    phoneNumber?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    mobileNumber?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    workPhoneNumber?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    faxNumber?: string;
    /**
     *
     * @type {string}
     * @memberof Agent
     */
    fullName?: string;
}
export declare function AgentFromJSON(json: any): Agent;
export declare function AgentFromJSONTyped(json: any, ignoreDiscriminator: boolean): Agent;
export declare function AgentToJSON(value?: Agent | null): any;
