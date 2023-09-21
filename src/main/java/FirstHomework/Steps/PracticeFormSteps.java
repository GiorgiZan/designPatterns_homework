package FirstHomework.Steps;

import FirstHomework.Pages.PracticeFormPage;
import io.qameta.allure.Step;

public class PracticeFormSteps {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Step
    public PracticeFormSteps openPracticeForm() {
        practiceFormPage.practiceForm.scrollTo().click();
        return this;
    }
}
