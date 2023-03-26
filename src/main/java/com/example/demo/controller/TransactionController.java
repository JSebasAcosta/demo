package com.example.demo.controller;

import com.example.demo.controller.dto.*;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.TransactionService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private TransactionService transactionService;


    @PutMapping(path = "/account/transfer-money")
    public String transferMoney(@RequestBody TransactionDTO transferData) {
        return transactionService.transferMoney(transferData);
    }

}
