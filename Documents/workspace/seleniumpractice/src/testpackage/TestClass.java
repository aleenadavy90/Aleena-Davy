package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/Users/aleenadavy/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
		
	}

}
