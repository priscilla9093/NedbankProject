package pages;

import base.BaseClass;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PrintOderNum extends BaseClass {


    @Then("Select Place your order and print the order number")
    public void select_place_your_order_and_print_the_order_number() {
        wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("place_order")));
        driver.findElement(By.xpath("//button[@id='place_order']")).click();
        driver.findElement(By.xpath("//button[@id='place_order']")).click();
        wait= new WebDriverWait(driver, Duration.ofSeconds(30));

        String OderNumber=driver.findElement(By.xpath("//li[@class='woocommerce-order-overview__order order']/strong")).getText();
        System.out.println("Validating the OrderNum "+ OderNumber);

    }

}
