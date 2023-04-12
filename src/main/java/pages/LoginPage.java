package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    private By usernamefield = By.id("username");
    private By passfield= By.id("password");
    private By loginButton = By.cssSelector("#login button");
    public  LoginPage(WebDriver _webdriver)
    {
        this.webDriver=_webdriver;

    }
    public void Setusername(String username)
    {
        webDriver.findElement(usernamefield).sendKeys(username);
    }
    public void setpassword(String pass)
    {
        webDriver.findElement(passfield).sendKeys(pass);
    }
    public SecureAreaPage loginbuttonclick()
    {
         webDriver.findElement(loginButton).click();
         return  new SecureAreaPage(webDriver);
    }
}
