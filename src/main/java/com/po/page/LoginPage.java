package com.po.page;

import org.openqa.selenium.By;

/**
 * @author dajun
 * @create 2021-12-20 13:07
 */
public class LoginPage {
    //定义email文本框的定位方式
    public static By emailInput = By.name("email");
    //定义密码文本框的定位方式
    public static By pwdInput = By.name("password");
    //定义登录按钮的定位方式
    public static By loginButton = By.id("dologin");

    //注册网易邮箱链接
    public static By wangyiemailLianJie = By.cssSelector("#normalLoginTab > div.loginWrap > div.u-normalLogin-reg-entry.f-clear > a.f-float-left");
    //邮箱官方app链接
    public static By emailGuanFangAppLianJie = By.cssSelector("#lgAppLink");

}
