package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import utilities.RandomStringUtility;

public class Temp {

	WebDriver driver;
	
	@Test
	void m1() {
		
		String otpt=RandomStringUtility.getnumericalphabetic(6);
		System.out.println(otpt);
	    
	}
	
}
