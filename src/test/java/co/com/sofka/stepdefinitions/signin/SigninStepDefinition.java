package co.com.sofka.stepdefinitions.signin;

import co.com.sofka.stepdefinitions.SetupWebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;

import java.util.Map;

import static co.com.sofka.question.signin.SignInIsSuccessful.signInIsSuccessful;
import static co.com.sofka.question.signin.SignInIsUnsuccessful.signInIsUnsuccessful;
import static co.com.sofka.task.createaccountform.FillCreateAccountForm.fillCreateAccountForm;
import static co.com.sofka.task.landingpage.GoToSignIn.goToSignIn;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.signinpage.FillTheSignInForm.fillTheSignInForm;
import static co.com.sofka.task.signinpage.GoToCreateAccountForm.goToCreateAccountForm;
import static co.com.sofka.task.signinpage.SignOut.andSignsOut;
import static java.lang.Math.random;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SigninStepDefinition extends SetupWebUI {

    private static final Logger LOGGER = Logger.getLogger(SigninStepDefinition.class);
    private static final String ACTOR_NAME = "Phillip";
    private Map<String, String> dataToValidate;
    private String emailToRegister;
    private String accountName;

    @Given("que me he registrado en la plataforma")
    public void queMeHeRegistradoEnLaPlataforma(Map<String,String> dataTable) {
        emailToRegister = generateEmail();
        accountName = "MY ACCOUNT";
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                goToSignIn(),
                goToCreateAccountForm()
                        .withCreateEmail(emailToRegister),
                fillCreateAccountForm()
                        .withFirstName(dataTable.get("FirstName"))
                        .withLastName(dataTable.get("LastName"))
                        .withPassword(dataTable.get("Password"))
                        .withAddress(dataTable.get("Address"))
                        .withCity(dataTable.get("City"))
                        .withState(dataTable.get("State"))
                        .withZipCode(dataTable.get("ZipCode"))
                        .andWithMobilePhone(dataTable.get("MobilePhone")),
                andSignsOut()
        );
    }

    @Given("estoy en el modulo Sign Un")
    public void estoyEnElModuloSignUn() {

        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                goToSignIn()
        );
    }

    @When("ingrese mis credenciales de login validas")
    public void ingreseMisCredencialesDeLoginValidas(Map<String,String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        theActorInTheSpotlight().attemptsTo(
                fillTheSignInForm()
                        .withEmail(emailToRegister)
                        .andPassword(dataTable.get("Password"))
        );
    }

    @Then("podre consultar el estado de mis poductos")
    public void podreConsultarElEstadoDeMisPoductos() {

        theActorInTheSpotlight().should(
                seeThat(signInIsSuccessful(), Matchers.containsString(accountName))
        );
    }

    @Given("que estoy en el modulo de ingreso")
    public void queEstoyEnElModuloDeIngreso() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                goToSignIn()
        );
    }

    @When("ingrese un correo con un formato no valido como {string} y password {string}")
    public void ingreseUnCorreoConUnFormatoNoValidoComo(String email, String password) {

        theActorInTheSpotlight().attemptsTo(
                fillTheSignInForm()
                        .withEmail(emailToRegister)
                        .andPassword(password)
        );

    }

    @Then("se mostrara un mensaje de error {string} y no podre ingresar al aplicativo")
    public void seMostraraUnMensajeDeErrorYNoPodreIngresarAlAplicativo(String errorMessage) {

        theActorInTheSpotlight().should(
                seeThat(signInIsUnsuccessful(),Matchers.containsString(errorMessage))
        );


    }

    private String generateEmail(){
        return "p.sherman"+random()+"@pixar.com";
    }
}
