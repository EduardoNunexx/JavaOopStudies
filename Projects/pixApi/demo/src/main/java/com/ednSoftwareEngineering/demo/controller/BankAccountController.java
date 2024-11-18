package com.ednSoftwareEngineering.demo.controller;

import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.services.BankAccountServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
    //TODO verify the create method, thinks about the way that you send just the user id instead the all the object
    //TODO CHANGE TO THE DTOS
    @PostMapping
    public ResponseEntity<BankAccount> createBankAccount(@RequestBody @Valid BankAccount bankAccount){
        BankAccount bankAccountCreated =bankAccountServices.createBankAccount(bankAccount);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bankAccountCreated.getId()).toUri();
        return ResponseEntity.created(location).body(bankAccountCreated);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BankAccount> updateBankAccount(@PathVariable(name = "id")UUID id, @RequestBody BankAccount bankAccount){
        return ResponseEntity.ok(bankAccountServices.updateBankAccount(id,bankAccount));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBankAccount(@PathVariable(name="id") UUID id){
        bankAccountServices.deleteBankAccount(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<List<BankAccount>> getAllBankAccounts(){
        return ResponseEntity.ok(bankAccountServices.findAllAccounts());
    }
}
