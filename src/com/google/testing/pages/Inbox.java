package com.google.testing.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.testing.WebUtil;

public class Inbox {
	
	WebDriver driver;
	WebElement element;

	private By writeButton = By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3");
	private By inboxLink = By.partialLinkText("Posteingang");
	private By signoutButton = By.linkText("Abmelden");
	private By accountButton = By.cssSelector(".gb_9a.gbii");
	
	
	public Inbox(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void clickWriteButton(){
		
		WebUtil.waitForElement(driver, writeButton);
		
		element = driver.findElement(writeButton);
		element.click();
	}
	
	public void clickInboxLink(){
		
		//WebUtil.waitForElement(driver, inboxLink);
		
		element = driver.findElement(inboxLink);
		element.click();
	}
	
	
	public void signOut(){
		
		WebUtil.waitForElement(driver, inboxLink);
		
		element = driver.findElement(accountButton);
		element.click();
		
		element = driver.findElement(signoutButton);
		element.click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.withTimeout(5, TimeUnit.SECONDS);
		
		WebUtil.waitForElement(driver, new Login(driver).getPasswordInput());
		
	}
	
}
