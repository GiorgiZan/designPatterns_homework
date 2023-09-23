import ClassicPom.Steps.PomChooseMoviePageSteps;
import ClassicPom.Steps.PomDatePlacePageSteps;
import ClassicPom.Steps.PomMainPageSteps;
import ClassicPom.Steps.PomSeatsPopupPageSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ClassicPOMTests extends SeleniumConfig {
    PomMainPageSteps pomMainPageSteps;
    PomChooseMoviePageSteps pomChooseMoviePageSteps;
    PomDatePlacePageSteps pomDatePlacePageSteps;
    PomSeatsPopupPageSteps pomSeatsPopupPageSteps;


    @BeforeMethod
    public void setup(){
        pomMainPageSteps = new PomMainPageSteps(driver);
        pomChooseMoviePageSteps = new PomChooseMoviePageSteps(driver);
        pomDatePlacePageSteps = new PomDatePlacePageSteps(driver);
        pomSeatsPopupPageSteps = new PomSeatsPopupPageSteps(driver);
    }



    @Test
    public void test() {
        driver.navigate().to("https://www.swoop.ge/");
        pomMainPageSteps.clickMovieButton();

        pomChooseMoviePageSteps.clickOnFirstMovie();

        pomDatePlacePageSteps.clickOnLastDate();
        pomDatePlacePageSteps.eastOptionsChecker();
        pomDatePlacePageSteps.clickLastOption();

        //Movie name
        Assert.assertEquals(pomSeatsPopupPageSteps.getActualMovieTitle(), pomDatePlacePageSteps.getMovieName());
        //Movie date
        Assert.assertEquals(pomSeatsPopupPageSteps.getActualDate(), pomDatePlacePageSteps.getMovieDate());
        //Cinema
        Assert.assertEquals(pomSeatsPopupPageSteps.getActualCinema(), pomDatePlacePageSteps.getCinemaName());


        pomSeatsPopupPageSteps.vacantSeat();

    }

}


