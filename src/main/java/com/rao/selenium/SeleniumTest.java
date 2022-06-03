package com.rao.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author raoshihong
 * @date 5/21/22 10:20 PM
 */
public class SeleniumTest {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","F:\\Java Software\\Selenium\\WebDriver\\chromedriver.exe");//下载的chromedriver位置
        WebDriver driver = new ChromeDriver();//实例化ChromeDriver对象
        String url="http://www.baidu.com/";
        driver.get(url);//打开指定网站

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

}
