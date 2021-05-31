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
import com.splitit.sdk.model.ConfigValues;
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.Merchants;
import com.splitit.sdk.model.TouchPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TouchPointColorValues
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class TouchPointColorValues  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("TouchPointId")
  private Long touchPointId = null;

  @SerializedName("MerchantId")
  private Long merchantId = null;

  @SerializedName("Merchant")
  private Merchants merchant = null;

  @SerializedName("Colors")
  private List<ConfigValues> colors = null;

  @SerializedName("TouchPoint")
  private TouchPoints touchPoint = null;

  public TouchPointColorValues id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TouchPointColorValues touchPointId(Long touchPointId) {
    this.touchPointId = touchPointId;
    return this;
  }

   /**
   * Get touchPointId
   * @return touchPointId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTouchPointId() {
    return touchPointId;
  }

  public void setTouchPointId(Long touchPointId) {
    this.touchPointId = touchPointId;
  }

  public TouchPointColorValues merchantId(Long merchantId) {
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

  public TouchPointColorValues merchant(Merchants merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(value = "")
  public Merchants getMerchant() {
    return merchant;
  }

  public void setMerchant(Merchants merchant) {
    this.merchant = merchant;
  }

  public TouchPointColorValues colors(List<ConfigValues> colors) {
    this.colors = colors;
    return this;
  }

  public TouchPointColorValues addColorsItem(ConfigValues colorsItem) {
    if (this.colors == null) {
      this.colors = new ArrayList<ConfigValues>();
    }
    this.colors.add(colorsItem);
    return this;
  }

   /**
   * Get colors
   * @return colors
  **/
  @ApiModelProperty(value = "")
  public List<ConfigValues> getColors() {
    return colors;
  }

  public void setColors(List<ConfigValues> colors) {
    this.colors = colors;
  }

  public TouchPointColorValues touchPoint(TouchPoints touchPoint) {
    this.touchPoint = touchPoint;
    return this;
  }

   /**
   * Get touchPoint
   * @return touchPoint
  **/
  @ApiModelProperty(value = "")
  public TouchPoints getTouchPoint() {
    return touchPoint;
  }

  public void setTouchPoint(TouchPoints touchPoint) {
    this.touchPoint = touchPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TouchPointColorValues touchPointColorValues = (TouchPointColorValues) o;
    return Objects.equals(this.id, touchPointColorValues.id) &&
        Objects.equals(this.touchPointId, touchPointColorValues.touchPointId) &&
        Objects.equals(this.merchantId, touchPointColorValues.merchantId) &&
        Objects.equals(this.merchant, touchPointColorValues.merchant) &&
        Objects.equals(this.colors, touchPointColorValues.colors) &&
        Objects.equals(this.touchPoint, touchPointColorValues.touchPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, touchPointId, merchantId, merchant, colors, touchPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TouchPointColorValues {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    touchPointId: ").append(toIndentedString(touchPointId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    touchPoint: ").append(toIndentedString(touchPoint)).append("\n");
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

