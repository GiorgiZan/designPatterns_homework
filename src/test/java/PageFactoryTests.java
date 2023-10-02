import PageFactory.Data.MovieData;
import PageFactory.Steps.ChooseMoviePageSteps;
import PageFactory.Steps.DatePlacePageSteps;
import PageFactory.Steps.MainPageSteps;
import PageFactory.Steps.SeatsPopupPageSteps;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;


@Listeners({AllureListener.class})

@Epic("Movie Booking via swoop.ge")
@Feature("Free seat Reservation")
public class PageFactoryTests extends SeleniumConfig {
    MainPageSteps mainPageSteps;
    ChooseMoviePageSteps chooseMoviePageSteps;
    DatePlacePageSteps datePlacePageSteps;
    SeatsPopupPageSteps seatsPopupPageSteps;
    MovieData movieData = new MovieData();

    @BeforeMethod
    public void setup(){
        mainPageSteps = new MainPageSteps(driver);
        chooseMoviePageSteps = new ChooseMoviePageSteps(driver);
        datePlacePageSteps = new DatePlacePageSteps(driver);
        seatsPopupPageSteps = new SeatsPopupPageSteps(driver);
    }


    @Test(description = "Booking free seats in east point scenario")
    @Severity(SeverityLevel.NORMAL)
    @Story("Selecting Movie and Seats")
    @Description("This test case performs the following steps:\n"
            + "1. Navigate to the Swoop.ge site.\n"
            + "2. Click on the movie section button.\n"
            + "3. Select the first movie available in east point.\n"
            + "4. Click on the last date available.\n"
            + "5. Check that all available options are 'East Point' .\n"
            + "6. Click on the last available option.\n"
            + "7. Verify movie details such as name, date, and cinema.\n"
            + "8. Click on a vacant seat.")
    public void test() {
        driver.navigate().to("https://www.swoop.ge/");
        mainPageSteps.clickMovieButton();
        chooseMoviePageSteps.clickOnFirstMovie();
        datePlacePageSteps
                .clickOnLastDate()
                .eastOptionsChecker(movieData.cinemaName)
                .clickLastOption();



        //Movie name
        Assert.assertEquals(seatsPopupPageSteps.getActualMovieTitle(), datePlacePageSteps.getMovieName());
        //Movie date
        Assert.assertEquals(seatsPopupPageSteps.getActualDate(), datePlacePageSteps.getMovieDate());
        //Cinema
        Assert.assertEquals(seatsPopupPageSteps.getActualCinema(), datePlacePageSteps.getCinemaName());


        seatsPopupPageSteps.vacantSeat();




    }

}
