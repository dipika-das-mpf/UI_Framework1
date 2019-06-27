import base.Base;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import pages.LoginPage;
import org.junit.Test;
import pages.MarketOverviewPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class LoginPageController extends Base {

    public static Logger log =LogManager.getLogger(Base.class.getName());

    @Test
        public void login () throws IOException {
            driver = initializeDriver();
            log.info("Driver is initialized");
            driver.get("https://turbine.xaxis.com");
           log.info("Driver is initialized");

           LoginPage login = new LoginPage(driver);
            System.out.println("https://turbine.xaxis.com/");
            login.username().sendKeys("dipika.das@groupm.com");
            login.password().sendKeys("Hillside@987654");
            login.Login().click();
            MarketOverviewPage home = new MarketOverviewPage(driver);
            home.Agency().sendKeys("Test Xaxis Agency");
            home.AgencyVal().click();
            home.Geo().sendKeys("USA");
            home.GeoVal().click();


        }

        @DataProvider
        public Object[][] getData () {
            Object[][] data = new Object[1][2];

            data[0][0] = "https://turbine.xaxis.com/";
            data[0][1] = "dipika.das@groupm.com";
            data[0][2] = "Hillside@987654";

            data[1][0] = "https://turbine.xaxis.com/";
            data[1][1] = "dipika.das@groupm.com";
            data[1][2] = "Hillside@987654";

            return data;
        }


        @AfterTest
        public void teardown() {
        driver.close();
        driver=null;
        }

}
