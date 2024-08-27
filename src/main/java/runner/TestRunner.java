package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/AutomationTestside.feature",
            tags = "@testing",
            glue = {"hooks","pages"},
            monochrome = true,
//        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "html:target/cucumber-reports/reports.html"
//                 },

        publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
