package com.ednSoftwareEngineering.demo.mapper;


import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountResponseDto;
import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountSaveDto;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper {
    public BankAccountResponseDto toResponseDto(BankAccount bankAccount) {
        return new BankAccountResponseDto(bankAccount.getPixKeys(),bankAccount.getAmount(),bankAccount.getAccountType());
    }
    public BankAccount toEntity(BankAccountSaveDto bankAccountSave){
        return new BankAccount(bankAccountSave.user(),bankAccountSave.pixKeys(),bankAccountSave.accountType(), bankAccountSave.amount());
    }
}
