package co.com.sofka.task.signinpage;

import co.com.sofka.task.landingpage.GoToContactUs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GoToCreateAccountForm implements Task {

    private String createEmail;

    public GoToCreateAccountForm withCreateEmail(String createEmail) {
        this.createEmail = createEmail;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static GoToCreateAccountForm goToCreateAccountForm(){
        return new GoToCreateAccountForm();
    }
}
