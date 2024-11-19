package com.ednSoftwareEngineering.demo.mapper;

import com.ednSoftwareEngineering.demo.dto.bankaccount.BankAccountResponseDto;
import com.ednSoftwareEngineering.demo.dto.user.UserResponseDto;
import com.ednSoftwareEngineering.demo.dto.user.UserSaveDto;
import com.ednSoftwareEngineering.demo.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {
    @Autowired
    private BankAccountMapper bankAccountMapper ;

    public UserResponseDto toResponseDto(User user){
        List<BankAccountResponseDto> bankAccountResponseDtos =null;
        if (user.getBankAccounts()!=null) {
            bankAccountResponseDtos = user.getBankAccounts().stream().map(bankAccountMapper::toResponseDto).toList();
        }
        return new UserResponseDto(user.getId(), user.getName(), user.getDateOfBirth(), bankAccountResponseDtos);
    }
    public User toEntity(UserSaveDto userSaveDto){
        return new User(userSaveDto.name(),userSaveDto.dateOfBirth(),userSaveDto.bankAccounts());
    }

}
