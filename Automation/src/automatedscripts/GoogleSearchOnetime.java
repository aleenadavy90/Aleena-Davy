package automatedscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchOnetime {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch a firefox browser
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Tools\\Selenium\\gecko\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		//Go to google.com
        driver.get("https://www.google.com");
        
        //enter search term google                //webdriver has diff locator types - id, classnames, css selectors, xpath
        driver.findElement(By.id("lst-ib")).clear();          //clear - if there is a prefield in that field it will clear before entering anything
        driver.findElement(By.id("lst-ib")).sendKeys("google");      // to type the term google into that method use sendkeys and pass the search term
        
        //enter search button
        driver.findElement(By.name("btnG")).click();  
        
        Thread.sleep(2000);
        
        //check page title contains the search term
        String pageTitle = driver.getTitle();  //store it in a string
        System.out.println(pageTitle);
		
        boolean titleContainsTerm = pageTitle.contains("google");

	System.out.println(titleContainsTerm);
	
	driver.quit();
	}

}
