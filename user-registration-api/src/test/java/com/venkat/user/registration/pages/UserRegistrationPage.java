package com.venkat.user.registration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends BasePage{

    private static String PAGE_URL="http://localhost:8080";

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id="email")
    private WebElement email;

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }


}
