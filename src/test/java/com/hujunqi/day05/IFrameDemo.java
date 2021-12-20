package com.hujunqi.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 21:15
 */
public class IFrameDemo {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void IFrameTest() throws InterruptedException {
        /**
         * 1. 定位iFrame
         * 2. driver控制权交给iFrame
         * 3. 操作iFrame里面的元素
         * 4. driver控制权交回原页面
         */

        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");
        //找到子框架
        driver.switchTo().frame("aa");
        //定位到输入框，输入内容
        driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("在input输入框中输入文本");
        Thread.sleep(3000);
        //控制权交出去
        driver.switchTo().defaultContent();
    }

    @Test
    public void selectTest() throws InterruptedException {
        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");
        //定位到下拉框
        WebElement element = driver.findElement(By.xpath("//*[@id=\"moreSelect\"]"));

        //创建一个selece对象
        Select select = new Select(element);
        //通过索引获取
        select.selectByIndex(1);
        Thread.sleep(3000);

        //根据属性value的属性值来选取
        select.selectByValue("vivo");
        Thread.sleep(3000);
        //根据标签之间的Text值，也就是页面显示的
        select.selectByVisibleText("xiaomi");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closeChromeDriver(){
        driver.close();
    }
}
