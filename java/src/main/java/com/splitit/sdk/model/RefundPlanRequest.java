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
import com.splitit.sdk.model.RefundStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RefundPlanRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class RefundPlanRequest extends ModelWithHeader {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("Amount")
  private MoneyWithCurrencyCode amount = null;

  @SerializedName("RefundStrategy")
  private RefundStrategy refundStrategy = null;

  public RefundPlanRequest installmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
    return this;
  }

   /**
   * Get installmentPlanNumber
   * @return installmentPlanNumber
  **/
  @ApiModelProperty(value = "")
  public String getInstallmentPlanNumber() {
    return installmentPlanNumber;
  }

  public void setInstallmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
  }

  public RefundPlanRequest amount(MoneyWithCurrencyCode amount) {
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

  public RefundPlanRequest refundStrategy(RefundStrategy refundStrategy) {
    this.refundStrategy = refundStrategy;
    return this;
  }

   /**
   * Get refundStrategy
   * @return refundStrategy
  **/
  @ApiModelProperty(value = "")
  public RefundStrategy getRefundStrategy() {
    return refundStrategy;
  }

  public void setRefundStrategy(RefundStrategy refundStrategy) {
    this.refundStrategy = refundStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundPlanRequest refundPlanRequest = (RefundPlanRequest) o;
    return Objects.equals(this.installmentPlanNumber, refundPlanRequest.installmentPlanNumber) &&
        Objects.equals(this.amount, refundPlanRequest.amount) &&
        Objects.equals(this.refundStrategy, refundPlanRequest.refundStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, amount, refundStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundPlanRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundStrategy: ").append(toIndentedString(refundStrategy)).append("\n");
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

