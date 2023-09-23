package PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainPage {
    WebDriver driver;

    @FindBy(xpath = "//li[contains(@class, 'MoreCategories')][contains(normalize-space(), 'კინო')]")
    public WebElement movieButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }
}
