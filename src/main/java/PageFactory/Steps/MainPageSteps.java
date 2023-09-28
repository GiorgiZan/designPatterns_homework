package PageFactory.Steps;

import PageFactory.Pages.MainPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class MainPageSteps {
    WebDriver driver;
    MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        mainPage = new MainPage(driver);
    }
    @Step("Clicking on movie section button")
    public MainPageSteps clickMovieButton() {
        mainPage.movieButton.click();
        return this;
    }
}
