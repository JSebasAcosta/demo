package com.example.demo.controller;
import com.example.demo.controller.dto.*;
import com.example.demo.entity.AccountEntity;
import com.example.demo.service.AccountService;
import lombok.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
public class AccountController {
    private AccountService service;

    @PostMapping(path = "/account")
    public String createAccount(@RequestBody AccountDTO accountDTO) {
        return service.insertAccount(accountDTO);
    }

    @GetMapping(path = "/account/check-balance/{accountNumber}")
    public int checkBalance(@PathVariable("accountNumber") int accountNumber) {
        return service.getAccountFundsByAccountNumber(accountNumber);
    }

    @PutMapping (path = "/account/deposit-money")
    public String depositMoney(@RequestBody DepositMoneyUserDto depositMoneyUserDTO) {
        service.depositMoney(depositMoneyUserDTO);
        return "Se ha realizado el deposito exitosamente";
    }

    @GetMapping("/accounts")
    public List<AccountEntity> getUserAccounts(@RequestParam("documento") Integer documento){
        return service.getUserAccounts(documento);
    }
}