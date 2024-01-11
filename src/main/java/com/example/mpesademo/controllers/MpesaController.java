package com.example.mpesademo.controllers;

import com.example.mpesademo.dtos.*;
import com.example.mpesademo.dtos.b2c_dtos.B2CResponse;
import com.example.mpesademo.dtos.b2c_dtos.B2CTransactionAsyncResponse;
import com.example.mpesademo.dtos.b2c_dtos.InitialB2CTransactionRequest;
import com.example.mpesademo.dtos.stk_push.InitialStkPushRequest;
import com.example.mpesademo.dtos.stk_push.StkPushResponse;
import com.example.mpesademo.dtos.stk_push.stk_results.StkPushAsyncResponse;
import com.example.mpesademo.services.MpesaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mobile_money")
@RequiredArgsConstructor
public class MpesaController {
    private final MpesaService mpesaService;
    private final AcknowledgeResponse acknowledgeResponse;
    private final ObjectMapper objectMapper;
    Logger logger = LoggerFactory.getLogger(MpesaController.class);
    @GetMapping("/token")
    public ResponseEntity<AccessTokenResponse> getAccessToken(){
        return ResponseEntity
                .ok(mpesaService.get_accessToken());
    }

    //todo register url(Registering validation and confirmation urls ..)
    @PostMapping("/registerUrl")
    public ResponseEntity<RegisterUrlResponse> registerUrl(){
        return ResponseEntity.ok(mpesaService.c2b_register_url());
    }

    //todo validation (Transaction validation Endpoint ..)
    @PostMapping("/validation")
    public ResponseEntity<AcknowledgeResponse> validateTransaction(@RequestBody TransactionResults transactionResults){
        return ResponseEntity.ok(acknowledgeResponse);
    }


    //todo simulation-c2b (Endpoint To Simulate C2B Transantions ..)
    @PostMapping("/simulate-c2b")
    public ResponseEntity<C2bResponse> simulateC2BTransaction(@RequestBody C2BRequest request){
        return ResponseEntity.ok(mpesaService.simulate_c2b_transaction(request));
    }
    //==============B2C transaction============
    @PostMapping("/b2c-transaction")
    public ResponseEntity<B2CResponse> b2c_transaction(@RequestBody InitialB2CTransactionRequest request) throws JsonProcessingException {
        return ResponseEntity.ok(mpesaService.b2c_transaction(request));
    }

    @PostMapping("/b2c-transaction-result")
    public ResponseEntity<AcknowledgeResponse> b2cTransactionAsyncResult(@RequestBody B2CTransactionAsyncResponse b2CTransactionAsyncResponse) throws JsonProcessingException {
        logger.info("======================B2C Transaction Response======================");
        logger.info(objectMapper.writeValueAsString(b2CTransactionAsyncResponse));
        return ResponseEntity.ok(acknowledgeResponse);
    }
    @PostMapping("/b2c-queue-timeout")
    public ResponseEntity<AcknowledgeResponse> queueTimeout(@RequestBody Object object)  {

        return ResponseEntity.ok(acknowledgeResponse);
    }
    //===================transaction status=====================
    @PostMapping("/transaction-status")
    public ResponseEntity<TransactionStatusSyncResponse> get_transaction_status(@RequestBody InitialTransactionStatusRequest request) {
        return ResponseEntity.ok(mpesaService.get_transaction_status(request));
    }

    @PostMapping("/transaction-status-result")
    public ResponseEntity<AcknowledgeResponse> get_transactionStatusAsyncResult(@RequestBody TransactionStatusAsyncResponse transactionStatusAsyncResponse) throws JsonProcessingException {
        logger.info("======================B2C Transaction Response======================");
        logger.info(objectMapper.writeValueAsString(transactionStatusAsyncResponse));
        return ResponseEntity.ok(acknowledgeResponse);
    }
    @PostMapping("/transaction-status-queue-timeout")
    public ResponseEntity<AcknowledgeResponse> get_transaction_status_queueTimeout(@RequestBody Object object)  {

        return ResponseEntity.ok(acknowledgeResponse);
    }

    //===================mpesa push stk=============================
    @PostMapping("/stk-push")
    public ResponseEntity<StkPushResponse> stk_push_simulate(@RequestBody InitialStkPushRequest request){
        return ResponseEntity.ok(mpesaService.stk_push(request));
    }
    @PostMapping("/express-results")
    public ResponseEntity<AcknowledgeResponse> getStkPushResults(@RequestBody StkPushAsyncResponse stkPushAsyncResponse) throws JsonProcessingException {
        logger.info("======================StkPushAsyncResponse ======================");
        logger.info(objectMapper.writeValueAsString(stkPushAsyncResponse));
        return ResponseEntity.ok(acknowledgeResponse);

    }



}
