package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
    public static WebDriver driver;
    public static WebDriverWait wait;
    
    @Before
    public void setup() {
    	
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    public static WebDriver getDriver() {
        return driver;
    }
    
    public static WebDriverWait getWait() {
        return wait;
    }
}
