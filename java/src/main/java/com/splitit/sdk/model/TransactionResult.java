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
import com.splitit.sdk.model.CardResult;
import com.splitit.sdk.model.ReferenceEntityBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * TransactionResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class TransactionResult  {
  @SerializedName("GatewayTransactionId")
  private String gatewayTransactionId = null;

  @SerializedName("SplititTransactionId")
  private Long splititTransactionId = null;

  @SerializedName("GatewayResultCode")
  private String gatewayResultCode = null;

  @SerializedName("GatewayResultMessage")
  private String gatewayResultMessage = null;

  @SerializedName("OperationType")
  private ReferenceEntityBase operationType = null;

  @SerializedName("GatewayResult")
  private Boolean gatewayResult = null;

  @SerializedName("GatewayTransactionDate")
  private OffsetDateTime gatewayTransactionDate = null;

  @SerializedName("IsChargeback")
  private Boolean isChargeback = null;

  @SerializedName("AVSResult")
  private CardResult avSResult = null;

  @SerializedName("CVCResult")
  private CardResult cvCResult = null;

  public TransactionResult gatewayTransactionId(String gatewayTransactionId) {
    this.gatewayTransactionId = gatewayTransactionId;
    return this;
  }

   /**
   * Get gatewayTransactionId
   * @return gatewayTransactionId
  **/
  @ApiModelProperty(value = "")
  public String getGatewayTransactionId() {
    return gatewayTransactionId;
  }

  public void setGatewayTransactionId(String gatewayTransactionId) {
    this.gatewayTransactionId = gatewayTransactionId;
  }

  public TransactionResult splititTransactionId(Long splititTransactionId) {
    this.splititTransactionId = splititTransactionId;
    return this;
  }

   /**
   * Get splititTransactionId
   * @return splititTransactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getSplititTransactionId() {
    return splititTransactionId;
  }

  public void setSplititTransactionId(Long splititTransactionId) {
    this.splititTransactionId = splititTransactionId;
  }

  public TransactionResult gatewayResultCode(String gatewayResultCode) {
    this.gatewayResultCode = gatewayResultCode;
    return this;
  }

   /**
   * Get gatewayResultCode
   * @return gatewayResultCode
  **/
  @ApiModelProperty(value = "")
  public String getGatewayResultCode() {
    return gatewayResultCode;
  }

  public void setGatewayResultCode(String gatewayResultCode) {
    this.gatewayResultCode = gatewayResultCode;
  }

  public TransactionResult gatewayResultMessage(String gatewayResultMessage) {
    this.gatewayResultMessage = gatewayResultMessage;
    return this;
  }

   /**
   * Get gatewayResultMessage
   * @return gatewayResultMessage
  **/
  @ApiModelProperty(value = "")
  public String getGatewayResultMessage() {
    return gatewayResultMessage;
  }

  public void setGatewayResultMessage(String gatewayResultMessage) {
    this.gatewayResultMessage = gatewayResultMessage;
  }

  public TransactionResult operationType(ReferenceEntityBase operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getOperationType() {
    return operationType;
  }

  public void setOperationType(ReferenceEntityBase operationType) {
    this.operationType = operationType;
  }

  public TransactionResult gatewayResult(Boolean gatewayResult) {
    this.gatewayResult = gatewayResult;
    return this;
  }

   /**
   * Get gatewayResult
   * @return gatewayResult
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isGatewayResult() {
    return gatewayResult;
  }

  public void setGatewayResult(Boolean gatewayResult) {
    this.gatewayResult = gatewayResult;
  }

  public TransactionResult gatewayTransactionDate(OffsetDateTime gatewayTransactionDate) {
    this.gatewayTransactionDate = gatewayTransactionDate;
    return this;
  }

   /**
   * Get gatewayTransactionDate
   * @return gatewayTransactionDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getGatewayTransactionDate() {
    return gatewayTransactionDate;
  }

  public void setGatewayTransactionDate(OffsetDateTime gatewayTransactionDate) {
    this.gatewayTransactionDate = gatewayTransactionDate;
  }

  public TransactionResult isChargeback(Boolean isChargeback) {
    this.isChargeback = isChargeback;
    return this;
  }

   /**
   * Get isChargeback
   * @return isChargeback
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsChargeback() {
    return isChargeback;
  }

  public void setIsChargeback(Boolean isChargeback) {
    this.isChargeback = isChargeback;
  }

  public TransactionResult avSResult(CardResult avSResult) {
    this.avSResult = avSResult;
    return this;
  }

   /**
   * Get avSResult
   * @return avSResult
  **/
  @ApiModelProperty(value = "")
  public CardResult getAvSResult() {
    return avSResult;
  }

  public void setAvSResult(CardResult avSResult) {
    this.avSResult = avSResult;
  }

  public TransactionResult cvCResult(CardResult cvCResult) {
    this.cvCResult = cvCResult;
    return this;
  }

   /**
   * Get cvCResult
   * @return cvCResult
  **/
  @ApiModelProperty(value = "")
  public CardResult getCvCResult() {
    return cvCResult;
  }

  public void setCvCResult(CardResult cvCResult) {
    this.cvCResult = cvCResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResult transactionResult = (TransactionResult) o;
    return Objects.equals(this.gatewayTransactionId, transactionResult.gatewayTransactionId) &&
        Objects.equals(this.splititTransactionId, transactionResult.splititTransactionId) &&
        Objects.equals(this.gatewayResultCode, transactionResult.gatewayResultCode) &&
        Objects.equals(this.gatewayResultMessage, transactionResult.gatewayResultMessage) &&
        Objects.equals(this.operationType, transactionResult.operationType) &&
        Objects.equals(this.gatewayResult, transactionResult.gatewayResult) &&
        Objects.equals(this.gatewayTransactionDate, transactionResult.gatewayTransactionDate) &&
        Objects.equals(this.isChargeback, transactionResult.isChargeback) &&
        Objects.equals(this.avSResult, transactionResult.avSResult) &&
        Objects.equals(this.cvCResult, transactionResult.cvCResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayTransactionId, splititTransactionId, gatewayResultCode, gatewayResultMessage, operationType, gatewayResult, gatewayTransactionDate, isChargeback, avSResult, cvCResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResult {\n");
    
    
    sb.append("    gatewayTransactionId: ").append(toIndentedString(gatewayTransactionId)).append("\n");
    sb.append("    splititTransactionId: ").append(toIndentedString(splititTransactionId)).append("\n");
    sb.append("    gatewayResultCode: ").append(toIndentedString(gatewayResultCode)).append("\n");
    sb.append("    gatewayResultMessage: ").append(toIndentedString(gatewayResultMessage)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    gatewayResult: ").append(toIndentedString(gatewayResult)).append("\n");
    sb.append("    gatewayTransactionDate: ").append(toIndentedString(gatewayTransactionDate)).append("\n");
    sb.append("    isChargeback: ").append(toIndentedString(isChargeback)).append("\n");
    sb.append("    avSResult: ").append(toIndentedString(avSResult)).append("\n");
    sb.append("    cvCResult: ").append(toIndentedString(cvCResult)).append("\n");
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

