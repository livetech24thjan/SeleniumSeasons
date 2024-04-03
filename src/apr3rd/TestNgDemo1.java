package apr3rd;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo1 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Start broswer ..");
		System.out.println("Launch application..");
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("Close browser");
	}
	
	
	@Test(priority=2)
	public void loginTest()
	{
		
		System.out.println("Enter crdentials ...");
		System.out.println("Click login ..");
		Assert.assertTrue(true);
		System.out.println("Login successfull ...");
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("Enter registration details ...");
		System.out.println("Click register ..");
		System.out.println("Registration successfull ...");
		
	}
	
	@Test(priority=3)
	public void forgotPasswordTest()
	{
		
		System.out.println("Enter email ...");
		System.out.println("Click forgot ..");
		System.out.println("Forgot password successfull ...");
		
	}

	@Test(priority=4,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Login to app ...");
		System.out.println("Click change password ..");
		System.out.println("Change password successfull ...");
		
	}


}
