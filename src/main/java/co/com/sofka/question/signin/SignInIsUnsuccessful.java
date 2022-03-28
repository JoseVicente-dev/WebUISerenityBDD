package co.com.sofka.question.signin;

import co.com.sofka.userinterface.createaccountform.CreateAccountFormPage;
import co.com.sofka.userinterface.signinpage.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SignInIsUnsuccessful implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return SignInPage.SIGN_IN_ERROR_MESSAGE_VALIDATION.resolveFor(actor).getText().trim();
    }

    public static SignInIsUnsuccessful signInIsUnsuccessful() {
        return new SignInIsUnsuccessful();
    }
}
