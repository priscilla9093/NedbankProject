package pages;

import base.BaseClass;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage extends BaseClass {


    @Given("I login using {string} and {string}")
    public void i_login_using_and(String useName, String pass) {
        driver.findElement(By.xpath("//span[text()='My account']")).click();
        driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys(useName);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.name("login")).click();

        driver.findElement(By.xpath("//span[text()='Home']")).click();
        wait= new WebDriverWait(driver, Duration.ofSeconds(30));



            }

}
