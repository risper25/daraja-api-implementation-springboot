package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class C2BRequest {
    @JsonProperty("ShortCode")
    public String getShortCode() {
        return this.shortCode; }
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode; }
    String shortCode;
    @JsonProperty("CommandID")
    public String getCommandID() {
        return this.commandID; }
    public void setCommandID(String commandID) {
        this.commandID = commandID; }
    String commandID;
    @JsonProperty("Amount")
    public String getAmount() {
        return this.amount; }
    public void setAmount(String amount) {
        this.amount = amount; }
    String amount;
    @JsonProperty("Msisdn")
    public String getMsisdn() {
        return this.msisdn; }
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn; }
    String msisdn;
    @JsonProperty("BillRefNumber")
    public String getBillRefNumber() {
        return this.billRefNumber; }
    public void setBillRefNumber(String billRefNumber) {
        this.billRefNumber = billRefNumber; }
    String billRefNumber;
}
