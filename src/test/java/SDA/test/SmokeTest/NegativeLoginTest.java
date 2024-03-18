package SDA.test.SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class NegativeLoginTest {

    By userNameFiled = By.id("username");
    By passwordName = By.name("password");
    By buttonTag = By.id("submit");
    By terrorextByXpath = By.id("error");
    @Test(dataProvider = "invalidCredentials")
    public void test01(String userName, String password)throws InterruptedException{

            WebDriver driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://practicetestautomation.com/practice-test-login/");

            driver.findElement(userNameFiled).sendKeys(userName);
            driver.findElement(passwordName).sendKeys(password);
            driver.findElement(buttonTag).click();

            Thread.sleep(1000);
            WebElement invalidText = driver.findElement(terrorextByXpath);

            Assert.assertTrue(invalidText.isDisplayed());
        }

    @DataProvider(name = "invalidCredentials",parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"student132", "Password123"},
                {"std", "Password123"},

        };
    }



}
