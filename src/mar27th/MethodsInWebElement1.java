package mar27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//WebElement  e1=driver.findElement(By.id("username"));
		
		//e1.sendKeys("reyaz0806");
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		//Thread.sleep(5000);
		
		driver.findElement(By.id("login")).click();
		
		//Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
