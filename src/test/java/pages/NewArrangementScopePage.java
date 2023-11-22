package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.apache.commons.io.FileUtils.waitFor;

public class NewArrangementScopePage extends BasePage {

    @FindBy(id = "form:j_id_4g_21:f_name")
    private WebElement nameInput;

    @FindBy(id = "form:j_id_4g_2c:f_geographicalScopeType")
    private WebElement soldToScope;

    @FindBy(xpath = "//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")
    private WebElement intervalCheckbox;

    @FindBy(id = "form:product:product:f_product")
    private WebElement caProductSelect;

    @FindBy(xpath = "//button[@id='form:j_id_4g_1w_next']")
    private WebElement nextButton;

    @FindBy(id = "form:j_id_4g_5p:indication:f_indication")
    private WebElement indicationSelect;

    @FindBy(id = "form:j_id_4g_60:treatmentLine:f_treatmentLine")
    private WebElement treatmentLineSelect;

    @FindBy(id = "form:mutationStatus:mutationStatus:f_mutationStatus")
    private WebElement mutationStatusSelect;

    @FindBy(id = "form:drugCombination:drugCombination:f_drugCombination")
    private WebElement drugCombinationSelect;

    private WebDriver driver;
    WebDriverWait wait;


    public NewArrangementScopePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public ReimbursementConditionPage fillScopeDefinition(String name, String product) {
        nameInput.sendKeys(name);

        Select soldToSelect = new Select(soldToScope);
        soldToSelect.selectByValue("NATIONAL");
        intervalCheckbox.click();

        Select caProductSel = new Select(caProductSelect);
        caProductSel.selectByVisibleText(product);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
        sleep(500);
        nextButton.click();


        //zrobić asercje czy jesteśmy na reimbursement Concidtions

        return new ReimbursementConditionPage(driver);

    }




}

//
//    /**
//     * Click on element with given locator when its visible
//     */
//    protected void click(String WebElement) {
//        waitForVisibilityOf(, 5);
//        WebElement.click();
//    }
//
//    protected void waitForVisibilityOf(WebElement, Integer... timeOutInSeconds) {
//        int attempts = 0;
//
//        while (attempts < 2) {
//
//            try {
//                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
//                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
//
//                break;
//            } catch (StaleElementReferenceException e) {
//            }
//            attempts++;
//
//            /** Wait for specific ExpectedConditon for the given Duration */
//            public void waitFor (ExpectedCondition < WebElement > condition, Integer timeOutInSeconds){
//                timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
//                WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(timeOutInSeconds));
//                wait.until(condition);
//
//            }
//
//        }
//
//    }








