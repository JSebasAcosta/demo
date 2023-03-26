package com.example.demo.service;

import com.example.demo.controller.dto.AccountDTO;
import com.example.demo.controller.dto.DepositMoneyUserDto;
import com.example.demo.entity.AccountEntity;
import com.example.demo.repository.AccountRepository;
import org.springframework.data.domain.ExampleMatcher;

public class AccountService {
    AccountRepository accountRepository;

    public String insertAccount(AccountDTO accountDTO){
        AccountEntity account = new AccountEntity();
        account.setCreationDate(accountDTO.getCreationDate());
        ExampleMatcher matcher = ExampleMatcher.matchingAny();
        System.out.println(bookingRepository.count(Example.of(probe, matcher)));
        if (bookingRepository.count(Example.of(probe, matcher)) < 20) {
            probe.setClient_id(bookingDTO.getClient_id());
            matcher = ExampleMatcher.matchingAll().withIgnorePaths("id", "pet_id");
            if(bookingRepository.count(Example.of(probe, matcher)) < 1) {
                bookingRepository.save(new Booking(bookingDTO.getId(), bookingDTO.getClient_id(), bookingDTO.getPet_id(), bookingDTO.getDate()));
                return "booking added";
            } else {
                return "you already have a booking for another pet";
            }
        } else {
            return "booking cannot be added";
        }
    }
    public int getAccountFundsByAccountNumber(){

        return 0;
    }
    public String depositMoney(DepositMoneyUserDto depositMoneyUserDto) {
        try {
            accountRepository.depositMoney(depositMoneyUserDto.getMoneyAmount(), depositMoneyUserDto.getAccountNumber());
            return "Your account has been recharged ";
        }
        catch (Exception e) {
            System.out.println(e);
            return "Your account has NOT been recharged";
        }
    }
}
