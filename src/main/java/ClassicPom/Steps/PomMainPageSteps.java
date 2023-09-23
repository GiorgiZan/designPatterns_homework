package ClassicPom.Steps;

import ClassicPom.Pages.PomMainPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class PomMainPageSteps {
     WebDriver driver;
     PomMainPage pomMainPage;

    public PomMainPageSteps(WebDriver driver) {
        this.driver = driver;
        pomMainPage = new PomMainPage(driver);
    }
    @Step
    public void clickMovieButton() {
        pomMainPage.getMovieButton().click();
    }
}
