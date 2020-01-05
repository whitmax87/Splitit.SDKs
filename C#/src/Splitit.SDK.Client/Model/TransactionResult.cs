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
    /// TransactionResult
    /// </summary>
    [DataContract]
    public partial class TransactionResult :  IEquatable<TransactionResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TransactionResult" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TransactionResult() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TransactionResult" /> class.
        /// </summary>
        /// <param name="gatewayTransactionId">gatewayTransactionId.</param>
        /// <param name="splititTransactionId">splititTransactionId (required).</param>
        /// <param name="gatewayResultCode">gatewayResultCode.</param>
        /// <param name="gatewayResultMessage">gatewayResultMessage.</param>
        /// <param name="operationType">operationType.</param>
        /// <param name="gatewayResult">gatewayResult (required).</param>
        /// <param name="gatewayTransactionDate">gatewayTransactionDate (required).</param>
        /// <param name="isChargeback">isChargeback (required).</param>
        public TransactionResult(string gatewayTransactionId = default(string), long? splititTransactionId = default(long?), string gatewayResultCode = default(string), string gatewayResultMessage = default(string), ReferenceEntityBase operationType = default(ReferenceEntityBase), bool? gatewayResult = default(bool?), DateTime? gatewayTransactionDate = default(DateTime?), bool? isChargeback = default(bool?))
        {
            // to ensure "splititTransactionId" is required (not null)
            if (splititTransactionId == null)
            {
                throw new InvalidDataException("splititTransactionId is a required property for TransactionResult and cannot be null");
            }
            else
            {
                this.SplititTransactionId = splititTransactionId;
            }
            // to ensure "gatewayResult" is required (not null)
            if (gatewayResult == null)
            {
                throw new InvalidDataException("gatewayResult is a required property for TransactionResult and cannot be null");
            }
            else
            {
                this.GatewayResult = gatewayResult;
            }
            // to ensure "gatewayTransactionDate" is required (not null)
            if (gatewayTransactionDate == null)
            {
                throw new InvalidDataException("gatewayTransactionDate is a required property for TransactionResult and cannot be null");
            }
            else
            {
                this.GatewayTransactionDate = gatewayTransactionDate;
            }
            // to ensure "isChargeback" is required (not null)
            if (isChargeback == null)
            {
                throw new InvalidDataException("isChargeback is a required property for TransactionResult and cannot be null");
            }
            else
            {
                this.IsChargeback = isChargeback;
            }
            this.GatewayTransactionId = gatewayTransactionId;
            this.GatewayResultCode = gatewayResultCode;
            this.GatewayResultMessage = gatewayResultMessage;
            this.OperationType = operationType;
        }

        
        /// <summary>
        /// Gets or Sets GatewayTransactionId
        /// </summary>
        [DataMember(Name="GatewayTransactionId", EmitDefaultValue=false)]
        public string GatewayTransactionId { get; set; }

        /// <summary>
        /// Gets or Sets SplititTransactionId
        /// </summary>
        [DataMember(Name="SplititTransactionId", EmitDefaultValue=false)]
        public long? SplititTransactionId { get; set; }

        /// <summary>
        /// Gets or Sets GatewayResultCode
        /// </summary>
        [DataMember(Name="GatewayResultCode", EmitDefaultValue=false)]
        public string GatewayResultCode { get; set; }

        /// <summary>
        /// Gets or Sets GatewayResultMessage
        /// </summary>
        [DataMember(Name="GatewayResultMessage", EmitDefaultValue=false)]
        public string GatewayResultMessage { get; set; }

        /// <summary>
        /// Gets or Sets OperationType
        /// </summary>
        [DataMember(Name="OperationType", EmitDefaultValue=false)]
        public ReferenceEntityBase OperationType { get; set; }

        /// <summary>
        /// Gets or Sets GatewayResult
        /// </summary>
        [DataMember(Name="GatewayResult", EmitDefaultValue=false)]
        public bool? GatewayResult { get; set; }

        /// <summary>
        /// Gets or Sets GatewayTransactionDate
        /// </summary>
        [DataMember(Name="GatewayTransactionDate", EmitDefaultValue=false)]
        public DateTime? GatewayTransactionDate { get; set; }

        /// <summary>
        /// Gets or Sets IsChargeback
        /// </summary>
        [DataMember(Name="IsChargeback", EmitDefaultValue=false)]
        public bool? IsChargeback { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TransactionResult {\n");
            sb.Append("  GatewayTransactionId: ").Append(GatewayTransactionId).Append("\n");
            sb.Append("  SplititTransactionId: ").Append(SplititTransactionId).Append("\n");
            sb.Append("  GatewayResultCode: ").Append(GatewayResultCode).Append("\n");
            sb.Append("  GatewayResultMessage: ").Append(GatewayResultMessage).Append("\n");
            sb.Append("  OperationType: ").Append(OperationType).Append("\n");
            sb.Append("  GatewayResult: ").Append(GatewayResult).Append("\n");
            sb.Append("  GatewayTransactionDate: ").Append(GatewayTransactionDate).Append("\n");
            sb.Append("  IsChargeback: ").Append(IsChargeback).Append("\n");
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
            return this.Equals(input as TransactionResult);
        }

        /// <summary>
        /// Returns true if TransactionResult instances are equal
        /// </summary>
        /// <param name="input">Instance of TransactionResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TransactionResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.GatewayTransactionId == input.GatewayTransactionId ||
                    (this.GatewayTransactionId != null &&
                    this.GatewayTransactionId.Equals(input.GatewayTransactionId))
                ) && 
                (
                    this.SplititTransactionId == input.SplititTransactionId ||
                    (this.SplititTransactionId != null &&
                    this.SplititTransactionId.Equals(input.SplititTransactionId))
                ) && 
                (
                    this.GatewayResultCode == input.GatewayResultCode ||
                    (this.GatewayResultCode != null &&
                    this.GatewayResultCode.Equals(input.GatewayResultCode))
                ) && 
                (
                    this.GatewayResultMessage == input.GatewayResultMessage ||
                    (this.GatewayResultMessage != null &&
                    this.GatewayResultMessage.Equals(input.GatewayResultMessage))
                ) && 
                (
                    this.OperationType == input.OperationType ||
                    (this.OperationType != null &&
                    this.OperationType.Equals(input.OperationType))
                ) && 
                (
                    this.GatewayResult == input.GatewayResult ||
                    (this.GatewayResult != null &&
                    this.GatewayResult.Equals(input.GatewayResult))
                ) && 
                (
                    this.GatewayTransactionDate == input.GatewayTransactionDate ||
                    (this.GatewayTransactionDate != null &&
                    this.GatewayTransactionDate.Equals(input.GatewayTransactionDate))
                ) && 
                (
                    this.IsChargeback == input.IsChargeback ||
                    (this.IsChargeback != null &&
                    this.IsChargeback.Equals(input.IsChargeback))
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
                if (this.GatewayTransactionId != null)
                    hashCode = hashCode * 59 + this.GatewayTransactionId.GetHashCode();
                if (this.SplititTransactionId != null)
                    hashCode = hashCode * 59 + this.SplititTransactionId.GetHashCode();
                if (this.GatewayResultCode != null)
                    hashCode = hashCode * 59 + this.GatewayResultCode.GetHashCode();
                if (this.GatewayResultMessage != null)
                    hashCode = hashCode * 59 + this.GatewayResultMessage.GetHashCode();
                if (this.OperationType != null)
                    hashCode = hashCode * 59 + this.OperationType.GetHashCode();
                if (this.GatewayResult != null)
                    hashCode = hashCode * 59 + this.GatewayResult.GetHashCode();
                if (this.GatewayTransactionDate != null)
                    hashCode = hashCode * 59 + this.GatewayTransactionDate.GetHashCode();
                if (this.IsChargeback != null)
                    hashCode = hashCode * 59 + this.IsChargeback.GetHashCode();
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
