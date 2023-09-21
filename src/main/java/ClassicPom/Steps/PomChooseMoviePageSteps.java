package ClassicPom.Steps;

import ClassicPom.Pages.PomChooseMoviePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomChooseMoviePageSteps {
    WebDriver driver;
    PomChooseMoviePage pomChooseMoviePage;
    PomDatePlacePageSteps pomDatePlacePageSteps;

    public PomChooseMoviePageSteps (WebDriver driver) {
        this.driver = driver;
        pomChooseMoviePage = new PomChooseMoviePage(driver);
        pomDatePlacePageSteps = new PomDatePlacePageSteps(driver);
    }

//    public ChooseMoviePageSteps clickFirstMovie() {
//        chooseMoviePage.allMovies.get(0).click();
//        return this;
//    }

    public void clickOnFirstMovie() {
        for (int i = 0; i < pomChooseMoviePage.getAllMovies().size(); i++) {
            WebElement movie = pomChooseMoviePage.getAllMovies().get(i);
            String nameOfTheMovie = movie.getText();
            movie.click();

            try {
                pomDatePlacePageSteps.scrollAndClick();
                break;
            } catch (NoSuchElementException e) {
                // 'კავეა ისთ ფოინთი' link not found, continue to the next movie
                System.out.println("ეს კინო: " + nameOfTheMovie + ", არ გადის კავეა ისთ ფოინთში");
                driver.navigate().back();

            }


        }
    }
}
