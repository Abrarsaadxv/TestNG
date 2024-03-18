package SDA.test.day17;

import SDA.utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C03FakerDataProvider extends TestBase {

    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ''Invalid credentials'’ is displayed.

By usernamefiled= By.name("username");
By passwordname= By.name("password");
By loginbutton= By.tagName("button");
By errorMessage = By.xpath("//*[.='Invalid credentials']");
    @Test(dataProvider = "InvalidCredentials")
    public void negativeLoginTest( String username,String password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(usernamefiled).sendKeys(username);
        driver.findElement(passwordname).sendKeys(password);
        driver.findElement(loginbutton).click();
        Thread.sleep(1000);
         WebElement invalidtext =driver.findElement(errorMessage);
        Assert.assertTrue(invalidtext.isDisplayed());


    }
    @DataProvider(name = "invalidCredentials")
    public Object[][] getData(){
        //Faker.instance().name().username();
        Faker faker = new Faker();
        return new Object[][]{
                {faker.name().username(),faker.internet().password()},
                {faker.name().username(),faker.internet().password()},
                {faker.name().username(),faker.internet().password()},
        };
    }

}



