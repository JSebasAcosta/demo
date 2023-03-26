package com.example.demo.controller.dto;

import lombok.Data;


@Data
public class UserDTO {
    private int document;
    private String name;
    private String last_name;
    private String date_created;
}
