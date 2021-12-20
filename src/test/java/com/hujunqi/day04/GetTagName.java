package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 16:58
 */
public class GetTagName {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void getTagNameTest(){
        //打开百度首页
        driver.get("http://www.baidu.com");
        //获取搜索框的TagName
        System.out.println(driver.findElement(By.xpath("//*[@id=\"kw\"]")).getTagName());
    }
}
