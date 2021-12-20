package com.hujunqi.day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

/**
 * @author dajun
 * 在元素上鼠标右击和双击
 * @create 2021-11-14 0:37
 */
public class ActionsDemo {
    private WebDriver driver;



    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void testContextClick() throws InterruptedException {
        //打开百度页面
        driver.get("http://www.baidu.com");
        //定位下百度按钮
        WebElement element = driver.findElement(By.xpath("//*[@id=\"su\"]"));
        //创建Actions对象
        Actions builder = new Actions(driver);


        //右击百度按钮
        builder.contextClick(element).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("胶囊就阿卜杜拉金山词霸LJ两节课ACNLKJBD查克拉HLLKJNCALBJDKBCALJDBKJSHDSHJACCDHKASJCXKjxcnLAJKHDCJK划分为撒成为iu");

        //双击百度按钮
        builder.doubleClick(element).perform();
        Thread.sleep(3000);

    }

    @Test
    public void testNoveToElement() throws InterruptedException {
        //打开百度页面
        driver.get("http://www.baidu.com");
        //定位更多
        WebElement more = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/div/a"));
        //实例化Actions
        Actions builder = new Actions(driver);

        //鼠标移动到更多上
        builder.moveToElement(more).perform();
        Thread.sleep(1000);

    }

    @Test
    public void testDragAndDropBy() throws InterruptedException {
        //打开指定网址
        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/dragAndDrop.html");

        //定位元素
        WebElement element = driver.findElement(By.xpath("//*[@id=\"drag\"]"));

        //创建Actions对象
        Actions bulider = new Actions(driver);

        //移动元素到指定位置
        bulider.dragAndDropBy(element,500,500).perform();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void closeChromeDriver(){
        driver.close();
    }


}
