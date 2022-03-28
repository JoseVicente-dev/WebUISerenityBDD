package co.com.sofka.question.signin;

import co.com.sofka.userinterface.createaccountform.CreateAccountFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SignInIsSuccessful implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CreateAccountFormPage.ACCOUNT_LINK.resolveFor(actor).getText().trim();
    }

    public static SignInIsUnsuccessful signInIsSuccessful() {
        return new SignInIsUnsuccessful();
    }
}
