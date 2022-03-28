package co.com.sofka.userinterface.signinpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInPage extends PageObject {

    //for create account scenarios
    public static final Target EMAIL_CREATE_FIELD = Target
            .the("Email create field")
            .located(By.id("email_create"));
    public static final Target CREATE_AN_ACCOUNT_BTN = Target
            .the("Create an account button")
            .located(By.cssSelector("#SubmitCreate > span"));

    //for sign in scenarios
    public static final Target EMAIL_SIGIN_FIELD = Target
            .the("Email Sign in field")
            .located(By.id("email"));
    public static final Target PASSWORD_FIELD = Target
            .the("Password field")
            .located(By.id("passwd"));
    public static final Target SIGNIN_BTN = Target
            .the("Sign in button")
            .located(By.id("#SubmitLogin > span"));

    //for validations
    public static final Target SIGN_IN_ERROR_MESSAGE_VALIDATION = Target
            .the("Sign in Error message")
            .located(By.cssSelector("ol > li"));
    public static final Target CREATE_ACCOUNT_ERROR_MESSAGE_VALIDATION = Target
            .the("Create account Error message")
            .located(By.cssSelector("ol > li"));




}
