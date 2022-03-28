package co.com.sofka.task.signinpage;

import co.com.sofka.userinterface.signinpage.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class GoToCreateAccountForm implements Task {

    private String createEmail;

    public GoToCreateAccountForm withCreateEmail(String createEmail) {
        this.createEmail = createEmail;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(SignInPage.EMAIL_CREATE_FIELD),
                Click.on(SignInPage.EMAIL_CREATE_FIELD),
                Clear.field(SignInPage.EMAIL_CREATE_FIELD),
                Enter.theValue(createEmail).into(SignInPage.EMAIL_CREATE_FIELD),

                Scroll.to(SignInPage.CREATE_AN_ACCOUNT_BTN),
                Click.on(SignInPage.CREATE_AN_ACCOUNT_BTN)

        );
    }

    public static GoToCreateAccountForm goToCreateAccountForm(){
        return new GoToCreateAccountForm();
    }
}
