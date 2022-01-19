package pages;

import org.openqa.selenium.WebDriver;
import utils.Setup;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}

