package com.booking.ride_on.service;

import com.booking.ride_on.entity.User;
import com.booking.ride_on.model.LoginRequest;

public interface AuthenticateService {

    public String verifyUser(LoginRequest loginRequest);

    public String createUser(User user);
}
