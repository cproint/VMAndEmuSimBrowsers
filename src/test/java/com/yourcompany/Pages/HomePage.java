package com.yourcompany.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    public WebDriver driver;

    public static String url = "https://www.saucedemo.com";

    public static HomePage homePage(WebDriver driver) {
        HomePage page = new HomePage(driver);
        page.getURL();
        return page;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getURL() {
        this.driver.get(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
