package SDA.homeworks.day17;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HW001 extends TestBase {

    By emailfilde= By.name("email");
    By passwordf= By.name("password");
    By submit= By.xpath("//input[@class='btn btn-primary']");
By searchBar = By.name("search");

    @Test(dataProvider = "validCredentials1")
    public void  test(String seachKey) {
        driver.get("https://opencart.abstracta.us:443/index.php?route=account/login");
   driver.findElement(emailfilde).sendKeys("clarusway@gmail.com");
   driver.findElement(passwordf).sendKeys("123456789");
        driver.findElement(submit).click();
        WebElement search= driver.findElement(searchBar);
        search.sendKeys(seachKey, Keys.ENTER);

    }

    @DataProvider(name = "validCredentials1")
    public Object[][] getData() {
        Object[][] data = {{"Mac"},{"ipad"},{"Samsung"}};
        return data;
    }    }



