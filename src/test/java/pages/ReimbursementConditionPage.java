package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReimbursementConditionPage extends BasePage {

    @FindBy(xpath = "//button[@id='form:j_id_4g_1w_next']")
    private WebElement nextButton;

    private WebDriver driver;


    public ReimbursementConditionPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public CADetailsPage goToCADetails() {
        sleep(500);
        nextButton.click();
        return new CADetailsPage(driver);
    }



}
