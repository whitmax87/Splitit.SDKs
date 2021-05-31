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
import com.splitit.sdk.model.AccountUpdaterSubscribersScopes;
import com.splitit.sdk.model.Agents;
import com.splitit.sdk.model.BusinessUnits;
import com.splitit.sdk.model.ChbDefaultAction;
import com.splitit.sdk.model.Currencies;
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.FailureUnderFrozenInstallmentsPlan;
import com.splitit.sdk.model.InstallmentPlans;
import com.splitit.sdk.model.IntegrationType;
import com.splitit.sdk.model.Merchants;
import com.splitit.sdk.model.ReconciliationReports;
import com.splitit.sdk.model.RefundUnderCancelation;
import com.splitit.sdk.model.StateLimitRuleDatas;
import com.splitit.sdk.model.TerminalCountries;
import com.splitit.sdk.model.TerminalGatewayDatas;
import com.splitit.sdk.model.TerminalKvps;
import com.splitit.sdk.model.TestModes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Terminals
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class Terminals  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("ApiKey")
  private String apiKey = null;

  @SerializedName("WizardTimeout")
  private Integer wizardTimeout = null;

  @SerializedName("MerchantId")
  private Long merchantId = null;

  @SerializedName("UtcOffset")
  private Double utcOffset = null;

  @SerializedName("IsDisabled")
  private Boolean isDisabled = null;

  @SerializedName("ChargeBeforeShipping")
  private Boolean chargeBeforeShipping = null;

  @SerializedName("TerminalId")
  private String terminalId = null;

  @SerializedName("AgentId")
  private Long agentId = null;

  @SerializedName("CanCancelInstallmentsPlan")
  private Boolean canCancelInstallmentsPlan = null;

  @SerializedName("CrmId")
  private String crmId = null;

  @SerializedName("CurrencyId")
  private Long currencyId = null;

  @SerializedName("PendingShipmentReminderDays")
  private Integer pendingShipmentReminderDays = null;

  @SerializedName("BusinessUnitId")
  private Long businessUnitId = null;

  @SerializedName("KeepNonApprovedPlanLive")
  private Long keepNonApprovedPlanLive = null;

  @SerializedName("UseTestGateway")
  private Boolean useTestGateway = null;

  @SerializedName("Agent")
  private Agents agent = null;

  @SerializedName("BusinessUnit")
  private BusinessUnits businessUnit = null;

  @SerializedName("Currency")
  private Currencies currency = null;

  @SerializedName("Merchant")
  private Merchants merchant = null;

  @SerializedName("AccountUpdaterSubscribersScopes")
  private List<AccountUpdaterSubscribersScopes> accountUpdaterSubscribersScopes = null;

  @SerializedName("InstallmentPlans")
  private List<InstallmentPlans> installmentPlans = null;

  @SerializedName("ReconciliationReports")
  private List<ReconciliationReports> reconciliationReports = null;

  @SerializedName("StateLimitRuleDatas")
  private List<StateLimitRuleDatas> stateLimitRuleDatas = null;

  @SerializedName("TerminalCountries")
  private List<TerminalCountries> terminalCountries = null;

  @SerializedName("TerminalGatewayDatas")
  private List<TerminalGatewayDatas> terminalGatewayDatas = null;

  @SerializedName("TerminalKvps")
  private List<TerminalKvps> terminalKvps = null;

  @SerializedName("ContinueExistingPlanWithOriginalGateway")
  private Boolean continueExistingPlanWithOriginalGateway = null;

  @SerializedName("ActiveTerminalData")
  private TerminalGatewayDatas activeTerminalData = null;

  @SerializedName("ChbDefaultAction")
  private ChbDefaultAction chbDefaultAction = null;

  @SerializedName("FailureUnderFrozenInstallmentsPlan")
  private FailureUnderFrozenInstallmentsPlan failureUnderFrozenInstallmentsPlan = null;

  @SerializedName("RefundUnderCancelation")
  private RefundUnderCancelation refundUnderCancelation = null;

  @SerializedName("IntegrationType")
  private IntegrationType integrationType = null;

  @SerializedName("TestMode")
  private TestModes testMode = null;

  public Terminals id(Long id) {
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

  public Terminals name(String name) {
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

  public Terminals email(String email) {
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

  public Terminals apiKey(String apiKey) {
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

  public Terminals wizardTimeout(Integer wizardTimeout) {
    this.wizardTimeout = wizardTimeout;
    return this;
  }

   /**
   * Get wizardTimeout
   * @return wizardTimeout
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWizardTimeout() {
    return wizardTimeout;
  }

  public void setWizardTimeout(Integer wizardTimeout) {
    this.wizardTimeout = wizardTimeout;
  }

  public Terminals merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public Terminals utcOffset(Double utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(Double utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Terminals isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public Terminals chargeBeforeShipping(Boolean chargeBeforeShipping) {
    this.chargeBeforeShipping = chargeBeforeShipping;
    return this;
  }

   /**
   * Get chargeBeforeShipping
   * @return chargeBeforeShipping
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isChargeBeforeShipping() {
    return chargeBeforeShipping;
  }

  public void setChargeBeforeShipping(Boolean chargeBeforeShipping) {
    this.chargeBeforeShipping = chargeBeforeShipping;
  }

  public Terminals terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Get terminalId
   * @return terminalId
  **/
  @ApiModelProperty(value = "")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public Terminals agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getAgentId() {
    return agentId;
  }

  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }

  public Terminals canCancelInstallmentsPlan(Boolean canCancelInstallmentsPlan) {
    this.canCancelInstallmentsPlan = canCancelInstallmentsPlan;
    return this;
  }

   /**
   * Get canCancelInstallmentsPlan
   * @return canCancelInstallmentsPlan
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCanCancelInstallmentsPlan() {
    return canCancelInstallmentsPlan;
  }

  public void setCanCancelInstallmentsPlan(Boolean canCancelInstallmentsPlan) {
    this.canCancelInstallmentsPlan = canCancelInstallmentsPlan;
  }

  public Terminals crmId(String crmId) {
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

  public Terminals currencyId(Long currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @ApiModelProperty(value = "")
  public Long getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Long currencyId) {
    this.currencyId = currencyId;
  }

  public Terminals pendingShipmentReminderDays(Integer pendingShipmentReminderDays) {
    this.pendingShipmentReminderDays = pendingShipmentReminderDays;
    return this;
  }

   /**
   * Get pendingShipmentReminderDays
   * @return pendingShipmentReminderDays
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPendingShipmentReminderDays() {
    return pendingShipmentReminderDays;
  }

  public void setPendingShipmentReminderDays(Integer pendingShipmentReminderDays) {
    this.pendingShipmentReminderDays = pendingShipmentReminderDays;
  }

  public Terminals businessUnitId(Long businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }

   /**
   * Get businessUnitId
   * @return businessUnitId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getBusinessUnitId() {
    return businessUnitId;
  }

  public void setBusinessUnitId(Long businessUnitId) {
    this.businessUnitId = businessUnitId;
  }

  public Terminals keepNonApprovedPlanLive(Long keepNonApprovedPlanLive) {
    this.keepNonApprovedPlanLive = keepNonApprovedPlanLive;
    return this;
  }

   /**
   * Get keepNonApprovedPlanLive
   * @return keepNonApprovedPlanLive
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getKeepNonApprovedPlanLive() {
    return keepNonApprovedPlanLive;
  }

  public void setKeepNonApprovedPlanLive(Long keepNonApprovedPlanLive) {
    this.keepNonApprovedPlanLive = keepNonApprovedPlanLive;
  }

  public Terminals useTestGateway(Boolean useTestGateway) {
    this.useTestGateway = useTestGateway;
    return this;
  }

   /**
   * Get useTestGateway
   * @return useTestGateway
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isUseTestGateway() {
    return useTestGateway;
  }

  public void setUseTestGateway(Boolean useTestGateway) {
    this.useTestGateway = useTestGateway;
  }

  public Terminals agent(Agents agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  public Agents getAgent() {
    return agent;
  }

  public void setAgent(Agents agent) {
    this.agent = agent;
  }

  public Terminals businessUnit(BusinessUnits businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

   /**
   * Get businessUnit
   * @return businessUnit
  **/
  @ApiModelProperty(value = "")
  public BusinessUnits getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(BusinessUnits businessUnit) {
    this.businessUnit = businessUnit;
  }

  public Terminals currency(Currencies currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public Currencies getCurrency() {
    return currency;
  }

  public void setCurrency(Currencies currency) {
    this.currency = currency;
  }

  public Terminals merchant(Merchants merchant) {
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

  public Terminals accountUpdaterSubscribersScopes(List<AccountUpdaterSubscribersScopes> accountUpdaterSubscribersScopes) {
    this.accountUpdaterSubscribersScopes = accountUpdaterSubscribersScopes;
    return this;
  }

  public Terminals addAccountUpdaterSubscribersScopesItem(AccountUpdaterSubscribersScopes accountUpdaterSubscribersScopesItem) {
    if (this.accountUpdaterSubscribersScopes == null) {
      this.accountUpdaterSubscribersScopes = new ArrayList<AccountUpdaterSubscribersScopes>();
    }
    this.accountUpdaterSubscribersScopes.add(accountUpdaterSubscribersScopesItem);
    return this;
  }

   /**
   * Get accountUpdaterSubscribersScopes
   * @return accountUpdaterSubscribersScopes
  **/
  @ApiModelProperty(value = "")
  public List<AccountUpdaterSubscribersScopes> getAccountUpdaterSubscribersScopes() {
    return accountUpdaterSubscribersScopes;
  }

  public void setAccountUpdaterSubscribersScopes(List<AccountUpdaterSubscribersScopes> accountUpdaterSubscribersScopes) {
    this.accountUpdaterSubscribersScopes = accountUpdaterSubscribersScopes;
  }

  public Terminals installmentPlans(List<InstallmentPlans> installmentPlans) {
    this.installmentPlans = installmentPlans;
    return this;
  }

  public Terminals addInstallmentPlansItem(InstallmentPlans installmentPlansItem) {
    if (this.installmentPlans == null) {
      this.installmentPlans = new ArrayList<InstallmentPlans>();
    }
    this.installmentPlans.add(installmentPlansItem);
    return this;
  }

   /**
   * Get installmentPlans
   * @return installmentPlans
  **/
  @ApiModelProperty(value = "")
  public List<InstallmentPlans> getInstallmentPlans() {
    return installmentPlans;
  }

  public void setInstallmentPlans(List<InstallmentPlans> installmentPlans) {
    this.installmentPlans = installmentPlans;
  }

  public Terminals reconciliationReports(List<ReconciliationReports> reconciliationReports) {
    this.reconciliationReports = reconciliationReports;
    return this;
  }

  public Terminals addReconciliationReportsItem(ReconciliationReports reconciliationReportsItem) {
    if (this.reconciliationReports == null) {
      this.reconciliationReports = new ArrayList<ReconciliationReports>();
    }
    this.reconciliationReports.add(reconciliationReportsItem);
    return this;
  }

   /**
   * Get reconciliationReports
   * @return reconciliationReports
  **/
  @ApiModelProperty(value = "")
  public List<ReconciliationReports> getReconciliationReports() {
    return reconciliationReports;
  }

  public void setReconciliationReports(List<ReconciliationReports> reconciliationReports) {
    this.reconciliationReports = reconciliationReports;
  }

  public Terminals stateLimitRuleDatas(List<StateLimitRuleDatas> stateLimitRuleDatas) {
    this.stateLimitRuleDatas = stateLimitRuleDatas;
    return this;
  }

  public Terminals addStateLimitRuleDatasItem(StateLimitRuleDatas stateLimitRuleDatasItem) {
    if (this.stateLimitRuleDatas == null) {
      this.stateLimitRuleDatas = new ArrayList<StateLimitRuleDatas>();
    }
    this.stateLimitRuleDatas.add(stateLimitRuleDatasItem);
    return this;
  }

   /**
   * Get stateLimitRuleDatas
   * @return stateLimitRuleDatas
  **/
  @ApiModelProperty(value = "")
  public List<StateLimitRuleDatas> getStateLimitRuleDatas() {
    return stateLimitRuleDatas;
  }

  public void setStateLimitRuleDatas(List<StateLimitRuleDatas> stateLimitRuleDatas) {
    this.stateLimitRuleDatas = stateLimitRuleDatas;
  }

  public Terminals terminalCountries(List<TerminalCountries> terminalCountries) {
    this.terminalCountries = terminalCountries;
    return this;
  }

  public Terminals addTerminalCountriesItem(TerminalCountries terminalCountriesItem) {
    if (this.terminalCountries == null) {
      this.terminalCountries = new ArrayList<TerminalCountries>();
    }
    this.terminalCountries.add(terminalCountriesItem);
    return this;
  }

   /**
   * Get terminalCountries
   * @return terminalCountries
  **/
  @ApiModelProperty(value = "")
  public List<TerminalCountries> getTerminalCountries() {
    return terminalCountries;
  }

  public void setTerminalCountries(List<TerminalCountries> terminalCountries) {
    this.terminalCountries = terminalCountries;
  }

  public Terminals terminalGatewayDatas(List<TerminalGatewayDatas> terminalGatewayDatas) {
    this.terminalGatewayDatas = terminalGatewayDatas;
    return this;
  }

  public Terminals addTerminalGatewayDatasItem(TerminalGatewayDatas terminalGatewayDatasItem) {
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

  public Terminals terminalKvps(List<TerminalKvps> terminalKvps) {
    this.terminalKvps = terminalKvps;
    return this;
  }

  public Terminals addTerminalKvpsItem(TerminalKvps terminalKvpsItem) {
    if (this.terminalKvps == null) {
      this.terminalKvps = new ArrayList<TerminalKvps>();
    }
    this.terminalKvps.add(terminalKvpsItem);
    return this;
  }

   /**
   * Get terminalKvps
   * @return terminalKvps
  **/
  @ApiModelProperty(value = "")
  public List<TerminalKvps> getTerminalKvps() {
    return terminalKvps;
  }

  public void setTerminalKvps(List<TerminalKvps> terminalKvps) {
    this.terminalKvps = terminalKvps;
  }

  public Terminals continueExistingPlanWithOriginalGateway(Boolean continueExistingPlanWithOriginalGateway) {
    this.continueExistingPlanWithOriginalGateway = continueExistingPlanWithOriginalGateway;
    return this;
  }

   /**
   * Get continueExistingPlanWithOriginalGateway
   * @return continueExistingPlanWithOriginalGateway
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isContinueExistingPlanWithOriginalGateway() {
    return continueExistingPlanWithOriginalGateway;
  }

  public void setContinueExistingPlanWithOriginalGateway(Boolean continueExistingPlanWithOriginalGateway) {
    this.continueExistingPlanWithOriginalGateway = continueExistingPlanWithOriginalGateway;
  }

  public Terminals activeTerminalData(TerminalGatewayDatas activeTerminalData) {
    this.activeTerminalData = activeTerminalData;
    return this;
  }

   /**
   * Get activeTerminalData
   * @return activeTerminalData
  **/
  @ApiModelProperty(value = "")
  public TerminalGatewayDatas getActiveTerminalData() {
    return activeTerminalData;
  }

  public void setActiveTerminalData(TerminalGatewayDatas activeTerminalData) {
    this.activeTerminalData = activeTerminalData;
  }

  public Terminals chbDefaultAction(ChbDefaultAction chbDefaultAction) {
    this.chbDefaultAction = chbDefaultAction;
    return this;
  }

   /**
   * Get chbDefaultAction
   * @return chbDefaultAction
  **/
  @ApiModelProperty(required = true, value = "")
  public ChbDefaultAction getChbDefaultAction() {
    return chbDefaultAction;
  }

  public void setChbDefaultAction(ChbDefaultAction chbDefaultAction) {
    this.chbDefaultAction = chbDefaultAction;
  }

  public Terminals failureUnderFrozenInstallmentsPlan(FailureUnderFrozenInstallmentsPlan failureUnderFrozenInstallmentsPlan) {
    this.failureUnderFrozenInstallmentsPlan = failureUnderFrozenInstallmentsPlan;
    return this;
  }

   /**
   * Get failureUnderFrozenInstallmentsPlan
   * @return failureUnderFrozenInstallmentsPlan
  **/
  @ApiModelProperty(required = true, value = "")
  public FailureUnderFrozenInstallmentsPlan getFailureUnderFrozenInstallmentsPlan() {
    return failureUnderFrozenInstallmentsPlan;
  }

  public void setFailureUnderFrozenInstallmentsPlan(FailureUnderFrozenInstallmentsPlan failureUnderFrozenInstallmentsPlan) {
    this.failureUnderFrozenInstallmentsPlan = failureUnderFrozenInstallmentsPlan;
  }

  public Terminals refundUnderCancelation(RefundUnderCancelation refundUnderCancelation) {
    this.refundUnderCancelation = refundUnderCancelation;
    return this;
  }

   /**
   * Get refundUnderCancelation
   * @return refundUnderCancelation
  **/
  @ApiModelProperty(required = true, value = "")
  public RefundUnderCancelation getRefundUnderCancelation() {
    return refundUnderCancelation;
  }

  public void setRefundUnderCancelation(RefundUnderCancelation refundUnderCancelation) {
    this.refundUnderCancelation = refundUnderCancelation;
  }

  public Terminals integrationType(IntegrationType integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @ApiModelProperty(required = true, value = "")
  public IntegrationType getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(IntegrationType integrationType) {
    this.integrationType = integrationType;
  }

  public Terminals testMode(TestModes testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * Get testMode
   * @return testMode
  **/
  @ApiModelProperty(required = true, value = "")
  public TestModes getTestMode() {
    return testMode;
  }

  public void setTestMode(TestModes testMode) {
    this.testMode = testMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Terminals terminals = (Terminals) o;
    return Objects.equals(this.id, terminals.id) &&
        Objects.equals(this.name, terminals.name) &&
        Objects.equals(this.email, terminals.email) &&
        Objects.equals(this.apiKey, terminals.apiKey) &&
        Objects.equals(this.wizardTimeout, terminals.wizardTimeout) &&
        Objects.equals(this.merchantId, terminals.merchantId) &&
        Objects.equals(this.utcOffset, terminals.utcOffset) &&
        Objects.equals(this.isDisabled, terminals.isDisabled) &&
        Objects.equals(this.chargeBeforeShipping, terminals.chargeBeforeShipping) &&
        Objects.equals(this.terminalId, terminals.terminalId) &&
        Objects.equals(this.agentId, terminals.agentId) &&
        Objects.equals(this.canCancelInstallmentsPlan, terminals.canCancelInstallmentsPlan) &&
        Objects.equals(this.crmId, terminals.crmId) &&
        Objects.equals(this.currencyId, terminals.currencyId) &&
        Objects.equals(this.pendingShipmentReminderDays, terminals.pendingShipmentReminderDays) &&
        Objects.equals(this.businessUnitId, terminals.businessUnitId) &&
        Objects.equals(this.keepNonApprovedPlanLive, terminals.keepNonApprovedPlanLive) &&
        Objects.equals(this.useTestGateway, terminals.useTestGateway) &&
        Objects.equals(this.agent, terminals.agent) &&
        Objects.equals(this.businessUnit, terminals.businessUnit) &&
        Objects.equals(this.currency, terminals.currency) &&
        Objects.equals(this.merchant, terminals.merchant) &&
        Objects.equals(this.accountUpdaterSubscribersScopes, terminals.accountUpdaterSubscribersScopes) &&
        Objects.equals(this.installmentPlans, terminals.installmentPlans) &&
        Objects.equals(this.reconciliationReports, terminals.reconciliationReports) &&
        Objects.equals(this.stateLimitRuleDatas, terminals.stateLimitRuleDatas) &&
        Objects.equals(this.terminalCountries, terminals.terminalCountries) &&
        Objects.equals(this.terminalGatewayDatas, terminals.terminalGatewayDatas) &&
        Objects.equals(this.terminalKvps, terminals.terminalKvps) &&
        Objects.equals(this.continueExistingPlanWithOriginalGateway, terminals.continueExistingPlanWithOriginalGateway) &&
        Objects.equals(this.activeTerminalData, terminals.activeTerminalData) &&
        Objects.equals(this.chbDefaultAction, terminals.chbDefaultAction) &&
        Objects.equals(this.failureUnderFrozenInstallmentsPlan, terminals.failureUnderFrozenInstallmentsPlan) &&
        Objects.equals(this.refundUnderCancelation, terminals.refundUnderCancelation) &&
        Objects.equals(this.integrationType, terminals.integrationType) &&
        Objects.equals(this.testMode, terminals.testMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, apiKey, wizardTimeout, merchantId, utcOffset, isDisabled, chargeBeforeShipping, terminalId, agentId, canCancelInstallmentsPlan, crmId, currencyId, pendingShipmentReminderDays, businessUnitId, keepNonApprovedPlanLive, useTestGateway, agent, businessUnit, currency, merchant, accountUpdaterSubscribersScopes, installmentPlans, reconciliationReports, stateLimitRuleDatas, terminalCountries, terminalGatewayDatas, terminalKvps, continueExistingPlanWithOriginalGateway, activeTerminalData, chbDefaultAction, failureUnderFrozenInstallmentsPlan, refundUnderCancelation, integrationType, testMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Terminals {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    wizardTimeout: ").append(toIndentedString(wizardTimeout)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    chargeBeforeShipping: ").append(toIndentedString(chargeBeforeShipping)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    canCancelInstallmentsPlan: ").append(toIndentedString(canCancelInstallmentsPlan)).append("\n");
    sb.append("    crmId: ").append(toIndentedString(crmId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    pendingShipmentReminderDays: ").append(toIndentedString(pendingShipmentReminderDays)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    keepNonApprovedPlanLive: ").append(toIndentedString(keepNonApprovedPlanLive)).append("\n");
    sb.append("    useTestGateway: ").append(toIndentedString(useTestGateway)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    accountUpdaterSubscribersScopes: ").append(toIndentedString(accountUpdaterSubscribersScopes)).append("\n");
    sb.append("    installmentPlans: ").append(toIndentedString(installmentPlans)).append("\n");
    sb.append("    reconciliationReports: ").append(toIndentedString(reconciliationReports)).append("\n");
    sb.append("    stateLimitRuleDatas: ").append(toIndentedString(stateLimitRuleDatas)).append("\n");
    sb.append("    terminalCountries: ").append(toIndentedString(terminalCountries)).append("\n");
    sb.append("    terminalGatewayDatas: ").append(toIndentedString(terminalGatewayDatas)).append("\n");
    sb.append("    terminalKvps: ").append(toIndentedString(terminalKvps)).append("\n");
    sb.append("    continueExistingPlanWithOriginalGateway: ").append(toIndentedString(continueExistingPlanWithOriginalGateway)).append("\n");
    sb.append("    activeTerminalData: ").append(toIndentedString(activeTerminalData)).append("\n");
    sb.append("    chbDefaultAction: ").append(toIndentedString(chbDefaultAction)).append("\n");
    sb.append("    failureUnderFrozenInstallmentsPlan: ").append(toIndentedString(failureUnderFrozenInstallmentsPlan)).append("\n");
    sb.append("    refundUnderCancelation: ").append(toIndentedString(refundUnderCancelation)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
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

