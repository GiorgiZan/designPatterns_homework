package PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DatePlacePage {
    WebDriver driver;
    @FindBy(xpath = "//a[text()='კავეა ისთ ფოინთი']")
    public WebElement eastPoint;

    @FindBy(xpath = "//div[@id='384933']//div[@class='seanse-details ui-tabs-panel ui-widget-content ui-corner-bottom']//p[@class='cinema-title' and text()='კავეა ისთ ფოინთი']")
    public List<WebElement> eastPointOptions;
    @FindBy(xpath = "//*[@id='384933']/div/ul/li")
    public  List<WebElement> dates;
    @FindBy(css = "p.name")
    public  WebElement movieName;

    public DatePlacePage(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }
}
