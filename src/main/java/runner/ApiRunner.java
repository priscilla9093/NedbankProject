package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/Api.feature",
        glue = "api",
        monochrome = true,
        publish = true)
public class ApiRunner extends AbstractTestNGCucumberTests {
}
