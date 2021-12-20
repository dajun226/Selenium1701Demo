package com.hujunqi.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 22:00
 */
public class WindowSelectTest {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    /**
     * 打开测试界面
     * 点击Open new window
     * 点击 baidu
     */
    @Test
    public void testWin() throws InterruptedException {
        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");
        driver.findElement(By.linkText("Open new window")).click();
        Thread.sleep(3000);

        //获取当前窗口的句柄
        String handle1 = driver.getWindowHandle();

        for (String handles:driver.getWindowHandles()) {
            if (handles.equals(handle1)){
                continue;
            }else{
                //控制权给别的页面句柄
                driver.switchTo().window(handles);
            }
        }


        driver.findElement(By.linkText("baidu")).click();
        Thread.sleep(3000);



    }


    @AfterMethod
    public void closeChromeDriver(){
        driver.close();
    }
}
