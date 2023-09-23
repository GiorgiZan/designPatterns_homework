package ClassicPom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.PageFactory.initElements;

public class PomMainPage {
    private WebDriver driver;

    public PomMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMovieButton() {
        return driver.findElement(By.xpath("//li[contains(@class, 'MoreCategories')][contains(normalize-space(), 'კინო')]"));
    }

}
