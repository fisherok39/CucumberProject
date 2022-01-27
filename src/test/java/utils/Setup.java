package utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import org.openqa.selenium.Platform;

public class Setup {

    protected static WebDriver driver;

    @Before
    public void setup() throws MalformedURLException  {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        DesiredCapabilities cap = new DesiredCapabilities();
        URL url = new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver(url, cap);
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void close() {
        driver.quit();
    }

}












