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
import com.splitit.sdk.model.Roles;
import com.splitit.sdk.model.User2;
import com.splitit.sdk.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ApplicativeUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class ApplicativeUser  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Culture")
  private String culture = null;

  @SerializedName("UserFullName")
  private String userFullName = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("Role")
  private Roles role = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("UniqueId")
  private String uniqueId = null;

  @SerializedName("LoginAttempt")
  private Integer loginAttempt = null;

  @SerializedName("MaxInvalidLoginAttempts")
  private Integer maxInvalidLoginAttempts = null;

  @SerializedName("Status")
  private UserStatus status = null;

  @SerializedName("IsLocked")
  private Boolean isLocked = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("CultureName")
  private String cultureName = null;

  @SerializedName("RoleId")
  private Long roleId = null;

  @SerializedName("LoginUserName")
  private String loginUserName = null;

  @SerializedName("LastTimeLogin")
  private OffsetDateTime lastTimeLogin = null;

  @SerializedName("IsDataPrivateRestricted")
  private Boolean isDataPrivateRestricted = null;

  public ApplicativeUser id(Long id) {
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

  public ApplicativeUser culture(String culture) {
    this.culture = culture;
    return this;
  }

   /**
   * Get culture
   * @return culture
  **/
  @ApiModelProperty(value = "")
  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }

  public ApplicativeUser userFullName(String userFullName) {
    this.userFullName = userFullName;
    return this;
  }

   /**
   * Get userFullName
   * @return userFullName
  **/
  @ApiModelProperty(value = "")
  public String getUserFullName() {
    return userFullName;
  }

  public void setUserFullName(String userFullName) {
    this.userFullName = userFullName;
  }

  public ApplicativeUser phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ApplicativeUser role(Roles role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Roles getRole() {
    return role;
  }

  public void setRole(Roles role) {
    this.role = role;
  }

  public ApplicativeUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ApplicativeUser uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @ApiModelProperty(value = "")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public ApplicativeUser loginAttempt(Integer loginAttempt) {
    this.loginAttempt = loginAttempt;
    return this;
  }

   /**
   * Get loginAttempt
   * @return loginAttempt
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLoginAttempt() {
    return loginAttempt;
  }

  public void setLoginAttempt(Integer loginAttempt) {
    this.loginAttempt = loginAttempt;
  }

  public ApplicativeUser maxInvalidLoginAttempts(Integer maxInvalidLoginAttempts) {
    this.maxInvalidLoginAttempts = maxInvalidLoginAttempts;
    return this;
  }

   /**
   * Get maxInvalidLoginAttempts
   * @return maxInvalidLoginAttempts
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxInvalidLoginAttempts() {
    return maxInvalidLoginAttempts;
  }

  public void setMaxInvalidLoginAttempts(Integer maxInvalidLoginAttempts) {
    this.maxInvalidLoginAttempts = maxInvalidLoginAttempts;
  }

  public ApplicativeUser status(UserStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public UserStatus getStatus() {
    return status;
  }

  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public ApplicativeUser isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public ApplicativeUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ApplicativeUser cultureName(String cultureName) {
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

  public ApplicativeUser roleId(Long roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public ApplicativeUser loginUserName(String loginUserName) {
    this.loginUserName = loginUserName;
    return this;
  }

   /**
   * Get loginUserName
   * @return loginUserName
  **/
  @ApiModelProperty(value = "")
  public String getLoginUserName() {
    return loginUserName;
  }

  public void setLoginUserName(String loginUserName) {
    this.loginUserName = loginUserName;
  }

  public ApplicativeUser lastTimeLogin(OffsetDateTime lastTimeLogin) {
    this.lastTimeLogin = lastTimeLogin;
    return this;
  }

   /**
   * Get lastTimeLogin
   * @return lastTimeLogin
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastTimeLogin() {
    return lastTimeLogin;
  }

  public void setLastTimeLogin(OffsetDateTime lastTimeLogin) {
    this.lastTimeLogin = lastTimeLogin;
  }

  public ApplicativeUser isDataPrivateRestricted(Boolean isDataPrivateRestricted) {
    this.isDataPrivateRestricted = isDataPrivateRestricted;
    return this;
  }

   /**
   * Get isDataPrivateRestricted
   * @return isDataPrivateRestricted
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsDataPrivateRestricted() {
    return isDataPrivateRestricted;
  }

  public void setIsDataPrivateRestricted(Boolean isDataPrivateRestricted) {
    this.isDataPrivateRestricted = isDataPrivateRestricted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicativeUser applicativeUser = (ApplicativeUser) o;
    return Objects.equals(this.id, applicativeUser.id) &&
        Objects.equals(this.culture, applicativeUser.culture) &&
        Objects.equals(this.userFullName, applicativeUser.userFullName) &&
        Objects.equals(this.phoneNumber, applicativeUser.phoneNumber) &&
        Objects.equals(this.role, applicativeUser.role) &&
        Objects.equals(this.userName, applicativeUser.userName) &&
        Objects.equals(this.uniqueId, applicativeUser.uniqueId) &&
        Objects.equals(this.loginAttempt, applicativeUser.loginAttempt) &&
        Objects.equals(this.maxInvalidLoginAttempts, applicativeUser.maxInvalidLoginAttempts) &&
        Objects.equals(this.status, applicativeUser.status) &&
        Objects.equals(this.isLocked, applicativeUser.isLocked) &&
        Objects.equals(this.email, applicativeUser.email) &&
        Objects.equals(this.cultureName, applicativeUser.cultureName) &&
        Objects.equals(this.roleId, applicativeUser.roleId) &&
        Objects.equals(this.loginUserName, applicativeUser.loginUserName) &&
        Objects.equals(this.lastTimeLogin, applicativeUser.lastTimeLogin) &&
        Objects.equals(this.isDataPrivateRestricted, applicativeUser.isDataPrivateRestricted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, culture, userFullName, phoneNumber, role, userName, uniqueId, loginAttempt, maxInvalidLoginAttempts, status, isLocked, email, cultureName, roleId, loginUserName, lastTimeLogin, isDataPrivateRestricted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicativeUser {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    userFullName: ").append(toIndentedString(userFullName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    loginAttempt: ").append(toIndentedString(loginAttempt)).append("\n");
    sb.append("    maxInvalidLoginAttempts: ").append(toIndentedString(maxInvalidLoginAttempts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    loginUserName: ").append(toIndentedString(loginUserName)).append("\n");
    sb.append("    lastTimeLogin: ").append(toIndentedString(lastTimeLogin)).append("\n");
    sb.append("    isDataPrivateRestricted: ").append(toIndentedString(isDataPrivateRestricted)).append("\n");
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

