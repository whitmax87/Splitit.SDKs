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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = Splitit.SDK.Client.Portable.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Portable.Model
{
    /// <summary>
    /// FraudCheck
    /// </summary>
    [DataContract]
    public partial class FraudCheck :  IEquatable<FraudCheck>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FraudCheck" /> class.
        /// </summary>
        /// <param name="fraudCheckResult">fraudCheckResult.</param>
        /// <param name="providerResultCode">providerResultCode.</param>
        /// <param name="providerResultDesc">providerResultDesc.</param>
        /// <param name="providerReferenceId">providerReferenceId.</param>
        public FraudCheck(ReferenceEntityBase fraudCheckResult = default(ReferenceEntityBase), string providerResultCode = default(string), string providerResultDesc = default(string), string providerReferenceId = default(string))
        {
            this.FraudCheckResult = fraudCheckResult;
            this.ProviderResultCode = providerResultCode;
            this.ProviderResultDesc = providerResultDesc;
            this.ProviderReferenceId = providerReferenceId;
        }

        
        /// <summary>
        /// Gets or Sets FraudCheckResult
        /// </summary>
        [DataMember(Name="FraudCheckResult", EmitDefaultValue=false)]
        public ReferenceEntityBase FraudCheckResult { get; set; }

        /// <summary>
        /// Gets or Sets ProviderResultCode
        /// </summary>
        [DataMember(Name="ProviderResultCode", EmitDefaultValue=false)]
        public string ProviderResultCode { get; set; }

        /// <summary>
        /// Gets or Sets ProviderResultDesc
        /// </summary>
        [DataMember(Name="ProviderResultDesc", EmitDefaultValue=false)]
        public string ProviderResultDesc { get; set; }

        /// <summary>
        /// Gets or Sets ProviderReferenceId
        /// </summary>
        [DataMember(Name="ProviderReferenceId", EmitDefaultValue=false)]
        public string ProviderReferenceId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FraudCheck {\n");
            sb.Append("  FraudCheckResult: ").Append(FraudCheckResult).Append("\n");
            sb.Append("  ProviderResultCode: ").Append(ProviderResultCode).Append("\n");
            sb.Append("  ProviderResultDesc: ").Append(ProviderResultDesc).Append("\n");
            sb.Append("  ProviderReferenceId: ").Append(ProviderReferenceId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as FraudCheck);
        }

        /// <summary>
        /// Returns true if FraudCheck instances are equal
        /// </summary>
        /// <param name="input">Instance of FraudCheck to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FraudCheck input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FraudCheckResult == input.FraudCheckResult ||
                    (this.FraudCheckResult != null &&
                    this.FraudCheckResult.Equals(input.FraudCheckResult))
                ) && 
                (
                    this.ProviderResultCode == input.ProviderResultCode ||
                    (this.ProviderResultCode != null &&
                    this.ProviderResultCode.Equals(input.ProviderResultCode))
                ) && 
                (
                    this.ProviderResultDesc == input.ProviderResultDesc ||
                    (this.ProviderResultDesc != null &&
                    this.ProviderResultDesc.Equals(input.ProviderResultDesc))
                ) && 
                (
                    this.ProviderReferenceId == input.ProviderReferenceId ||
                    (this.ProviderReferenceId != null &&
                    this.ProviderReferenceId.Equals(input.ProviderReferenceId))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.FraudCheckResult != null)
                    hashCode = hashCode * 59 + this.FraudCheckResult.GetHashCode();
                if (this.ProviderResultCode != null)
                    hashCode = hashCode * 59 + this.ProviderResultCode.GetHashCode();
                if (this.ProviderResultDesc != null)
                    hashCode = hashCode * 59 + this.ProviderResultDesc.GetHashCode();
                if (this.ProviderReferenceId != null)
                    hashCode = hashCode * 59 + this.ProviderReferenceId.GetHashCode();
                return hashCode;
            }
        }
    }

}
