package com.ednSoftwareEngineering.demo.model.services.implementation;

import com.ednSoftwareEngineering.demo.exceptions.ResourceNotFoundException;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.repository.BankAccountRepository;
import com.ednSoftwareEngineering.demo.model.services.BankAccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class BankAccountServiceImp implements BankAccountServices {
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Override
    public BankAccount createBankAccount(BankAccount bankAccount) {
        return bankAccountRepository.save(bankAccount);
    }

    @Override
    public BankAccount updateBankAccount(UUID id, BankAccount bankAccount) {
        BankAccount bankAccountFound = bankAccountRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("BankAccount not found"));
        bankAccountFound.setUser(bankAccount.getUser());
        bankAccountFound.setPixKeys(bankAccount.getPixKeys());
        bankAccountFound.setAmount(bankAccount.getAmount());
        return bankAccountRepository.save(bankAccountFound);
    }
    @Override
    public void deleteBankAccount(UUID id) {
        bankAccountRepository.findById(id).ifPresentOrElse(user->bankAccountRepository.deleteById(id),()->{throw new ResourceNotFoundException("BankAccount not found");});
    }
    public List<BankAccount> findAllAccountsByUserId(UUID id){
        return bankAccountRepository.findAllByUserId(id);
    }


}
