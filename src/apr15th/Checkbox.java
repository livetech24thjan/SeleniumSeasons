package apr15th;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class Checkbox {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms09.htm");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Test(priority = 1,enabled=false)
	public void checkBoxTest() throws InterruptedException, IOException {
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	@Test(priority = 2,enabled=false)
	public void checkBoxNoneSelectedTest() throws InterruptedException, IOException {
		
		WebElement element=driver.findElement(By.xpath("//input[@value='Butter']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].click();", element);
		
		js.executeScript("arguments[0].click()", element);
		
		Thread.sleep(5000);
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	
	@Test(priority = 3)
	public void checkBoxAllSelectedTest() throws InterruptedException, IOException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
			
		
		List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		
		for(int i=0;i<allCheckBoxes.size();i++)
		{
			if(!allCheckBoxes.get(i).isSelected())
			{
				allCheckBoxes.get(i).click();
				Thread.sleep(5000);
			}
		}
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

}
