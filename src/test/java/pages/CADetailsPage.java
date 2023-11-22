package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CADetailsPage {

    @FindBy(id = "form:j_id_4g_8u:j_id_4g_8w:branches:1:j_id_4g_97")
    private WebElement newRuleButton;

    private WebDriver driver;

    public CADetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }






}
