package com.ednSoftwareEngineering.demo.dto.transactions;

import com.ednSoftwareEngineering.demo.model.entities.BankAccount;

import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionsResponseDto(
        UUID id,
        UUID sourceAccountId,
        UUID destinationAccountId,
        Double amount,
        LocalDateTime timestamp,
        String description
        ) {
}
