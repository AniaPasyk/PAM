package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CreateNewCA extends BaseTests {

    @Test
    public void createNewCA() {
        new LoginPage(driver)
                .logIn()
                .startNewArrangement()
                .fillScopeDefinition("TestAutomation","Herceptin")
                .goToCADetails();

    }

}
