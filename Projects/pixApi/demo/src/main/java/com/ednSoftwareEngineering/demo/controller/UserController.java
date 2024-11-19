package com.ednSoftwareEngineering.demo.controller;

import com.ednSoftwareEngineering.demo.dto.user.UserResponseDto;
import com.ednSoftwareEngineering.demo.dto.user.UserSaveDto;
import com.ednSoftwareEngineering.demo.mapper.UserMapper;
import com.ednSoftwareEngineering.demo.model.entities.User;
import com.ednSoftwareEngineering.demo.model.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServices userServices;
    @Autowired
    private UserMapper userMapper;
    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserSaveDto userSaveDto){
        User userCreated = userServices.createUser(userMapper.toEntity(userSaveDto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(location).body(userMapper.toResponseDto(userCreated));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> updateUser(@PathVariable(name = "id") UUID id, @RequestBody @Valid UserSaveDto userSaveDto){
        return ResponseEntity.ok(userMapper.toResponseDto(userServices.updateUser(id,userMapper.toEntity(userSaveDto))));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable (name = "id")UUID id){
        userServices.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
    //just for tests
    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        return ResponseEntity.ok(userServices.getAllUsers().stream().map(userMapper::toResponseDto).toList());
    }

}
