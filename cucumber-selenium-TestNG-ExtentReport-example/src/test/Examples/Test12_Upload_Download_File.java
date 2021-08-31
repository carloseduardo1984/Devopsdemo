package TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test12_Upload_Download_File { //How to Upload & Download a File
	
	
		 public static void main(String[] args) {
			 
			    System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
		 		WebDriver driver = new FirefoxDriver();
		 		driver.manage().window().maximize();
		        String baseUrl = "http://demo.guru99.com/test/upload/";
		        

		        driver.get(baseUrl);
		        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		        // enter the file path onto the file-selection input field
		        uploadElement.sendKeys("D:\\new 3.txt");

		        // check the "I accept the terms of service" check box
		        driver.findElement(By.id("terms")).click();

		        // click the "UploadFile" button
		        driver.findElement(By.name("send")).click();
		        
		      //	
									
	            System.out.println("done");					
	            
		        }

}
