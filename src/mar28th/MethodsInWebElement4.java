package mar28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.name("option2")).getAttribute("checked"));
		
		driver.quit();

	}

}
