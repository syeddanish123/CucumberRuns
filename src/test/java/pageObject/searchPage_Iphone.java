package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.Basepage;

public class searchPage_Iphone extends Basepage {

	
	public searchPage_Iphone(WebDriver driver) {
		
		super(driver);
	}
	
@FindBy(xpath="//a[normalize-space()='iPhone']")
WebElement linkiphone;

public String verifyphone() {
	
	return linkiphone.getText();
	
}
}
