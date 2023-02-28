package com.selenium.mukePageObject.testCase;

import com.selenium.mukePageObject.listener.TestngListenerScreen;
import org.testng.annotations.Listeners;
import com.selenium.mukePageObject.base.DriverBase;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
@Listeners({TestngListenerScreen.class})
public class CaseBase {
    public DriverBase driverBase;
    public DriverBase initDriver(String brower){
        return new DriverBase(brower);
    }
}
