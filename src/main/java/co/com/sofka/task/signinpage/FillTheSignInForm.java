package co.com.sofka.task.signinpage;

import co.com.sofka.userinterface.signinpage.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class FillTheSignInForm implements Task {

    private String email;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SignInPage.EMAIL_SIGNIN_FIELD),
                Click.on(SignInPage.EMAIL_SIGNIN_FIELD),
                Clear.field(SignInPage.EMAIL_SIGNIN_FIELD),
                Enter.theValue(email).into(SignInPage.EMAIL_SIGNIN_FIELD),

                Scroll.to(SignInPage.PASSWORD_FIELD),
                Click.on(SignInPage.PASSWORD_FIELD),
                Clear.field(SignInPage.PASSWORD_FIELD),
                Enter.theValue(password).into(SignInPage.PASSWORD_FIELD),

                Scroll.to(SignInPage.SIGNIN_BTN),
                Click.on(SignInPage.SIGNIN_BTN)
        );
    }

    public FillTheSignInForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillTheSignInForm andPassword(String password) {
        this.password = password;
        return this;
    }

    public static FillTheSignInForm fillTheSignInForm(){
        return new FillTheSignInForm();
    }
}
