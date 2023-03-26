package com.example.demo.service;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepo;
    private AccountRepository accountRepo;

    public UserEntity createUser(UserEntity userEntity){
        return userRepo.save(userEntity);
    }

    public String getAllUserAccounts(int document){   
        try {
        UserEntity userEntity = userRepo.findById(document).orElse(new UserEntity());
        return "Cuentas de usuario: "+accountRepo.getAllAccounts(document);
        }
        catch (Exception e){
        return "El usuario no tiene cuentas.";
        }
    }
}
