package com.auth.service;

import com.auth.controller.dto.UserDto;
import com.auth.entity.AppUser;
import com.auth.repository.UserRepository;
import com.auth.repository.UserRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepo userRoleRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(UserDto userDto) {
        userRepository.save(AppUser.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .password(passwordEncoder.encode(userDto.getPassword()))
                .username(userDto.getUserName())
                .roles(Arrays.asList(userRoleRepo.findById(1l).get()))
                .build());

        // 1-UESR_ROLE
        //2-ADMIN_ROLE

        return "Saved Successfully!!";
    }

}
