package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
    WebDriver driver;
    String radioButtonLocator = "//input[@type='radio' and @value = '%s']/..";
    //input[@type='radio' and @value = '%s']/..
    String value;

    public RadioButton(WebDriver driver, String value) {
        this.driver = driver;
        this.value = value;
    }
    public void select(){
        driver.findElement(By.xpath(String.format(radioButtonLocator,this.value))).click();
    }
}
