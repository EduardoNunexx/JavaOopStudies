package com.ednSoftwareEngineering.demo.dto.user;

import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record UserSaveDto(
        @NotNull String name,
        @NotNull LocalDate dateOfBirth,
        List<BankAccount> bankAccounts,
        List<PixKey> pixKeys){
}
