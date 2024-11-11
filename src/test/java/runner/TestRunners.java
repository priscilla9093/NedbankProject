package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/main/resources/AutomationTestside.feature",
//            glue = {"hooks","pages"},
//            monochrome = true,
        //plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
          //      "html:target/cucumber-reports/reports.html"
          //       },

 //       publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
