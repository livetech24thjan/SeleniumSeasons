package apr2nd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
		
		List<WebElement>  allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of links in block : "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		driver.quit();

	}

}
