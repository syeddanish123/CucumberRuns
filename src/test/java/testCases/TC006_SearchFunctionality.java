package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.searchPage_Iphone;
import testBase.BaseClass;

public class TC006_SearchFunctionality extends BaseClass {

	@Test(groups= {"sanity"})
	public void search_Functionality() throws Exception
	{
		logger.info("-------------TC006 Started----------------");
		
		Homepage hp=new Homepage(driver);
		logger.info("Enterinhg Data to TextBox");
		hp.enterSearchDetails("iphone");
		hp.clickSearchbutton();
		logger.info("Successfully Enter the Data to TextBox");
		searchPage_Iphone sp=new searchPage_Iphone(driver);
		String msg=sp.verifyphone();
		logger.info("Verifying the Data enter");
		Thread.sleep(4000);
		if(msg.equalsIgnoreCase("iphone"))
		{
			logger.info("Data Match");
			Assert.assertTrue(true);
		}
		else
		{
			logger.warn("Verification Failed Test Case Got Failed");
			logger.trace("TC006_SearchFunctionality Failed..");
			Assert.fail();
		}
	}
	
}
