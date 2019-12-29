<?php
/**
 * RefundStrategy
 *
 * PHP version 5
 *
 * @category Class
 * @package  SplititSdkClient
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * splitit-web-api-public
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.10
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace SplititSdkClient\Model;
use \SplititSdkClient\ObjectSerializer;

/**
 * RefundStrategy Class Doc Comment
 *
 * @category Class
 * @description 
 * @package  SplititSdkClient
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class RefundStrategy
{
    /**
     * Possible values of this enum
     */
    const FUTURE_INSTALLMENTS_FIRST = 'FutureInstallmentsFirst';
    const FUTURE_INSTALLMENTS_LAST = 'FutureInstallmentsLast';
    const FUTURE_INSTALLMENTS_NOT_ALLOWED = 'FutureInstallmentsNotAllowed';
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FUTURE_INSTALLMENTS_FIRST,
            self::FUTURE_INSTALLMENTS_LAST,
            self::FUTURE_INSTALLMENTS_NOT_ALLOWED,
        ];
    }
}


