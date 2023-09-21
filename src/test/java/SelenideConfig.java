import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;

public class SelenideConfig {
    @BeforeMethod
    public void ConfigTests() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        browserCapabilities = options;
        browserSize = null;
        timeout = 20000;
        screenshots=true;
        savePageSource=false;
        holdBrowserOpen=true;

    }

    @AfterMethod
    public void afterMethod() {
        Selenide.closeWebDriver();
    }
}
