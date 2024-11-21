package com.ednSoftwareEngineering.demo.model.services;

import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.Transactions;

import java.util.UUID;


public interface TransactionsServices {
    public Transactions receiveAmountByPixKey(Double amount, PixKeyResponseDto pixKeyResponseDto);
    public Transactions transferAmountByPixKey(Double amount, UUID bankAccountId, String pixKeyValue, String description);
}
