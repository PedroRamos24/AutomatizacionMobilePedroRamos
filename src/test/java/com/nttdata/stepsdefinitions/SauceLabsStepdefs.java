package com.nttdata.stepsdefinitions;
import com.nttdata.steps.SauceLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SauceLabsStepdefs {

    @Steps
    SauceLabsSteps sauceLabsSteps;

    int unidad = 0;
    String titulo = "";

    @Given("estoy en la aplicacion de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
        
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        sauceLabsSteps.tituloVerificado();
        sauceLabsSteps.firsProductValidation();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int unidades, String producto) {
        unidad = unidades;
        titulo = producto;
        sauceLabsSteps.selectedProduct(producto);
        sauceLabsSteps.clickAddtoCart(unidades);

    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        sauceLabsSteps.clickCartbutton();
        sauceLabsSteps.verificarTituloProducto(titulo);
        sauceLabsSteps.verificarCantidadProducto(unidad);
    }
}
