package co.com.sofka.userinterface.contactus;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class ContactUsPage extends PageObject {

    public static final Target CONTACTUS = Target
            .the("Contact us")
            .located(By.id("contact-link"));

    public static final Target SUBJECT = Target
            .the("subject")
            .located(By.id("id_contact"));

    public static final Target EMAIL = Target
            .the("email")
            .located(By.id("email"));

    public static final Target MESSAGE = Target
            .the("message")
            .located(By.id("message"));

    public static final Target SUBMIT = Target
            .the("submit")
            .located(By.id("submitMessage"));

    public static final Target MESSAGE_SUCCESSFULLY = Target
            .the("message_successfully")
            .located(By.cssSelector(".alert"));

    public static final Target MESSAGE_UNSUCCESSFULLY = Target
            .the("message_unsuccessfully")
            .located(By.cssSelector("ol > li"));



}
