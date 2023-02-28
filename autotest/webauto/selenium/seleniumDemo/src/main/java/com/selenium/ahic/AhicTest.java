package com.selenium.ahic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AhicTest {
    static WebDriver driver;

    public static WebDriver init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjie\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void SelectPolicyno(){
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"policyQu\"]/a")).click();
            driver.switchTo().defaultContent();
            WebElement iframe_content = driver.findElement(By.className("iframe_content"));
            driver.switchTo().frame(iframe_content);

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"toFind\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"policyList\"]/tr[2]/td[8]/a")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     * 车险新保
     */
    public static void startDo() throws InterruptedException {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);
        driver.findElement(By.xpath("//*[@id=\"newAuto\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ddbAuto\"]")).click();
        //投保录入
        driver.switchTo().defaultContent();
        startCarInfo();
        startInsureInfo();
        startPremium();
        startUpload();
        startconfirm();
        startSubmission();
    }

    public static void startSubmission() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"toubao\"]")).click();
        Thread.sleep(10000);
        WebElement rolespan1 = driver.findElement(By.id("rolespan1"));
        WebElement rolespan2 = driver.findElement(By.id("rolespan2"));
        WebElement rolespan3 = driver.findElement(By.id("rolespan3"));
        System.out.println(rolespan1.isDisplayed());
        System.out.println(rolespan2.isDisplayed());
        System.out.println(rolespan3.isDisplayed());

    }

    public static void startconfirm() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.id("toubao")).click();
        Thread.sleep(4000);
    }

    public static void startUpload() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Upload_btn\"]")).click();
        Thread.sleep(2000);
        windowsHandle(driver.getWindowHandle());
        System.out.println(driver.getWindowHandle());
        //切都車險新保
        WebElement iframe_content = driver.findElement(By.className("iframe_content"));
        driver.switchTo().frame(iframe_content);
        driver.findElement(By.id("b2b05")).click();

    }

    /**
     * 窗口操作
     */
    public static void windowsHandle(String s) throws InterruptedException {
        System.out.println(s);
        Set<String> handlers = driver.getWindowHandles();
        System.out.println(handlers.size());
        for (String handler:handlers
                ) {
            if (s.equals(handler)){
                continue;
            }
            driver.switchTo().window(handler);
            System.out.println(handler);
        }
        Thread.sleep(1000);
        driver.findElement(By.className("webuploader-element-invisible")).sendKeys("F:\\IdeaProjects\\Auto-Selenium\\image\\au3exe.png");
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@id=\"uploader\"]/div[2]/div[3]/div[2]")).click();
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(s);


    }

    /**
     * 报价页面
     */
    public static void startPremium() throws InterruptedException {
        // 验车情况
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ycqk\"]")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//*[@id=\"table_jiaoqiang1\"]/tbody/tr[1]/td[2]/div/ul/li[3]")).click();
        // 争议解决方式
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dispute\"]")).click();
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@id=\"table_jiaoqiang1\"]/tbody/tr[5]/td[2]/div/ul/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("payNo")).sendKeys("4213414132");
        driver.findElement(By.className("total_a")).click();
        /**
         * 规定时间内找到进行执行
         */
        WebDriverWait wait = new WebDriverWait(driver, 100);
             wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                                  return !driver.findElement(By.id("JQtotal")).getText().equals("0.00");
                                              }
                  });
        driver.findElement(By.xpath("//*[@id=\"dszrx\"]")).click();
        if (driver.getCurrentUrl().equalsIgnoreCase("http://10.199.3.4:7002/web/b2b/web/index.jsp")){
            driver.findElement(By.xpath("//*[@id=\"mainKindBody1\"]/tbody/tr[4]/td[2]/div/ul/li[1]")).click();
        }
        else {
            driver.findElement(By.xpath("//*[@id=\"mainKindBody1\"]/tbody/tr[3]/td[2]/div/ul/li[1]")).click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fm4\"]/div[2]/div[2]/div/div/div[3]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("b2b04")).click();
    }

    /**
     * 人员信息页面
     */
    public static void startInsureInfo() {
        driver.findElement(By.id("realname")).sendKeys("安杰");
        driver.findElement(By.id("code0")).sendKeys("141122199308180017");
        driver.findElement(By.id("mobile")).sendKeys("15652761388");
        driver.findElement(By.id("address")).sendKeys("投保人地址");
        driver.findElement(By.id("email")).sendKeys("1257772358@qq.com");
        driver.findElement(By.id("exp")).sendKeys("2029-01-01");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("b2b03")).click();
    }

    public static void startCarInfo() throws InterruptedException {
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_content")));
        WebElement iframe_content = driver.findElement(By.className("iframe_content"));
        driver.switchTo().frame(iframe_content);
        //车牌
        driver.findElement(By.className("xin_input")).click();
        //发动机
        WebElement engineElment = driver.findElement(By.id("engineNo"));
        engineElment.sendKeys("324132DD");
        driver.findElement(By.id("vehicleNo")).sendKeys("LJFAD45FD52435324");
        //品牌型号
        driver.findElement(By.id("carType")).click();
        //回到默认页面
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modelNames"))));
        //输入品牌型号
        driver.findElement(By.id("modelNames")).sendKeys("北京现代BH7162HMZ轿车\t");
        driver.findElement(By.id("xinbao")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"car_mask\"]/div[2]/div/p[2]/input[1]")).click();
        //切换ifrmae
        driver.switchTo().frame(iframe_content);
        //初等日期
        driver.findElement(By.id("enrollDate")).sendKeys("2019-02-14");
        //车辆使用性质
        driver.findElement(By.id("carUseNature")).click();
        driver.findElement(By.xpath("//*[@id=\"useNatureCodeb2b\"]/li[1]")).click();
        Thread.sleep(1000);
        //行驶证车辆类型
        driver.findElement(By.xpath("//*[@id=\"fm2\"]/div/div[7]/div[4]/label/div")).click();
        driver.findElement(By.xpath("//*[@id=\"appendVehicleType\"]/li[1]")).click();
        //纯风险
        WebElement chunfengxian = driver.findElement(By.id("chunfengxian"));
        System.out.println(chunfengxian.isDisplayed());
        System.out.println(chunfengxian.isEnabled());

        //产险销售
        Thread.sleep(2000);
        driver.findElement(By.id("saleAgentPersonInfo")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Salesperson\"]/label/div/ul/li[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("b2b02")).click();
    }

    public static void login(String Url,String login,String pass) throws InterruptedException {
        //初始化一个chrome浏览器实例driver

//        driver.navigate().to("http://10.0.0.173/web/ahic/web/user/ahlogin.jsp");
        driver.navigate().to(Url);

        driver.findElement(By.id("mobilenohide")).click();
        driver.findElement(By.id("mobile_r")).sendKeys(login);
        driver.findElement(By.id("passnohide")).click();
        driver.findElement(By.id("passWord")).sendKeys(pass);
        driver.findElement(By.className("btn")).click();
        Thread.sleep(5000);
    }
    public static void SelectFaPiao1() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"li_last\"]/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"invoicequery\"]")).click();
            driver.switchTo().defaultContent();
            WebElement iframe_content = driver.findElement(By.className("iframe_content"));
            driver.switchTo().frame(iframe_content);

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/ul/li[4]/a[1]")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void SelectFaPiao2() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"blueinvoicequery\"]")).click();
            driver.switchTo().defaultContent();
            WebElement iframe_content = driver.findElement(By.className("iframe_content"));
            driver.switchTo().frame(iframe_content);

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/ul/li[5]/a[1]")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void SelectFaPiao() {
        SelectFaPiao1();
        SelectPolicyno();
    }

    public static void SelectPrint() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        WebElement iframe_content = driver.findElement(By.className("iframe_content"));

        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/ul/li[5]/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"gzdQuery\"]")).click();
            Thread.sleep(1000);
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_content);
            GaozhiDao();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_left);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"proposalNoQuery\"]")).click();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_content);
            Toubaodan();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_left);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"policyQuery1\"]")).click();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_content);
            BaodanPrin();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_left);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"paymentNotify\"]")).click();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe_content);
            Jiaofeitongzhidan();
            driver.switchTo().defaultContent();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void BaodanPrin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"toFind\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"policyList\"]/tr[2]/td[7]/a")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        String policyno=driver.findElement(By.id("forloginpolicyNo")).getText();
        if (policyno.contains("DDA")){
            System.out.println("交强险流程");

        }else {
            System.out.println("商业险流程");
        }
        Select printTypes=new Select(driver.findElement(By.id("printType")));
        List<WebElement> options = printTypes.getOptions();
        WebElement print = driver.findElement(By.id("printPolicys"));
        for (WebElement opton:options
                ) {
            Thread.sleep(2000);
            opton.click();
            Thread.sleep(1000);
            print.click();
        }
        System.out.println(printTypes);
        Thread.sleep(1000);
        //关闭打印窗口
        driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
        Thread.sleep(2000);


    }
    public static void Toubaodan() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[2]/table/tbody/tr[2]/td[7]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[2]/table/tbody/tr[2]/td[2]/span/a")).click();
        Thread.sleep(3000);
    }

    public static void Jiaofeitongzhidan() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"toFind\"]")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"proposalList\"]/tr[2]/td[9]/a")).click();
        Thread.sleep(3000);
    }

    public static void GaozhiDao() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[2]/table/tbody/tr[2]/td[7]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[2]/table/tbody/tr[2]/td[2]/span/a")).click();
        Thread.sleep(3000);
    }

    public static void SelectDangZheng() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"documentQu\"]/a/span")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void SelectPiGai() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"policyCorr\"]/a/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"correntactive\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"correntquery\"]")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void SelectVIN() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);
            WebElement left_ul = driver.findElement(By.className("left_ul"));
            List<WebElement> lis = left_ul.findElements(By.tagName("li"));
            lis.get(7).findElement(By.tagName("a")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"vincheck\"]")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void SelectTeShuYeWu() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"specialservice\"]/a/span")).click();
            driver.switchTo().defaultContent();
            WebElement iframe_content = driver.findElement(By.className("iframe_content"));
            driver.switchTo().frame(iframe_content);

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"toFind\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"specialNoDetail\"]")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void SelectUpload() {
        driver.switchTo().defaultContent();
        new WebDriverWait(driver,15).until(
                ExpectedConditions.presenceOfElementLocated(By.className("iframe_left")));
        WebElement iframe_left = driver.findElement(By.className("iframe_left"));
        driver.switchTo().frame(iframe_left);

        try {
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"yingxiangzl\"]/a")).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
