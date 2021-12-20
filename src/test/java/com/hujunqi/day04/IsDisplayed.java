package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 17:43
 */
public class IsDisplayed {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void isDisplayedTest(){
        //打开百度首页
        driver.get("http://www.baidu.com");
        //校验百度一下按钮已经展示
        Boolean flag = driver.findElement(By.xpath("//*[@id=\"su\"]")).isDisplayed();

        Assert.assertTrue(flag,"校验百度一下按钮是否显示");
        System.out.println(flag);
    }

}
