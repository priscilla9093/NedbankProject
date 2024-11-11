package pages;

import base.BaseClass;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage extends BaseClass {

//li[text()='The specified email already exists']

    @Given("I login using my Login Details {string} {string}")
    public void i_login_using_my_login_details(String email , String Password) {
      if(driver.findElement(By.xpath("//li[text()='The specified email already exists']")).isDisplayed()){
          driver.findElement(By.linkText("Log in")).click();
      }
      else{
          driver.findElement(By.linkText("Log out")).click();
      }
        driver.findElement(By.name("Email")).isDisplayed();
        driver.findElement(By.name("Email")).isEnabled();
      driver.findElement(By.name("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).sendKeys(email);
        driver.findElement(By.xpath("(//input[@value='Log in'])")).click();
    }

}
