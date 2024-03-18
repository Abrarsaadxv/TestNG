package SDA.homeworks.day16;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HW03 extends TestBase {
    @Parameters({"username", "password"})
    @Test
    public void test3(String Username, String Password) throws InterruptedException {
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
        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
        Thread.sleep(2000);
        WebElement errormess = driver.findElement(By.id("error"));
        sa.assertTrue(errormess.isDisplayed());
        WebElement text = driver.findElement(By.xpath("//*[text()='Your password is invalid!']"));
        String m = text.getText();
        sa.assertTrue(m.contains("invalid"));
        sa.assertAll();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        System.out.println("The username is :" + Username);
        System.out.println("Your password is invalid!");
        System.out.println("The Password is :" + Password);
        driver.quit();
    }
}
