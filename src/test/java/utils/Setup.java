package utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Setup {
    private  WebDriver driver;

    @Before
    private void setWebDriver() {

        String browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
      //  C:\Users\ANDRE\IdeaProjects\CucumberProject\src\test\resources\driver
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;
        }
    }
    public WebDriver getDriver(){
        if(driver==null){
            setWebDriver();
        }
        return driver;
    }

    @After
    public void close() {
        driver.quit();
    }

}











