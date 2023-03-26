package com.example.demo.controller.dto;

import lombok.Data;

@Data
public class AccountDTO {
    private int id;
    private String type;
    private int money;
    private String date_created;
    private int user;
}
