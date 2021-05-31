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
import com.splitit.sdk.model.ApplicativeUserPasswordHistory;
import com.splitit.sdk.model.PisUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PisUserPasswordHistories
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class PisUserPasswordHistories  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("PasswordHash")
  private String passwordHash = null;

  @SerializedName("PasswordExpDate")
  private OffsetDateTime passwordExpDate = null;

  @SerializedName("PisUserId")
  private Long pisUserId = null;

  @SerializedName("PisUser")
  private PisUsers pisUser = null;

  public PisUserPasswordHistories id(Long id) {
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

  public PisUserPasswordHistories password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PisUserPasswordHistories passwordHash(String passwordHash) {
    this.passwordHash = passwordHash;
    return this;
  }

   /**
   * Get passwordHash
   * @return passwordHash
  **/
  @ApiModelProperty(value = "")
  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public PisUserPasswordHistories passwordExpDate(OffsetDateTime passwordExpDate) {
    this.passwordExpDate = passwordExpDate;
    return this;
  }

   /**
   * Get passwordExpDate
   * @return passwordExpDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getPasswordExpDate() {
    return passwordExpDate;
  }

  public void setPasswordExpDate(OffsetDateTime passwordExpDate) {
    this.passwordExpDate = passwordExpDate;
  }

  public PisUserPasswordHistories pisUserId(Long pisUserId) {
    this.pisUserId = pisUserId;
    return this;
  }

   /**
   * Get pisUserId
   * @return pisUserId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getPisUserId() {
    return pisUserId;
  }

  public void setPisUserId(Long pisUserId) {
    this.pisUserId = pisUserId;
  }

  public PisUserPasswordHistories pisUser(PisUsers pisUser) {
    this.pisUser = pisUser;
    return this;
  }

   /**
   * Get pisUser
   * @return pisUser
  **/
  @ApiModelProperty(value = "")
  public PisUsers getPisUser() {
    return pisUser;
  }

  public void setPisUser(PisUsers pisUser) {
    this.pisUser = pisUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PisUserPasswordHistories pisUserPasswordHistories = (PisUserPasswordHistories) o;
    return Objects.equals(this.id, pisUserPasswordHistories.id) &&
        Objects.equals(this.password, pisUserPasswordHistories.password) &&
        Objects.equals(this.passwordHash, pisUserPasswordHistories.passwordHash) &&
        Objects.equals(this.passwordExpDate, pisUserPasswordHistories.passwordExpDate) &&
        Objects.equals(this.pisUserId, pisUserPasswordHistories.pisUserId) &&
        Objects.equals(this.pisUser, pisUserPasswordHistories.pisUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, passwordHash, passwordExpDate, pisUserId, pisUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PisUserPasswordHistories {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    passwordExpDate: ").append(toIndentedString(passwordExpDate)).append("\n");
    sb.append("    pisUserId: ").append(toIndentedString(pisUserId)).append("\n");
    sb.append("    pisUser: ").append(toIndentedString(pisUser)).append("\n");
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

