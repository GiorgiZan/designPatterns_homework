package PageFactory.Steps;

import PageFactory.Pages.SeatsPopupPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeatsPopupPageSteps {
    WebDriver driver;
    SeatsPopupPage seatsPopupPage;

    public SeatsPopupPageSteps(WebDriver driver) {
        this.driver = driver;
        seatsPopupPage = new SeatsPopupPage(driver);
    }

    @Step
    public String getActualMovieTitle(){
        return seatsPopupPage.actualMovieTitle.getText();
    }
    @Step
    public String getActualCinema(){
        WebElement cinema = seatsPopupPage.actualCinemaAndDate.get(0);
        return cinema.getText();
    }
    @Step
    public String getActualDate(){
        WebElement date = seatsPopupPage.actualCinemaAndDate.get(1);
        return date.getText().split(" ")[0];
    }
    @Step
    public SeatsPopupPageSteps vacantSeat(){
        seatsPopupPage.freeSeat.click();
        return this;
    }
}
