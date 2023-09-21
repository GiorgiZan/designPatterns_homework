package ClassicPom.Steps;

import ClassicPom.Pages.PomSeatsPopupPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomSeatsPopupPageSteps {
    WebDriver driver;
    PomSeatsPopupPage pomSeatsPopupPage;

    public PomSeatsPopupPageSteps(WebDriver driver) {
        this.driver = driver;
        pomSeatsPopupPage = new PomSeatsPopupPage(driver);
    }
    @Step
    public String getActualMovieTitle(){
        return pomSeatsPopupPage.getActualMovieTitle().getText();
    }
    @Step
    public String getActualCinema(){
        WebElement cinema = pomSeatsPopupPage.getActualCinemaAndDate().get(0);
        return cinema.getText();
    }
    @Step
    public String getActualDate(){
        WebElement date = pomSeatsPopupPage.getActualCinemaAndDate().get(1);
        return date.getText().split(" ")[0];
    }
    @Step
    public void vacantSeat(){
        pomSeatsPopupPage.getFreeSeat().click();
    }
}
