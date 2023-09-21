package PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ChooseMoviePage {
    WebDriver driver;

    @FindBy(css = "div.movies-deal")
    public List<WebElement> allMovies;

    public ChooseMoviePage(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }
}
