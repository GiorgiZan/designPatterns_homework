package PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SeatsPopupPage {
    WebDriver driver;
    @FindBy(css = "p.movie-title")
    public WebElement actualMovieTitle;

    @FindBy(css = "p.movie-cinema")
    public List<WebElement> actualCinemaAndDate;
    @FindBy(xpath = "//div[@class='seat free']")
    public WebElement freeSeat;



    public SeatsPopupPage(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }
}
