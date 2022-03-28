package co.com.sofka.question.createaccountform;

import co.com.sofka.userinterface.signinpage.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreateAccountUnsuccess implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return SignInPage.CREATE_ACCOUNT_ERROR_MESSAGE_VALIDATION.resolveFor(actor).getText().trim();
    }

    public static CreateAccountUnsuccess createAccountIsUnsuccessful(){
        return new CreateAccountUnsuccess();
    }
}
