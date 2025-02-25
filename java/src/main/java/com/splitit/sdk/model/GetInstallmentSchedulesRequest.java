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

/**
 * GetInstallmentSchedulesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class GetInstallmentSchedulesRequest extends ModelWithHeader {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("Amount")
  private MoneyWithCurrencyCode amount = null;

  @SerializedName("CardNumber")
  private String cardNumber = null;

  public GetInstallmentSchedulesRequest installmentPlanNumber(String installmentPlanNumber) {
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

  public GetInstallmentSchedulesRequest amount(MoneyWithCurrencyCode amount) {
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

  public GetInstallmentSchedulesRequest cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstallmentSchedulesRequest getInstallmentSchedulesRequest = (GetInstallmentSchedulesRequest) o;
    return Objects.equals(this.installmentPlanNumber, getInstallmentSchedulesRequest.installmentPlanNumber) &&
        Objects.equals(this.amount, getInstallmentSchedulesRequest.amount) &&
        Objects.equals(this.cardNumber, getInstallmentSchedulesRequest.cardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, amount, cardNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstallmentSchedulesRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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

