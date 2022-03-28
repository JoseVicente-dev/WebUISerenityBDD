package co.com.sofka.task.practiceform;

import co.com.sofka.userinterface.practiceform.PracticeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BrowseToPracticeForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(PracticeForm.ELEMENTS),
                Click.on(PracticeForm.ELEMENTS),

                Scroll.to(PracticeForm.FORMS),
                Click.on(PracticeForm.FORMS),

                Scroll.to(PracticeForm.PRACTICE_FORM),
                Click.on(PracticeForm.PRACTICE_FORM)
        );

    }

    public static BrowseToPracticeForm browseToPracticeForm(){
        return new BrowseToPracticeForm();
    }
}
