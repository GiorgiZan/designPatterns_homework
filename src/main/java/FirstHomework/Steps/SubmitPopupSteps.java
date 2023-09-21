package FirstHomework.Steps;

import FirstHomework.Data.FormLogin;
import FirstHomework.Pages.SubmitPopupPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class SubmitPopupSteps {
    SubmitPopupPage submitPopupPage = new SubmitPopupPage();
    FormLogin formLogin = new FormLogin();
    
    @Step
    public String getPopupText (){
        submitPopupPage.popupText.shouldBe(visible);
        return submitPopupPage.popupText.getText();
    }

    // შემდეგ სამ მეთოდში პრინტები უბრალოდ დავწერე ვიფიქრე ესე ეჯობება ტესტში რომ გამოვიძახებდი გამოჩნდება თქო ლამაზად, ცოტა უაზროდ კი არიან ისე, ნუ იყოს მაინც
    @Step
    public SubmitPopupSteps checkStudentName(){
        submitPopupPage.tableStudentInfo.shouldHave(text(formLogin.firstName + " " + formLogin.lastName));
        System.out.println("Student name is correct!");
        return this;

    }
    @Step
    public SubmitPopupSteps checkStudentGender(){
        submitPopupPage.tableStudentInfo.shouldHave(text(formLogin.gender));
        System.out.println("Gender is correct!");
        return this;

    }
    @Step
    public SubmitPopupSteps checkStudentMobile(){
        submitPopupPage.tableStudentInfo.shouldHave(text(formLogin.mobileNumber));
        System.out.println("Mobile is correct!");
        return this;

    }

    //შემეძლო სამივე ერთად დამეწერა მაგალითად
    //          public void checkStudentInfo(){
    //        submitPopup.tableStudentInfo.shouldHave(text(formLogin.firstName + " " + formLogin.lastName));
    //        submitPopup.tableStudentInfo.shouldHave(text(formLogin.gender));
    //        submitPopup.tableStudentInfo.shouldHave(text(formLogin.mobileNumber));
    //
    //    } მაგრამ ვფიქრობ ესე ცალ-ცალკე უფრო თვალსაჩინოა
    //
}
