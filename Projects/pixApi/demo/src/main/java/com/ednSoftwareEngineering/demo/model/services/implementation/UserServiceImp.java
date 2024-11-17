package com.ednSoftwareEngineering.demo.model.services.implementation;

import com.ednSoftwareEngineering.demo.exceptions.ResourceNotFoundException;
import com.ednSoftwareEngineering.demo.model.entities.User;
import com.ednSoftwareEngineering.demo.model.repository.UserRepository;
import com.ednSoftwareEngineering.demo.model.services.BankAccountServices;
import com.ednSoftwareEngineering.demo.model.services.UserServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImp implements UserServices {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BankAccountServices bankAccountServices;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public User updateUser(UUID id,User user) {
         User oldUser = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found"));
         oldUser.setName(user.getName());
         oldUser.setBankAccounts(user.getBankAccounts());
         oldUser.setPixKeys(user.getPixKeys());
         oldUser.setDateOfBirth(user.getDateOfBirth());
         return userRepository.save(oldUser);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.findById(id).ifPresentOrElse(user-> userRepository.deleteById(id),()->{throw new ResourceNotFoundException("User not found");});
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
