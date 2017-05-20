package com.google.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.testing.WebUtil;

public class Write {
	
	private WebDriver driver;
	private WebElement element;
	
	private By receiverEmail = By.cssSelector("textarea[name=to]");	
	private By textEmail = By.cssSelector(".Am.Al.editable.LW-avf");	
	private By subjectEmail = By.cssSelector("input[name=subjectbox]");	
	private By sendButton = By.cssSelector(".T-I.J-J5-Ji.aoO.T-I-atl.L3");
	
	public Write (WebDriver driver){
		
		this.driver = driver;
	}
 

	public void fillReceiver(String receiver){
	
		element = driver.findElement(receiverEmail);
		element.sendKeys(receiver);
	
	}
	
	public void fillSubjecttext(String subject){
		
		element = driver.findElement(subjectEmail);
		element.sendKeys(subject);
	}
	
	public void fillBodytext(String text){
		
		element = driver.findElement(textEmail);
		element.sendKeys(text);
	}
	
	public void clickSend(){
		
		element = driver.findElement(sendButton);
		element.click();
	}
	
	public void sendEmail(String receiver, String subject, String text){
		
		WebUtil.waitForElement(driver, receiverEmail);
		
		fillReceiver(receiver);
		fillSubjecttext(subject);
		fillBodytext(text);
		clickSend();
	}
	
}
