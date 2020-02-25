package com.yourcompany.Tests;

import com.yourcompany.Pages.HomePage;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;


public class EmulatorBrowserPageTitleTest extends TestBase {

    /**
     * Runs a simple test verifying Page Title.
     *
     * @throws InvalidElementStateException
     */
    @Test(dataProvider = "hardCodedBrowsers", enabled = true)
    public void verifyTitleTest(String browser, String version, String os, String deviceName, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

    	//create webdriver session
        createDriver(browser, version, os, deviceName, method.getName(),"VMAndEmuSimBrowserTest");
        WebDriver driver = getWebDriver();

        annotate("Open Swag Labs page...");
        HomePage page = HomePage.homePage(driver);


        annotate("Asserting Page Title...");
        Assert.assertEquals(page.getTitle(),"Swag Labs");
    }
    
 

}