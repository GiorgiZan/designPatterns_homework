package PageFactory.Steps;

import PageFactory.Pages.ChooseMoviePage;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ChooseMoviePageSteps {
    WebDriver driver;
    ChooseMoviePage chooseMoviePage;
    DatePlacePageSteps datePlacePageSteps;

    public ChooseMoviePageSteps(WebDriver driver) {
        this.driver = driver;
        chooseMoviePage = new ChooseMoviePage(driver);
        datePlacePageSteps = new DatePlacePageSteps(driver);
    }

    @Step("Clicking on first movie which airs in east point ")
    public ChooseMoviePageSteps clickOnFirstMovie() {
        for (int i = 0; i < chooseMoviePage.allMovies.size(); i++) {
            WebElement movie = chooseMoviePage.allMovies.get(i);
            String nameOfTheMovie = movie.getText();
            movie.click();

            try {
                datePlacePageSteps.scrollAndClick();
                break;
            } catch (NoSuchElementException e) {
                // 'კავეა ისთ ფოინთი' link not found, continue to the next movie
                System.out.println("ეს კინო: " + nameOfTheMovie + ", არ გადის კავეა ისთ ფოინთში");
                driver.navigate().back();

            }


    }
        return this;
    }
    }
