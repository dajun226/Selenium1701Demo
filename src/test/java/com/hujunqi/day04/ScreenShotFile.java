package com.hujunqi.day04;


import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.management.FileSystem;

import java.io.File;
import java.io.IOException;

/**
 * @author dajun
 * @create 2021-11-13 18:49
 */
public class ScreenShotFile {
    private WebDriver driver;
    private Project FileUtils;

    @BeforeMethod
    public void openChromeDriver(){
        WebDriver driver = null;
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void screenShotFile(){

        driver.get("http://www.baidu.com");

        //下面代码是得到截图并保存在D盘下
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file,new File("D:\\test.jpg"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
