package com.example.demo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class DepositMoneyUserDto {
    private int moneyAmount;
    private int accountNumber;

}
