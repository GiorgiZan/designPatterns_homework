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

    @Step("Getting actual movie title (in popup)")
    public String getActualMovieTitle(){
        return seatsPopupPage.actualMovieTitle.getText();
    }
    @Step("Getting actual cinema name (in popup)")
    public String getActualCinema(){
        WebElement cinema = seatsPopupPage.actualCinemaAndDate.get(0);
        return cinema.getText();
    }
    @Step("Getting actual movie date (in popup)")
    public String getActualDate(){
        WebElement date = seatsPopupPage.actualCinemaAndDate.get(1);
        return date.getText().split(" ")[0];
    }
    @Step("Clicking on available seat")
    public SeatsPopupPageSteps vacantSeat(){
        seatsPopupPage.freeSeat.click();
        return this;
    }
}
