package SDA.homeworks.day16;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HW02 extends TestBase {
    //Test Case2: Parametrizes Positive Login Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username student into Username field
    //Type password Password123 into Password field
    //Click Submit button.
    //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    //You should execute this test with xml file (edited)
    @Test
    @Parameters({"username", "password"})
    public void test1(String user, String pass) {
        driver.get(" https://practicetestautomation.com/practice-test-login/");
        // Soft assertion
        SoftAssert sa = new SoftAssert();
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123" + Keys.ENTER);

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
        System.out.println("The username is :" + user);
        System.out.println("The Password is :" + pass);

        String acurl = "https://practicetestautomation.com/logged-in-successfully/";
        String expeurl = driver.getCurrentUrl();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        WebElement text = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
        String title = driver.getTitle();
        String title2 = "Logged In Successfully";
        sa.assertTrue(title.contains("Successfully"));
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //Verify button Log out is displayed on the new page.
        WebElement logout = driver.findElement(By.xpath("//*[text()='Log out']"));
        sa.assertTrue(logout.isDisplayed());
        sa.assertAll();
        driver.quit();
    }

    @Parameters({"username", "password"})
    @Test
    public void test2(String Username, String Password) throws InterruptedException {
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
        password.sendKeys("Password123" + Keys.ENTER);
        //        Click Submit button.
        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        Thread.sleep(2000);
        WebElement errormess = driver.findElement(By.id("error"));
        sa.assertTrue(errormess.isDisplayed());
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        WebElement text = driver.findElement(By.xpath("//*[text()='Your username is invalid!']"));
        String m = text.getText();
        // String ex= "Your username is invalid!";
        sa.assertTrue(m.contains("invalid"));
        sa.assertAll();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        System.out.println("The username is :" + Username);
        System.out.println("Your username is invalid!");
        System.out.println("The Password is :" + Password);
        driver.quit();
    }

}
