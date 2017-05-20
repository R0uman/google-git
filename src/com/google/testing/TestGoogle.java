package com.google.testing;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.testing.pages.*;

public class TestGoogle {
	
	//Driver
	WebDriver driver;
	
	//Pages
	Login loginPage;
	Inbox inboxPage;
	Write writePage;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com/gmail/");
		
		//Page instances
		loginPage = new Login(driver);
		inboxPage = new Inbox(driver);
		writePage = new Write(driver);
		
	}
	
	@Test
	public void loginCorrect(){
		
		loginPage.signIn("xxx");
		inboxPage.clickWriteButton();
		writePage.sendEmail("r0um4n@gmail.com", "Test 04", "This ist the 04 Email!");
		inboxPage.clickInboxLink();
		inboxPage.signOut();
	
	}
	
	@After
	public void tearDown() throws InterruptedException{
		
		driver.close();
	}

}
