package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.Basepage;

public class Homepage extends Basepage {
	
	
//Below constructor for all pages to be used by extending Basepage
//Purpose is to avoid ripitation of logics used in constructor..
	
	public Homepage(WebDriver driver) 
	{
		super(driver);
		
	}
	
//whatever element in Homepage of application that individual method
//that individual locators have to write below...
	
 @FindBy(xpath="//a[@title='My Account']")
 WebElement lnkMyaccount;	
	
 @FindBy(xpath="//a[normalize-space()='Register']")
 WebElement lnkRegister;
	
 @FindBy(xpath="//a[normalize-space()='Login']")
 WebElement lnkLogin;

 @FindBy(xpath="//a[normalize-space()='Desktops']")
 WebElement lnkDesktop;
 
 @FindBy(xpath="//input[@placeholder='Search']")
 WebElement lnkSearchbox;
 
 @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
 WebElement lnkSearchbutton;
 
 @FindBy(xpath="//a[normalize-space()='Contact Us']")
 WebElement lnkContactUs;
 //whatever element in Homepage of application that individual method 
 //have to write below..
 
 public void clickDesktop() {
	 
	 lnkDesktop.click();
 }
 
 public void clickMyAccount() {
	 
	 lnkMyaccount.click();
 }
 
 public void clickMyRegister() {
	 
	 lnkRegister.click();
 }
 
 public void clickLogin() {
	 
	 lnkLogin.click();
 }
 
 public void enterSearchDetails(String msg) {
	 
	 lnkSearchbox.sendKeys(msg);
 }
 
 public void clickSearchbutton() {
	 
	 lnkSearchbutton.click();
 }
 
 public void clickContactUs() {
	 
	 lnkContactUs.click();
 }
}
