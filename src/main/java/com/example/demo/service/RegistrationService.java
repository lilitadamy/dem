package com.example.demo.service;

import com.example.demo.model.dto.UserDto;
import com.example.demo.model.entity.User;
import com.example.demo.model.role.UserRole;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;

    public String register(UserDto userDto) {
        UserRole role;
        String userRole = "WAITER";
        if (userDto.getRole() == userRole) {
            role = UserRole.WAITER;
        } else role = UserRole.MANAGER;
        return userService.signUpUser(
                new User(
                        userDto.getFirstName(),
                        userDto.getLastName(),
                        userDto.getUsername(),
                        userDto.getPassword(),
                        role
                )
        );
    }
}
