package com.example.demo.service;

import com.example.demo.controller.dto.DepositMoneyUserDto;
import com.example.demo.controller.dto.TransactionDTO;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.repository.TransactionRepository;

public class TransactionService {

    TransactionRepository transactionRepository;

    public void insertTransaction(TransactionDTO transactionDTO){
        transactionRepository.save(new TransactionEntity(transactionDTO.getId(), transactionDTO.getOrigen(), transactionDTO.getDestination(), transactionDTO.getAmount()));

    }

}
