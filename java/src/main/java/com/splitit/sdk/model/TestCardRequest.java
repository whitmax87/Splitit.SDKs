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
 * TestCardRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class TestCardRequest extends ModelWithHeader {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("DoVoid")
  private Boolean doVoid = null;

  public TestCardRequest installmentPlanNumber(String installmentPlanNumber) {
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

  public TestCardRequest doVoid(Boolean doVoid) {
    this.doVoid = doVoid;
    return this;
  }

   /**
   * Get doVoid
   * @return doVoid
  **/
  @ApiModelProperty(value = "")
  public Boolean isDoVoid() {
    return doVoid;
  }

  public void setDoVoid(Boolean doVoid) {
    this.doVoid = doVoid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCardRequest testCardRequest = (TestCardRequest) o;
    return Objects.equals(this.installmentPlanNumber, testCardRequest.installmentPlanNumber) &&
        Objects.equals(this.doVoid, testCardRequest.doVoid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, doVoid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCardRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    doVoid: ").append(toIndentedString(doVoid)).append("\n");
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

