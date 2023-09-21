import FirstHomework.Steps.EnterDataSteps;
import FirstHomework.Steps.FormsSteps;
import FirstHomework.Steps.PracticeFormSteps;
import FirstHomework.Steps.SubmitPopupSteps;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;


public class FormTests extends SelenideConfig {
    FormsSteps formsSteps = new FormsSteps();
    PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
    EnterDataSteps enterDataSteps = new EnterDataSteps();
    SubmitPopupSteps submitPopupSteps = new SubmitPopupSteps();

    @Test
    public void test(){
        Selenide.open("https://demoqa.com/");
        formsSteps.openForms();
        practiceFormSteps.openPracticeForm();
        enterDataSteps.enterFirstName()
                .enterLastName()
                .enterGender()
                .enterMobileNumber()
                .pressSubmitButton();


        // submitPopupStep-ში ვამოწმებ რომ ნადმვილად არის visible და შემდეგ უბრალოდ ვპრინტავ
        System.out.println( submitPopupSteps.getPopupText());

        submitPopupSteps.checkStudentName()
                .checkStudentGender()
                .checkStudentMobile();
    }
}
