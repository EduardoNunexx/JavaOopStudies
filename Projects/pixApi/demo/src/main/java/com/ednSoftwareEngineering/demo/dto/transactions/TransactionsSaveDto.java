package com.ednSoftwareEngineering.demo.dto.transactions;

import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TransactionsSaveDto(
        BankAccount sourceAccount,
        @NotNull BankAccount destinationAccount,
        @NotNull Double amount,
        @NotNull LocalDateTime timestamp,
        String description
) {
}
