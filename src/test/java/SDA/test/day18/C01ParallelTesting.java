package SDA.test.day18;

import SDA.utilities.TestBase;
import org.testng.annotations.Test;

public class C01ParallelTesting  {


    @Test
    public void test01(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test01"+threadName );
    }
    @Test
    public void test02(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test02"+threadName );

    }
    @Test
    public void test03(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test03"+threadName );

    }
    @Test
    public void test04(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test04"+threadName );

    }
    @Test
    public void test05(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test01"+threadName );

    }
    @Test
    public void test06(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test01" +threadName);

    }
    @Test
    public void test07(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test07"+threadName );

    }    @Test
    public void test08(){
        String threadName = Thread.currentThread().getName();

        System.out.println(" =Thread Executing for test08"+threadName );

    }


}
