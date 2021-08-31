package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoAlertPresentException;	



//Handling Alert in Selenium Webdriver using above scenario
public class Test13_Hand_Alert { 

	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
 		WebDriver driver = new FirefoxDriver();
 		driver.manage().window().maximize();
	
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
      
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(500);
        		
        // Accepting alert		
        driver.switchTo().alert().accept();	
        
        driver.close();
    }	
	

}
