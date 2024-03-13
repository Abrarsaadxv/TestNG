package SDA.homeworks.day15;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D15HW1 {

    WebDriver driver = new ChromeDriver();
    @Test
    public void test() {
        driver.get(" https://practicetestautomation.com/practice-test-login/");
//Type username student into Username field
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("student");
        //Type password Password123 into Password field

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123" + Keys.ENTER);

//Click Submit button.
        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully
        String acurl = "https://practicetestautomation.com/logged-in-successfully/";
        String expeurl = driver.getCurrentUrl();
        Assert.assertEquals(acurl, expeurl, " True ");
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement text = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
        String title = driver.getTitle();
        String title2 = "Successfully";
        Assert.assertTrue(title.contains("Successfully"));
        //Verify button Log out is displayed on the new page.
        WebElement logout = driver.findElement(By.xpath("//*[text()='Log out']"));
        Assert.assertTrue(logout.isDisplayed());
    }


    @Test
    public void test2() {
        driver.get(" https://practicetestautomation.com/practice-test-login/");
        // Soft assertion
        SoftAssert sa = new SoftAssert();
        //Type username student into Username field
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("student");
        //Type password Password123 into Password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123" + Keys.ENTER);
        //Click Submit button.
        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully
        String acurl = "https://practicetestautomation.com/logged-in-successfully/";
        String expeurl = driver.getCurrentUrl();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement text = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
        String title = driver.getTitle();
        String title2 = "Logged In Successfully";
        sa.assertTrue(title.contains("Successfully"));
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**
        //Verify button Log out is displayed on the new page.
        WebElement logout = driver.findElement(By.xpath("//*[text()='Log out']"));
        sa.assertTrue(logout.isDisplayed());
        sa.assertAll();
        //  **__**_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*__**_*_*_*_**__**


    }
}

