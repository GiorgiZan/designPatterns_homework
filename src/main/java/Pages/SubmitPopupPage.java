package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SubmitPopupPage {
    public SelenideElement
     // მეორე ვარიანტი
//                popupText = $("#example-modal-sizes-title-lg"),

                  popupText = $(byText("Thanks for submitting the form")),
                  tableStudentInfo =  $(".table-responsive");
}
