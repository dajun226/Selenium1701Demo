package com.hujunqi.day04;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-13 18:05
 */
public class JudgeIsSelected {
    private WebDriver driver;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void isSelectedTest() {
        driver.get("file:///D:/BaiduNetdiskDownload/YuanMa/webdriver_demo/selenium_html/index.html");


        //定位并获取“Volvo”单选框是否选中状态
        WebElement element = driver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]"));
        element.click();
        Boolean b = element.isSelected();

        //校验结果
        Assert.assertTrue(b,"校验单选框已选中");

    }
}
