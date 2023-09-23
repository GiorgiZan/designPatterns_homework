package ClassicPom.Steps;

import ClassicPom.Pages.PomDatePlacePage;
import PageFactory.Pages.DatePlacePage;
import PageFactory.Steps.DatePlacePageSteps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PomDatePlacePageSteps {
    WebDriver driver;

    PomDatePlacePage pomDatePlacePage;
    JavascriptExecutor js;
    WebDriverWait wait;

    public PomDatePlacePageSteps(WebDriver driver) {
        this.driver = driver;
        pomDatePlacePage = new PomDatePlacePage(driver);
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 15);
    }
    @Step
    public void scrollAndClick() {
        js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, arguments[1]);",   pomDatePlacePage.getEastPoint(), -100);
        pomDatePlacePage.getEastPoint().click();
    }
    @Step
    public void clickOnLastDate() {
        pomDatePlacePage.getDates().get(pomDatePlacePage.getDates().size()-1).click();
    }
    @Step
    public void eastOptionsChecker(){
        for (int i = 0; i < pomDatePlacePage.getEastPointOptions().size(); i++) {;
            String elementText = (String) js.executeScript("return arguments[0].textContent;", pomDatePlacePage.getEastPointOptions().get(i));

            Assert.assertEquals("კავეა ისთ ფოინთი", elementText);
        }
    }
    @Step
    public void clickLastOption(){
        pomDatePlacePage.getEastPointOptions().get(pomDatePlacePage.getEastPointOptions().size()-1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.left-content")));
    }
    @Step
    public String getMovieDate(){
        return pomDatePlacePage.getDates().get(pomDatePlacePage.getDates().size()-1).getText().split(" ")[0];
    }
    @Step
    public String getMovieName(){
        return pomDatePlacePage.getMovieName().getText();
    }
    @Step
    public String getCinemaName(){
        return pomDatePlacePage.getEastPointOptions().get(pomDatePlacePage.getEastPointOptions().size()-1).getText();
    }
}
