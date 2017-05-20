package com.google.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	private WebDriver driver;

	private By passwordInput = By.cssSelector("input[name=password]");
	private By continueButton = By.cssSelector(".RveJvd.snByac");
	
	public Login(WebDriver driver){
		
		this.driver = driver;
	}
 
 	public void inputPassword(String password){
 		
 		WebElement element = driver.findElement(passwordInput);
 		element.sendKeys(password);
 	}
 	
 	public void signIn(String password){

 		
 		inputPassword(password);
 		
 		WebElement element = driver.findElement(continueButton);
 		element.click();
 	}

 	public By getPasswordInput(){
 	
 		return passwordInput;
 	}
	
}
