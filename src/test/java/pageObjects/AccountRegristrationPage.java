package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.BasePage;

public class AccountRegristrationPage extends BasePage {

	public AccountRegristrationPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txtconfirmpswrd;
	
	@FindBy(xpath="//input[@name='agree']") WebElement chkdpolicy;
	
     	@FindBy(xpath="//input[@value='Continue']") WebElement btnContinue;
     	
     	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
     	WebElement msgConfirmation;


	
	
	
	public void setFirstName(String fname) 
	{
		txtFirstname.sendKeys(fname);		
	}
	
	public void setLastname(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	 
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	
	public void setTelephone(String telephone)
	{
		txttelephone.sendKeys(telephone);
	}
	
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void setConfirmpswrd(String cnfrmpswrd)
	{
		txtconfirmpswrd.sendKeys(cnfrmpswrd);
	}
	
	public void setPolicy()
	{
		chkdpolicy.click();
	}
	
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}
}
	
   
