package co.com.sofka.userinterface.createaccountform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountFormPage extends PageObject {

    public static final Target FIRST_NAME = Target
            .the("First Name")
            .located(By.id("customer_firstname"));

    public static final Target LAST_NAME = Target
            .the("Last Name")
            .located(By.id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(By.id("passwd"));

    public static final Target ADDRESS = Target
            .the("Address")
            .located(By.id("address1"));

    public static final Target CITY = Target
            .the("City")
            .located(By.id("city"));

    public static final Target STATE = Target
            .the("State")
            .located(By.id("id_state"));

    public static final Target ZIP_CODE = Target
            .the("Zip code")
            .located(By.id("postcode"));

    public static final Target  MOBILE_PHONE= Target
            .the("Mobile phone")
            .located(By.id("phone_mobile"));

    public static final Target  REGISTER_BTN= Target
            .the("Register button")
            .located(By.cssSelector("#submitAccount > span"));

    public static final Target  SIGN_OUT_LINK= Target
            .the("Sign out link")
            .located(By.linkText("Sign out"));

    //For validations
    public static final Target  ACCOUNT_LINK= Target
            .the("Account link")
            .located(By.cssSelector(".page-heading"));

}
