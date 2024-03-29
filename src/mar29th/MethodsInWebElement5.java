package mar29th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement5 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		//System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		//System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		//System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		
		//System.out.println(driver.findElement(By.id("username")).getRect().getX());
		//System.out.println(driver.findElement(By.id("username")).getRect().getY());
		//System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		//System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		
        System.out.println(driver.findElement(By.linkText("Sell on Amazon")).isDisplayed());
		
		driver.quit();
	}

}
