package co.com.sofka.question.createaccountform;

import co.com.sofka.userinterface.createaccountform.CreateAccountFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreateAccountSuccess implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CreateAccountFormPage.ACCOUNT_LINK.resolveFor(actor).getText().trim();
    }

    public static CreateAccountSuccess createAccountIsSuccess(){
        return new CreateAccountSuccess();
    }
}
