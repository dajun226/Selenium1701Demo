package com.hujunqi.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-08 17:57
 */
public class CloseBrowserTest {

    @Test
    public void closeeChrome() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Project location\\Selenium_Demo1701\\drivers\\chromedriver.exe");


        WebDriver webDriver = new ChromeDriver();
        //等3秒
        Thread.sleep(10000);
        //关闭当前窗口
        webDriver.close();

    }
}
