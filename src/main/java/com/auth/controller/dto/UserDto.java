package com.auth.controller.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class UserDto {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
}
