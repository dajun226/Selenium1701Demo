package com.hujunqi.day05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 20:38
 */
public class PromptTestDemo {
    private WebDriver driver;

    @BeforeMethod
    public void openFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver","D:\\IDEA Project location\\Selenium_Demo1701\\drivers\\geckodriver.exe");


        System.setProperty("webdriver.firefox.bin","D:\\tools\\HuoHu\\Mozilla Firefox\\firefox.exe");

        //启动它
        driver = new FirefoxDriver();
    }

    @Test
    public  void promptTest() throws InterruptedException {
        /**
         * 1. 打开“UI自动化测试”主页
         * 2. 点击Prompt按钮
         * 3. 在Prompt 弹窗中，输入“这个是Prompt”
         * 4. 点击确定\取消按钮
         */

        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"prompt\"]/input")).click();
        Thread.sleep(3000);
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("这个是Promte");
        Thread.sleep(3000);
        prompt.accept();
        Thread.sleep(3000);
        prompt.accept();
    }
}
