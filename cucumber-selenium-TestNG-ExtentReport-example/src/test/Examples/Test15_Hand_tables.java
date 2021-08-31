package TestCases;

	
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test15_Hand_tables { //tables
	
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
		System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
 		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
	        System.out.println(innerText); 
	        
	        
	        //Using Attributes as Predicates
	        baseUrl = "http://demo.guru99.com/test/newtours/";
	    	
	    	driver.get(baseUrl);
	    	innerText = driver.findElement(By
	    		.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
	    		.getText(); 		
	    	System.out.println(innerText); 
	    	
	    	//Shortcut: Use Inspect Element for Accessing Tables in Selenium
	    	
	    	baseUrl = "http://demo.guru99.com/test/newtours/";

	    	driver.get(baseUrl);
	    	innerText = driver.findElement(By
	    		.xpath("//table/tbody/tr/td[2]"
	    		+ "//table/tbody/tr[4]/td/"
	    		+ "table/tbody/tr/td[2]/"
	    		+ "table/tbody/tr[2]/td[1]/"
	    		+ "table[2]/tbody/tr[3]/td[2]/font"))
	    		.getText(); 		
	    	System.out.println(innerText); 
	    	driver.quit();
	}

}
