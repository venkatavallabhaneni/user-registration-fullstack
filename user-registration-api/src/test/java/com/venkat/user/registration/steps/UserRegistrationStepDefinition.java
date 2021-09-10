package com.venkat.user.registration.steps;

import com.venkat.user.registration.pages.UserRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserRegistrationStepDefinition extends CucumberSpringConfiguration {

    private UserRegistrationPage userRegistrationPage;

    private Logger logger = LoggerFactory.getLogger(UserRegistrationStepDefinition.class);
    @Given("Open the Chrome and launch the application")
    public void open_the_chrome_and_launch_the_application() {
        logger.info("Open the Chrome and launch the application");
    }
    @When("Enter the Username and email")
    public void enter_the_username_and_email() {
        logger.info("Enter the Username and email");
    }
    @Then("Register the user")
    public void register_the_user() {
        logger.info("Register the user");
    }
}
