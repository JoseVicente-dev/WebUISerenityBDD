package co.com.sofka.stepdefinitions.createaccount;

import co.com.sofka.stepdefinitions.SetupWebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class RegisterStepDefinition extends SetupWebUI {

    @Given("que estoy en la pagina de registro de la plataforma")
    public void queEstoyEnLaPaginaDeRegistroDeLaPlataforma() {
    }

    @When("diligencie los campos obligatorios con mi informacion personal necesaria")
    public void diligencieLosCamposObligatoriosConMiInformacionPersonalNecesaria(Map<String,String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }

    @Then("se mostrará un mensaje que confrima mi registro en la plataforma")
    public void seMostraráUnMensajeQueConfrimaMiRegistroEnLaPlataforma() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("que estoy en la pagina de creacion de cuenta")
    public void queEstoyEnLaPaginaDeCreacionDeCuenta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ingrese un correo con un formato incorrecto como {string}")
    public void ingreseUnCorreoConUnFormatoIncorrectoComo(String email) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("se mostrar un mensaje de advertencia {string}.")
    public void seMostrarUnMensajeDeAdvertencia(String errorMessage) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
