package com.example.demo.controller;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @PostMapping(path = "/user")
    public String createUser(@RequestBody UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO.getDocument(),
                userDTO.getName(),
                userDTO.getLast_name(),
                userDTO.getDate_created());
        userService.createUser(userEntity);
        return "Se ha creado el usuario con exito.";
    }

}
