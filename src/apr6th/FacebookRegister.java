package apr6th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookRegister {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
	}
	
	@Test
	public void facebookRegistrationTest() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("reyaz");
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}



}
