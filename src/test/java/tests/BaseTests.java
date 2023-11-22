package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    protected WebDriver driver;
    protected Logger log = LogManager.getLogger();

    private String pageUrl = "https://pam-uat.roche.com/prm/security/login.xhtml";

    @BeforeMethod
    public void openUrl() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        log.info("Opening page" + pageUrl);
        driver.get(pageUrl);
        log.info("Page opened");

    }
}

   // public String getPageUrl() {
    //    return this.pageUrl;

  //  }
    /*@AfterMethod
    public void tearDown() {
        driver.quit();
    } */

  //  }

