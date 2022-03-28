package co.com.sofka.task.contactus;


import co.com.sofka.userinterface.contactus.ContactUsPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;





public class FillContactUs implements Task {

    private String subject;
    private String email;
    private String message;

    public FillContactUs choosingSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public FillContactUs usingEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContactUs AndWithTheMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ContactUsPage.SUBJECT),
                Click.on(ContactUsPage.SUBJECT),
                SelectFromOptions.byVisibleText(subject).from(ContactUsPage.SUBJECT),

                Scroll.to(ContactUsPage.EMAIL),
                Enter.theValue(email).into(ContactUsPage.EMAIL),

                Scroll.to(ContactUsPage.MESSAGE),
                Enter.theValue(message).into(ContactUsPage.MESSAGE),

                Scroll.to(ContactUsPage.SUBMIT),
                Click.on(ContactUsPage.SUBMIT)

                );

    }

    public static FillContactUs fillContactUs(){
        return new FillContactUs();
    }



}
