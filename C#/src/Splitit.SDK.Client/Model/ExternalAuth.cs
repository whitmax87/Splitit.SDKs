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
    /// ExternalAuth
    /// </summary>
    [DataContract]
    public partial class ExternalAuth :  IEquatable<ExternalAuth>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExternalAuth" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ExternalAuth() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ExternalAuth" /> class.
        /// </summary>
        /// <param name="uniqueGatewayAuthID">uniqueGatewayAuthID.</param>
        /// <param name="date">date (required).</param>
        /// <param name="amount">amount.</param>
        /// <param name="transactionFullLog">transactionFullLog.</param>
        public ExternalAuth(string uniqueGatewayAuthID = default(string), DateTime? date = default(DateTime?), MoneyWithCurrencyCode amount = default(MoneyWithCurrencyCode), string transactionFullLog = default(string))
        {
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for ExternalAuth and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            this.UniqueGatewayAuthID = uniqueGatewayAuthID;
            this.Amount = amount;
            this.TransactionFullLog = transactionFullLog;
        }

        
        /// <summary>
        /// Gets or Sets UniqueGatewayAuthID
        /// </summary>
        [DataMember(Name="UniqueGatewayAuthID", EmitDefaultValue=false)]
        public string UniqueGatewayAuthID { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="Date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name="Amount", EmitDefaultValue=false)]
        public MoneyWithCurrencyCode Amount { get; set; }

        /// <summary>
        /// Gets or Sets TransactionFullLog
        /// </summary>
        [DataMember(Name="TransactionFullLog", EmitDefaultValue=false)]
        public string TransactionFullLog { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ExternalAuth {\n");
            sb.Append("  UniqueGatewayAuthID: ").Append(UniqueGatewayAuthID).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  TransactionFullLog: ").Append(TransactionFullLog).Append("\n");
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
            return this.Equals(input as ExternalAuth);
        }

        /// <summary>
        /// Returns true if ExternalAuth instances are equal
        /// </summary>
        /// <param name="input">Instance of ExternalAuth to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExternalAuth input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UniqueGatewayAuthID == input.UniqueGatewayAuthID ||
                    (this.UniqueGatewayAuthID != null &&
                    this.UniqueGatewayAuthID.Equals(input.UniqueGatewayAuthID))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.TransactionFullLog == input.TransactionFullLog ||
                    (this.TransactionFullLog != null &&
                    this.TransactionFullLog.Equals(input.TransactionFullLog))
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
                if (this.UniqueGatewayAuthID != null)
                    hashCode = hashCode * 59 + this.UniqueGatewayAuthID.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.TransactionFullLog != null)
                    hashCode = hashCode * 59 + this.TransactionFullLog.GetHashCode();
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
