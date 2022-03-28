package co.com.sofka.userinterface.landingpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingPage extends PageObject {

    public static final Target SING_IN_LINK = Target
            .the("Sing In link")
            .located(By.linkText("Sign in"));

    public static final Target CONTACT_US_LINK = Target
            .the("Contact us link")
            .located(By.linkText("Contact us"));

}
