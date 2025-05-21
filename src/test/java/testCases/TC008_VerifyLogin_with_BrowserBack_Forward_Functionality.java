package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import pageObject.LoginPage;

public class TC008_VerifyLogin_with_BrowserBack_Forward_Functionality extends BaseClass{

	@Test(groups="sanity")
	public void test_VerifyLoginWhenPressing_Browser_BackandForward() throws InterruptedException {
		
		Homepage hp=new Homepage(driver);
		hp.clickMyAccount();
		
		MyAccountPage ma=new MyAccountPage(driver);
		ma.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmailAddress(pro.getProperty("username"));
		lp.setPassword(pro.getProperty("password"));
		lp.clickLogin();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		Boolean text=ma.isMyAccounttextdisplayed();
		Assert.assertTrue(text);
		
		
		ma.clickLogout();
		Thread.sleep(2000);
		ma.clickContinue();
	}
}
