package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 16:43
 */
public class Clear {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void clear() throws InterruptedException {
        //打开百度首页
        //在搜索文本框输入selenium
        //清空搜索输入框

        driver.get("http://www.baidu.com");

        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("selenium");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"kw\"]")).clear();
    }
}
