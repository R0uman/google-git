package com.google.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//private WebDriver driver;

	@FindBy(css="input[name=password]")
	private WebElement passwordInput;
	
	@FindBy(css=".RveJvd.snByac")
	private WebElement continueButton;
	
	public Login(WebDriver driver){
		
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
 	private void inputPassword(String password){
 		
 		passwordInput.sendKeys(password);
 	}
 	
 	public void signIn(String password){

 		inputPassword(password);
 		continueButton.click();
 	}

 	public By getPasswordInput(){
 	
 		return By.cssSelector("input[name=password]");
 	}
	
}
