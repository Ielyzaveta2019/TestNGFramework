package com.syntax.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
    public static void setUpDriver() {
    	
    	ConfigsReader.readProperties(Constans.CREDENTIALS_FILEPATH);//we are reading the property file
    	String browser = ConfigsReader.getProperty("browser");
    	
        if (browser.equalsIgnoreCase("chrome")) {
           
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
           driver = new ChromeDriver();
            
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "src/test/resourses/drivers/IEDriverServer.exe");
        }else {
        	System.out.println("browser given is wrong");
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigsReader.getProperty("url"));
    }
    @AfterMethod(alwaysRun=true)
    public static void tearDown() {
    	driver.quit();
    	
    }

}
