package com.syntax.pages;

import com.syntax.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageWithoutPageFactory extends BaseClass {
	// one way using instance variables

	public WebElement username=driver.findElement(By.id("txtUsername"));
	 public WebElement password=driver.findElement(By.id("txtPassword"));
	 public WebElement btnLogin=driver.findElement(By.id("btnLogin"));

	

}
