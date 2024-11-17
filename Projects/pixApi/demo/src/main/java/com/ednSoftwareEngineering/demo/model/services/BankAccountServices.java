package com.ednSoftwareEngineering.demo.model.services;

import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface BankAccountServices {
    public BankAccount createBankAccount(BankAccount bankAccount);
    public BankAccount updateBankAccount(UUID id, BankAccount bankAccount);
    public void deleteBankAccount(UUID id);
    public List<BankAccount> findAllAccountsByUserId(UUID id);
}
