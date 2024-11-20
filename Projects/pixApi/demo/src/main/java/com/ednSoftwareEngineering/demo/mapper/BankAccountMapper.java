package com.ednSoftwareEngineering.demo.mapper;


import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountResponseDto;
import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountSaveDto;
import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankAccountMapper {
    @Autowired
    PixKeyMapper pixKeyMapper;
    public BankAccountResponseDto toResponseDto(BankAccount bankAccount) {
        List<PixKeyResponseDto> pixKeys = null;
        if(bankAccount.getPixKeys()!=null){
            pixKeys = bankAccount.getPixKeys().stream().map(pixKeyMapper::toResponseDto).toList();
        }
        return new BankAccountResponseDto(
                bankAccount.getId(),
                pixKeys,bankAccount.getAccountBalance(),
                bankAccount.getAccountType(),
                bankAccount.getInstitutionName());
    }
    public BankAccount toEntity(BankAccountSaveDto bankAccountSave){
        return new BankAccount(
                bankAccountSave.user(),
                bankAccountSave.pixKeys(),
                bankAccountSave.accountType(),
                bankAccountSave.accountBalance(),
                bankAccountSave.institutionName(),
                bankAccountSave.incomingTransactions(),
                bankAccountSave.outgoingTransactions());
    }
}
