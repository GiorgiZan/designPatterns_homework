package FirstHomework.Steps;

import FirstHomework.Data.FormLogin;
import FirstHomework.Pages.EnterDataPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class EnterDataSteps {
    EnterDataPage enterDataPage = new EnterDataPage();
    FormLogin formLogin = new FormLogin();

    @Step
    public EnterDataSteps enterFirstName() {
        enterDataPage.firstNameField.setValue(formLogin.firstName);
        return this;
    }
    @Step
    public EnterDataSteps enterLastName() {
        enterDataPage.lastNameField.setValue(formLogin.lastName);
        return this;
    }
    @Step
    public EnterDataSteps enterGender() {
        executeJavaScript("arguments[0].click()", enterDataPage.genderButtons.find(attribute("value", formLogin.gender)));
        return this;
    }

    @Step
    public EnterDataSteps enterMobileNumber() {
        enterDataPage.mobileNumberField.setValue(formLogin.mobileNumber);
        return this;
    }

    @Step
    public EnterDataSteps pressSubmitButton() {
        executeJavaScript("arguments[0].click();", enterDataPage.submitButton);
        return this;
    }
}
