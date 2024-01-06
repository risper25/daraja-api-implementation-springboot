package com.example.mpesademo.services;

import com.example.mpesademo.config.MpesaConfiguration;
import com.example.mpesademo.dtos.*;
import com.example.mpesademo.utils.Constants;
import com.example.mpesademo.utils.HelperUtility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MpesaService {
    private final MpesaConfiguration mpesaConfiguration;
    private final OkHttpClient client;
    private final ObjectMapper objectMapper;
    Logger logger = LoggerFactory.getLogger(MpesaService.class);

    public AccessTokenResponse get_accessToken(){
        Request request = new Request.Builder()
                .url(mpesaConfiguration.getOuth_endpoint())
                .method("GET", null)
                .addHeader("Authorization", mpesaConfiguration.getBasic_auth())
                .build();

        try {
            Response response = client.newCall(request).execute();

            return objectMapper.readValue(response.body().string(), AccessTokenResponse.class);
        } catch (IOException e) {
            return null;

        }
    }
    public RegisterUrlResponse c2b_register_url(){
        //generate accessToken
        AccessTokenResponse accessTokenResponse=get_accessToken();
        String token=accessTokenResponse.getAccess_token();
        logger.info("token------: {}",token);
        RegisterUrlRequest registerUrlRequest=new RegisterUrlRequest(
                mpesaConfiguration.getShortCode(),
                mpesaConfiguration.getResponseType(),
                mpesaConfiguration.getConfirmationURL(),
                mpesaConfiguration.getValidationURL());
        RequestBody body=RequestBody.create(Constants.JsonMediaType, Objects.requireNonNull( HelperUtility.toJson(registerUrlRequest)));
        logger.info("body------: {}",HelperUtility.toJson(registerUrlRequest));
        Request request = new Request.Builder()
                .url(mpesaConfiguration.getRegister_url_endpoint())
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer "+token)
                .build();
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                logger.debug("Response -> {}", response);
                return objectMapper.readValue(response.body().string(), RegisterUrlResponse.class);
            } else {
                logger.error("Failed to register URL. HTTP Status: {}", response.code());
                // Handle the error or return an appropriate response
                return null;
            }
        } catch (IOException e) {
            logger.info("failed to register url"+e);
            e.printStackTrace();
            return null;
        }


    }
    public C2bResponse simulate_c2b_transaction(C2BRequest c2BRequest) {
        //generate accessToken
        AccessTokenResponse accessTokenResponse = get_accessToken();
        String token = accessTokenResponse.getAccess_token();

        RequestBody body = RequestBody.create(Constants.JsonMediaType, Objects.requireNonNull(HelperUtility.toJson(c2BRequest)));

        Request request = new Request.Builder()
                .url(mpesaConfiguration.getSimulateC2B_endpoint())
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + token)
                .build();
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                logger.debug("Response -> {}", response);
                String resp = response.body().string();
                logger.info(resp);
                return objectMapper.readValue(resp, C2bResponse.class);
            } else {
                logger.error("Failed to simulate c2b transaction register URL. HTTP Status: {}", response.code());
                // Handle the error or return an appropriate response
                return null;
            }
        } catch (IOException e) {
            logger.info("failed to simulate transaction" + e);
            e.printStackTrace();
            return null;
        }


    }
    public B2CResponse b2c_transaction(InitialB2CTransactionRequest initialB2CTransactionRequest) throws JsonProcessingException {
        //generate accessToken
        AccessTokenResponse accessTokenResponse=get_accessToken();
        String token=accessTokenResponse.getAccess_token();
        B2CRequest b2CRequest=new B2CRequest();
        b2CRequest.setAmount(initialB2CTransactionRequest.getAmount());
        b2CRequest.setRemarks(initialB2CTransactionRequest.getRemarks());
        b2CRequest.setOccassion(initialB2CTransactionRequest.getOccassion());
        b2CRequest.setCommandID(initialB2CTransactionRequest.getCommandID());
        b2CRequest.setPartyB(initialB2CTransactionRequest.getPartyB());

        b2CRequest.setInitiatorName(mpesaConfiguration.getB2c_initiator_name());
        b2CRequest.setPartyA(mpesaConfiguration.getB2c_partyA());
        b2CRequest.setOriginatorConversationID(mpesaConfiguration.getB2c_originator_conversation_ID());
        b2CRequest.setResultURL(mpesaConfiguration.getB2c_result_url());
        b2CRequest.setQueueTimeOutURL(mpesaConfiguration.getB2c_queue_timeout_url());
        b2CRequest.setSecurityCredential(mpesaConfiguration.getB2c_security_credential());

        RequestBody body=RequestBody.create(Constants.JsonMediaType,
                Objects.requireNonNull( HelperUtility.toJson(b2CRequest)));


        Request request = new Request.Builder()
                .url(mpesaConfiguration.getB2c_transaction_endpoint())
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer "+token)
                .build();
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                logger.debug("Response -> {}", response);
                String resp=response.body().string();
                logger.info(resp);
                return objectMapper.readValue(resp, B2CResponse.class);
            } else {
                logger.error("Failed to do b2c transaction . HTTP Status: {}", response.code());
                // Handle the error or return an appropriate response
                return null;
            }
        } catch (IOException e) {
            logger.info("failed to do b2c transaction"+e);
            e.printStackTrace();
            return null;
        }
    }
public TransactionStatusSyncResponse get_transaction_status(InitialTransactionStatusRequest initialTransactionStatusRequest){
    //generate accessToken
    AccessTokenResponse accessTokenResponse=get_accessToken();
    String token=accessTokenResponse.getAccess_token();

    TransactionStatusRequest transactionStatusRequest=new TransactionStatusRequest();
    transactionStatusRequest.setOccasion(initialTransactionStatusRequest.getOccasion());
    transactionStatusRequest.setCommand_ID(initialTransactionStatusRequest.getCommand_ID());
    transactionStatusRequest.setRemarks(initialTransactionStatusRequest.getRemarks());
    transactionStatusRequest.setPartyA(mpesaConfiguration.getB2c_partyA());
    transactionStatusRequest.setTransaction_ID(initialTransactionStatusRequest.transaction_ID);
    transactionStatusRequest.setInitiator(mpesaConfiguration.getB2c_initiator_name());
    transactionStatusRequest.setIdentifierType(initialTransactionStatusRequest.getIdentifierType());


        return null;
}


    }

