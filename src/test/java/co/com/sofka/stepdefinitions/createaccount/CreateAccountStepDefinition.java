package co.com.sofka.stepdefinitions.createaccount;

import co.com.sofka.stepdefinitions.SetupWebUI;
import co.com.sofka.userinterface.createaccountform.CreateAccountFormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.Map;

import static co.com.sofka.question.createaccountform.CreateAccountSuccess.createAccountWasSuccess;
import static co.com.sofka.question.createaccountform.CreateAccountUnsuccess.createAccountWasUnsuccessful;
import static co.com.sofka.task.createaccountform.FillCreateAccountForm.fillCreateAccountForm;
import static co.com.sofka.task.landingpage.GoToSignIn.goToSignIn;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.signinpage.GoToCreateAccountForm.goToCreateAccountForm;
import static java.lang.Math.random;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateAccountStepDefinition extends SetupWebUI {

    private static final Logger LOGGER = Logger.getLogger(CreateAccountStepDefinition.class);
    private static final String ACTOR_NAME = "Phillip";
    private Map<String, String> dataToValidate;
    private String ACCOUNT_NAME;

    @Given("que estoy en la pagina de registro de la plataforma")
    public void queEstoyEnLaPaginaDeRegistroDeLaPlataforma() {

        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                goToSignIn()
        );


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

        ACCOUNT_NAME = dataTable.get("FirstName")+" "+dataTable.get("LastName");
        theActorInTheSpotlight().attemptsTo(
                goToCreateAccountForm()
                        .withCreateEmail(generateEmail()),
                fillCreateAccountForm()
                        .withFirstName(dataTable.get("FirstName"))
                        .withLastName(dataTable.get("LastName"))
                        .withPassword(dataTable.get("Password"))
                        .withAddress(dataTable.get("Address"))
                        .withCity(dataTable.get("City"))
                        .withState(dataTable.get("State"))
                        .withZipCode(dataTable.get("ZipCode"))
                        .andWithMobilePhone(dataTable.get("MobilePhone"))
        );

    }

    @Then("se mostrara un mensaje que confrima mi registro en la plataforma")
    public void seMostraraUnMensajeQueConfrimaMiRegistroEnLaPlataforma() {
        theActorInTheSpotlight().should(
                seeThat(createAccountWasSuccess(),Matchers.containsString(ACCOUNT_NAME))
        );
    }



    @Given("que estoy en la pagina de creacion de cuenta")
    public void queEstoyEnLaPaginaDeCreacionDeCuenta() {

        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                goToSignIn()
        );
    }

    @When("ingrese un correo con un formato incorrecto como {string}")
    public void ingreseUnCorreoConUnFormatoIncorrectoComo(String email) {

        theActorInTheSpotlight().attemptsTo(
                goToCreateAccountForm()
                        .withCreateEmail(email)
        );
    }


    @Then("se mostrar un mensaje de advertencia {string}.")
    public void seMostrarUnMensajeDeAdvertencia(String errorMessage) {

        theActorInTheSpotlight().should(
                seeThat(createAccountWasUnsuccessful(),Matchers.containsString(errorMessage))
        );

    }


    private String generateEmail(){
        return "p.sherman"+random()+"@pixar.com";
    }


}
