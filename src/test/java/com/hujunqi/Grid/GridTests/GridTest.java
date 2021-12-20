package com.hujunqi.Grid.GridTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.hujunqi.Grid.GridPage.LoginPage.*;

/**
 * @author dajun
 * @create 2021-12-20 4:07
 */
public class GridTest {
    String HubUrl = HUB_URL + "/wd/hub";

    @Test
    public void testChrome() throws MalformedURLException,InterruptedException{
        //创建一个DesiredCapabilities类型
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        //实例化一个driver
        WebDriver driver = new RemoteWebDriver(new URL(HubUrl),dc);

        driver.get(BAIDU_URL);
        Thread.sleep(10000);
        driver.quit();

    }

    @DataProvider(name = "data4")
    public Object[][] test1(){
        return new Object[][] {{"chrome","http://192.168.134.1:6666"},
                {"firefox","http://192.168.134.1:6666"}};
    }

    @Test(dataProvider = "data4")
    public void testGrid2(String browser,String url) throws MalformedURLException,InterruptedException{
        DesiredCapabilities desiredCapabilities = null;
        if (browser.equals("chrome")){
            desiredCapabilities = DesiredCapabilities.chrome();
        }else if (browser.equals("firefox")){
            desiredCapabilities = DesiredCapabilities.firefox();
        }else if (browser.equals("ie")){
            desiredCapabilities = DesiredCapabilities.internetExplorer();
        }

        WebDriver driver = new RemoteWebDriver(new URL(url + "/wd/hub"),desiredCapabilities);
        driver.get(BAIDU_URL);
        Thread.sleep(3000);
        driver.quit();

    }


















}
