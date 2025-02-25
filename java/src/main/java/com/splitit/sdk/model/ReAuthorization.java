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
import com.splitit.sdk.model.CardData;
import com.splitit.sdk.model.Money;
import com.splitit.sdk.model.TransactionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ReAuthorization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class ReAuthorization  {
  @SerializedName("ProcessingDate")
  private OffsetDateTime processingDate = null;

  @SerializedName("Amount")
  private Money amount = null;

  @SerializedName("TransactionResults")
  private List<TransactionResult> transactionResults = null;

  @SerializedName("CardDetails")
  private CardData cardDetails = null;

  @SerializedName("Result")
  private Boolean result = null;

  public ReAuthorization processingDate(OffsetDateTime processingDate) {
    this.processingDate = processingDate;
    return this;
  }

   /**
   * Get processingDate
   * @return processingDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessingDate() {
    return processingDate;
  }

  public void setProcessingDate(OffsetDateTime processingDate) {
    this.processingDate = processingDate;
  }

  public ReAuthorization amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public ReAuthorization transactionResults(List<TransactionResult> transactionResults) {
    this.transactionResults = transactionResults;
    return this;
  }

  public ReAuthorization addTransactionResultsItem(TransactionResult transactionResultsItem) {
    if (this.transactionResults == null) {
      this.transactionResults = new ArrayList<TransactionResult>();
    }
    this.transactionResults.add(transactionResultsItem);
    return this;
  }

   /**
   * Get transactionResults
   * @return transactionResults
  **/
  @ApiModelProperty(value = "")
  public List<TransactionResult> getTransactionResults() {
    return transactionResults;
  }

  public void setTransactionResults(List<TransactionResult> transactionResults) {
    this.transactionResults = transactionResults;
  }

  public ReAuthorization cardDetails(CardData cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

   /**
   * Get cardDetails
   * @return cardDetails
  **/
  @ApiModelProperty(value = "")
  public CardData getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(CardData cardDetails) {
    this.cardDetails = cardDetails;
  }

  public ReAuthorization result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReAuthorization reAuthorization = (ReAuthorization) o;
    return Objects.equals(this.processingDate, reAuthorization.processingDate) &&
        Objects.equals(this.amount, reAuthorization.amount) &&
        Objects.equals(this.transactionResults, reAuthorization.transactionResults) &&
        Objects.equals(this.cardDetails, reAuthorization.cardDetails) &&
        Objects.equals(this.result, reAuthorization.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingDate, amount, transactionResults, cardDetails, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReAuthorization {\n");
    
    
    sb.append("    processingDate: ").append(toIndentedString(processingDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionResults: ").append(toIndentedString(transactionResults)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

