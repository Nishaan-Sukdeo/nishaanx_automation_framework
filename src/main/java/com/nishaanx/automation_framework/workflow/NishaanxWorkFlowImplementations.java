package com.nishaanx.automation_framework.workflow;

import com.nishaanx.automation_framework.base.DriverFactory;
import com.nishaanx.automation_framework.pages.web.CheckoutPage;
import com.nishaanx.automation_framework.pages.web.HomePage;
import com.nishaanx.automation_framework.pages.web.LoginPage;
import com.nishaanx.automation_framework.pages.web.EmailConfirmationPage;

public class NishaanxWorkFlowImplementations implements NishaanxWorkflows {

    @Override
    public HomePage navigateToAProductUrl(String url) {
        DriverFactory.getDriver().get(url);
        return new HomePage();
    }

    @Override
    public LoginPage selectProductsFromPageAndContinue(HomePage homePage, String searchTerm) {
        homePage.getSelectedProductDetailsByExpression(searchTerm);
        return homePage.clickCheckout();
    }

    @Override
    public CheckoutPage loginAndContinueToCheckout(LoginPage loginPage, String username, String password) {
        return loginPage.enterUserName(username)
                .enterPassword(password)
                .clickSubmit();
    }

    @Override
    public EmailConfirmationPage checkoutAndConfirmOrderByCreditCard(CheckoutPage checkoutPage) {
        return checkoutPage.clickCreditCard()
                .clickContinue();
    }

    @Override
    public EmailConfirmationPage checkoutAndConfirmOrderByDirectDebit(CheckoutPage checkoutPage) {
        return checkoutPage.clickDebitOptions()
                .clickContinue();
    }


}
