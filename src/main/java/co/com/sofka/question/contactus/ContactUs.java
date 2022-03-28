package co.com.sofka.question.contactus;

import co.com.sofka.userinterface.contactus.ContactUsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ContactUs implements Question<Boolean> {

    private String subject;
    private String email;
    private String message;

    public ContactUs wasFillingSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public ContactUs wasFillingEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactUs wasFillingMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

            return (ContactUsPage.MESSAGE_SUCCESSFULLY .resolveFor(actor).containsOnlyText("Your message has been successfully sent to our team.")

            );

    }
    public static ContactUs contactUs(){
        return new ContactUs();
    }


}

