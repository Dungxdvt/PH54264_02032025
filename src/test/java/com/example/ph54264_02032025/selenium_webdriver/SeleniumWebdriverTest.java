package com.example.ph54264_02032025.selenium_webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverTest {

    private WebDriver webDriver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {
        webDriver.get("https://www.savor.vn/?gclid=Cj0KCQiA_Yq-BhC9ARIsAA6fbAg0WKzvdNa-4UrFzm24blpJNW2uI5aJYrExiU7lm_Zo3HW9iOPiIEIaAvb7EALw_wcB");
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//*[@id=\"radix-:Rtra:\"]/div[2]/div/button[1]")).click();

        webDriver.findElement(By.xpath("/html/body/div[2]/main/div[1]/a/button/i")).click();
        Thread.sleep(1000);
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");
        webDriver.findElement(By.xpath("//*[@id=\"phu-kien-banh-sinh-nhat\"]/div/div[2]/div/div/div[1]/div/div[2]/button[2]")).click();


    }

}

