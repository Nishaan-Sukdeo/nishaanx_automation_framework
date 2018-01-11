package com.nishaanx.automation_framework.workflow;

import com.nishaanx.automation_framework.pages.web.CheckoutPage;
import com.nishaanx.automation_framework.pages.web.HomePage;
import com.nishaanx.automation_framework.pages.web.LoginPage;
import com.nishaanx.automation_framework.pages.web.EmailConfirmationPage;

public interface NishaanxWorkflows {

    public HomePage navigateToAProductUrl(String url);

    public LoginPage selectProductsFromPageAndContinue(HomePage homePage, String searchTerm);

    public CheckoutPage loginAndContinueToCheckout(LoginPage loginPage, String username, String password);

    public EmailConfirmationPage checkoutAndConfirmOrderByCreditCard(CheckoutPage checkoutPage);

    public EmailConfirmationPage checkoutAndConfirmOrderByDirectDebit(CheckoutPage checkoutPage);

}
