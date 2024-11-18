package com.ednSoftwareEngineering.demo.mapper;

import com.ednSoftwareEngineering.demo.dto.user.UserResponseDto;
import com.ednSoftwareEngineering.demo.dto.user.UserSaveDto;
import com.ednSoftwareEngineering.demo.model.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDto toResponseDto(User user){
        return new UserResponseDto(user.getId(), user.getName(), user.getDateOfBirth(), user.getBankAccounts(),user.getPixKeys());
    }
    public User toEntity(UserSaveDto userSaveDto){
        return new User(userSaveDto.name(),userSaveDto.dateOfBirth(),userSaveDto.bankAccounts(),userSaveDto.pixKeys());
    }

}
