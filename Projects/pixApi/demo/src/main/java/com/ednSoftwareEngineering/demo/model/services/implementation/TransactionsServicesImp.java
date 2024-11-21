package com.ednSoftwareEngineering.demo.model.services.implementation;

import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.dto.transactions.TransactionsResponseDto;
import com.ednSoftwareEngineering.demo.dto.transactions.TransactionsSaveDto;
import com.ednSoftwareEngineering.demo.exceptions.ResourceNotFoundException;
import com.ednSoftwareEngineering.demo.mapper.TransactionsMapper;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import com.ednSoftwareEngineering.demo.model.entities.Transactions;
import com.ednSoftwareEngineering.demo.model.repository.BankAccountRepository;
import com.ednSoftwareEngineering.demo.model.repository.PixKeyRepository;
import com.ednSoftwareEngineering.demo.model.repository.TransactionsRepository;
import com.ednSoftwareEngineering.demo.model.services.BankAccountServices;
import com.ednSoftwareEngineering.demo.model.services.PixServices;
import com.ednSoftwareEngineering.demo.model.services.TransactionsServices;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TransactionsServicesImp implements TransactionsServices {
    @Autowired
    BankAccountServices bankAccountServices;
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Autowired
    TransactionsRepository transactionsRepository;
    @Autowired
    PixServices pixServices;
    @Transactional
    @Override
    public Transactions receiveAmountByPixKey(Double amount, PixKeyResponseDto pixKeyResponseDto) {
        BankAccount destinationAccount = pixServices.findBankAccountByPixKeyValue(pixKeyResponseDto.keyValue());
        bankAccountRepository.save(destinationAccount);
        return transactionsRepository.save(new Transactions(destinationAccount,amount,LocalDateTime.now()));//save the transaction
    }

    @Override//TODO MUDAR AO INVES DE PASSAR A CONTAD E BANCO PASSAR O ID E BUSCAR O BANCO AI JA CORRIGE
    public Transactions transferAmountByPixKey(Double amount, UUID bankAccountId, String pixKeyVale, String description) {
        BankAccount bankAccount = bankAccountRepository.findById(bankAccountId).orElseThrow(()->new ResourceNotFoundException("Account not found"));
        if(bankAccount.getAccountBalance()>=amount){
            BankAccount destinationAccount = pixServices.findBankAccountByPixKeyValue(pixKeyVale);
            bankAccount.setAccountBalance(bankAccount.getAccountBalance()-amount);
            destinationAccount.setAccountBalance(destinationAccount.getAccountBalance()+amount);
            bankAccountRepository.save(bankAccount);
            bankAccountRepository.save(destinationAccount);

            return transactionsRepository.save(new Transactions(bankAccount,destinationAccount,amount,LocalDateTime.now(),description));
        }
        throw new RuntimeException("Account haven't founds");
    }
}
