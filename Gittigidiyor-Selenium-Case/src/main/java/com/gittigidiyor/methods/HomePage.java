package com.gittigidiyor.methods;

import com.gittigidiyor.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends WebDriverHelper {

    By loginAndSignUpButtonBy = By.cssSelector("[data-cy='header-user-menu']");
    By loginButtonBy = By.cssSelector("[data-cy='header-login-button']");

    Actions actions;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.actions = new Actions(this.webDriver);
    }

    public String getText(By element, String attribute){
        return webDriver.findElement(element).getAttribute(attribute);
    }

    public LoginPage goToLoginPage(){
        moveToElement(loginAndSignUpButtonBy);
        clickOnElement(loginButtonBy);
        return new LoginPage(webDriver);
    }

}
