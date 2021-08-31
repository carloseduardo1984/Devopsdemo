package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test04_SwitchingBetweenPopupWindows { //Switching Between Pop-up Windows

    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
       
    }
}