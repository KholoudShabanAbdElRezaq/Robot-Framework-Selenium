package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver webDriver;
    private By alert=By.id("flash");
    public  SecureAreaPage(WebDriver _webdriver)
    {
     this.webDriver=_webdriver;
    }
    public String getAlert()
    {
        return  webDriver.findElement(alert).getText();
    }

}
