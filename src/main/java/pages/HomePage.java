package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private WebDriver webDriver;

    private By formAuthenticationlink= By.linkText("Form Authentication");
    private By listt=By.tagName("a");

    public HomePage(WebDriver _webDriver)
    {
        this.webDriver=_webDriver;

    }
    public void getsize()
    {
        List<WebElement> list= webDriver.findElements(listt);
        System.out.println(list.size());

    }
    public LoginPage clickformAuthenticationlink()
    {
      webDriver.findElement(formAuthenticationlink).click();
      return new LoginPage(webDriver);
    }
}
