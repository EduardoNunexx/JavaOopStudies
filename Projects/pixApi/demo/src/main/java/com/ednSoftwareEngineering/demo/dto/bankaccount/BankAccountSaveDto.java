package com.ednSoftwareEngineering.demo.dto.bankaccount;

import com.ednSoftwareEngineering.demo.enums.AccountType;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import com.ednSoftwareEngineering.demo.model.entities.User;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record BankAccountSaveDto(
        @NotNull User user,
        List<PixKey> pixKeys,
        Double amount,
        @NotNull AccountType accountType,
        @NotNull String institutionName
        ) {
}