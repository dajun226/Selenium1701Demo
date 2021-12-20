package com.hujunqi.day08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author dajun
 * @create 2021-12-20 12:19
 */
public class DataDriverTest {

    @DataProvider(name = "loginUser")
    public Object[][] data1(){
        return new Object[][] {{"user1","pwd1"},{"user2","pwd2"}};
    }

    @Test(dataProvider = "loginUser")
    public void loginTest(String username,String pwd){
        System.out.println("username" + username + ",pwd" + pwd);
    }
}
