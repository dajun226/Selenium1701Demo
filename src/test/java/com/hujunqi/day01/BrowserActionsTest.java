package com.hujunqi.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-09 14:17
 */
public class BrowserActionsTest {

    @Test
    public void judgeUrlWhetherTrue() throws InterruptedException {
        //打开chrome浏览器
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        //打开百度首页
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        //睡3秒
        Thread.sleep(3000);
        //获取当前页面URL是不是百度地址
        String url = driver.getCurrentUrl();

        System.out.println("获取到的地址为：" + url);
        Assert.assertEquals(url,"https://www.baidu.com/");

        String title = driver.getTitle();
        System.out.println("页面的标题为：" + title);
        driver.quit();
    }
}
