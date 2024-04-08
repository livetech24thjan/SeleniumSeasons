package apr8th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWaitDemo1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		 driver=new ChromeDriver();
		 
		 driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 	 
	}
	
	@Test
	public void waitsTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='2']")).click();
		
		driver.findElement(By.xpath("//span[text()='+']")).click();
		
		driver.findElement(By.xpath("//span[text()='3']")).click();
		
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		//WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		FluentWait<WebDriver> myWait=new FluentWait<WebDriver>(driver);
		
		myWait.withTimeout(Duration.ofSeconds(20))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(NoSuchElementException.class);
		
		myWait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']"))));
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='screen']")).getText(), "5");
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}


}
