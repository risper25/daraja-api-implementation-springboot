package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionResults{
    @JsonProperty("TransactionType")
    public String getTransactionType() {
        return this.transactionType; }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType; }
    String transactionType;
    @JsonProperty("TransID")
    public String getTransID() {
        return this.transID; }
    public void setTransID(String transID) {
        this.transID = transID; }
    String transID;
    @JsonProperty("TransTime")
    public String getTransTime() {
        return this.transTime; }
    public void setTransTime(String transTime) {
        this.transTime = transTime; }
    String transTime;
    @JsonProperty("TransAmount")
    public String getTransAmount() {
        return this.transAmount; }
    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount; }
    String transAmount;
    @JsonProperty("BusinessShortCode")
    public String getBusinessShortCode() {
        return this.businessShortCode; }
    public void setBusinessShortCode(String businessShortCode) {
        this.businessShortCode = businessShortCode; }
    String businessShortCode;
    @JsonProperty("BillRefNumber")
    public String getBillRefNumber() {
        return this.billRefNumber; }
    public void setBillRefNumber(String billRefNumber) {
        this.billRefNumber = billRefNumber; }
    String billRefNumber;
    @JsonProperty("InvoiceNumber")
    public String getInvoiceNumber() {
        return this.invoiceNumber; }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber; }
    String invoiceNumber;
    @JsonProperty("OrgAccountBalance")
    public String getOrgAccountBalance() {
        return this.orgAccountBalance; }
    public void setOrgAccountBalance(String orgAccountBalance) {
        this.orgAccountBalance = orgAccountBalance; }
    String orgAccountBalance;
    @JsonProperty("ThirdPartyTransID")
    public String getThirdPartyTransID() {
        return this.thirdPartyTransID; }
    public void setThirdPartyTransID(String thirdPartyTransID) {
        this.thirdPartyTransID = thirdPartyTransID; }
    String thirdPartyTransID;
    @JsonProperty("MSISDN")
    public String getMSISDN() {
        return this.mSISDN; }
    public void setMSISDN(String mSISDN) {
        this.mSISDN = mSISDN; }
    String mSISDN;
    @JsonProperty("FirstName")
    public String getFirstName() {
        return this.firstName; }
    public void setFirstName(String firstName) {
        this.firstName = firstName; }
    String firstName;
    @JsonProperty("MiddleName")
    public String getMiddleName() {
        return this.middleName; }
    public void setMiddleName(String middleName) {
        this.middleName = middleName; }
    String middleName;
    @JsonProperty("LastName")
    public String getLastName() {
        return this.lastName; }
    public void setLastName(String lastName) {
        this.lastName = lastName; }
    String lastName;
}