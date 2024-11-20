package com.ednSoftwareEngineering.demo.model.services;

import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.Transactions;


public interface TransactionsServices {
    public Transactions receiveAmountByPixKey(Double amount, PixKeyResponseDto pixKeyResponseDto);
    //public Transactions transferAmountByPixKey(Double amount, BankAccount bankAccount, PixKeyResponseDto pixKeyResponseDto);
}
