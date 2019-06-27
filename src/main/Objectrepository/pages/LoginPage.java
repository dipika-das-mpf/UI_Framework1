package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username") WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]") WebElement password;
    @FindBy(xpath = "//*[@id=\"submit\"]") WebElement Login;



   public WebElement username(){

       return username;

   }

   public WebElement password(){

       return password;
   }

    public WebElement Login(){

        return Login;
    }
}
