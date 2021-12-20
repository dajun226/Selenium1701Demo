package com.hujunqi.day01;

import org.testng.annotations.*;

/**
 * @author dajun
 * @create 2021-11-07 11:35
 */
public class TestNGDemo1 {

    @Test
    public void testCase1() throws InterruptedException {
        Thread.sleep(5000);

        System.out.println("这是Case1的一个注解");
    }
    @Test
    public void testCase2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("这是Case2的一个注解");
    }

    @BeforeTest
    public void beforeTest01(){
        System.out.println("这是@BeforeTest的一个注解");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是beforeMethod的一个注解");
    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("这是afterMethod的一个注解");
    }

    @AfterTest
    public void afterTest01(){
        System.out.println("这是@AfterTest的一个注解");
    }

}
