package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.Basepage;

public class ContactUsPage extends Basepage {

	public ContactUsPage(WebDriver driver) {
		
		super(driver);
	}
	
@FindBy(xpath="//input[@id='input-name']")
WebElement lnktxtYourName;
	
@FindBy(xpath="//input[@id='input-email']")
WebElement lnktxtEmail;

@FindBy(xpath="//textarea[@id='input-enquiry']")
WebElement lnktxtEnquiry;

@FindBy(xpath="//input[@value='Submit']")
WebElement lnkbtnSubmit;

@FindBy(linkText="Continue")
WebElement lnkbtnContinue;

public void enterYourName(String name) {
	
	lnktxtYourName.sendKeys(name);
}

public void enterEmail(String email) {
	
	lnktxtEmail.sendKeys(email);
}

public void entertxtEnquiry(String email) {
	
	lnktxtEnquiry.sendKeys(email);
}

public WebElement clickSubmit() {
	
	return lnkbtnSubmit;
}

public WebElement clickContinue() {
	
	return lnkbtnContinue;
	
}

}
