package com.qait.com.qait.hris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {

	WebDriver driver;
	public void validCredentials() throws InterruptedException {

		driver.findElement(By.className("icon-lock")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("dakshitasharma");
		driver.findElement(By.id("txtPassword")).sendKeys("Dakshita");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.className("user-image")).click();
		hardWait(2000);
		driver.findElement(By.xpath("//a[contains(@href,'logoff')]//span")).click();
		hardWait(2000);
	}

	public void launchApplication(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void closeApplication() {
		driver.quit();
	}
	
	public void hardWait(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	

		
	}


