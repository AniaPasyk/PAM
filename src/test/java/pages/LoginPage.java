package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "username:username:username")
    private WebElement userNameInput;

    @FindBy(id  ="password:password:password")
    private WebElement passwordInput;

    @FindBy(id= "j_id_16")
    private WebElement loginButton;

    private String userName = "pamt1";
    private String password = "SDS7knYaf%NN*Ji";
    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }




    public PricingPage logIn() {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new PricingPage(driver);
    }


    }

