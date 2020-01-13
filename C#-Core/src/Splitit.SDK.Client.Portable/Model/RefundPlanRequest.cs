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
    /// RefundPlanRequest
    /// </summary>
    [DataContract]
    public partial class RefundPlanRequest :  IEquatable<RefundPlanRequest>
    {
        /// <summary>
        /// Gets or Sets RefundStrategy
        /// </summary>
        [DataMember(Name="RefundStrategy", EmitDefaultValue=false)]
        public RefundStrategy? RefundStrategy { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RefundPlanRequest" /> class.
        /// </summary>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        /// <param name="amount">amount.</param>
        /// <param name="refundStrategy">refundStrategy.</param>
        public RefundPlanRequest(string installmentPlanNumber = default(string), MoneyWithCurrencyCode amount = default(MoneyWithCurrencyCode), RefundStrategy? refundStrategy = default(RefundStrategy?))
        {
            this.InstallmentPlanNumber = installmentPlanNumber;
            this.Amount = amount;
            this.RefundStrategy = refundStrategy;
        }

        [DataMember(Name="RequestHeader", EmitDefaultValue=false)]
        internal RequestHeader RequestHeader { get; set; }
        
        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name="InstallmentPlanNumber", EmitDefaultValue=false)]
        public string InstallmentPlanNumber { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name="Amount", EmitDefaultValue=false)]
        public MoneyWithCurrencyCode Amount { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RefundPlanRequest {\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  RefundStrategy: ").Append(RefundStrategy).Append("\n");
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
            return this.Equals(input as RefundPlanRequest);
        }

        /// <summary>
        /// Returns true if RefundPlanRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of RefundPlanRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RefundPlanRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.InstallmentPlanNumber == input.InstallmentPlanNumber ||
                    (this.InstallmentPlanNumber != null &&
                    this.InstallmentPlanNumber.Equals(input.InstallmentPlanNumber))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.RefundStrategy == input.RefundStrategy ||
                    (this.RefundStrategy != null &&
                    this.RefundStrategy.Equals(input.RefundStrategy))
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
                if (this.InstallmentPlanNumber != null)
                    hashCode = hashCode * 59 + this.InstallmentPlanNumber.GetHashCode();
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.RefundStrategy != null)
                    hashCode = hashCode * 59 + this.RefundStrategy.GetHashCode();
                return hashCode;
            }
        }
    }

}