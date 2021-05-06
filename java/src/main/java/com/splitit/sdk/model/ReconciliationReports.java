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
import com.splitit.sdk.model.ReconciliationReportItems;
import com.splitit.sdk.model.Terminals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ReconciliationReports
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class ReconciliationReports  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("From")
  private OffsetDateTime from = null;

  @SerializedName("To")
  private OffsetDateTime to = null;

  @SerializedName("TerminalId")
  private Long terminalId = null;

  @SerializedName("IsIdentical")
  private Boolean isIdentical = null;

  @SerializedName("IsDaily")
  private Boolean isDaily = null;

  @SerializedName("Terminal")
  private Terminals terminal = null;

  @SerializedName("ReconciliationReportItems")
  private List<ReconciliationReportItems> reconciliationReportItems = null;

  public ReconciliationReports id(Long id) {
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

  public ReconciliationReports from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public ReconciliationReports to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }

  public ReconciliationReports terminalId(Long terminalId) {
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

  public ReconciliationReports isIdentical(Boolean isIdentical) {
    this.isIdentical = isIdentical;
    return this;
  }

   /**
   * Get isIdentical
   * @return isIdentical
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsIdentical() {
    return isIdentical;
  }

  public void setIsIdentical(Boolean isIdentical) {
    this.isIdentical = isIdentical;
  }

  public ReconciliationReports isDaily(Boolean isDaily) {
    this.isDaily = isDaily;
    return this;
  }

   /**
   * Get isDaily
   * @return isDaily
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsDaily() {
    return isDaily;
  }

  public void setIsDaily(Boolean isDaily) {
    this.isDaily = isDaily;
  }

  public ReconciliationReports terminal(Terminals terminal) {
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

  public ReconciliationReports reconciliationReportItems(List<ReconciliationReportItems> reconciliationReportItems) {
    this.reconciliationReportItems = reconciliationReportItems;
    return this;
  }

  public ReconciliationReports addReconciliationReportItemsItem(ReconciliationReportItems reconciliationReportItemsItem) {
    if (this.reconciliationReportItems == null) {
      this.reconciliationReportItems = new ArrayList<ReconciliationReportItems>();
    }
    this.reconciliationReportItems.add(reconciliationReportItemsItem);
    return this;
  }

   /**
   * Get reconciliationReportItems
   * @return reconciliationReportItems
  **/
  @ApiModelProperty(value = "")
  public List<ReconciliationReportItems> getReconciliationReportItems() {
    return reconciliationReportItems;
  }

  public void setReconciliationReportItems(List<ReconciliationReportItems> reconciliationReportItems) {
    this.reconciliationReportItems = reconciliationReportItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconciliationReports reconciliationReports = (ReconciliationReports) o;
    return Objects.equals(this.id, reconciliationReports.id) &&
        Objects.equals(this.from, reconciliationReports.from) &&
        Objects.equals(this.to, reconciliationReports.to) &&
        Objects.equals(this.terminalId, reconciliationReports.terminalId) &&
        Objects.equals(this.isIdentical, reconciliationReports.isIdentical) &&
        Objects.equals(this.isDaily, reconciliationReports.isDaily) &&
        Objects.equals(this.terminal, reconciliationReports.terminal) &&
        Objects.equals(this.reconciliationReportItems, reconciliationReports.reconciliationReportItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, terminalId, isIdentical, isDaily, terminal, reconciliationReportItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconciliationReports {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    isIdentical: ").append(toIndentedString(isIdentical)).append("\n");
    sb.append("    isDaily: ").append(toIndentedString(isDaily)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    reconciliationReportItems: ").append(toIndentedString(reconciliationReportItems)).append("\n");
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

