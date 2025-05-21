package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class Steps {

    public WebDriver driver;
	public Homepage hp;
	public LoginPage lp;
    public MyAccountPage mp;
	
	@Given("user open url {string}")
	public void user_open_url(String url) {
	    
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@When("clicked on MyAccount Dropdown")
	public void clicked_on_my_account_dropdown() {
	    
		hp=new Homepage(driver);
		hp.clickMyAccount();
	
	}

	@When("Click on Login")
	public void click_on_login() {
	    
		hp.clickLogin();
	}

	@When("Enter Email Address {string} and Password {string}")
	public void enter_email_address_and_password(String email,String Password) {
	   
		lp=new LoginPage(driver);
		lp.setEmailAddress(email);
		lp.setPassword(Password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    
		lp.clickLogin();
	}

	@Then("MyAccount Page should be displayed")
	public void my_account_page_should_be_displayed() {
	    
		mp=new MyAccountPage(driver);
		
		Boolean msg=mp.isMyAccounttextdisplayed();
		if(msg==true)
		{
			Assert.assertTrue(true);
		}
		else
			Assert.fail();
	}

	
}
