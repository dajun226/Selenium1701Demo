package com.hujunqi.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author dajun
 * @create 2021-11-13 16:48
 */
public class GetText {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void getText(){
        //打开百度首页
        driver.get("http://www.baidu.com");
        //获取左上角所有文本并输出
        List<WebElement> listTest = driver.findElements(By.xpath("//*[@id=\"s-top-left\"]/a"));

        //*[@id="s-top-left"]/a[1]

        for (int i = 0; i < listTest.size(); i++) {

            System.out.println(listTest.get(i).getText() );
        }
    }
}
