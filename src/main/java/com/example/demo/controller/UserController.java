package com.example.demo.controller;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService service;

    @PostMapping(path = "/user")
    public String createUser(@RequestBody UserDTO userDTO) {
        return service.createUser(userDTO);
    }

}
