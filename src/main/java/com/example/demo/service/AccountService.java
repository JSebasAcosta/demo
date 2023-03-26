package com.example.demo.service;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class AccountService {
    AccountRepository accountRepo;
    UserRepository userRepo;

    public String insertAccount(AccountDTO accountDTO){
        if(userRepo.existsById(accountDTO.getUser()) && accountRepo.getAllAccounts(accountDto.getUser()).size()<=4){
            accountRepository.save(new AccountEntity(accountDto.getId(),accountDto.getType(),accountDto.getMoney(),accountDto.getDate_created(),accountDto.getUser()));
            return "La cuenta fue creada con exito";
        }
        else{
            return "Se excede el límite de cuentas";
        }
    }
    public int getAccountFundsByAccountNumber(AccountDto accountDTO){
        AccountEntity account = accountRepo.findById(accountDTO.getAccountNumber());
        UserEntity user = userRepo.findById(account.getUser());
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
}
