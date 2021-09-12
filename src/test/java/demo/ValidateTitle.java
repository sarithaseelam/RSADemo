package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LandingPage;
import resources.Base;

import java.io.IOException;


public class ValidateTitle extends Base {

    public WebDriver driver;
    public static Logger log = LogManager.getLogger(Base.class.getName());
    @BeforeTest
    public void initializeDriver() throws IOException {
        driver = initialize();
    }

    @Test
    public void validateTitle()
    {
        driver.get(prop.getProperty("url"));
        LandingPage lp = new LandingPage(driver);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(actualTitle,"RSA");

        log.info("Title validated successfully");

    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }

}
