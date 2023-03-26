package com.example.demo.service;

import com.example.demo.controller.dto.TransactionDTO;
import com.example.demo.controller.dto.UserDTO;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepo;

    public UserEntity createUser(UserEntity userEntity){
        return userRepo.save(userEntity);
    }
}
