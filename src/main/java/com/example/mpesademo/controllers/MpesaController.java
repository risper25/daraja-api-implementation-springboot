package com.example.mpesademo.controllers;

import com.example.mpesademo.dtos.*;
import com.example.mpesademo.services.MpesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mobile_money")
@RequiredArgsConstructor
public class MpesaController {
    private final MpesaService mpesaService;
    private final AcknowledgeResponse acknowledgeResponse;
    @GetMapping("/token")
    public ResponseEntity<AccessTokenResponse> getAccessToken(){
        return ResponseEntity.ok(mpesaService.get_accessToken());
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

}
