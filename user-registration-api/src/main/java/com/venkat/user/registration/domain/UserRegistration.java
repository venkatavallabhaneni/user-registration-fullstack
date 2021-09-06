package com.venkat.user.registration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class UserRegistration {

    private String name;
    private String phone;
    private String gender;
    private String address;
    private String profession;
    private Long id;


}
