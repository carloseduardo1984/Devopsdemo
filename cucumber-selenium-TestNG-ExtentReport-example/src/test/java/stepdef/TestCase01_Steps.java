package stepdef;

import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

import static org.apache.commons.io.FileUtils.copyFile;

public class TestCase01_Steps {

     private WebDriver driver;

    String url = "https://www.stellaxius.com/";
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
        System.out.println("===========================START TESTS======================");
        System.out.println("Feature 1- step 1 - Open Bank page");

        System.out.println("Feature 1- step 2 - Take screenshot Bank page");
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


        System.out.println("Feature 1- step 3 - Login validation");

        System.out.println("Feature 1- step 4 - Take screenshot of the Login validation");
        // Capture Screenshot ==============================================
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC1_Stp02.png"));
        // Capture Screenshot ==============================================
        System.out.println("O CARLOS É UMA BOA OPCAO DE TESTER - AMA QA E ADORA TRABALHAR EM EQUIPE");
        System.out.println("AGILE É UMA PRATICA QUE ELE JA UTILIZA COMO GUIA...");
        System.out.println("ELE PSSUI CERTIFICACAO CTFL COMO AGILE TESTER E DIVERSOS GO-LIVES");
        System.out.println("VAMOS CONVERSAR MAIS? O BOM DIALOGO SEMPRE SERA BEM VINDO!");
        System.out.println("OBRIGADO PELA EXCELENTE DEMO!!!!!!");

    }

    @Then("^the results are the login process with success$")
    public void the_results_are_the_login_process_with_success() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Keys.ENTER);

        System.out.println("Feature 1- step 5 - After Login validation check assert and validation features");
        // Capture Screenshot ==============================================
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("./Screenshots/TC1_Stp03.png"));
        // Capture Screenshot ==============================================

        System.out.println("Feature 1- step 6 - Code Snippet for assertEquals() in Selenium");
        driver.navigate().to("https://www.browserstack.com/");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        Assert.assertEquals(ExpectedTitle, ActualTitle);

        System.out.println("Feature 1- step 7 - Example of Soft Assert in Selenium (or Verify in Selenium)");
        SoftAssert softAssert = new SoftAssert();
        driver.navigate().to("https://www.browserstack.com/");
        String getActualTitle = driver.getTitle();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");

        System.out.println("==========================================================");

        driver.quit();
    }


}
