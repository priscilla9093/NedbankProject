package pages;

import base.BaseClass;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class AddToCart extends BaseClass {

    @And("I Order a HP Smart Tank")
    public void i_order_a_hp_smart_tank() {
   driver.findElement(By.xpath("(//h2[text()='HP Smart Tank 670 Duplex']/parent::a/parent::li/a[2])[1]")).click();
    }


}
