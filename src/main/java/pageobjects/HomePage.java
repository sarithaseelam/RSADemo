package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    By email = By.xpath("//input[@id='user_email']");
    By password = By.xpath("//input[@id='user_password']");
    By login = By.xpath("//input[@value='Log In']");

    public HomePage(WebDriver driver) {
            this.driver = driver;

    }

    public WebElement getEmail()
    {
        return driver.findElement(email);

    }
    public WebElement getPassword()
    {
        return driver.findElement(password);

    }
    public WebElement getLogin()
    {
        return driver.findElement(login);

    }
}
