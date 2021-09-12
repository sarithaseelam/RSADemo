package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;
    By login = By.xpath("//a[contains(text(),'Login')]");

    public LandingPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public HomePage getLogin()
    {
        driver.findElement(login).click();
        HomePage hp = new HomePage(driver);
        return hp;

    }

}
