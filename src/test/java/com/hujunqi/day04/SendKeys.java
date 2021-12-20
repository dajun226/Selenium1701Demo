package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 16:31
 */
public class SendKeys {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void sendKeysTest(){
        driver.get("http://www.baidu.com");

        //搜索框输入selenium
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("selenium");

        //点击一下搜索按钮
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();

    }
}
