package com.example.demo.service;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionService {

    TransactionRepository transactionRepository;
    AccountRepository accountRepository;

    public void saveTransaction(TransactionDTO transactionDTO){
        transactionRepository.save(new TransactionEntity(transactionDTO.getId(), transactionDTO.getOrigen(), transactionDTO.getDestination(), transactionDTO.getAmount()));
    }
    public String transferMoney(TransactionDTO transactionDTO){
        if (this.accountRepository.existsById(transactionDTO.getDestination())&&this.accountRepository.existsById(transactionDTO.getOrigen())){
            AccountEntity senderAccount = accountRepository.findById(transactionDTO.getOrigen()).orElse(new AccountEntity());
            if (senderAccount.getMoney()>=transactionDTO.getAmount()){
                accountRepository.depositMoney(transactionDTO.getAmount(),transactionDTO.getDestination());
                accountRepository.depositMoney(-1*transactionDTO.getAmount(),transactionDTO.getOrigen());
                this.saveTransaction(transactionDTO);
                return "Transacción exitosa";
            }
            else{
                return "No se puede transferir. Fondos insuficientes.";
            }
        }
        else{
            return "La cuenta no existe";
        }
    }

}
