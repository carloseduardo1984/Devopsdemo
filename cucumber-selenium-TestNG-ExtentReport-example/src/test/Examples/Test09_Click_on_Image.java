package TestCases;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test09_Click_on_Image { //Click on Image

	public static void main(String[] args) {									
        String baseUrl = "https://www.guru99.com/click-on-image-in-selenium.html";					
     // declaration and instantiation of objects/variables		
     		System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
     		WebDriver driver = new FirefoxDriver();
     		driver.manage().window().maximize();						
        		
        driver.get(baseUrl);					
        //click on the "Facebook" logo on the upper left portion		
			driver.findElement(By.cssSelector("a[title=\"Guru99\"]")).click();					

			//verify that we are now back on Facebook's homepage		
			if (driver.getTitle().equals("Guru99")) {							
            System.out.println("We are back at Guru homepage");					
        } else {			
            System.out.println("We are NOT in  homepage");					
        }		
				driver.close();		

    }		
	
}
