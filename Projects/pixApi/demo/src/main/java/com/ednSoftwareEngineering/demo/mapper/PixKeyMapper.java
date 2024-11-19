package com.ednSoftwareEngineering.demo.mapper;

import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountResponseDto;
import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountSaveDto;
import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeyResponseDto;
import com.ednSoftwareEngineering.demo.dto.pixKey.PixKeySaveDto;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PixKeyMapper {
    public PixKeyResponseDto toResponseDto(PixKey pixKey) {
        return new PixKeyResponseDto(pixKey.getId(), pixKey.getKeyValue(), pixKey.getKeyType());
    }
    public PixKey toEntity(PixKeySaveDto pixKeySaveDto){
        return new PixKey(pixKeySaveDto.keyValue(), pixKeySaveDto.keyType(),pixKeySaveDto.bankAccount());
    }
}
