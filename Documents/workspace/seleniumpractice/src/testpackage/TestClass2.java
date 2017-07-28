package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass2 {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/Users/aleenadavy/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.yahoo.com";
		
		driver.get(baseURL);
		
	}

}
