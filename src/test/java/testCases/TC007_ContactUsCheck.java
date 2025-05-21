package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pageObject.ContactUsPage;
import pageObject.Homepage;
import testBase.BaseClass;
import utilities.DataProviderss;

public class TC007_ContactUsCheck extends BaseClass {

	@Test(dataProvider="contactUS",groups= {"datadriven"},dataProviderClass=DataProviderss.class)
	public void tc007_ContactUscheck(String name,String email,String Enquiry) throws Exception {
		
		Homepage hp=new Homepage(driver);
		hp.clickContactUs();
		
		Thread.sleep(3000);		
		ContactUsPage cp=new ContactUsPage(driver);
		cp.enterYourName(name);
		cp.enterEmail(email);
		cp.entertxtEnquiry(Enquiry);
		
		explitwait.until(ExpectedConditions.elementToBeClickable(cp.clickSubmit())).click();

		explitwait.until(ExpectedConditions.elementToBeClickable(cp.clickContinue())).click();
	}
	
}
