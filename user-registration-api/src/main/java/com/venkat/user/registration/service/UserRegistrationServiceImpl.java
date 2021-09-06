package com.venkat.user.registration.service;

import com.venkat.user.registration.domain.UserRegistration;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private Random random = new Random();

    @Override
    public UserRegistration create(UserRegistration userRegistration) {
        userRegistration.setId(random.nextLong());
        return userRegistration;
    }

    @Override
    public UserRegistration get(Long id) {

        return new UserRegistration("Venkat", "9741535455", "M", "54,LIBDOM", "SE", random.nextLong());
    }


}
