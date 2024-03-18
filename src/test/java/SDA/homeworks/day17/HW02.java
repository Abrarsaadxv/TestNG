package SDA.homeworks.day17;

import SDA.utilities.ParameterBrowserTestBase;
import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HW02 extends ParameterBrowserTestBase {
    By serchbox = By.id("todotext");
    By archive = By.xpath("//*[.='archive']");

    @Test
    public void test1()  {
        driver.get("http://crossbrowsertesting.github.io/todo-app.html");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));

        int initialSize = checkboxes.size();
//        System.out.println("Initial size: " + initialSize);

        checkboxes.get(3).click();
        if (checkboxes.get(3).isSelected()) {
            System.out.println("Checkbox 4 is selected.");
            initialSize--;
        }
        checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
        checkboxes.get(4).click();
        if (checkboxes.get(4).isSelected()) {
            System.out.println("Checkbox 5 is selected.");
            initialSize--;
            System.out.println("Total length after selection : " + initialSize);
            Assert.assertEquals(3, 3, "The length of the list is  3");

            //*_*_*--*_**_*_*_*_*_*_*_*__*_*_*_*_*
            //*_*_*--*_**_*_*_*_*_*_*_*__*_*_*_*_*
            WebElement addbox = driver.findElement(serchbox);
            addbox.sendKeys("Run selenium Tesr" + Keys.ENTER);
            Assert.assertTrue(addbox.isDisplayed());
            driver.findElement(archive).click();
            //*_*_*--*_**_*_*_*_*_*_*_*__*_*_*_*_*
            //*_*_*--*_**_*_*_*_*_*_*_*__*_*_*_*_*
            checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
            int initialSize1 = checkboxes.size();
            System.out.println("initialSize1 After archive : " + initialSize1);
            Assert.assertEquals(4, 4, "The length of the list is 4");


        }
    }
}
