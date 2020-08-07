package com.auth.controller;

import com.auth.controller.dto.UserDto;
import com.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public String register(@RequestBody UserDto userDto) {
        return userService.register(userDto);
    }
}
