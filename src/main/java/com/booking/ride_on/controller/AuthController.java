package com.booking.ride_on.controller;

import com.booking.ride_on.entity.User;
import com.booking.ride_on.model.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.booking.ride_on.service.AuthenticateService;

@RestController
@RequestMapping("/authenticate")
public class AuthController {

    @Autowired
    AuthenticateService authenticateService;

    @PostMapping("/login")
    public ResponseEntity authenticateUser(@RequestBody LoginRequest loginRequest){
        String result=authenticateService.verifyUser(loginRequest);
        return result.equalsIgnoreCase("SUCCESS") ? ResponseEntity.ok(HttpStatus.ACCEPTED) : ResponseEntity.ok(HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody User user) {
        String result = authenticateService.createUser(user);
        return result.equalsIgnoreCase("CREATED") ? ResponseEntity.ok(HttpStatus.CREATED) : ResponseEntity.ok(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getItems")
    public String getItems(){
        return "Gaura";
    }



}
