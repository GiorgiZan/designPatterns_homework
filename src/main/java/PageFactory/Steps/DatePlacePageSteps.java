package PageFactory.Steps;

import PageFactory.Pages.DatePlacePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DatePlacePageSteps {
    WebDriver driver;

    DatePlacePage datePlacePage;
    JavascriptExecutor js;
    WebDriverWait wait;

    public DatePlacePageSteps(WebDriver driver) {
        this.driver = driver;
        datePlacePage = new DatePlacePage(driver);
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 15);
    }
    @Step
    public DatePlacePageSteps scrollAndClick() {
        js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, arguments[1]);", datePlacePage.eastPoint, -100);
        datePlacePage.eastPoint.click();
        return this;

    }
    @Step
    public DatePlacePageSteps clickOnLastDate() {
        datePlacePage.dates.get(datePlacePage.dates.size()-1).click();
        return this;
    }
    @Step
    public DatePlacePageSteps eastOptionsChecker(){
        for (int i = 0; i < datePlacePage.eastPointOptions.size(); i++) {
            String elementText = (String) js.executeScript("return arguments[0].textContent;", datePlacePage.eastPointOptions.get(i));
            Assert.assertEquals("კავეა ისთ ფოინთი", elementText);
        }
        return this;
    }
    @Step
    public DatePlacePageSteps clickLastOption(){
        datePlacePage.eastPointOptions.get(datePlacePage.eastPointOptions.size()-1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.left-content")));
        return this;
    }
    @Step
    public String getMovieDate(){
        return datePlacePage.dates.get(datePlacePage.dates.size()-1).getText().split(" ")[0];
    }
    @Step
    public String getMovieName(){
        return datePlacePage.movieName.getText();
    }
    @Step
    public String getCinemaName(){
        return datePlacePage.eastPointOptions.get(datePlacePage.eastPointOptions.size()-1).getText();
    }



}
