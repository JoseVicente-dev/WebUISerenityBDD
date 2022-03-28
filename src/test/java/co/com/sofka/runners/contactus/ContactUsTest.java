package co.com.sofka.runners.contactus;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/contactus/contactUs.feature"},
        glue = {"co.com.sofka.stepdefinition.contacus"},
        tags = {""}
)
public class ContactUsTest {

}
