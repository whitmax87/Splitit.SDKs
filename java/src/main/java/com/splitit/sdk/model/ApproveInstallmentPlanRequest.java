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
 * ApproveInstallmentPlanRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-21T07:57:36.416Z")
public class ApproveInstallmentPlanRequest   extends RequestWithHeader  {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("CustomerSignaturePngAsBase64")
  private String customerSignaturePngAsBase64 = null;

  @SerializedName("AreTermsAndConditionsApproved")
  private Boolean areTermsAndConditionsApproved = null;

  public ApproveInstallmentPlanRequest installmentPlanNumber(String installmentPlanNumber) {
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

  public ApproveInstallmentPlanRequest customerSignaturePngAsBase64(String customerSignaturePngAsBase64) {
    this.customerSignaturePngAsBase64 = customerSignaturePngAsBase64;
    return this;
  }

   /**
   * Get customerSignaturePngAsBase64
   * @return customerSignaturePngAsBase64
  **/
  @ApiModelProperty(value = "")
  public String getCustomerSignaturePngAsBase64() {
    return customerSignaturePngAsBase64;
  }

  public void setCustomerSignaturePngAsBase64(String customerSignaturePngAsBase64) {
    this.customerSignaturePngAsBase64 = customerSignaturePngAsBase64;
  }

  public ApproveInstallmentPlanRequest areTermsAndConditionsApproved(Boolean areTermsAndConditionsApproved) {
    this.areTermsAndConditionsApproved = areTermsAndConditionsApproved;
    return this;
  }

   /**
   * Get areTermsAndConditionsApproved
   * @return areTermsAndConditionsApproved
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAreTermsAndConditionsApproved() {
    return areTermsAndConditionsApproved;
  }

  public void setAreTermsAndConditionsApproved(Boolean areTermsAndConditionsApproved) {
    this.areTermsAndConditionsApproved = areTermsAndConditionsApproved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveInstallmentPlanRequest approveInstallmentPlanRequest = (ApproveInstallmentPlanRequest) o;
    return Objects.equals(this.installmentPlanNumber, approveInstallmentPlanRequest.installmentPlanNumber) &&
        Objects.equals(this.customerSignaturePngAsBase64, approveInstallmentPlanRequest.customerSignaturePngAsBase64) &&
        Objects.equals(this.areTermsAndConditionsApproved, approveInstallmentPlanRequest.areTermsAndConditionsApproved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, customerSignaturePngAsBase64, areTermsAndConditionsApproved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveInstallmentPlanRequest {\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    customerSignaturePngAsBase64: ").append(toIndentedString(customerSignaturePngAsBase64)).append("\n");
    sb.append("    areTermsAndConditionsApproved: ").append(toIndentedString(areTermsAndConditionsApproved)).append("\n");
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

