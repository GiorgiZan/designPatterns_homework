package FirstHomework.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    public SelenideElement
            forms = $(byText("Forms"));

}
