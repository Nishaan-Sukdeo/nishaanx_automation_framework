package com.nishaanx.automation_framework.data;

import org.openqa.selenium.WebElement;

/**
 *
 * @author abc
 */
public class ProductDetail {

    String productName;
    String price;
    WebElement addToCartLink;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public WebElement getAddToCartLink() {
        return addToCartLink;
    }

    public void setAddToCartLink(WebElement addToCartLink) {
        this.addToCartLink = addToCartLink;
    }

}
