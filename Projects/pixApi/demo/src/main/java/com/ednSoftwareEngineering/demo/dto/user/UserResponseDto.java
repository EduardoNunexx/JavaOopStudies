package com.ednSoftwareEngineering.demo.dto.user;

import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record UserResponseDto(
        UUID id,
        String name,
        LocalDate dateOfBirth,
        List<BankAccount> bankAccounts,
        List<PixKey> pixKeys) {
}
