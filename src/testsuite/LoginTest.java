package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowser(){
        setUpBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
// Enter “Admin” username
      sendTextToElement((By.id("txtUsername")),"Admin");
// Enter “admin123 password
        sendTextToElement((By.id("txtPassword")),"admin123");
//* Click on ‘LOGIN’ button
      clickOnElement((By.id("btnLogin")));
// Verify the ‘Welcome’ text is display
        String actualMessage = getTextFromElement((By.id("welcome"))).substring(0,7);
        String expectedMessage = "Welcome";
        Assert.assertEquals(expectedMessage,actualMessage);


    }
    @After
    public void quitBrowser(){
        closeBrowser();
    }
}
