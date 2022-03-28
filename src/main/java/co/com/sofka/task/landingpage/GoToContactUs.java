package co.com.sofka.task.landingpage;

import co.com.sofka.userinterface.landingpage.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class GoToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LandingPage.CONTACT_US_LINK),
                Click.on(LandingPage.CONTACT_US_LINK)
        );

    }

    public static GoToContactUs goToContactUs(){
        return new GoToContactUs();
    }
}
