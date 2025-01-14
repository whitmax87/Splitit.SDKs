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
 * GetResourcesRequestContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class GetResourcesRequestContext  {
  @SerializedName("MerchantCode")
  private String merchantCode = null;

  @SerializedName("CultureName")
  private String cultureName = null;

  @SerializedName("TouchPointCode")
  private String touchPointCode = null;

  public GetResourcesRequestContext merchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
    return this;
  }

   /**
   * Get merchantCode
   * @return merchantCode
  **/
  @ApiModelProperty(value = "")
  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }

  public GetResourcesRequestContext cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

   /**
   * Get cultureName
   * @return cultureName
  **/
  @ApiModelProperty(value = "")
  public String getCultureName() {
    return cultureName;
  }

  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }

  public GetResourcesRequestContext touchPointCode(String touchPointCode) {
    this.touchPointCode = touchPointCode;
    return this;
  }

   /**
   * Get touchPointCode
   * @return touchPointCode
  **/
  @ApiModelProperty(value = "")
  public String getTouchPointCode() {
    return touchPointCode;
  }

  public void setTouchPointCode(String touchPointCode) {
    this.touchPointCode = touchPointCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResourcesRequestContext getResourcesRequestContext = (GetResourcesRequestContext) o;
    return Objects.equals(this.merchantCode, getResourcesRequestContext.merchantCode) &&
        Objects.equals(this.cultureName, getResourcesRequestContext.cultureName) &&
        Objects.equals(this.touchPointCode, getResourcesRequestContext.touchPointCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCode, cultureName, touchPointCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetResourcesRequestContext {\n");
    
    
    sb.append("    merchantCode: ").append(toIndentedString(merchantCode)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    touchPointCode: ").append(toIndentedString(touchPointCode)).append("\n");
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

