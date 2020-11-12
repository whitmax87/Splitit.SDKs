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

/**
 * GetFraudStatusDisplayRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T07:38:48.509Z")
public class GetFraudStatusDisplayRequest extends ModelWithHeader {
  @SerializedName("ProviderReferenceId")
  private String providerReferenceId = null;

  @SerializedName("MerchantId")
  private Long merchantId = null;

  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  public GetFraudStatusDisplayRequest providerReferenceId(String providerReferenceId) {
    this.providerReferenceId = providerReferenceId;
    return this;
  }

   /**
   * Get providerReferenceId
   * @return providerReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getProviderReferenceId() {
    return providerReferenceId;
  }

  public void setProviderReferenceId(String providerReferenceId) {
    this.providerReferenceId = providerReferenceId;
  }

  public GetFraudStatusDisplayRequest merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public GetFraudStatusDisplayRequest installmentPlanNumber(String installmentPlanNumber) {
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
    GetFraudStatusDisplayRequest getFraudStatusDisplayRequest = (GetFraudStatusDisplayRequest) o;
    return Objects.equals(this.providerReferenceId, getFraudStatusDisplayRequest.providerReferenceId) &&
        Objects.equals(this.merchantId, getFraudStatusDisplayRequest.merchantId) &&
        Objects.equals(this.installmentPlanNumber, getFraudStatusDisplayRequest.installmentPlanNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerReferenceId, merchantId, installmentPlanNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFraudStatusDisplayRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    providerReferenceId: ").append(toIndentedString(providerReferenceId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

