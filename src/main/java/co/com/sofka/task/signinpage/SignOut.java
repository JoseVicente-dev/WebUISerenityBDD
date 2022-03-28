package co.com.sofka.task.signinpage;

import co.com.sofka.userinterface.createaccountform.CreateAccountFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SignOut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(CreateAccountFormPage.SIGN_OUT_LINK),
                Click.on(CreateAccountFormPage.SIGN_OUT_LINK)
        );

    }

    public static SignOut andSignsOut(){
        return new SignOut();
    }
}
