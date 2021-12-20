package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 17:07
 */
public class GetAttribute {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void getAttribute(){
        //打开百度首页
        //搜索框输入“webdriver”
        //获取搜索框的value属性值

        driver.get("http://www.baidu.com");

        //定位搜索框
        WebElement element = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
        element.sendKeys("webdriver");

        //获取搜索框的value属性值
        System.out.println(element.getAttribute("value"));
    }
}
