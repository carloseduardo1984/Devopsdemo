package stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

import static org.apache.commons.io.FileUtils.copyFile;

public class TestCase01_Steps {

     private WebDriver driver;

    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;

    public static int valid = 0;
    public static int noUsed = 0;
    public static int broken = 0;


    @Given("^an operational user of bank link page \"([^\"]*)\"$")
    public void an_operational_user_of_bank_link_page(String arg1) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
//        driver = new ChromeDriver(options);
        driver = new ChromeDriver();

        driver.get(arg1);

        // Capture Screenshot ==============================================
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC1_Stp01.png"));
        // Capture Screenshot ==============================================
    }

    @When("^you insert the SOEID \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void you_insert_the_SOEID_and_password(String arg1, String arg2) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("uid")).sendKeys(arg1);

        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(arg2);

        // Capture Screenshot ==============================================
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC1_Stp02.png"));
        // Capture Screenshot ==============================================
    }

    @Then("^the results are the login process with success$")
    public void the_results_are_the_login_process_with_success() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Keys.ENTER);

        // Capture Screenshot ==============================================
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC1_Stp03.png"));
        // Capture Screenshot ==============================================

        driver.quit();
    }


}
