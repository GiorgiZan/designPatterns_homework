package FirstHomework.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EnterDataPage {
    public SelenideElement
            firstNameField = $("#firstName"),
            lastNameField = $("#lastName"),
            mobileNumberField = $("#userNumber"),
            submitButton =  $("#submit");

    //ჯერ ყველა ოპციას ერთ ElementsCollection-ში ვინახავ და შემდეგ მოთხოვნიდან გამომდინარე დავჩეკავ სწორს
    public ElementsCollection genderButtons = $$(By.cssSelector("input[name='gender']"));

}
