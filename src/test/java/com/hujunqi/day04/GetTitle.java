package com.hujunqi.day04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 17:28
 */
public class GetTitle {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void getTitleTest(){
        //打开百度首页
        //获取当前页面的title
        //校验title值等于“百度一下，你就知道”
        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        System.out.println(title.equals("百度一下，你就知道"));
    }

}
