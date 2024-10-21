package com.booking.ride_on.service.Impl;

import com.booking.ride_on.Repository.AuthenticateUserRepo;
import com.booking.ride_on.entity.User;
import com.booking.ride_on.model.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.ride_on.service.AuthenticateService;

@Service
public class AuthenticateServiceImpl implements AuthenticateService {

    @Autowired
    AuthenticateUserRepo authenticateUserRepo;


    @Override
    public String verifyUser(LoginRequest loginRequest) {
        User user = authenticateUserRepo.findByEmail(loginRequest.getUserName());
        return user != null ? "SUCCESS" : "FAILURE";
    }

    @Override
    public String createUser(User user) {

        User user1 = authenticateUserRepo.findByEmail(user.getEmail());

        if (user1 == null) {
            authenticateUserRepo.save(user);
        } else {
            throw new RuntimeException("User Already exists");
        }

        return "CREATED";
    }
}
