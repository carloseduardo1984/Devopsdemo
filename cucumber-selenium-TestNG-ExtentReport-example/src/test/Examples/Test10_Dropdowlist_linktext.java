package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Test10_Dropdowlist_linktext { //Dropdow list and link text
	
	public static void main(String[] args) { 
		System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
 		WebDriver driver = new FirefoxDriver();
 		driver.manage().window().maximize();
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		System.out.println("ANTARCTICA selected");	

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		System.out.println("BANANA selected");
		
		fruits.selectByIndex(2); // select 0 banana , 1 apple, 2 orange
		
		//link text
		
		 String baseUrl = "http://demo.guru99.com/test/link.html";					
	       	
	        		
	        driver.get(baseUrl);					
	        driver.findElement(By.linkText("click here")).click();					
	        System.out.println("title of page is: " + driver.getTitle());							


//	        driver.get(baseUrl);					
//	        driver.findElement(By.partialLinkText("here")).click();					
//	        System.out.println("Title of page is: " + driver.getTitle());		
	        
	        baseUrl = "http://demo.guru99.com/test/block.html";
	        driver.get(baseUrl);					
	        driver.findElement(By.partialLinkText("Inside")).click();					
	        System.out.println(driver.getTitle());					
	        driver.navigate().back();			
	        driver.findElement(By.partialLinkText("Outside")).click();					
	        System.out.println(driver.getTitle());
	       
		
		driver.close();	
 }
	

}
