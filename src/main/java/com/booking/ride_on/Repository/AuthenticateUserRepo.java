package com.booking.ride_on.Repository;

import com.booking.ride_on.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticateUserRepo extends JpaRepository<User,Long> {

    User findByEmail(String email);




}
