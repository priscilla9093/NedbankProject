package pages;

import base.BaseClass;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends BaseClass {


    @Given("I am on Demo web shop page and I register personal details {string} {string} {string} {string} {string} {string}")
    public void i_am_on_demo_web_shop_page_and_i_register_personal_details(String gender, String fname, String lname, String email, String pass, String pass2) {

        driver.findElement(By.linkText("Register")).click();

        try {
            if (gender.equalsIgnoreCase("male")) {
                driver.findElement(By.id("gender-male")).click();

            } else
                driver.findElement(By.id("gender-female")).click();
        } catch (Exception e) {
            System.out.println("gender not selected" + e);

        }

        driver.findElement(By.id("FirstName")).sendKeys(fname);
        driver.findElement(By.id("LastName")).sendKeys(lname);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(pass);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(pass2);
        driver.findElement(By.name("register-button")).click();
        driver.findElement(By.cssSelector("input[value=Continue]")).click();;
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/computers']"))).click();
    List<WebElement> list= driver.findElements(By.xpath("//ul[@class='sublist firstLevel']/li"));
    for(WebElement elem:list){
        if(elem.equals("Desktops")){
            elem.click();
        }
    }


    }}
