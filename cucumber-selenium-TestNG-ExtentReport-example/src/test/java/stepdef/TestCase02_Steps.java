package stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static org.apache.commons.io.FileUtils.copyFile;

public class TestCase02_Steps {

    private WebDriver driver;

    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;

    public static int valid = 0;
    public static int noUsed = 0;
    public static int broken = 0;



    @Given("^an user need to access a web browser$")
    public void an_user_need_to_access_a_web_browser() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        //driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/V1/index.php");
        // Capture Screenshot ==============================================
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC2_Stp01.01.png"));
        // Capture Screenshot ==============================================
        driver.findElement(By.name("uid")).sendKeys("mgr123");
        // Capture Screenshot ==============================================
        ts = (TakesScreenshot) driver;
        file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC2_Stp01.02.png"));
        // Capture Screenshot ==============================================
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("mgr!23");
        // Capture Screenshot ==============================================
        ts = (TakesScreenshot) driver;
        file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC2_Stp01.03.png"));
        // Capture Screenshot ==============================================
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Keys.ENTER);
        WebElement element = driver.findElement(By.className("barone"));
        String texto = element.getText();
        //assertTrue(texto, element.isDisplayed());

        System.out.println(texto);
        // Capture Screenshot ==============================================
        ts = (TakesScreenshot) driver;
        file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC2_Stp01.04.png"));
        // Capture Screenshot ==============================================

    }

    @When("^is opened$")
    public void is_opened()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^check if exist any broken link$")
    public void check_if_exist_any_broken_link() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){

            url = it.next().getAttribute("href");

            //System.out.println(url);

            if(url == null || url.isEmpty()){
                //System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if(!url.startsWith("http://demo.guru99.com/")){
                //System.out.println("URL belongs to another domain, skipping it.");
                noUsed++;
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
                }
                else{
                    System.out.println(url+" is a valid link");
                    valid++;
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


            System.out.println("Total of valid links: " + valid);
            System.out.println("Total of no Used links: " + noUsed);
            System.out.println("Total of broken links: " + broken);

            // Capture Screenshot ==============================================
            TakesScreenshot ts = (TakesScreenshot) driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
            copyFile(file, new File("./Screenshots/TC2_Stp03.png"));
            // Capture Screenshot ==============================================

            driver.quit();

                                }

    }



