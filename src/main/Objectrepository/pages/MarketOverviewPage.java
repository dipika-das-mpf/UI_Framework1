package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketOverviewPage {

    WebDriver driver;

    public MarketOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//div[@class='ui search dropdown item js-account-dd account-dd']/input[@class='search']") WebElement agency;
    @FindBy(xpath = "//div[text()='Test Xaxis Agency']") public WebElement agencyval;
    @FindBy(xpath = "//div[@class='ui search dropdown item js-geo-dd geo-dd']/input[@class='search']") public WebElement geo;
    @FindBy(xpath = "//div[text()='USA']") public WebElement geoval;


    public WebElement Agency(){

        return agency;
    }

    public WebElement AgencyVal(){

        return agencyval;
    }


    public WebElement Geo(){

        return geo;
    }

    public WebElement GeoVal(){

        return geoval;
    }

}
