package com.ednSoftwareEngineering.demo.dto.pixKey;

import com.ednSoftwareEngineering.demo.enums.PixKeyType;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record PixKeySaveDto(
        @NotNull String keyValue,
        @NotNull PixKeyType keyType,
        @NotNull @Valid BankAccount bankAccount) {
}
