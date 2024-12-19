package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductScreen extends PageObject {

    private WebDriver driver;

    public ProductScreen(WebDriver driver) {
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddtoCart;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnAddMore;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCart;

    public void clickAddToCart(){
        btnAddtoCart.click();
    }

    public void clickAddMoreItem(){
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) btnAddMore));*/
        waitFor(ExpectedConditions.visibilityOf(btnAddMore));
        btnAddMore.click();

    }

    public void clickCart(){
        btnCart.click();
    }

}
