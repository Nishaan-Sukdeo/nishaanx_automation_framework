package com.nishaanx.automation_framework.pages.web;

import org.openqa.selenium.By;

/**
 *
 * @author abc
 */
public class CheckoutPage extends BasePage {

    By creditCardOptionsRadioButton = By.xpath("");
    By directDebitOptionsRadioButton = By.xpath("");
    By continueButton = By.xpath("");

    //TODO: Put other options like creditcard number, expiry date, cvc number etc... I am leaving it to your implementation

    public CheckoutPage clickCreditCard() {
        waitForElement(creditCardOptionsRadioButton).click();
        return this;
    }

    public CheckoutPage clickDebitOptions() {
        waitForElement(directDebitOptionsRadioButton).click();
        return this;
    }

    public EmailConfirmationPage clickContinue() {
        waitForElement(continueButton).click();
        return new EmailConfirmationPage();
    }

    public boolean isCheckoutPageDisplayed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
