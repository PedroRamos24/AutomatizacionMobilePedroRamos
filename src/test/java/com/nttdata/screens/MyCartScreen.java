package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyCartScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement lbltituloProducto;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement lblCantidadProduct;

    public String getTituloProduct(){
        waitFor(ExpectedConditions.visibilityOf(lbltituloProducto));
        return lbltituloProducto.getText();
    }

    public String getCantidad(){
        waitFor(ExpectedConditions.visibilityOf(lblCantidadProduct));
        return lblCantidadProduct.getText();
    }


}
