package mar29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(element);
		
		//s1.selectByIndex(11);
		
		//s1.selectByValue("search-alias=dvd");
		
		s1.selectByVisibleText("Luggage & Bags");
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
