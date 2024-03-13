package SDA.homeworks.day15;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D15HW02 extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username incorrectUser into Username field.
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("studentt1");
        //Type password Password123 into Password field.
        WebElement password = driver.findElement(By.id("password"));
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

        password.sendKeys("Password123" + Keys.ENTER);
        //        Click Submit button.
        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

//        Verify error message is displayed.
        Thread.sleep(2000);
        WebElement errormess = driver.findElement(By.id("error"));
        sa.assertTrue(errormess.isDisplayed());
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

//        Verify error message text is Your username is invalid!
        WebElement text = driver.findElement(By.xpath("//*[text()='Your username is invalid!']"));
        String m = text.getText();
        // String ex= "Your username is invalid!";
        sa.assertTrue(m.contains("invalid"));
        sa.assertAll();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

    }
}
