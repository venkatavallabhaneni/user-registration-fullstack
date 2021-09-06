package com.venkat.user.registration.app;

import com.venkat.user.registration.domain.UserRegistration;
import com.venkat.user.registration.service.UserRegistrationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user/registration/")
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }


    @Operation(summary = "Create User from Registration form", description = "Create User from Registration form")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful")})
    @PostMapping(headers = "Accept=application/json", produces = "application/json")
    @ResponseBody
    public UserRegistration create(@RequestBody UserRegistration aUserRegistartionForm) {
        return userRegistrationService.create(aUserRegistartionForm);
    }

    @Operation(summary = "Get User  Registered Data", description = "Get User  Registered Data")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful")})
    @GetMapping(path = "/{id}", headers = "Accept=application/json", produces = "application/json")
    @ResponseBody
    public UserRegistration get(@PathVariable Long id) {
        return userRegistrationService.get(id);
    }

}
