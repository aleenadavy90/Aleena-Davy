package wdpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wdTestScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver;              // instantiate firefox browser
       System.setProperty("webdriver.gecko.driver","C:\\Tools\\Selenium\\gecko\\geckodriver.exe");
       driver = new FirefoxDriver();  //use ref variable of type webdriver to point to object
                                      // this will also launch firefox browser
      
       //go to google.com
       driver.get("https://www.google.com");                 //call get method on the driver object
       
       //perform a search using the term google  , we are going to use locater type id
       driver.findElement(By.id("lst-ib")).clear();  // good to clear input fields
       driver.findElement(By.id("lst-ib")).sendKeys("google");    //it inputs the search term in the input field
        
       
       // click on search button
       driver.findElement(By.name("btnG")).click();        //  locator type name
       
       //close the pop-up
       driver.findElement(By.linkText("×")).click();      // locator type link text
       
       //Click on options button
       Thread.sleep(2000);
       driver.findElement(By.className("ab_icon")).click();    // locator type class name
       
       //Click on Search help               // locator type link text
       driver.findElement(By.linkText("Search help")).click();
       
       //locator type partial link text
       //   driver.findElement(By.partialLinkText("Sign in")).click();
       
       
       // verify first help topic is expanded by default
       // using customized xpath 
     //go to the div tag of that section //"article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div"
       String attributeofFirstHelptopic = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("Style");                     
                                         
      
       
       System.out.println("attributeofFirstHelptopic: " +attributeofFirstHelptopic);   //should display 0px
       System.out.println("Hello");
       
       Thread.sleep(5000);
       //driver.quit();
       
	}

}
