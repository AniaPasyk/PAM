package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingPage {

    @FindBy(xpath="//div[@class='col-md-4 text-right']//a[2]")
    private WebElement addArrangementButton;

    private WebDriver driver;

    public PricingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public NewArrangementScopePage startNewArrangement() {
        addArrangementButton.click();
        return new NewArrangementScopePage(driver);
    }



}
