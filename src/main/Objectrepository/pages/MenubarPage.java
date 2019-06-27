package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class MenubarPage {

    WebDriver driver;
    public void MenubarPage(WebDriver driver){

        {
         this.driver= driver;
        }
    }

    @FindBy(css = "div.ui.dropdown.item.js-inner-menu.main-nav-dropdowns.new-icon-marketOverview-wrap.main-active-menu") WebElement MarketOvrview;
    @FindBy(xpath = "") WebElement DataAsset;
    @FindBy(xpath = "") WebElement MonitoringReport;
    @FindBy(xpath = "") WebElement AdvertiserReport;
    @FindBy(xpath ="")   WebElement AudienceSizeReport;
    @FindBy(xpath = "") WebElement CompositionReport;
}
