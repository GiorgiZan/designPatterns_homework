import PageFactory.Steps.ChooseMoviePageSteps;
import PageFactory.Steps.DatePlacePageSteps;
import PageFactory.Steps.MainPageSteps;
import PageFactory.Steps.SeatsPopupPageSteps;
import org.testng.Assert;
import org.testng.annotations.*;


public class PageFactoryTests extends SeleniumConfig {
    MainPageSteps mainPageSteps;
    ChooseMoviePageSteps chooseMoviePageSteps;
    DatePlacePageSteps datePlacePageSteps;
    SeatsPopupPageSteps seatsPopupPageSteps;

    @BeforeMethod
    public void setup(){
        mainPageSteps = new MainPageSteps(driver);
        chooseMoviePageSteps = new ChooseMoviePageSteps(driver);
        datePlacePageSteps = new DatePlacePageSteps(driver);
        seatsPopupPageSteps = new SeatsPopupPageSteps(driver);
    }


    @Test
    public void test() {
        driver.navigate().to("https://www.swoop.ge/");
        mainPageSteps.clickMovieButton();
        chooseMoviePageSteps.clickOnFirstMovie();
        datePlacePageSteps
                .clickOnLastDate()
                .eastOptionsChecker()
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
