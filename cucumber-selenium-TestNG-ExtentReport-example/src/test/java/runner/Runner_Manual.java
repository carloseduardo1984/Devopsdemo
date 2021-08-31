/*** @author CEO ***/
package runner;

import com.cucumber.listener.Reporter;
import org.testng.annotations.*;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features={"src//test//java//features"}, glue={"stepdef"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber-reports/Manual_TestReport.html" },
        monochrome = true,
        tags ={"@TestCase02"})

        //Setup by Tags on Feature Files

@Test
public class Runner_Manual extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(".\\extent-config.xml");
    }



}

