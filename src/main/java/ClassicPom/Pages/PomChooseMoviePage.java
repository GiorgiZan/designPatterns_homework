package ClassicPom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class PomChooseMoviePage {
    WebDriver driver;

    public PomChooseMoviePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllMovies() {
        return driver.findElements(By.cssSelector("div.movies-deal"));
    }





}
