package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Api.feature",
        glue = "api",
        monochrome = true,
        publish = true)
public class ApiRunner extends AbstractTestNGCucumberTests {
}
