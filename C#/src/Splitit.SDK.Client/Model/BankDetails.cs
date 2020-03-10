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
using SwaggerDateConverter = Splitit.SDK.Client.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Model
{
    /// <summary>
    /// BankDetails
    /// </summary>
    [DataContract]
    public partial class BankDetails :  IEquatable<BankDetails>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BankDetails" /> class.
        /// </summary>
        /// <param name="bankAccountName">bankAccountName.</param>
        /// <param name="bankRoutingNumber">bankRoutingNumber.</param>
        /// <param name="bankAccountNumber">bankAccountNumber.</param>
        public BankDetails(string bankAccountName = default(string), string bankRoutingNumber = default(string), string bankAccountNumber = default(string))
        {
            this.BankAccountName = bankAccountName;
            this.BankRoutingNumber = bankRoutingNumber;
            this.BankAccountNumber = bankAccountNumber;
        }

        
        /// <summary>
        /// Gets or Sets BankAccountName
        /// </summary>
        [DataMember(Name="BankAccountName", EmitDefaultValue=false)]
        public string BankAccountName { get; set; }

        /// <summary>
        /// Gets or Sets BankRoutingNumber
        /// </summary>
        [DataMember(Name="BankRoutingNumber", EmitDefaultValue=false)]
        public string BankRoutingNumber { get; set; }

        /// <summary>
        /// Gets or Sets BankAccountNumber
        /// </summary>
        [DataMember(Name="BankAccountNumber", EmitDefaultValue=false)]
        public string BankAccountNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BankDetails {\n");
            sb.Append("  BankAccountName: ").Append(BankAccountName).Append("\n");
            sb.Append("  BankRoutingNumber: ").Append(BankRoutingNumber).Append("\n");
            sb.Append("  BankAccountNumber: ").Append(BankAccountNumber).Append("\n");
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
            return this.Equals(input as BankDetails);
        }

        /// <summary>
        /// Returns true if BankDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of BankDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BankDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.BankAccountName == input.BankAccountName ||
                    (this.BankAccountName != null &&
                    this.BankAccountName.Equals(input.BankAccountName))
                ) && 
                (
                    this.BankRoutingNumber == input.BankRoutingNumber ||
                    (this.BankRoutingNumber != null &&
                    this.BankRoutingNumber.Equals(input.BankRoutingNumber))
                ) && 
                (
                    this.BankAccountNumber == input.BankAccountNumber ||
                    (this.BankAccountNumber != null &&
                    this.BankAccountNumber.Equals(input.BankAccountNumber))
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
                if (this.BankAccountName != null)
                    hashCode = hashCode * 59 + this.BankAccountName.GetHashCode();
                if (this.BankRoutingNumber != null)
                    hashCode = hashCode * 59 + this.BankRoutingNumber.GetHashCode();
                if (this.BankAccountNumber != null)
                    hashCode = hashCode * 59 + this.BankAccountNumber.GetHashCode();
                return hashCode;
            }
        }
    }

}
