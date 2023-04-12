package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver webDriver;
    protected HomePage homePage;
    @BeforeClass
    public  void Setup()
    {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        webDriver=new ChromeDriver(co);
        webDriver.manage().window().maximize();
        webDriver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(webDriver);

    }
    @AfterClass
    public  void teardown()
    {
        webDriver.quit();
    }


}
