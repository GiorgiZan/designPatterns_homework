package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {

    public SelenideElement
             practiceForm = $(byText("Practice Form"));


}
