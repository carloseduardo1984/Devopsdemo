package TestCases;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;


public class Test14_Handling_Multiple_windows { //Handling multiple windows in Selenium webdriver using above scenario.

	public static void main(String[] args) throws InterruptedException {									
    	
		System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
 		WebDriver driver = new FirefoxDriver();
 					
    		
    //Launching the site.				
        driver.get("http://demo.guru99.com/popup.php");			
    driver.manage().window().maximize();		
            		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
    		
    String MainWindow=driver.getWindowHandle();		
    		
    // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
        // Switching to Child window
        driver.switchTo().window(ChildWindow);	
        Thread.sleep(500);
        System.out.println(ChildWindow); 
        
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys("gaurav.3n@gmail.com");   
        
        System.out.println("Email sent");
                
         driver.findElement(By.name("btnLogin")).click();			
                             
		// Closing the Child Window.
        driver.close();		
        }		
    }		
    // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);	
        
       // driver.close();
}
	
	
}
