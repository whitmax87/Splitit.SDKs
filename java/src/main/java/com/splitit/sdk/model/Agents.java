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
import com.splitit.sdk.model.Merchants;
import com.splitit.sdk.model.Terminals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Agents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class Agents  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("AgentNumber")
  private String agentNumber = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("JobTitle")
  private String jobTitle = null;

  @SerializedName("FaxNumber")
  private String faxNumber = null;

  @SerializedName("MobileNumber")
  private String mobileNumber = null;

  @SerializedName("WorkPhoneNumber")
  private String workPhoneNumber = null;

  @SerializedName("Notes")
  private String notes = null;

  @SerializedName("CrmId")
  private String crmId = null;

  @SerializedName("PisUserUniqueId")
  private String pisUserUniqueId = null;

  @SerializedName("MerchantId")
  private Long merchantId = null;

  @SerializedName("PisUserId")
  private Long pisUserId = null;

  @SerializedName("Merchant")
  private Merchants merchant = null;

  @SerializedName("PisUser")
  private Object pisUser = null;

  @SerializedName("Terminals")
  private List<Terminals> terminals = null;

  public Agents id(Long id) {
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

  public Agents agentNumber(String agentNumber) {
    this.agentNumber = agentNumber;
    return this;
  }

   /**
   * Get agentNumber
   * @return agentNumber
  **/
  @ApiModelProperty(value = "")
  public String getAgentNumber() {
    return agentNumber;
  }

  public void setAgentNumber(String agentNumber) {
    this.agentNumber = agentNumber;
  }

  public Agents email(String email) {
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

  public Agents firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Agents lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Agents jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Agents faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  @ApiModelProperty(value = "")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Agents mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Agents workPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
    return this;
  }

   /**
   * Get workPhoneNumber
   * @return workPhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getWorkPhoneNumber() {
    return workPhoneNumber;
  }

  public void setWorkPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
  }

  public Agents notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Agents crmId(String crmId) {
    this.crmId = crmId;
    return this;
  }

   /**
   * Get crmId
   * @return crmId
  **/
  @ApiModelProperty(value = "")
  public String getCrmId() {
    return crmId;
  }

  public void setCrmId(String crmId) {
    this.crmId = crmId;
  }

  public Agents pisUserUniqueId(String pisUserUniqueId) {
    this.pisUserUniqueId = pisUserUniqueId;
    return this;
  }

   /**
   * Get pisUserUniqueId
   * @return pisUserUniqueId
  **/
  @ApiModelProperty(value = "")
  public String getPisUserUniqueId() {
    return pisUserUniqueId;
  }

  public void setPisUserUniqueId(String pisUserUniqueId) {
    this.pisUserUniqueId = pisUserUniqueId;
  }

  public Agents merchantId(Long merchantId) {
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

  public Agents pisUserId(Long pisUserId) {
    this.pisUserId = pisUserId;
    return this;
  }

   /**
   * Get pisUserId
   * @return pisUserId
  **/
  @ApiModelProperty(value = "")
  public Long getPisUserId() {
    return pisUserId;
  }

  public void setPisUserId(Long pisUserId) {
    this.pisUserId = pisUserId;
  }

  public Agents merchant(Merchants merchant) {
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

  public Agents pisUser(Object pisUser) {
    this.pisUser = pisUser;
    return this;
  }

   /**
   * Get pisUser
   * @return pisUser
  **/
  @ApiModelProperty(value = "")
  public Object getPisUser() {
    return pisUser;
  }

  public void setPisUser(Object pisUser) {
    this.pisUser = pisUser;
  }

  public Agents terminals(List<Terminals> terminals) {
    this.terminals = terminals;
    return this;
  }

  public Agents addTerminalsItem(Terminals terminalsItem) {
    if (this.terminals == null) {
      this.terminals = new ArrayList<Terminals>();
    }
    this.terminals.add(terminalsItem);
    return this;
  }

   /**
   * Get terminals
   * @return terminals
  **/
  @ApiModelProperty(value = "")
  public List<Terminals> getTerminals() {
    return terminals;
  }

  public void setTerminals(List<Terminals> terminals) {
    this.terminals = terminals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agents agents = (Agents) o;
    return Objects.equals(this.id, agents.id) &&
        Objects.equals(this.agentNumber, agents.agentNumber) &&
        Objects.equals(this.email, agents.email) &&
        Objects.equals(this.firstName, agents.firstName) &&
        Objects.equals(this.lastName, agents.lastName) &&
        Objects.equals(this.jobTitle, agents.jobTitle) &&
        Objects.equals(this.faxNumber, agents.faxNumber) &&
        Objects.equals(this.mobileNumber, agents.mobileNumber) &&
        Objects.equals(this.workPhoneNumber, agents.workPhoneNumber) &&
        Objects.equals(this.notes, agents.notes) &&
        Objects.equals(this.crmId, agents.crmId) &&
        Objects.equals(this.pisUserUniqueId, agents.pisUserUniqueId) &&
        Objects.equals(this.merchantId, agents.merchantId) &&
        Objects.equals(this.pisUserId, agents.pisUserId) &&
        Objects.equals(this.merchant, agents.merchant) &&
        Objects.equals(this.pisUser, agents.pisUser) &&
        Objects.equals(this.terminals, agents.terminals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agentNumber, email, firstName, lastName, jobTitle, faxNumber, mobileNumber, workPhoneNumber, notes, crmId, pisUserUniqueId, merchantId, pisUserId, merchant, pisUser, terminals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agents {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agentNumber: ").append(toIndentedString(agentNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    workPhoneNumber: ").append(toIndentedString(workPhoneNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    crmId: ").append(toIndentedString(crmId)).append("\n");
    sb.append("    pisUserUniqueId: ").append(toIndentedString(pisUserUniqueId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    pisUserId: ").append(toIndentedString(pisUserId)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    pisUser: ").append(toIndentedString(pisUser)).append("\n");
    sb.append("    terminals: ").append(toIndentedString(terminals)).append("\n");
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

