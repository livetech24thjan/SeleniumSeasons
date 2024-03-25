package mar23rd;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\009LiveTech\\jars\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		new ChromeDriver();

	}

}
