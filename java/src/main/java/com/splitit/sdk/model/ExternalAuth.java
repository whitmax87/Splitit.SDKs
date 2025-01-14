/*
 * splitit-web-api-public-sdk
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.splitit.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.splitit.sdk.model.MoneyWithCurrencyCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ExternalAuth
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class ExternalAuth  {
  @SerializedName("UniqueGatewayAuthID")
  private String uniqueGatewayAuthID = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("Amount")
  private MoneyWithCurrencyCode amount = null;

  @SerializedName("TransactionFullLog")
  private String transactionFullLog = null;

  public ExternalAuth uniqueGatewayAuthID(String uniqueGatewayAuthID) {
    this.uniqueGatewayAuthID = uniqueGatewayAuthID;
    return this;
  }

   /**
   * Get uniqueGatewayAuthID
   * @return uniqueGatewayAuthID
  **/
  @ApiModelProperty(value = "")
  public String getUniqueGatewayAuthID() {
    return uniqueGatewayAuthID;
  }

  public void setUniqueGatewayAuthID(String uniqueGatewayAuthID) {
    this.uniqueGatewayAuthID = uniqueGatewayAuthID;
  }

  public ExternalAuth date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ExternalAuth amount(MoneyWithCurrencyCode amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public MoneyWithCurrencyCode getAmount() {
    return amount;
  }

  public void setAmount(MoneyWithCurrencyCode amount) {
    this.amount = amount;
  }

  public ExternalAuth transactionFullLog(String transactionFullLog) {
    this.transactionFullLog = transactionFullLog;
    return this;
  }

   /**
   * Get transactionFullLog
   * @return transactionFullLog
  **/
  @ApiModelProperty(value = "")
  public String getTransactionFullLog() {
    return transactionFullLog;
  }

  public void setTransactionFullLog(String transactionFullLog) {
    this.transactionFullLog = transactionFullLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAuth externalAuth = (ExternalAuth) o;
    return Objects.equals(this.uniqueGatewayAuthID, externalAuth.uniqueGatewayAuthID) &&
        Objects.equals(this.date, externalAuth.date) &&
        Objects.equals(this.amount, externalAuth.amount) &&
        Objects.equals(this.transactionFullLog, externalAuth.transactionFullLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueGatewayAuthID, date, amount, transactionFullLog);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAuth {\n");
    
    
    sb.append("    uniqueGatewayAuthID: ").append(toIndentedString(uniqueGatewayAuthID)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionFullLog: ").append(toIndentedString(transactionFullLog)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

