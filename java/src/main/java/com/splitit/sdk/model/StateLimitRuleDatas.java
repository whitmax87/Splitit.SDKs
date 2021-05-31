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
import com.splitit.sdk.model.CountrySubdivisions;
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.Terminals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StateLimitRuleDatas
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class StateLimitRuleDatas  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("TerminalId")
  private Long terminalId = null;

  @SerializedName("CountrySubdivisionId")
  private Long countrySubdivisionId = null;

  @SerializedName("CountrySubdivision")
  private CountrySubdivisions countrySubdivision = null;

  @SerializedName("Terminal")
  private Terminals terminal = null;

  public StateLimitRuleDatas id(Long id) {
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

  public StateLimitRuleDatas terminalId(Long terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Get terminalId
   * @return terminalId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(Long terminalId) {
    this.terminalId = terminalId;
  }

  public StateLimitRuleDatas countrySubdivisionId(Long countrySubdivisionId) {
    this.countrySubdivisionId = countrySubdivisionId;
    return this;
  }

   /**
   * Get countrySubdivisionId
   * @return countrySubdivisionId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCountrySubdivisionId() {
    return countrySubdivisionId;
  }

  public void setCountrySubdivisionId(Long countrySubdivisionId) {
    this.countrySubdivisionId = countrySubdivisionId;
  }

  public StateLimitRuleDatas countrySubdivision(CountrySubdivisions countrySubdivision) {
    this.countrySubdivision = countrySubdivision;
    return this;
  }

   /**
   * Get countrySubdivision
   * @return countrySubdivision
  **/
  @ApiModelProperty(value = "")
  public CountrySubdivisions getCountrySubdivision() {
    return countrySubdivision;
  }

  public void setCountrySubdivision(CountrySubdivisions countrySubdivision) {
    this.countrySubdivision = countrySubdivision;
  }

  public StateLimitRuleDatas terminal(Terminals terminal) {
    this.terminal = terminal;
    return this;
  }

   /**
   * Get terminal
   * @return terminal
  **/
  @ApiModelProperty(value = "")
  public Terminals getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminals terminal) {
    this.terminal = terminal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateLimitRuleDatas stateLimitRuleDatas = (StateLimitRuleDatas) o;
    return Objects.equals(this.id, stateLimitRuleDatas.id) &&
        Objects.equals(this.terminalId, stateLimitRuleDatas.terminalId) &&
        Objects.equals(this.countrySubdivisionId, stateLimitRuleDatas.countrySubdivisionId) &&
        Objects.equals(this.countrySubdivision, stateLimitRuleDatas.countrySubdivision) &&
        Objects.equals(this.terminal, stateLimitRuleDatas.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, terminalId, countrySubdivisionId, countrySubdivision, terminal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateLimitRuleDatas {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    countrySubdivisionId: ").append(toIndentedString(countrySubdivisionId)).append("\n");
    sb.append("    countrySubdivision: ").append(toIndentedString(countrySubdivision)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

