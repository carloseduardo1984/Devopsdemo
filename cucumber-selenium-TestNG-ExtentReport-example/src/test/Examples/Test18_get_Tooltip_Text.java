package TestCases;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Test18_get_Tooltip_Text { //How to get Tooltip Text in Selenium Webdriver
	
	public static void main(String[] args) {									
	     
        String baseUrl = "http://demo.guru99.com/test/social-icon.html";					
        System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
 		WebDriver driver = new FirefoxDriver();					
        driver.get(baseUrl);					
        String expectedTooltip = "Github";	
        
        // Find the Github icon at the top right of the header		
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));	
        
        //get the value of the "title" attribute of the github icon		
        String actualTooltip = github.getAttribute("title");	
        
        //Assert the tooltip's value is as expected 		
        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }	
        
        //JQuery Plugin:
        baseUrl = "http://demo.guru99.com/test/tooltip.html";
        
        String expectedTooltip1 = "What's new in 3.2";					
        driver.get(baseUrl);					
        		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder1 = new Actions (driver);							

        builder1.clickAndHold().moveToElement(download);					
        builder1.moveToElement(download).build().perform(); 	
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip1 = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip1);							
        if(actualTooltip1.equals(expectedTooltip1)) {							
            System.out.println("Test Case Passed");					
        }	else {	System.out.println("Test Case Fail");}
        
        driver.close();			
   }		
	

}
