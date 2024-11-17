package com.ednSoftwareEngineering.demo.controller;

import com.ednSoftwareEngineering.demo.model.entities.User;
import com.ednSoftwareEngineering.demo.model.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User userCreated = userServices.createUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(name = "id") UUID id, @RequestBody @Valid User user){
        return ResponseEntity.ok(userServices.updateUser(id,user));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable (name = "id")UUID id){
        userServices.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
    //just for tests
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userServices.getAllUsers());
    }

}
