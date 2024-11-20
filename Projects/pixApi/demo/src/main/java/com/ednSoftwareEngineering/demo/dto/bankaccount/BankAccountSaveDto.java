package com.ednSoftwareEngineering.demo.dto.bankaccount;

import com.ednSoftwareEngineering.demo.enums.AccountType;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import com.ednSoftwareEngineering.demo.model.entities.Transactions;
import com.ednSoftwareEngineering.demo.model.entities.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;
//todo criar um dto para retornar todas as transações da conta
public record BankAccountSaveDto(
        @NotNull User user,
        @Valid List<PixKey> pixKeys,
        @NotNull Double accountBalance,
        @NotNull AccountType accountType,
        @NotNull String institutionName,
        @Valid List<Transactions> incomingTransactions,
        @Valid List<Transactions> outgoingTransactions
        ) {
}