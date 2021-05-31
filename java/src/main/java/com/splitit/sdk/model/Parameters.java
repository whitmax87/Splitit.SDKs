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
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.ParameterGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Parameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class Parameters  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("ParameterGroupId")
  private Long parameterGroupId = null;

  @SerializedName("ParameterGroup")
  private ParameterGroups parameterGroup = null;

  public Parameters id(Long id) {
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

  public Parameters key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Parameters value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Parameters parameterGroupId(Long parameterGroupId) {
    this.parameterGroupId = parameterGroupId;
    return this;
  }

   /**
   * Get parameterGroupId
   * @return parameterGroupId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getParameterGroupId() {
    return parameterGroupId;
  }

  public void setParameterGroupId(Long parameterGroupId) {
    this.parameterGroupId = parameterGroupId;
  }

  public Parameters parameterGroup(ParameterGroups parameterGroup) {
    this.parameterGroup = parameterGroup;
    return this;
  }

   /**
   * Get parameterGroup
   * @return parameterGroup
  **/
  @ApiModelProperty(value = "")
  public ParameterGroups getParameterGroup() {
    return parameterGroup;
  }

  public void setParameterGroup(ParameterGroups parameterGroup) {
    this.parameterGroup = parameterGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameters parameters = (Parameters) o;
    return Objects.equals(this.id, parameters.id) &&
        Objects.equals(this.key, parameters.key) &&
        Objects.equals(this.value, parameters.value) &&
        Objects.equals(this.parameterGroupId, parameters.parameterGroupId) &&
        Objects.equals(this.parameterGroup, parameters.parameterGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value, parameterGroupId, parameterGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameters {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    parameterGroupId: ").append(toIndentedString(parameterGroupId)).append("\n");
    sb.append("    parameterGroup: ").append(toIndentedString(parameterGroup)).append("\n");
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

