/*** @author CEO ***/
package runner;

import com.cucumber.listener.Reporter;
import org.testng.annotations.*;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features={"src//test//java//features"}, glue={"stepdef"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber-reports/Automated_TestReport.html" },
        monochrome = true)

@Test
public class RunTest extends AbstractTestNGCucumberTests{

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(".\\extent-config.xml");
    }

}
