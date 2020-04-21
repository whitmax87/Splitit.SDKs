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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChargebackRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-21T07:57:36.416Z")
public class ChargebackRequest   extends RequestWithHeader  {
  @SerializedName("TransactionIdsToMark")
  private List<Long> transactionIdsToMark = null;

  @SerializedName("TransactionIdsToUnmark")
  private List<Long> transactionIdsToUnmark = null;

  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  public ChargebackRequest transactionIdsToMark(List<Long> transactionIdsToMark) {
    this.transactionIdsToMark = transactionIdsToMark;
    return this;
  }

  public ChargebackRequest addTransactionIdsToMarkItem(Long transactionIdsToMarkItem) {
    if (this.transactionIdsToMark == null) {
      this.transactionIdsToMark = new ArrayList<Long>();
    }
    this.transactionIdsToMark.add(transactionIdsToMarkItem);
    return this;
  }

   /**
   * Get transactionIdsToMark
   * @return transactionIdsToMark
  **/
  @ApiModelProperty(value = "")
  public List<Long> getTransactionIdsToMark() {
    return transactionIdsToMark;
  }

  public void setTransactionIdsToMark(List<Long> transactionIdsToMark) {
    this.transactionIdsToMark = transactionIdsToMark;
  }

  public ChargebackRequest transactionIdsToUnmark(List<Long> transactionIdsToUnmark) {
    this.transactionIdsToUnmark = transactionIdsToUnmark;
    return this;
  }

  public ChargebackRequest addTransactionIdsToUnmarkItem(Long transactionIdsToUnmarkItem) {
    if (this.transactionIdsToUnmark == null) {
      this.transactionIdsToUnmark = new ArrayList<Long>();
    }
    this.transactionIdsToUnmark.add(transactionIdsToUnmarkItem);
    return this;
  }

   /**
   * Get transactionIdsToUnmark
   * @return transactionIdsToUnmark
  **/
  @ApiModelProperty(value = "")
  public List<Long> getTransactionIdsToUnmark() {
    return transactionIdsToUnmark;
  }

  public void setTransactionIdsToUnmark(List<Long> transactionIdsToUnmark) {
    this.transactionIdsToUnmark = transactionIdsToUnmark;
  }

  public ChargebackRequest installmentPlanNumber(String installmentPlanNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackRequest chargebackRequest = (ChargebackRequest) o;
    return Objects.equals(this.transactionIdsToMark, chargebackRequest.transactionIdsToMark) &&
        Objects.equals(this.transactionIdsToUnmark, chargebackRequest.transactionIdsToUnmark) &&
        Objects.equals(this.installmentPlanNumber, chargebackRequest.installmentPlanNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdsToMark, transactionIdsToUnmark, installmentPlanNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackRequest {\n");
    
    sb.append("    transactionIdsToMark: ").append(toIndentedString(transactionIdsToMark)).append("\n");
    sb.append("    transactionIdsToUnmark: ").append(toIndentedString(transactionIdsToUnmark)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
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

