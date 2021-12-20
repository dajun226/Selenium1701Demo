package com.hujunqi.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-09 20:01
 */
public class FindElementsTest {

    private WebDriver driver;

    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    /**
     * 打开百度页面
     * 定位搜索文本框
     */

    @Test
    public void findElements(){
        driver.get("http://www.baidu.com");

        //通过id
        //WebElement keyField =  driver.findElement(By.id("kw"));

        //通过name
        //WebElement keyField1 =  driver.findElement(By.name("wd"));

        //通过class
        //WebElement keyField =  driver.findElement(By.className("s_ipt"));

        //通过linkTest，必须是<a></a>中的文本链接
        //WebElement keyField =  driver.findElement(By.linkText("新闻"));

        //通过部分文本标签partialLinkTest
        //WebElement keyField =  driver.findElement(By.partialLinkText("新"));

        //通过节点名，By. tagName(dom节点名)：这个不谈。没卵用。

        WebElement keyField =  driver.findElement(By.xpath("//*[@id=\"su\"]"));


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
