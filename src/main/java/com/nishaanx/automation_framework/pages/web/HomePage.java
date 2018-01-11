package com.nishaanx.automation_framework.pages.web;

import com.nishaanx.automation_framework.data.ProductDetail;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author abc
 */
public class HomePage extends BasePage {

    By productTable = By.xpath("");
    By nextLink = By.xpath("");
    By continueToCheckout = By.xpath("");

    public List<ProductDetail> getAllProductDetails() {
        List<ProductDetail> productDetails = new ArrayList<>();
        List<WebElement> elements = waitForElementsBy(productTable);

        while (isNextEnabled(waitForElement(nextLink))) {
            for (WebElement element : elements) {
                ProductDetail productDetail = new ProductDetail();
                productDetail.setProductName(element.findElement(By.xpath("")).getText()); //Fill out the location of productname here
                productDetail.setPrice(element.findElement(By.xpath("")).getText()); //Fill out the location of price here
                productDetail.setAddToCartLink(element.findElement(By.xpath(""))); //Fill out the location of add to cart button here
                productDetails.add(productDetail);
            }
            waitForElement(nextLink).click();
        }

        return productDetails;
    }

    public List<ProductDetail> getSelectedProductDetailsByExpression(String regex) {
        List<ProductDetail> allProductsOnPage = getAllProductDetails();
        List<ProductDetail> selectedProducts = new ArrayList<>();
        for (ProductDetail product : allProductsOnPage) {
            if (product.getProductName().matches(regex)) {
                product.getAddToCartLink().click();
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }

    private boolean isNextEnabled(WebElement element) {
        return element.getAttribute("").contains(""); //Logic for nextButton enabled here
    }

    public LoginPage clickCheckout() {
        waitForElement(continueToCheckout).click();
        return new LoginPage();
    }

    public boolean isProductPageDisplayed() {
        return hasElement(continueToCheckout);
    }
}
