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
import com.splitit.sdk.model.InstallmentPlanActivityStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RelationsLoad
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-10T18:07:01.900Z")
public class RelationsLoad   {
  @SerializedName("Installments")
  private InstallmentPlanActivityStatus installments = null;

  @SerializedName("SecureAuthorizations")
  private InstallmentPlanActivityStatus secureAuthorizations = null;

  public RelationsLoad installments(InstallmentPlanActivityStatus installments) {
    this.installments = installments;
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @ApiModelProperty(required = true, value = "")
  public InstallmentPlanActivityStatus getInstallments() {
    return installments;
  }

  public void setInstallments(InstallmentPlanActivityStatus installments) {
    this.installments = installments;
  }

  public RelationsLoad secureAuthorizations(InstallmentPlanActivityStatus secureAuthorizations) {
    this.secureAuthorizations = secureAuthorizations;
    return this;
  }

   /**
   * Get secureAuthorizations
   * @return secureAuthorizations
  **/
  @ApiModelProperty(required = true, value = "")
  public InstallmentPlanActivityStatus getSecureAuthorizations() {
    return secureAuthorizations;
  }

  public void setSecureAuthorizations(InstallmentPlanActivityStatus secureAuthorizations) {
    this.secureAuthorizations = secureAuthorizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationsLoad relationsLoad = (RelationsLoad) o;
    return Objects.equals(this.installments, relationsLoad.installments) &&
        Objects.equals(this.secureAuthorizations, relationsLoad.secureAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installments, secureAuthorizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationsLoad {\n");
    
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    secureAuthorizations: ").append(toIndentedString(secureAuthorizations)).append("\n");
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

