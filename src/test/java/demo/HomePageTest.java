package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LandingPage;
import resources.Base;


import java.io.IOException;


public class HomePageTest extends Base {

    public static Logger log = LogManager.getLogger(Base.class.getName());
    public WebDriver driver;
    @BeforeTest
    public void initializeDriver() throws IOException {
        driver = initialize();
        log.info("driver initializes successfully");
    }

    @Test
    public void basePageNavigation() {
        driver.get(prop.getProperty("url"));
        LandingPage lp = new LandingPage(driver);
        HomePage hp = lp.getLogin();
        hp.getEmail().sendKeys("abc@gmail.com");
        hp.getPassword().sendKeys("123456");
        hp.getLogin().click();
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }

}
