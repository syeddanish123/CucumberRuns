package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ContactUsPage;
import pageObject.Homepage;

public class StepDep2 {

	WebDriver driver;
	WebDriverWait wait;
	Homepage hp;
	ContactUsPage cp;

	@Given("User on Application Homepage")
	public void user_on_application_homepage() {

		driver=Hooks.getDriver();
		wait=Hooks.getWait();
	}
	
	
	@When("Click on ContactUs link")
	public void click_on_contact_us_link() {
		hp=new Homepage(driver);
		hp.clickContactUs();
	}
	
	
	@When("Enter yourname, email, Enquiry click on Continue button")
	public void enter_yourname_email_enquiry_click_on_continue_button() throws InterruptedException {

		cp=new ContactUsPage(driver);
		cp.enterYourName("Syed");
		Thread.sleep(3000);
		cp.enterEmail("syed89990@gmail.com");
		cp.entertxtEnquiry("this product are available..");
		wait.until(ExpectedConditions.elementToBeClickable(cp.clickSubmit())).click();

	}
	
	
	@Then("Contact US Text should be displayed.")
	public void contact_us_text_should_be_displayed() throws InterruptedException {

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(cp.clickContinue())).click();

	}

}
