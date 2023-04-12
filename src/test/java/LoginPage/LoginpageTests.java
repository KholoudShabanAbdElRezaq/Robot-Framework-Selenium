package LoginPage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;


public class LoginpageTests extends BaseTests {
    @Test
    public  void testsuccessfulltest()
    {
       LoginPage loginPage= homePage.clickformAuthenticationlink();
       loginPage.Setusername("tomsmith");
       loginPage.setpassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage=loginPage.loginbuttonclick();
        assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!")
                 , "Alert is error") ;
    }

}
