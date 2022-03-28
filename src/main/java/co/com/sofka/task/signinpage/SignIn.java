package co.com.sofka.task.signinpage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SignIn implements Task {

    private String signInEmail;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public SignIn setSignInEmail(String signInEmail) {
        this.signInEmail = signInEmail;
        return this;
    }

    public SignIn setPassword(String password) {
        this.password = password;
        return this;
    }

    public static GoToCreateAccountForm goToCreateAccountForm(){
        return new GoToCreateAccountForm();
    }
}
