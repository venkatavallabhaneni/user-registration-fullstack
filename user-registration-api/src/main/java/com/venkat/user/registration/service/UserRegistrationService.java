package com.venkat.user.registration.service;

import com.venkat.user.registration.domain.UserRegistration;

public interface UserRegistrationService {

    public UserRegistration create(UserRegistration userRegistration);

    public UserRegistration get(Long id);
}
