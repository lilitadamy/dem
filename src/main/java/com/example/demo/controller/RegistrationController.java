package com.example.demo.controller;

import com.example.demo.model.dto.UserDto;
import com.example.demo.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/users/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody UserDto userDto) {
        return registrationService.register(userDto);
    }

}
