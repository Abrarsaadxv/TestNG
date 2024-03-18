package SDA.test.day17;

import SDA.utilities.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C04DataProviderFromAnotherClass extends TestBase {
     /*
        We can use our data by retrieving it from a different class; for this, we need to properly integrate the
        data provider method as a parameter into the test method.
        */

    @Test(dataProvider="invalidCredentials",dataProviderClass = C02DataProvider2.class)
    public void printCredentialsTest(String username ,String password ){
        System.out.println("username = " + username);
        System.out.println("passowrd = " + password);
    }


}
