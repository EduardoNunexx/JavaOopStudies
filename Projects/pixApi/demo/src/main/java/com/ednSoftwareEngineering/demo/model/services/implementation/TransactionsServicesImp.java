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
import com.ednSoftwareEngineering.demo.model.services.TransactionsServices;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionsServicesImp implements TransactionsServices {
    @Autowired
    BankAccountServices bankAccountServices;
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Autowired
    TransactionsRepository transactionsRepository;
    @Autowired
    PixKeyRepository pixKeyRepository;
    @Transactional
    @Override
    public Transactions receiveAmountByPixKey(Double amount, PixKeyResponseDto pixKeyResponseDto) {
        PixKey pixKey =pixKeyRepository.findByKeyValue(pixKeyResponseDto.keyValue()).orElseThrow(()-> new ResourceNotFoundException("Haven't accounts with this pix key "));
        BankAccount destinationAccount= pixKey.getBankAccount();
        destinationAccount.setAccountBalance(destinationAccount.getAccountBalance()+amount);
        bankAccountRepository.save(destinationAccount);
        return transactionsRepository.save(new Transactions(destinationAccount,amount,LocalDateTime.now()));//save the transaction
    }

    /*@Override
    public Transactions transferAmountByPixKey(Double amount, BankAccount bankAccount, PixKeyResponseDto pixKeyResponseDto) {
        if(bankAccount.getAccountBalance()>=amount){
            PixKey pixKey =pixKeyRepository.findByKeyValue(pixKeyResponseDto.keyValue()).orElseThrow(()->new ResourceNotFoundException("Haven't accounts with this pix key"));
            BankAccount destinationAccount =
        }
    }*/
}
