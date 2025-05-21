package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    WebDriver driver;

    @Before
    public void setup() {
    	
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        DriverFactory.setDriver(driver);
    }
    
    @After
    public void tearDown() {
        DriverFactory.getDriver().quit();
    }
}
