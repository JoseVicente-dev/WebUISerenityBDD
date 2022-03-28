package co.com.sofka.task.createaccountform;

import co.com.sofka.userinterface.createaccountform.CreateAccountFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class FillCreateAccountForm implements Task {

    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String mobilePhone;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(CreateAccountFormPage.FIRST_NAME),
                Click.on(CreateAccountFormPage.FIRST_NAME),
                Clear.field(CreateAccountFormPage.FIRST_NAME),
                Enter.theValue(firstName).into(CreateAccountFormPage.FIRST_NAME),

                Scroll.to(CreateAccountFormPage.LAST_NAME),
                Click.on(CreateAccountFormPage.LAST_NAME),
                Clear.field(CreateAccountFormPage.LAST_NAME),
                Enter.theValue(lastName).into(CreateAccountFormPage.LAST_NAME),

                Scroll.to(CreateAccountFormPage.PASSWORD),
                Click.on(CreateAccountFormPage.PASSWORD),
                Clear.field(CreateAccountFormPage.PASSWORD),
                Enter.theValue(password).into(CreateAccountFormPage.PASSWORD),

                Scroll.to(CreateAccountFormPage.ADDRESS),
                Click.on(CreateAccountFormPage.ADDRESS),
                Clear.field(CreateAccountFormPage.ADDRESS),
                Enter.theValue(address).into(CreateAccountFormPage.ADDRESS),

                Scroll.to(CreateAccountFormPage.CITY),
                Click.on(CreateAccountFormPage.CITY),
                Clear.field(CreateAccountFormPage.CITY),
                Enter.theValue(city).into(CreateAccountFormPage.CITY),

                Scroll.to(CreateAccountFormPage.STATE),
                Click.on(CreateAccountFormPage.STATE),
                SelectFromOptions.byVisibleText(state).from(CreateAccountFormPage.STATE),

                Scroll.to(CreateAccountFormPage.ZIP_CODE),
                Click.on(CreateAccountFormPage.ZIP_CODE),
                Clear.field(CreateAccountFormPage.ZIP_CODE),
                Enter.theValue(zipCode).into(CreateAccountFormPage.ZIP_CODE),

                Scroll.to(CreateAccountFormPage.MOBILE_PHONE),
                Click.on(CreateAccountFormPage.MOBILE_PHONE),
                Clear.field(CreateAccountFormPage.MOBILE_PHONE),
                Enter.theValue(mobilePhone).into(CreateAccountFormPage.MOBILE_PHONE),

                Scroll.to(CreateAccountFormPage.REGISTER_BTN),
                Click.on(CreateAccountFormPage.REGISTER_BTN)


        );


    }

    public FillCreateAccountForm withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillCreateAccountForm withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillCreateAccountForm withPassword(String password) {
        this.password = password;
        return this;
    }

    public FillCreateAccountForm withAddress(String address) {
        this.address = address;
        return this;
    }

    public FillCreateAccountForm withCity(String city) {
        this.city = city;
        return this;
    }

    public FillCreateAccountForm withState(String state) {
        this.state = state;
        return this;
    }

    public FillCreateAccountForm withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public FillCreateAccountForm andWithMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public static FillCreateAccountForm fillCreateAccountForm() {
        return new FillCreateAccountForm();
    }
}