package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuProductsScreen extends PageObject {

    private WebDriver driver;

    // Constructor que recibe el WebDriver (puede ser AppiumDriver o cualquier clase compatible)
    public MenuProductsScreen(WebDriver driver) {
        this.driver = driver;
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTOS\"]")
    private WebElement lblProduct;

    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isEnabled();
    }

    //EXAMEN
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblTitulo;

    public String getTituloTexto(){
        waitFor(ExpectedConditions.visibilityOf(lblTitulo));  // Espera a que el texto sea visible
        return lblTitulo.getText();  // Devuelve el texto del elemento
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement firstProduct;

    public boolean firstProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(firstProduct));
        return firstProduct.isEnabled();
    }

    public void getSelectedProduct(String producto) {
        String dynamicXPath = "//android.widget.ImageView[@content-desc=\"" + producto + "\"]";
        WebElement btnSelectedProduct = driver.findElement(By.xpath(dynamicXPath));
        btnSelectedProduct.click();
    }

}
