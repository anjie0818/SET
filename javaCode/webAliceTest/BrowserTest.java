package com.webAliceTest;

import org.junit.jupiter.api.Test;

public class BrowserTest extends BaseTest{
    @Test
    public void browserTest(){

        driver.get("https://ceshiren.com/");
    }
}
