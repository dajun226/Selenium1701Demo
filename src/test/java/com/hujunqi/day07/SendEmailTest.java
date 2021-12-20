package com.hujunqi.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-11-26 22:23
 */
public class SendEmailTest {
    private WebDriver driver;
    private WebElement iframe;


    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
    }
    @Test
    public void sendEmail(){
        LoginTest.login(driver,"dajun226@163.com","040502abc");

        //显示等待
        new WebDriverWait(driver,10).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"dvNavTop\"]/ul/li[2]/span[2]")));

        //点击写信按钮//*[@id="dvNavTop"]
        driver.findElement(By.xpath("//*[@id=\"dvNavTop\"]/ul/li[2]/span[2]")).click();


        driver.findElement(By.className("nui-editableAddr-ipt"))
                .sendKeys("dajun226@163.com");

        //定位主题文本框，并输入文本
        driver.findElement(By.xpath("//*[@aria-label=\"邮件主题输入框，请输入邮件主题\"]/input")).sendKeys("这个是主题");

        //添加附件
        driver.findElement(By.xpath("//*[@type=\"file\"]")).sendKeys("D:\\截图照片\\电脑壁纸\\未分类\\wallhaven-vg6dqp.jpg");


        //进入内容表单
        WebElement iframe = driver.findElement(By.className("APP-editor-iframe"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("/html/body/p")).sendKeys("月薪：24000");

        //出表单
        driver.switchTo().defaultContent();

        //点击发送
        driver.findElement(By.xpath("//*[@class=\"js-component-button nui-mainBtn nui-btn nui-btn-hasIcon nui-mainBtn-hasIcon  \"]/span[2]")).click();

        ////*[@id="1637950113259_succInfo"]/text()

        if (true){
            new WebDriverWait(driver,20).
                    until(ExpectedConditions.presenceOfElementLocated(By.className("suc-anim-icon_stroke")));

            String successFlag = driver.findElement(By.xpath("//*[@class=\"fI1\"]/a")).getText();
            Assert.assertEquals(successFlag,"已成功发送到收件人(1)");

        }




    }
}
