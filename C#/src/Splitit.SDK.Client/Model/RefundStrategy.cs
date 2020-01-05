/* 
 * splitit-web-api-public-sdk
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Splitit.SDK.Client.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Model
{
    /// <summary>
    /// Defines RefundStrategy
    /// </summary>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum RefundStrategy
    {
        
        /// <summary>
        /// Enum FutureInstallmentsFirst for value: FutureInstallmentsFirst
        /// </summary>
        [EnumMember(Value = "FutureInstallmentsFirst")]
        FutureInstallmentsFirst = 1,
        
        /// <summary>
        /// Enum FutureInstallmentsLast for value: FutureInstallmentsLast
        /// </summary>
        [EnumMember(Value = "FutureInstallmentsLast")]
        FutureInstallmentsLast = 2,
        
        /// <summary>
        /// Enum FutureInstallmentsNotAllowed for value: FutureInstallmentsNotAllowed
        /// </summary>
        [EnumMember(Value = "FutureInstallmentsNotAllowed")]
        FutureInstallmentsNotAllowed = 3
    }

}
