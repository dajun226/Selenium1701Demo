package com.hujunqi.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.po.page.LoginPage.*;

/**
 * @author dajun
 * @create 2021-11-23 23:54
 */
public class LoginTest {
    private WebDriver driver;
    private WebElement iframe;

    @BeforeMethod
    public void openChromeDriver(){
        System.setProperty("Webdriver.chrome.driver","D:\\IDEA Project location" +
                "\\Selenium_Demo1701\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        //全局的等待
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://mail.163.com/");

    }

    @DataProvider(name = "userlist")
    public Object[][] test1(){
        return new Object[][] {{"dajun226@163.com","040502abc"},
                {"dajun226@163.com","040502abcABC"}};
    }

    @Test(dataProvider = "userlist")
    public void LoginTest(String username,String pwd) throws InterruptedException {

        login(driver,username,pwd);
        //显示的等待
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("设置")));
        String text = driver.findElement(By.linkText("设置")).getText();
        Assert.assertEquals(text,"设置");



    }

//    @Test
//    public void LoginTestError()  {
//
//        login(driver,"dajun226@163.com","040502abcABC");
//
//        //显示的等待
//        new WebDriverWait(driver, 10).
//                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"nerror\"]/div[2]")));
//
//        String error = driver.findElement(By.xpath("//*[@id=\"nerror\"]/div[2]")).getText();
//        Assert.assertEquals(error,"请先进行验证");
//
//
//    }

    public static void login(WebDriver driver ,String email,String pwd){
        //转交控制权
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(pwdInput).sendKeys(pwd);
        driver.findElement(loginButton).click();

    }

    @AfterMethod
    public  void afterMethod(){
        driver.quit();
    }


}
