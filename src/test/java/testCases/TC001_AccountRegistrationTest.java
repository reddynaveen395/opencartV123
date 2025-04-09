package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegristrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	 public void Verify_account_registration() 
	 {	 
		  logger.info("****Starting  TC001_AccountRegistrationTest   *****");
		   logger.debug("This is a debug log message");
		try 
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		   logger.info("** Clicked On My Account Link ***");
		
		hp.clickRegister();
		logger.info("Clicked On Register Link ");
		
		AccountRegristrationPage regpage = new AccountRegristrationPage(driver);
		
		logger.info(" Providing Customer Details ");
		
		    regpage.setFirstName(randomeString().toUpperCase());
		    regpage.setLastname(randomeString().toUpperCase());
		    regpage.setEmail(randomeString()+"@gmail.com");
		    regpage.setTelephone(randomeNumber());
		    
		             String password = randomeAlphaNumberic();
		             
		    regpage.setPassword(password);
		    regpage.setConfirmpswrd(password);
		    regpage.setPolicy();
		    regpage.clickContinue();
		  
		
                   logger.info("Validating expected message..");
		
		String confmsg = regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");

		   logger.info("Test passed");
		} 
		catch (Exception e)
		{
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} 
		finally 
		{
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	 
		  
	 }  
		   
  }	    
		    
		    
		    
		    
	
	

	
	

