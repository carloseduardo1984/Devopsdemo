package TestCases;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;		
import java.util.concurrent.TimeUnit;		
import org.openqa.selenium.*;

public class Test20_getALL_Links_WebPage { // How to get ALL Links of a Web Page
	
	 public static void main(String[] args) {									
	        String baseUrl = "http://demo.guru99.com/test/newtours/";					
//	        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
//	        WebDriver driver = new ChromeDriver();	
	        System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
	        WebDriver driver = new FirefoxDriver();	
	        		
	        String underConsTitle = "Under Construction: Mercury Tours";					
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

				driver.get(baseUrl);					
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
	        String[] linkTexts = new String[linkElements.size()];							
				int					i = 0;					

				//extract the link texts of each link element		
				for (WebElement e : linkElements) {							
				linkTexts[i] = e.getText();							
				i++;			
	        }		
				System.out.println("Total links number are " + i );

				//test each link		
				for (String t : linkTexts) {							
				driver.findElement(By.linkText(t)).click();					
				if (driver.getTitle().equals(underConsTitle)) {							
	                System.out.println("\"" + t + "\""								
	                        + " is under construction.");			
	            } else {			
	                System.out.println("\"" + t + "\""								
	                        + " is working.");			
	            }		
				driver.navigate().back();			
	        }		
				driver.quit();			
	    }		

}
