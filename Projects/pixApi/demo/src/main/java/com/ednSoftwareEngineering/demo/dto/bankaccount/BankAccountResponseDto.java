package com.ednSoftwareEngineering.demo.dto.bankaccount;

import com.ednSoftwareEngineering.demo.enums.AccountType;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;

import java.util.List;

public record BankAccountResponseDto(
        List<PixKey> pixKeys,
        Double amount,
        AccountType accountType
        ) {

}
