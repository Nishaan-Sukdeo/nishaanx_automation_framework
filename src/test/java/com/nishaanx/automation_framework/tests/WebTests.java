package com.nishaanx.automation_framework.tests;

import com.nishaanx.automation_framework.pages.web.CheckoutPage;
import com.nishaanx.automation_framework.pages.web.EmailConfirmationPage;
import com.nishaanx.automation_framework.pages.web.HomePage;
import com.nishaanx.automation_framework.pages.web.LoginPage;
import com.nishaanx.automation_framework.utils.Excel;
import com.nishaanx.automation_framework.utils.ExcelContext;
import com.nishaanx.automation_framework.workflow.NishaanxWorkFlowImplementations;
import com.nishaanx.automation_framework.workflow.NishaanxWorkflows;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebTests extends BaseTests {

    @Test(dataProvider = "testData")
    public void addProductsAndCheckout(String url, String searchTerm, String username, String password) {
        NishaanxWorkflows nw = new NishaanxWorkFlowImplementations();

        HomePage homePage = nw.navigateToAProductUrl(url);
        assertTrue(homePage.isProductPageDisplayed(), "Home Page not loaded");

        LoginPage loginPage = nw.selectProductsFromPageAndContinue(homePage, searchTerm);
        assertTrue(loginPage.isLoginPageDisplayed(), "Login Page not loaded");

        CheckoutPage checkoutPage = nw.loginAndContinueToCheckout(loginPage, username, password);
        assertTrue(checkoutPage.isCheckoutPageDisplayed(), "Checkout Page not loaded");

        EmailConfirmationPage emailConfirmationPage = nw.checkoutAndConfirmOrderByCreditCard(checkoutPage);
        assertTrue(emailConfirmationPage.isEmailConfirmed(), "Email not confirmed");

    }

    @DataProvider(name = "testData", parallel = false)
    public static Object[][] getTestData() {
        ExcelContext context = new ExcelContext();
        context.setExcelFile("testData/Web.xlsx");
        context.setSheetName("login");
        Excel excelObj = new Excel(context);
        String[][] testData = excelObj.getData("url", "searchTerm", "username", "password");
        return testData;
    }
}
