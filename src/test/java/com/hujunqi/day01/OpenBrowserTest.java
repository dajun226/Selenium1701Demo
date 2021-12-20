package com.hujunqi.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


/**
 * @author dajun
 * @create 2021-11-08 10:29
 */
public class OpenBrowserTest {
    private WebDriver driver;


    @Test
    public void openFireFoxTest(){
        //指定firefox安装路径

        System.setProperty("webdriver.gecko.driver","D:\\IDEA Project location\\Selenium_Demo1701\\drivers\\geckodriver.exe");


        System.setProperty("webdriver.firefox.bin","D:\\tools\\HuoHu\\Mozilla Firefox\\firefox.exe");

        //启动它
        driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");


    }

    @Test
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\IDEA Project location\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.baidu.com");
    }

    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver","D:\\IDEA Project location\\Selenium_Demo1701\\drivers" +
                "\\IEDriverServer.exe");

        WebDriver webDriver = new InternetExplorerDriver();
        //webDriver.get("http://www.baidu.com");
    }

    @Test
    public void openEdge(){
        System.setProperty("webdriver.edge.driver","D:\\IDEA Project location\\Selenium_Demo1701\\drivers" +
                "\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("http://www.baidu.com");
    }
}
