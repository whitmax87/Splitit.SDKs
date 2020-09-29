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
import com.splitit.sdk.model.AuthenticationType;
import com.splitit.sdk.model.TouchPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RequestHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-29T14:12:31.625Z")
public class RequestHeader   {
  @SerializedName("TouchPoint")
  private TouchPoint touchPoint = null;

  @SerializedName("SessionId")
  private String sessionId = null;

  @SerializedName("ApiKey")
  private String apiKey = null;

  @SerializedName("CultureName")
  private String cultureName = null;

  @SerializedName("AuthenticationType")
  private AuthenticationType authenticationType = null;

  public RequestHeader touchPoint(TouchPoint touchPoint) {
    this.touchPoint = touchPoint;
    return this;
  }

   /**
   * Get touchPoint
   * @return touchPoint
  **/
  @ApiModelProperty(value = "")
  public TouchPoint getTouchPoint() {
    return touchPoint;
  }

  public void setTouchPoint(TouchPoint touchPoint) {
    this.touchPoint = touchPoint;
  }

  public RequestHeader sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(value = "")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public RequestHeader apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public RequestHeader cultureName(String cultureName) {
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

  public RequestHeader authenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @ApiModelProperty(value = "")
  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.touchPoint, requestHeader.touchPoint) &&
        Objects.equals(this.sessionId, requestHeader.sessionId) &&
        Objects.equals(this.apiKey, requestHeader.apiKey) &&
        Objects.equals(this.cultureName, requestHeader.cultureName) &&
        Objects.equals(this.authenticationType, requestHeader.authenticationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(touchPoint, sessionId, apiKey, cultureName, authenticationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    
    sb.append("    touchPoint: ").append(toIndentedString(touchPoint)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
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

