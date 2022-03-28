package co.com.sofka.question.practiceform;

import co.com.sofka.userinterface.practiceform.PracticeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PracticeFormQuestion implements Question<Boolean> {

    private String firstName;
    private String lastName;
    private String gender;
    private String mobile;

    public PracticeFormQuestion withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PracticeFormQuestion andWithLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PracticeFormQuestion andWithGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PracticeFormQuestion andWithMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public PracticeFormQuestion is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (PracticeForm.STUDENT_NAME_VALIDATION.resolveFor(actor).containsOnlyText(firstName+" "+lastName)
                && PracticeForm.GENDER_VALIDATION.resolveFor(actor).containsOnlyText(gender)
                && PracticeForm.MOBILE_VALIDATION.resolveFor(actor).containsOnlyText(mobile)
        );
    }

    public static PracticeFormQuestion practiceFormQuestion(){
        return new PracticeFormQuestion();
    }


}
