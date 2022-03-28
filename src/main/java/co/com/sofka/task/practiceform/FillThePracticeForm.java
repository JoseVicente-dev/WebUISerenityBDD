package co.com.sofka.task.practiceform;

import co.com.sofka.userinterface.practiceform.PracticeForm;
import co.com.sofka.util.Gender;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;

public class FillThePracticeForm implements Task {

    private String firstName;
    private String lastName;
    private String gender;
    private String mobile;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(PracticeForm.FIRST_NAME),
                Click.on(PracticeForm.FIRST_NAME),
                Clear.field(PracticeForm.FIRST_NAME),
                Enter.theValue(firstName).into(PracticeForm.FIRST_NAME),

                Scroll.to(PracticeForm.LAST_NAME),
                Click.on(PracticeForm.LAST_NAME),
                Clear.field(PracticeForm.LAST_NAME),
                Enter.theValue(lastName).into(PracticeForm.LAST_NAME),

                Check.whether(Gender.MALE.getValue().equals(gender))
                        .andIfSo(Scroll.to(PracticeForm.GENDER_MALE),
                                Click.on(PracticeForm.GENDER_MALE))
                        .otherwise(
                                Check.whether(Gender.FEMALE.getValue().equals(gender))
                                        .andIfSo(Scroll.to(PracticeForm.GENDER_FEMALE),
                                                Click.on(PracticeForm.GENDER_FEMALE)
                                        )
                                        .otherwise(
                                                Scroll.to(PracticeForm.GENDER_OTHER),
                                                Click.on(PracticeForm.GENDER_OTHER)
                                        )
                        ),

                Scroll.to(PracticeForm.MOBILE),
                Click.on(PracticeForm.MOBILE),
                Clear.field(PracticeForm.MOBILE),
                Enter.theValue(mobile).into(PracticeForm.MOBILE),

                Click.on(PracticeForm.CLOSE_ADS),

                Scroll.to(PracticeForm.SUBMIT),
                Click.on(PracticeForm.SUBMIT)

                );
    }

    public static FillThePracticeForm fillThePracticeForm() {
        return new FillThePracticeForm();
    }

    public FillThePracticeForm usingTheFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillThePracticeForm usingTheLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillThePracticeForm usingTheGender(String gender) {
        this.gender = gender;
        return this;
    }

    public FillThePracticeForm andUsingTheMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
}
