package com.example.demo.controller.dto;

import lombok.Data;

@Data
public class TransactionDTO {
    private int id;
    private int origen;
    private int destination;
    private int amount;

}
