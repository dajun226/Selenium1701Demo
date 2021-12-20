package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 15:45
 */
public class Click {

    private WebDriver driver;

    /**
     * 1,打开百度页面
     * 2，点击百度首页的“新闻”链接
     */

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void clickTest() throws InterruptedException {
        //打开百度首页
        driver.get("http://www.baidu.com");
        //定位“新闻”链接文本
        WebElement element = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]"));
        //点解链接
        element.click();
//        //睡3秒
//        Thread.sleep(3000);
        //返回上一页面
        driver.manage().window().maximize();
//        //定位"hao123"链接文本
//        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[2]"));
//        element.click();
//        //浏览器刷新
//        driver.navigate().refresh();
//        //浏览器最大化
//        driver.manage().window().maximize();
//        //设置浏览器大小
//        driver.manage().window().setSize(new Dimension(900,800));

    }
}
