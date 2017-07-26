package automatedscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchThreetime {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch a firefox browser
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Tools\\Selenium\\gecko\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		//Go to google.com
        driver.get("https://www.google.com");
        
        //search for "google", "Selenium", and "Automation" and click on the
        //search button after entering the terms
        //webdriver has diff locator types - id, classnames, css selectors, xpath
      WebElement searchBox = driver.findElement(By.id("lst-ib")); //give ref variable 
        
      WebElement searchButton = driver.findElement(By.name("btnG"));
      
      String searchTerms[] = {"google", "selenium", "automation"};
      
      String pageTitle = "";
      boolean titleContainsTerm = false;
      
      for(int i = 0; i< searchTerms.length ; i++)
      {
    	  searchBox.clear();
          searchBox.sendKeys(searchTerms[i]);
          
          searchButton.click();
          
          Thread.sleep(2000);
          
          //check page title contains the search term
          pageTitle = driver.getTitle();  //store it in a string
        
  		
          titleContainsTerm = pageTitle.contains(searchTerms[i]);

  	        if(pageTitle.contains(searchTerms[i])) {
  	        	System.out.println("Page title: "+pageTitle);
  	        	System.out.println("Search term: "+ searchTerms[i]);
  	        	System.out.println("Page title contains the search term");
  	        	System.out.println();
  	        	
  	        	}
  	        else {
  	        	System.out.println("Page title: "+pageTitle);
  	        	System.out.println("Search term: "+ searchTerms[i]);
  	        	System.out.println("Page title contains the search term");
  	        	System.out.println();
  	        }
      }
      
  	driver.quit();
       
        
      
	}

}
