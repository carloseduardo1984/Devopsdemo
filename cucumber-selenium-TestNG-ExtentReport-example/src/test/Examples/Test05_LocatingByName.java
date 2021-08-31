package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test05_LocatingByName { //Locating by Name
	
	public static void main(String[] args) { // Found elements by id
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();
		System.out.println("Click");
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
		
		System.out.println("Button Checked");

		}

}
