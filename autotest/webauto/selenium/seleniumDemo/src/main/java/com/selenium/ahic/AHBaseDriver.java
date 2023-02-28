package com.selenium.ahic;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.selenium.ahic.TestngListenerScreen;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
@Listeners({TestngListenerScreen.class})
public class AHBaseDriver  {
    static WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        System.out.println("begin test");
        driver=AhicTest.init();
        String url1="10.199.3.4:7002";
        String url2="10.0.0.172";
        String url3="10.0.0.173";
        String url4="www.ahic.com.cn";
        AhicTest.login("http://"+url1+"/web/ahic/web/user/ahlogin.jsp","0200440001","0000");
//        AhicTest.login("http://"+url3+"/web/ahic/web/user/ahlogin.jsp","0200003857","0000");
    }

    @Test
    public void startDo() throws InterruptedException {
//         AhicTest.startDo();
    }
    @Test
    public void SelectPolicyno(){
        System.out.println("================="+Thread.currentThread().getId());
        AhicTest.SelectPolicyno();
    }
    @Test
    public void SelectFaPiao(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectFaPiao();
    }
    @Test
    public void SelectPrint(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectPrint();
    }
    @Test
    public void SelectDangZheng(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectDangZheng();
    }
    @Test
    public void SelectPiGai(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectPiGai();
    }
    @Test
    public void SelectVIN(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectVIN();
    }
    @Test
    public void SelectTeShuYeWu(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectTeShuYeWu();

    }
    @Test
    public void SelectUpload(){
        System.out.println("================="+Thread.currentThread().getId());

        AhicTest.SelectUpload();

    }
    @AfterClass
    public void teardown() throws InterruptedException {
        System.out.println("================="+Thread.currentThread().getId());

        System.out.println("end test");
        Thread.sleep(2000);
//        AhicTest.driver.close();
    }
}
