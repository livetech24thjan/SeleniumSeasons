package mar28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("datepick_in")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepick_in")).sendKeys("29/03/2024");
		
		driver.findElement(By.id("datepick_out")).clear();
		
		driver.findElement(By.id("datepick_out")).sendKeys("30/03/2024");
		
		System.out.println(driver.findElement(By.id("username_show")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("username_show")).getAttribute("href"));
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
