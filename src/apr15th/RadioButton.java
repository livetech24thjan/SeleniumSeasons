package apr15th;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class RadioButton {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms10.htm");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Test
	public void radioButtonTest() throws InterruptedException, IOException {
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	@Test
	public void toValidateCheeseOptionTest() throws InterruptedException, IOException {
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		WebElement element=driver.findElement(By.xpath("//input[@value='Cheese']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].click();", element);
		
		js.executeScript("arguments[0].click()", element);
		
		Thread.sleep(5000);
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

}
