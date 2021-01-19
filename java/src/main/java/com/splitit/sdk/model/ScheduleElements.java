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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * ScheduleElements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-19T15:46:09.732Z")
public class ScheduleElements  {
  @SerializedName("InstallmentNumber")
  private Integer installmentNumber = null;

  @SerializedName("ChargeDate")
  private OffsetDateTime chargeDate = null;

  @SerializedName("ChargeAmount")
  private BigDecimal chargeAmount = null;

  @SerializedName("RequiredCredit")
  private BigDecimal requiredCredit = null;

  public ScheduleElements installmentNumber(Integer installmentNumber) {
    this.installmentNumber = installmentNumber;
    return this;
  }

   /**
   * Get installmentNumber
   * @return installmentNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getInstallmentNumber() {
    return installmentNumber;
  }

  public void setInstallmentNumber(Integer installmentNumber) {
    this.installmentNumber = installmentNumber;
  }

  public ScheduleElements chargeDate(OffsetDateTime chargeDate) {
    this.chargeDate = chargeDate;
    return this;
  }

   /**
   * Get chargeDate
   * @return chargeDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getChargeDate() {
    return chargeDate;
  }

  public void setChargeDate(OffsetDateTime chargeDate) {
    this.chargeDate = chargeDate;
  }

  public ScheduleElements chargeAmount(BigDecimal chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(BigDecimal chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public ScheduleElements requiredCredit(BigDecimal requiredCredit) {
    this.requiredCredit = requiredCredit;
    return this;
  }

   /**
   * Get requiredCredit
   * @return requiredCredit
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getRequiredCredit() {
    return requiredCredit;
  }

  public void setRequiredCredit(BigDecimal requiredCredit) {
    this.requiredCredit = requiredCredit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleElements scheduleElements = (ScheduleElements) o;
    return Objects.equals(this.installmentNumber, scheduleElements.installmentNumber) &&
        Objects.equals(this.chargeDate, scheduleElements.chargeDate) &&
        Objects.equals(this.chargeAmount, scheduleElements.chargeAmount) &&
        Objects.equals(this.requiredCredit, scheduleElements.requiredCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentNumber, chargeDate, chargeAmount, requiredCredit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleElements {\n");
    
    
    sb.append("    installmentNumber: ").append(toIndentedString(installmentNumber)).append("\n");
    sb.append("    chargeDate: ").append(toIndentedString(chargeDate)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    requiredCredit: ").append(toIndentedString(requiredCredit)).append("\n");
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

