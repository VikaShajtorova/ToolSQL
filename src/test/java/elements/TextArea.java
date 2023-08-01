package elements;

import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String textAreaLocator = "currentAddress";
    String id;


    public TextArea(WebDriver driver) {
        this.driver = driver;
    }
}
