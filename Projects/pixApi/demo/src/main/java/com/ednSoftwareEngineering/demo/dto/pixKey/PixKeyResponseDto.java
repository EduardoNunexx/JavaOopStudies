package com.ednSoftwareEngineering.demo.dto.pixKey;

import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountResponseDto;
import com.ednSoftwareEngineering.demo.enums.PixKeyType;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record PixKeyResponseDto(
        UUID id,
        String keyValue,
        PixKeyType keyType
) {
}
