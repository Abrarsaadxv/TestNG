package SDA.homeworks.day16;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hw01 extends TestBase {
//HW01:
//Go to URL: https://www.google.com
//Search words: Java, Selenium
//Assert get text result est that the result text contains the searched Word.
//Run tests from XML file.

//    @Test
//   // @Parameters("serachWord")
//    public void Parametertest( String serachWord) {
//
//        driver.get("https://www.google.com");
//        WebElement search = driver.findElement(By.id("APjFqb"));
//        search.sendKeys(" Java, Selenium" + Keys.ENTER);
//        System.out.println("the Serach Word  is :"+serachWord);
//          //Assert
//     String title = driver.getTitle();
//        SoftAssert sa = new SoftAssert();
//        sa.assertTrue(title.contains("Java, Selenium"));
//    }
    @Test
    @Parameters("word1")
    public void test1(String w1){
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys(" Java" + Keys.ENTER);
       System.out.println("the Serach Word  is :"+w1);
        String title = driver.getTitle();
         SoftAssert sa = new SoftAssert();
        sa.assertTrue(title.contains("Java"));

        //Assert

    }

    @Test
    @Parameters("word2")
    public void test2(String w2){
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys(" Selenium" + Keys.ENTER);
        System.out.println("the Serach Word  is :"+w2);
        //Assert
        String title2 = driver.getTitle();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(title2.contains("Selenium"));

    }

}
