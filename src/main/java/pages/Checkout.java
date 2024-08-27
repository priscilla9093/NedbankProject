package pages;

import base.BaseClass;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout extends BaseClass {
    @And("I Select Check out")
    public void i_select_check_out() {

        wait= new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='wc-proceed-to-checkout']/a")));
        driver.findElement(By.xpath("//div[@class='wc-proceed-to-checkout']/a")).click();
    }

}
