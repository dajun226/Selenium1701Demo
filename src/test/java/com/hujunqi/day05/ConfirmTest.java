package com.hujunqi.day05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 20:12
 */
public class ConfirmTest {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void confirmTest() throws InterruptedException {
        //打开“UI自动化测试”主页
        //点击Confirm按钮
        //在Confirm警告框点击确认\取消按钮

        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"confirm\"]/input")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();
        Thread.sleep(3000);
        alert.accept();
    }
}
