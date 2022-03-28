package co.com.sofka.task.landingpage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GoToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static GoToContactUs goToContactUs(){
        return new GoToContactUs();
    }
}
