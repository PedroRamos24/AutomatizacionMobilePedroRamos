package com.nttdata.steps;

import com.nttdata.screens.MenuProductsScreen;
import com.nttdata.screens.MyCartScreen;
import com.nttdata.screens.ProductScreen;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class SauceLabsSteps {

    MenuProductsScreen menuProductsScreen;
    ProductScreen productScreen;
    MyCartScreen myCartScreen;

    private WebDriver driver;


    public void tituloVerificado(){
        String titulo = menuProductsScreen.getTituloTexto();
        Assert.assertEquals("El título no es 'Products'", "Products", titulo);
    }

    public void firsProductValidation(){
        Assert.assertTrue("No se inicio secion de forma exitosa", menuProductsScreen.firstProductDisplayed());
    }

    public void selectedProduct(String producto){
        menuProductsScreen.getSelectedProduct(producto);
    }

    public void clickAddtoCart(int unidades){

        for(int i = 1; i<unidades; i++){
            productScreen.clickAddMoreItem();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        productScreen.clickAddToCart();

    }

    public void clickCartbutton(){
        productScreen.clickCart();
    }

    public void verificarTituloProducto(String titulo){
        String title = myCartScreen.getTituloProduct();
        Assert.assertEquals("No coincide el titulo", title, titulo);
    }

    public void verificarCantidadProducto(int unidades){
        int cantidad = Integer.parseInt(myCartScreen.getCantidad());
        Assert.assertEquals("No coinciden las cantidades", unidades, cantidad);
    }

}
