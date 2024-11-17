package com.ednSoftwareEngineering.demo.model.services;

import com.ednSoftwareEngineering.demo.model.entities.User;

import java.util.List;
import java.util.UUID;

public interface UserServices {
    public User createUser(User user);
    public User updateUser(UUID id, User user);
    public void deleteUser(UUID id);
    public List<User> getAllUsers();
}
