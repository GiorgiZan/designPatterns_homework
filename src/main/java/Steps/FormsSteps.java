package Steps;

import Data.FormLogin;
import Pages.FormsPage;
import io.qameta.allure.Step;

public class FormsSteps {
    FormsPage formsPage = new FormsPage();

    @Step
    public FormsSteps openForms() {
        formsPage.forms.scrollTo().click();
        return this;
    }
}
