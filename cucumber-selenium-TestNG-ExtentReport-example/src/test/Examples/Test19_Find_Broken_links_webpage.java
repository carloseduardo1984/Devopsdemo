package TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test19_Find_Broken_links_webpage {

    private static int valid = 0;
    private static int broken = 0;
    //Code to Find the Broken links on a webpage


    public static void main(String[] args) {
        // TODO Auto-generated method stub


    	System.setProperty("webdriver.gecko.driver","D:\\firefoxWebDriver\\geckodriver.exe");  
        WebDriver driver = new FirefoxDriver();	
   	
        
        String homePage = "http://demo.guru99.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
               
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
            System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                    broken++;
                    System.out.println(" Total broken links:"+broken);
                }
                else{
                    System.out.println(url+" is a valid link");
                    valid++;
                    System.out.println(" Total valid links:"+valid);

                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
	

}
