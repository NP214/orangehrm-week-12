package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowser(){
        setUpBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
// click on the ‘Forgot your password’ link
       clickOnElement((By.linkText("Forgot your password?")));
// Verify the text ‘Forgot Your Password?
       verifyTextWithAssert("Forgot Your Password?",By.xpath(("//h1[contains(text(),'Forgot Your Password?')]")),"text not displayed");

    }
    @After
    public void quitBrowser(){
        closeBrowser();
    }
}
