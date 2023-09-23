package ClassicPom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PomDatePlacePage {
    WebDriver driver;

    public PomDatePlacePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEastPoint() {
        return driver.findElement(By.xpath("//a[text()='კავეა ისთ ფოინთი']"));
    }
    public List<WebElement> getEastPointOptions() {
        return driver.findElements(By.xpath("//div[@id='384933']//div[@class='seanse-details ui-tabs-panel ui-widget-content ui-corner-bottom']//p[@class='cinema-title' and text()='კავეა ისთ ფოინთი']"));
    }

    public List<WebElement> getDates() {
        return driver.findElements(By.xpath("//*[@id='384933']/div/ul/li"));
    }

    public WebElement getMovieName() {
        return driver.findElement(By.cssSelector("p.name"));
    }

}
