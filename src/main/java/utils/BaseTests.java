package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.HomePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTests {



    private static WebDriver webDriver;
    protected static HomePage homePage;

    @BeforeClass
    public static void launchApplication(){
        setChromeDriverProperty();
        webDriver=new ChromeDriver();
        webDriver.get(PropertyLoader.loadProperty("application.url"));
        homePage = new HomePage(webDriver);

    }
    @AfterClass
    public static void closeBrowser(){

        webDriver.quit();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    private static void setChromeDriverProperty(){

        if (System.getProperty("os.name").contains("Windows")){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        }
        else{
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        }
    }


}
