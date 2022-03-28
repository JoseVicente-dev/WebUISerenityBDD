package co.com.sofka.stepdefinitions.contactus;


import co.com.sofka.stepdefinitions.SetupWebUI;
import co.com.sofka.stepdefinitions.createaccount.CreateAccountStepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;

import java.util.Map;

import static co.com.sofka.question.contactus.ContactUs.contactUs;
import static co.com.sofka.question.contactus.ContactUsFailed.contactUsFailed;
import static co.com.sofka.task.contactus.FillContactUs.fillContactUs;
import static co.com.sofka.task.landingpage.GoToContactUs.goToContactUs;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContactUsStepDefinition extends SetupWebUI {

    private static final Logger LOGGER = Logger.getLogger(ContactUsStepDefinition.class);
    private static final String ACTOR_NAME = "Phillip";
    private Map<String, String> dataToValidate;

    @Given("que estoy en la seccion Contact Us")
    public void queEstoyEnLaSeccionContactUs() {

        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                goToContactUs());
    }

    @When("diligencie mi PQRS y la envie")
    public void diligencieMiPQRSYLaEnvie(Map<String, String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        theActorInTheSpotlight().attemptsTo(
                fillContactUs()
                        .usingEmail(dataTable.get("email"))
                        .choosingSubject(dataTable.get("SubjectHeading"))
                        .AndWithTheMessage("Message")

        );
    }

    @Then("se confirmara el envio de la misma {string}")
    public void seConfirmaraElEnvioDeLaMisma(String string) {

        theActorInTheSpotlight().should(
                seeThat(contactUs(), Matchers.equalTo(true)));
    }

    @Given("que estoy en Contact Us")
    public void queEstoyEnContactUs() {

        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                goToContactUs());
    }

    @When("diligencie el correo de contacto pero no suministre un mensaje")
    public void diligencieElCorreoDeContactoPeroNoSuministreUnMensaje(Map<String,String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        theActorInTheSpotlight().attemptsTo(
                fillContactUs()
                        .usingEmail(dataTable.get("email"))
                        .choosingSubject(dataTable.get("SubjectHeading"))
                        .AndWithTheMessage("Message")

        );

    }

    @Then("se mostrara el error {string}")
    public void seMostraraElError(String string) {
        theActorInTheSpotlight().should(
                seeThat(contactUsFailed(), Matchers.equalTo(true)));

    }



}
