package co.com.sofka.userinterface.practiceform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeForm extends PageObject {

    public static final Target ELEMENTS = Target
            .the("Elements")
            .located(By.cssSelector(".card:nth-child(1) path"));

    public static final Target FORMS = Target
            .the("Forms")
            .located(By.cssSelector(".element-group:nth-child(2) .header-text"));

    public static final Target PRACTICE_FORM = Target
            .the("Practice form")
            .located(By.cssSelector(".show .text"));

    //For mandatory fields
    public static final Target FIRST_NAME = Target
            .the("First name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target
            .the("Last name")
            .located(By.id("lastName"));
    public static final Target GENDER_MALE = Target
            .the("Gender male")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
    public static final Target GENDER_FEMALE = Target
            .the("Gender female")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
    public static final Target GENDER_OTHER = Target
            .the("Gender other")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label"));
    public static final Target MOBILE = Target
            .the("Mobile")
            .located(By.id("userNumber"));
    public static final Target SUBMIT = Target
            .the("Submit button")
            .located(By.id("submit"));

    public static final Target CLOSE_ADS = Target
            .the("Close ads")
            .located(By.cssSelector("#close-fixedban > img"));

    //For validations
    public static final Target STUDENT_NAME_VALIDATION = Target
            .the("Student Name")
            .located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));

    public static final Target GENDER_VALIDATION = Target
            .the("Gender")
            .located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[3]/td[2]"));

    public static final Target MOBILE_VALIDATION = Target
            .the("Mobile")
            .located(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]"));

}