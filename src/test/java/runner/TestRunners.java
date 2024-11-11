package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/AutomationTestside.feature",
        glue = {"hooks", "pages"},
        monochrome = true,
        publish = true,
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})
public class TestRunners extends AbstractTestNGCucumberTests {
}
