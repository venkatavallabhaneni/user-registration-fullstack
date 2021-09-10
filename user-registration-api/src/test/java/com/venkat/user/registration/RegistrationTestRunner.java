package com.venkat.user.registration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",  plugin = {"pretty", "html:target/cucumber-report.html"},glue = {"com/venkat/user/registration/steps"})
public class RegistrationTestRunner {

}

