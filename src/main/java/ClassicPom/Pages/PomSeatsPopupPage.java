package ClassicPom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class PomSeatsPopupPage {

    WebDriver driver;

    public PomSeatsPopupPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getActualMovieTitle() {
        return driver.findElement(By.cssSelector("p.movie-title"));
    }
    public List<WebElement> getActualCinemaAndDate() {
        return driver.findElements(By.cssSelector("p.movie-cinema"));
    }
    public WebElement getFreeSeat() {
        return driver.findElement(By.xpath("//div[@class='seat free']"));
    }
}
