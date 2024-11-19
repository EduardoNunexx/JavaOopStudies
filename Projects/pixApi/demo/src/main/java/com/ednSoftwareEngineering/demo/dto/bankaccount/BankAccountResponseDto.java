package com.ednSoftwareEngineering.demo.dto.bankaccount;

import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.enums.AccountType;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;

import java.util.List;
import java.util.UUID;

public record BankAccountResponseDto(
        UUID id,
        List<PixKeyResponseDto> pixKeys,
        Double accountBalance,
        AccountType accountType,
        String institutionName
        ) {

}
