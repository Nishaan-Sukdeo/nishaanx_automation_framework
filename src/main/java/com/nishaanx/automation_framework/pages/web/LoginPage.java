package com.nishaanx.automation_framework.pages.web;

import org.openqa.selenium.By;

/**
 *
 * @author abc
 */
public class LoginPage extends BasePage {

    By username = By.xpath("");
    By password = By.xpath("");
    By submit = By.xpath("");

    public LoginPage enterUserName(String username) {
        waitForElement(this.username).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        waitForElement(this.password).sendKeys(password);
        return this;
    }

    public CheckoutPage clickSubmit() {
        waitForElement(submit).click();
        return new CheckoutPage();
    }

    public boolean isLoginPageDisplayed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
