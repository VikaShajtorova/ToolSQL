package tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class FormTest extends BaseTest{
    @Test
    public void fromPage(){
        formPage.open();

       assertTrue(formPage.isPageOpen());

       formPage.create();
       formPage.clickInput();
        System.out.println("gghfhfh");

    }
}
