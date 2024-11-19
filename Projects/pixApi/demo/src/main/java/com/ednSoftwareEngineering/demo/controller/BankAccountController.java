package com.ednSoftwareEngineering.demo.controller;

import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountResponseDto;
import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountSaveDto;
import com.ednSoftwareEngineering.demo.mapper.BankAccountMapper;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.services.BankAccountServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bankAccount")
public class BankAccountController {
    @Autowired
    BankAccountServices bankAccountServices;
    @Autowired
    BankAccountMapper bankAccountMapper;
    //TODO verify the create method, thinks about the way that you send just the user id instead the all the object
    //TODO CHANGE TO THE DTOS
    @PostMapping
    public ResponseEntity<BankAccountResponseDto> createBankAccount(@RequestBody @Valid BankAccountSaveDto bankAccount){
        BankAccount bankAccountCreated =bankAccountServices.createBankAccount(bankAccountMapper.toEntity(bankAccount));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bankAccountCreated.getId()).toUri();
        return ResponseEntity.created(location).body(bankAccountMapper.toResponseDto(bankAccountCreated));
    }
    @PutMapping("/{id}")
    public ResponseEntity<BankAccountResponseDto> updateBankAccount(@PathVariable(name = "id")UUID id, @RequestBody BankAccountSaveDto bankAccount){
        return ResponseEntity.ok(bankAccountMapper.toResponseDto(bankAccountServices.updateBankAccount(id,bankAccountMapper.toEntity(bankAccount))));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBankAccount(@PathVariable(name="id") UUID id){
        bankAccountServices.deleteBankAccount(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<List<BankAccountResponseDto>> getAllBankAccounts(){
        return ResponseEntity.ok(bankAccountServices.findAllAccounts().stream().map(bankAccountMapper::toResponseDto).toList());
    }
}
