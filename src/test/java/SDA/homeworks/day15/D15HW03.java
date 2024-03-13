package SDA.homeworks.day15;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Test Case3: Negative Password Test
//Open page https://practicetestautomation.com/practice-test-login/
//Type username student into Username field.
//Type password incorrectPassword into Password field.
//Puch Submit button.
//Verify error message is displayed.
//Verify error message text is Your password is invalid!

public class D15HW03 extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
//Type username student into Username field.
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("student");
//Type password incorrectPassword into Password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password321" + Keys.ENTER);
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

        //        Click Submit button.
        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
//        Verify error message is displayed.
        Thread.sleep(2000);
        WebElement errormess = driver.findElement(By.id("error"));
        sa.assertTrue(errormess.isDisplayed());
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

//Verify error message text is Your password is invalid!

        WebElement text = driver.findElement(By.xpath("//*[text()='Your password is invalid!']"));
        String m = text.getText();
        sa.assertTrue(m.contains("invalid"));
        sa.assertAll();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**


    }
}

