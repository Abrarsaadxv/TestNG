package SDA.test.day18;

import SDA.utilities.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C02ParallelTesting2 extends TestBase {


    @Test
    public void test1(){

        new ChromeDriver().get("https://www.clarusway.com");
    }

    @Test
    public void test2(){
        new ChromeDriver().get("https://www.ebay.com");

    }   @Test
    public void test3(){

        new ChromeDriver().get("https://www.linkedin.com");

    }   @Test
    public void test4(){

        new ChromeDriver().get("https://www.clarusway.com");

    }
}
