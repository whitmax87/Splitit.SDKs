/* 
 * splitit-web-api-public
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
    /// CancelInstallmentPlanRequest
    /// </summary>
    [DataContract]
    public partial class CancelInstallmentPlanRequest :  IEquatable<CancelInstallmentPlanRequest>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets RefundUnderCancelation
        /// </summary>
        [DataMember(Name="RefundUnderCancelation", EmitDefaultValue=false)]
        public RefundUnderCancelation RefundUnderCancelation { get; set; }
        /// <summary>
        /// Gets or Sets CancelationReason
        /// </summary>
        [DataMember(Name="CancelationReason", EmitDefaultValue=false)]
        public InstallmentPlanCancelationReason CancelationReason { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CancelInstallmentPlanRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CancelInstallmentPlanRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CancelInstallmentPlanRequest" /> class.
        /// </summary>
        /// <param name="requestHeader">requestHeader.</param>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        /// <param name="refundUnderCancelation">refundUnderCancelation (required).</param>
        /// <param name="cancelationReason">cancelationReason (required).</param>
        /// <param name="isExecutedUnattended">isExecutedUnattended (required).</param>
        public CancelInstallmentPlanRequest(RequestHeader requestHeader = default(RequestHeader), string installmentPlanNumber = default(string), RefundUnderCancelation refundUnderCancelation = default(RefundUnderCancelation), InstallmentPlanCancelationReason cancelationReason = default(InstallmentPlanCancelationReason), bool? isExecutedUnattended = default(bool?))
        {
            // to ensure "refundUnderCancelation" is required (not null)
            if (refundUnderCancelation == null)
            {
                throw new InvalidDataException("refundUnderCancelation is a required property for CancelInstallmentPlanRequest and cannot be null");
            }
            else
            {
                this.RefundUnderCancelation = refundUnderCancelation;
            }
            // to ensure "cancelationReason" is required (not null)
            if (cancelationReason == null)
            {
                throw new InvalidDataException("cancelationReason is a required property for CancelInstallmentPlanRequest and cannot be null");
            }
            else
            {
                this.CancelationReason = cancelationReason;
            }
            // to ensure "isExecutedUnattended" is required (not null)
            if (isExecutedUnattended == null)
            {
                throw new InvalidDataException("isExecutedUnattended is a required property for CancelInstallmentPlanRequest and cannot be null");
            }
            else
            {
                this.IsExecutedUnattended = isExecutedUnattended;
            }
            this.RequestHeader = requestHeader;
            this.InstallmentPlanNumber = installmentPlanNumber;
        }
        
        /// <summary>
        /// Gets or Sets RequestHeader
        /// </summary>
        [DataMember(Name="RequestHeader", EmitDefaultValue=false)]
        public RequestHeader RequestHeader { get; set; }

        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name="InstallmentPlanNumber", EmitDefaultValue=false)]
        public string InstallmentPlanNumber { get; set; }



        /// <summary>
        /// Gets or Sets IsExecutedUnattended
        /// </summary>
        [DataMember(Name="IsExecutedUnattended", EmitDefaultValue=false)]
        public bool? IsExecutedUnattended { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CancelInstallmentPlanRequest {\n");
            sb.Append("  RequestHeader: ").Append(RequestHeader).Append("\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
            sb.Append("  RefundUnderCancelation: ").Append(RefundUnderCancelation).Append("\n");
            sb.Append("  CancelationReason: ").Append(CancelationReason).Append("\n");
            sb.Append("  IsExecutedUnattended: ").Append(IsExecutedUnattended).Append("\n");
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
            return this.Equals(input as CancelInstallmentPlanRequest);
        }

        /// <summary>
        /// Returns true if CancelInstallmentPlanRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of CancelInstallmentPlanRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CancelInstallmentPlanRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RequestHeader == input.RequestHeader ||
                    (this.RequestHeader != null &&
                    this.RequestHeader.Equals(input.RequestHeader))
                ) && 
                (
                    this.InstallmentPlanNumber == input.InstallmentPlanNumber ||
                    (this.InstallmentPlanNumber != null &&
                    this.InstallmentPlanNumber.Equals(input.InstallmentPlanNumber))
                ) && 
                (
                    this.RefundUnderCancelation == input.RefundUnderCancelation ||
                    (this.RefundUnderCancelation != null &&
                    this.RefundUnderCancelation.Equals(input.RefundUnderCancelation))
                ) && 
                (
                    this.CancelationReason == input.CancelationReason ||
                    (this.CancelationReason != null &&
                    this.CancelationReason.Equals(input.CancelationReason))
                ) && 
                (
                    this.IsExecutedUnattended == input.IsExecutedUnattended ||
                    (this.IsExecutedUnattended != null &&
                    this.IsExecutedUnattended.Equals(input.IsExecutedUnattended))
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
                if (this.RequestHeader != null)
                    hashCode = hashCode * 59 + this.RequestHeader.GetHashCode();
                if (this.InstallmentPlanNumber != null)
                    hashCode = hashCode * 59 + this.InstallmentPlanNumber.GetHashCode();
                if (this.RefundUnderCancelation != null)
                    hashCode = hashCode * 59 + this.RefundUnderCancelation.GetHashCode();
                if (this.CancelationReason != null)
                    hashCode = hashCode * 59 + this.CancelationReason.GetHashCode();
                if (this.IsExecutedUnattended != null)
                    hashCode = hashCode * 59 + this.IsExecutedUnattended.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
