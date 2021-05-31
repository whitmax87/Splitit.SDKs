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
import com.splitit.sdk.model.Installments;
import com.splitit.sdk.model.ProcessorAuthenticationParameters;
import com.splitit.sdk.model.ReAuthorizations;
import com.splitit.sdk.model.TerminalGatewayDatas;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Processors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class Processors  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ApiUrl")
  private String apiUrl = null;

  @SerializedName("MaxNumberOfRetries")
  private Integer maxNumberOfRetries = null;

  @SerializedName("TimeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("MaxAuth")
  private Integer maxAuth = null;

  @SerializedName("GracePeriod")
  private Integer gracePeriod = null;

  @SerializedName("AsyncRefundGracePeriodDays")
  private Integer asyncRefundGracePeriodDays = null;

  @SerializedName("IsCheckedMastercard")
  private Boolean isCheckedMastercard = null;

  @SerializedName("IsCheckedUpi")
  private Boolean isCheckedUpi = null;

  @SerializedName("IsCheckedVisa")
  private Boolean isCheckedVisa = null;

  @SerializedName("IsCheckedAmex")
  private Boolean isCheckedAmex = null;

  @SerializedName("IsCheckedMaestro")
  private Boolean isCheckedMaestro = null;

  @SerializedName("IsCheckedJcb")
  private Boolean isCheckedJcb = null;

  @SerializedName("IsCheckedDiscover")
  private Boolean isCheckedDiscover = null;

  @SerializedName("Is3ds2Supported")
  private Boolean is3ds2Supported = null;

  @SerializedName("GatewayApiassembly")
  private String gatewayApiassembly = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("GatewayApiimplementorNs")
  private String gatewayApiimplementorNs = null;

  @SerializedName("IsTokenSupported")
  private Boolean isTokenSupported = null;

  @SerializedName("ConsumerUpdateCcGracePeriod")
  private String consumerUpdateCcGracePeriod = null;

  @SerializedName("IsVoidSupported")
  private Boolean isVoidSupported = null;

  @SerializedName("IsVoidAfterFailRefund")
  private Boolean isVoidAfterFailRefund = null;

  @SerializedName("MinAmountAllowedForAuth")
  private BigDecimal minAmountAllowedForAuth = null;

  @SerializedName("CaptureDelayInSec")
  private Integer captureDelayInSec = null;

  @SerializedName("VoidDelayInSec")
  private Integer voidDelayInSec = null;

  @SerializedName("AllowPartialVoid")
  private Boolean allowPartialVoid = null;

  @SerializedName("Installments")
  private List<Installments> installments = null;

  @SerializedName("ProcessorAuthenticationParameters")
  private List<ProcessorAuthenticationParameters> processorAuthenticationParameters = null;

  @SerializedName("ReAuthorizations")
  private List<ReAuthorizations> reAuthorizations = null;

  @SerializedName("TerminalGatewayDatas")
  private List<TerminalGatewayDatas> terminalGatewayDatas = null;

  public Processors id(Long id) {
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

  public Processors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Processors apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @ApiModelProperty(value = "")
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public Processors maxNumberOfRetries(Integer maxNumberOfRetries) {
    this.maxNumberOfRetries = maxNumberOfRetries;
    return this;
  }

   /**
   * Get maxNumberOfRetries
   * @return maxNumberOfRetries
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxNumberOfRetries() {
    return maxNumberOfRetries;
  }

  public void setMaxNumberOfRetries(Integer maxNumberOfRetries) {
    this.maxNumberOfRetries = maxNumberOfRetries;
  }

  public Processors timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public Processors maxAuth(Integer maxAuth) {
    this.maxAuth = maxAuth;
    return this;
  }

   /**
   * Get maxAuth
   * @return maxAuth
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxAuth() {
    return maxAuth;
  }

  public void setMaxAuth(Integer maxAuth) {
    this.maxAuth = maxAuth;
  }

  public Processors gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * Get gracePeriod
   * @return gracePeriod
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public Processors asyncRefundGracePeriodDays(Integer asyncRefundGracePeriodDays) {
    this.asyncRefundGracePeriodDays = asyncRefundGracePeriodDays;
    return this;
  }

   /**
   * Get asyncRefundGracePeriodDays
   * @return asyncRefundGracePeriodDays
  **/
  @ApiModelProperty(value = "")
  public Integer getAsyncRefundGracePeriodDays() {
    return asyncRefundGracePeriodDays;
  }

  public void setAsyncRefundGracePeriodDays(Integer asyncRefundGracePeriodDays) {
    this.asyncRefundGracePeriodDays = asyncRefundGracePeriodDays;
  }

  public Processors isCheckedMastercard(Boolean isCheckedMastercard) {
    this.isCheckedMastercard = isCheckedMastercard;
    return this;
  }

   /**
   * Get isCheckedMastercard
   * @return isCheckedMastercard
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedMastercard() {
    return isCheckedMastercard;
  }

  public void setIsCheckedMastercard(Boolean isCheckedMastercard) {
    this.isCheckedMastercard = isCheckedMastercard;
  }

  public Processors isCheckedUpi(Boolean isCheckedUpi) {
    this.isCheckedUpi = isCheckedUpi;
    return this;
  }

   /**
   * Get isCheckedUpi
   * @return isCheckedUpi
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedUpi() {
    return isCheckedUpi;
  }

  public void setIsCheckedUpi(Boolean isCheckedUpi) {
    this.isCheckedUpi = isCheckedUpi;
  }

  public Processors isCheckedVisa(Boolean isCheckedVisa) {
    this.isCheckedVisa = isCheckedVisa;
    return this;
  }

   /**
   * Get isCheckedVisa
   * @return isCheckedVisa
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedVisa() {
    return isCheckedVisa;
  }

  public void setIsCheckedVisa(Boolean isCheckedVisa) {
    this.isCheckedVisa = isCheckedVisa;
  }

  public Processors isCheckedAmex(Boolean isCheckedAmex) {
    this.isCheckedAmex = isCheckedAmex;
    return this;
  }

   /**
   * Get isCheckedAmex
   * @return isCheckedAmex
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedAmex() {
    return isCheckedAmex;
  }

  public void setIsCheckedAmex(Boolean isCheckedAmex) {
    this.isCheckedAmex = isCheckedAmex;
  }

  public Processors isCheckedMaestro(Boolean isCheckedMaestro) {
    this.isCheckedMaestro = isCheckedMaestro;
    return this;
  }

   /**
   * Get isCheckedMaestro
   * @return isCheckedMaestro
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedMaestro() {
    return isCheckedMaestro;
  }

  public void setIsCheckedMaestro(Boolean isCheckedMaestro) {
    this.isCheckedMaestro = isCheckedMaestro;
  }

  public Processors isCheckedJcb(Boolean isCheckedJcb) {
    this.isCheckedJcb = isCheckedJcb;
    return this;
  }

   /**
   * Get isCheckedJcb
   * @return isCheckedJcb
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedJcb() {
    return isCheckedJcb;
  }

  public void setIsCheckedJcb(Boolean isCheckedJcb) {
    this.isCheckedJcb = isCheckedJcb;
  }

  public Processors isCheckedDiscover(Boolean isCheckedDiscover) {
    this.isCheckedDiscover = isCheckedDiscover;
    return this;
  }

   /**
   * Get isCheckedDiscover
   * @return isCheckedDiscover
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsCheckedDiscover() {
    return isCheckedDiscover;
  }

  public void setIsCheckedDiscover(Boolean isCheckedDiscover) {
    this.isCheckedDiscover = isCheckedDiscover;
  }

  public Processors is3ds2Supported(Boolean is3ds2Supported) {
    this.is3ds2Supported = is3ds2Supported;
    return this;
  }

   /**
   * Get is3ds2Supported
   * @return is3ds2Supported
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIs3ds2Supported() {
    return is3ds2Supported;
  }

  public void setIs3ds2Supported(Boolean is3ds2Supported) {
    this.is3ds2Supported = is3ds2Supported;
  }

  public Processors gatewayApiassembly(String gatewayApiassembly) {
    this.gatewayApiassembly = gatewayApiassembly;
    return this;
  }

   /**
   * Get gatewayApiassembly
   * @return gatewayApiassembly
  **/
  @ApiModelProperty(value = "")
  public String getGatewayApiassembly() {
    return gatewayApiassembly;
  }

  public void setGatewayApiassembly(String gatewayApiassembly) {
    this.gatewayApiassembly = gatewayApiassembly;
  }

  public Processors displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Processors gatewayApiimplementorNs(String gatewayApiimplementorNs) {
    this.gatewayApiimplementorNs = gatewayApiimplementorNs;
    return this;
  }

   /**
   * Get gatewayApiimplementorNs
   * @return gatewayApiimplementorNs
  **/
  @ApiModelProperty(value = "")
  public String getGatewayApiimplementorNs() {
    return gatewayApiimplementorNs;
  }

  public void setGatewayApiimplementorNs(String gatewayApiimplementorNs) {
    this.gatewayApiimplementorNs = gatewayApiimplementorNs;
  }

  public Processors isTokenSupported(Boolean isTokenSupported) {
    this.isTokenSupported = isTokenSupported;
    return this;
  }

   /**
   * Get isTokenSupported
   * @return isTokenSupported
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsTokenSupported() {
    return isTokenSupported;
  }

  public void setIsTokenSupported(Boolean isTokenSupported) {
    this.isTokenSupported = isTokenSupported;
  }

  public Processors consumerUpdateCcGracePeriod(String consumerUpdateCcGracePeriod) {
    this.consumerUpdateCcGracePeriod = consumerUpdateCcGracePeriod;
    return this;
  }

   /**
   * Get consumerUpdateCcGracePeriod
   * @return consumerUpdateCcGracePeriod
  **/
  @ApiModelProperty(value = "")
  public String getConsumerUpdateCcGracePeriod() {
    return consumerUpdateCcGracePeriod;
  }

  public void setConsumerUpdateCcGracePeriod(String consumerUpdateCcGracePeriod) {
    this.consumerUpdateCcGracePeriod = consumerUpdateCcGracePeriod;
  }

  public Processors isVoidSupported(Boolean isVoidSupported) {
    this.isVoidSupported = isVoidSupported;
    return this;
  }

   /**
   * Get isVoidSupported
   * @return isVoidSupported
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsVoidSupported() {
    return isVoidSupported;
  }

  public void setIsVoidSupported(Boolean isVoidSupported) {
    this.isVoidSupported = isVoidSupported;
  }

  public Processors isVoidAfterFailRefund(Boolean isVoidAfterFailRefund) {
    this.isVoidAfterFailRefund = isVoidAfterFailRefund;
    return this;
  }

   /**
   * Get isVoidAfterFailRefund
   * @return isVoidAfterFailRefund
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsVoidAfterFailRefund() {
    return isVoidAfterFailRefund;
  }

  public void setIsVoidAfterFailRefund(Boolean isVoidAfterFailRefund) {
    this.isVoidAfterFailRefund = isVoidAfterFailRefund;
  }

  public Processors minAmountAllowedForAuth(BigDecimal minAmountAllowedForAuth) {
    this.minAmountAllowedForAuth = minAmountAllowedForAuth;
    return this;
  }

   /**
   * Get minAmountAllowedForAuth
   * @return minAmountAllowedForAuth
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMinAmountAllowedForAuth() {
    return minAmountAllowedForAuth;
  }

  public void setMinAmountAllowedForAuth(BigDecimal minAmountAllowedForAuth) {
    this.minAmountAllowedForAuth = minAmountAllowedForAuth;
  }

  public Processors captureDelayInSec(Integer captureDelayInSec) {
    this.captureDelayInSec = captureDelayInSec;
    return this;
  }

   /**
   * Get captureDelayInSec
   * @return captureDelayInSec
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCaptureDelayInSec() {
    return captureDelayInSec;
  }

  public void setCaptureDelayInSec(Integer captureDelayInSec) {
    this.captureDelayInSec = captureDelayInSec;
  }

  public Processors voidDelayInSec(Integer voidDelayInSec) {
    this.voidDelayInSec = voidDelayInSec;
    return this;
  }

   /**
   * Get voidDelayInSec
   * @return voidDelayInSec
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getVoidDelayInSec() {
    return voidDelayInSec;
  }

  public void setVoidDelayInSec(Integer voidDelayInSec) {
    this.voidDelayInSec = voidDelayInSec;
  }

  public Processors allowPartialVoid(Boolean allowPartialVoid) {
    this.allowPartialVoid = allowPartialVoid;
    return this;
  }

   /**
   * Get allowPartialVoid
   * @return allowPartialVoid
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllowPartialVoid() {
    return allowPartialVoid;
  }

  public void setAllowPartialVoid(Boolean allowPartialVoid) {
    this.allowPartialVoid = allowPartialVoid;
  }

  public Processors installments(List<Installments> installments) {
    this.installments = installments;
    return this;
  }

  public Processors addInstallmentsItem(Installments installmentsItem) {
    if (this.installments == null) {
      this.installments = new ArrayList<Installments>();
    }
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @ApiModelProperty(value = "")
  public List<Installments> getInstallments() {
    return installments;
  }

  public void setInstallments(List<Installments> installments) {
    this.installments = installments;
  }

  public Processors processorAuthenticationParameters(List<ProcessorAuthenticationParameters> processorAuthenticationParameters) {
    this.processorAuthenticationParameters = processorAuthenticationParameters;
    return this;
  }

  public Processors addProcessorAuthenticationParametersItem(ProcessorAuthenticationParameters processorAuthenticationParametersItem) {
    if (this.processorAuthenticationParameters == null) {
      this.processorAuthenticationParameters = new ArrayList<ProcessorAuthenticationParameters>();
    }
    this.processorAuthenticationParameters.add(processorAuthenticationParametersItem);
    return this;
  }

   /**
   * Get processorAuthenticationParameters
   * @return processorAuthenticationParameters
  **/
  @ApiModelProperty(value = "")
  public List<ProcessorAuthenticationParameters> getProcessorAuthenticationParameters() {
    return processorAuthenticationParameters;
  }

  public void setProcessorAuthenticationParameters(List<ProcessorAuthenticationParameters> processorAuthenticationParameters) {
    this.processorAuthenticationParameters = processorAuthenticationParameters;
  }

  public Processors reAuthorizations(List<ReAuthorizations> reAuthorizations) {
    this.reAuthorizations = reAuthorizations;
    return this;
  }

  public Processors addReAuthorizationsItem(ReAuthorizations reAuthorizationsItem) {
    if (this.reAuthorizations == null) {
      this.reAuthorizations = new ArrayList<ReAuthorizations>();
    }
    this.reAuthorizations.add(reAuthorizationsItem);
    return this;
  }

   /**
   * Get reAuthorizations
   * @return reAuthorizations
  **/
  @ApiModelProperty(value = "")
  public List<ReAuthorizations> getReAuthorizations() {
    return reAuthorizations;
  }

  public void setReAuthorizations(List<ReAuthorizations> reAuthorizations) {
    this.reAuthorizations = reAuthorizations;
  }

  public Processors terminalGatewayDatas(List<TerminalGatewayDatas> terminalGatewayDatas) {
    this.terminalGatewayDatas = terminalGatewayDatas;
    return this;
  }

  public Processors addTerminalGatewayDatasItem(TerminalGatewayDatas terminalGatewayDatasItem) {
    if (this.terminalGatewayDatas == null) {
      this.terminalGatewayDatas = new ArrayList<TerminalGatewayDatas>();
    }
    this.terminalGatewayDatas.add(terminalGatewayDatasItem);
    return this;
  }

   /**
   * Get terminalGatewayDatas
   * @return terminalGatewayDatas
  **/
  @ApiModelProperty(value = "")
  public List<TerminalGatewayDatas> getTerminalGatewayDatas() {
    return terminalGatewayDatas;
  }

  public void setTerminalGatewayDatas(List<TerminalGatewayDatas> terminalGatewayDatas) {
    this.terminalGatewayDatas = terminalGatewayDatas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processors processors = (Processors) o;
    return Objects.equals(this.id, processors.id) &&
        Objects.equals(this.name, processors.name) &&
        Objects.equals(this.apiUrl, processors.apiUrl) &&
        Objects.equals(this.maxNumberOfRetries, processors.maxNumberOfRetries) &&
        Objects.equals(this.timeoutSeconds, processors.timeoutSeconds) &&
        Objects.equals(this.maxAuth, processors.maxAuth) &&
        Objects.equals(this.gracePeriod, processors.gracePeriod) &&
        Objects.equals(this.asyncRefundGracePeriodDays, processors.asyncRefundGracePeriodDays) &&
        Objects.equals(this.isCheckedMastercard, processors.isCheckedMastercard) &&
        Objects.equals(this.isCheckedUpi, processors.isCheckedUpi) &&
        Objects.equals(this.isCheckedVisa, processors.isCheckedVisa) &&
        Objects.equals(this.isCheckedAmex, processors.isCheckedAmex) &&
        Objects.equals(this.isCheckedMaestro, processors.isCheckedMaestro) &&
        Objects.equals(this.isCheckedJcb, processors.isCheckedJcb) &&
        Objects.equals(this.isCheckedDiscover, processors.isCheckedDiscover) &&
        Objects.equals(this.is3ds2Supported, processors.is3ds2Supported) &&
        Objects.equals(this.gatewayApiassembly, processors.gatewayApiassembly) &&
        Objects.equals(this.displayName, processors.displayName) &&
        Objects.equals(this.gatewayApiimplementorNs, processors.gatewayApiimplementorNs) &&
        Objects.equals(this.isTokenSupported, processors.isTokenSupported) &&
        Objects.equals(this.consumerUpdateCcGracePeriod, processors.consumerUpdateCcGracePeriod) &&
        Objects.equals(this.isVoidSupported, processors.isVoidSupported) &&
        Objects.equals(this.isVoidAfterFailRefund, processors.isVoidAfterFailRefund) &&
        Objects.equals(this.minAmountAllowedForAuth, processors.minAmountAllowedForAuth) &&
        Objects.equals(this.captureDelayInSec, processors.captureDelayInSec) &&
        Objects.equals(this.voidDelayInSec, processors.voidDelayInSec) &&
        Objects.equals(this.allowPartialVoid, processors.allowPartialVoid) &&
        Objects.equals(this.installments, processors.installments) &&
        Objects.equals(this.processorAuthenticationParameters, processors.processorAuthenticationParameters) &&
        Objects.equals(this.reAuthorizations, processors.reAuthorizations) &&
        Objects.equals(this.terminalGatewayDatas, processors.terminalGatewayDatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, apiUrl, maxNumberOfRetries, timeoutSeconds, maxAuth, gracePeriod, asyncRefundGracePeriodDays, isCheckedMastercard, isCheckedUpi, isCheckedVisa, isCheckedAmex, isCheckedMaestro, isCheckedJcb, isCheckedDiscover, is3ds2Supported, gatewayApiassembly, displayName, gatewayApiimplementorNs, isTokenSupported, consumerUpdateCcGracePeriod, isVoidSupported, isVoidAfterFailRefund, minAmountAllowedForAuth, captureDelayInSec, voidDelayInSec, allowPartialVoid, installments, processorAuthenticationParameters, reAuthorizations, terminalGatewayDatas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processors {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    maxNumberOfRetries: ").append(toIndentedString(maxNumberOfRetries)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    maxAuth: ").append(toIndentedString(maxAuth)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    asyncRefundGracePeriodDays: ").append(toIndentedString(asyncRefundGracePeriodDays)).append("\n");
    sb.append("    isCheckedMastercard: ").append(toIndentedString(isCheckedMastercard)).append("\n");
    sb.append("    isCheckedUpi: ").append(toIndentedString(isCheckedUpi)).append("\n");
    sb.append("    isCheckedVisa: ").append(toIndentedString(isCheckedVisa)).append("\n");
    sb.append("    isCheckedAmex: ").append(toIndentedString(isCheckedAmex)).append("\n");
    sb.append("    isCheckedMaestro: ").append(toIndentedString(isCheckedMaestro)).append("\n");
    sb.append("    isCheckedJcb: ").append(toIndentedString(isCheckedJcb)).append("\n");
    sb.append("    isCheckedDiscover: ").append(toIndentedString(isCheckedDiscover)).append("\n");
    sb.append("    is3ds2Supported: ").append(toIndentedString(is3ds2Supported)).append("\n");
    sb.append("    gatewayApiassembly: ").append(toIndentedString(gatewayApiassembly)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gatewayApiimplementorNs: ").append(toIndentedString(gatewayApiimplementorNs)).append("\n");
    sb.append("    isTokenSupported: ").append(toIndentedString(isTokenSupported)).append("\n");
    sb.append("    consumerUpdateCcGracePeriod: ").append(toIndentedString(consumerUpdateCcGracePeriod)).append("\n");
    sb.append("    isVoidSupported: ").append(toIndentedString(isVoidSupported)).append("\n");
    sb.append("    isVoidAfterFailRefund: ").append(toIndentedString(isVoidAfterFailRefund)).append("\n");
    sb.append("    minAmountAllowedForAuth: ").append(toIndentedString(minAmountAllowedForAuth)).append("\n");
    sb.append("    captureDelayInSec: ").append(toIndentedString(captureDelayInSec)).append("\n");
    sb.append("    voidDelayInSec: ").append(toIndentedString(voidDelayInSec)).append("\n");
    sb.append("    allowPartialVoid: ").append(toIndentedString(allowPartialVoid)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    processorAuthenticationParameters: ").append(toIndentedString(processorAuthenticationParameters)).append("\n");
    sb.append("    reAuthorizations: ").append(toIndentedString(reAuthorizations)).append("\n");
    sb.append("    terminalGatewayDatas: ").append(toIndentedString(terminalGatewayDatas)).append("\n");
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

