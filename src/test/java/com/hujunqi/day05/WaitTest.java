package com.hujunqi.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author dajun
 * @create 2021-11-13 22:23
 */
public class WaitTest {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        //用全局等待
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * 打开测试界面
     * 点击wait按钮
     * 获取文本，并判断是否为“wait for display”
     */
    @Test
    public void waitTest(){
        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");
        //找到按钮，点它
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();


        //显示等待
        new WebDriverWait(driver,30).until
                (ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"display\"]/div")));

        //获取文本，并判断是否为“wait for display”
        String text = driver.findElement(By.xpath("//*[@id=\"display\"]/div")).getText();

        Assert.assertEquals(text,"wait for display");


    }

    @AfterMethod
    public void closeChromeDriver(){
        driver.close();
    }


}
