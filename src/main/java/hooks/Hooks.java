package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends BaseClass {
    @Before
    public  void openBrowser(){
        driver= new ChromeDriver();
        //driver.get("www.eqaroloflow.co.za/wp/ ");
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
