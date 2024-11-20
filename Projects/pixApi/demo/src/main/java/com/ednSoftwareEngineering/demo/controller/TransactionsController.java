package com.ednSoftwareEngineering.demo.controller;

import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeySaveDto;
import com.ednSoftwareEngineering.demo.dto.transactions.TransactionsResponseDto;
import com.ednSoftwareEngineering.demo.dto.transactions.TransactionsSaveDto;
import com.ednSoftwareEngineering.demo.mapper.PixKeyMapper;
import com.ednSoftwareEngineering.demo.mapper.TransactionsMapper;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import com.ednSoftwareEngineering.demo.model.services.TransactionsServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {
    //todo comeback after implementing the service transaction
    @Autowired
    TransactionsServices transactionsServices;
    @Autowired
    TransactionsMapper transactionsMapper;
    @Autowired
    PixKeyMapper pixKeyMapper;
    @PostMapping("/receiveValueByPix")
    public ResponseEntity<TransactionsResponseDto> receiveValueByPix(@RequestParam(name = "amount")Double amount, @RequestBody @Valid PixKeyResponseDto pixKeyResponseDto){
        return ResponseEntity.ok(transactionsMapper.toResponseDto(transactionsServices.receiveAmountByPixKey(amount,pixKeyResponseDto )));
    }
}
