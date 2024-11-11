package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/AutomationTestside.feature",
            glue = {"hooks","pages"},
        monochrome = true,
        publish = true)
public class TestRunners extends AbstractTestNGCucumberTests{
}
