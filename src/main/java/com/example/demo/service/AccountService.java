package com.example.demo.service;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class AccountService {
    AccountRepository accountRepo;
    UserRepository userRepo;

    public String insertAccount(AccountDTO accountDTO){
        if(this.userRepo.existsById(accountDTO.getUser()) && accountRepo.getAllAccounts(accountDTO.getUser()).size()<4){
            accountRepo.save(new AccountEntity(accountDTO.getId(),accountDTO.getType(),String.valueOf(accountDTO.getMoney()),Integer.parseInt(accountDTO.getDate_created()),accountDTO.getUser()));
            return "La cuenta fue creada con exito";
        }
        else{
            return "Se excede el límite de cuentas";
        }
    }
    public int getAccountFundsByAccountNumber(int accountNumber){
        AccountEntity account = accountRepo.findById(accountNumber).orElse(new AccountEntity());
        return account.getMoney();
    }
    public String depositMoney(DepositMoneyUserDto depositMoneyUserDto) {
        try {
            accountRepo.depositMoney(depositMoneyUserDto.getMoneyAmount(), depositMoneyUserDto.getAccountNumber());
            return "La cuenta ha sido recargada ";
        }
        catch (Exception e) {
            System.out.println(e);
            return "No se ha podido depositar a la cuenta";
        }
    }
    public List<AccountEntity> getUserAccounts(Integer document) {
        UserEntity user = userRepo.getUserByDocument(document);
        return accountRepo.getAllAccounts(user.getDocument());
    }
}

