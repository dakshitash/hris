package com.qait.com.qait.hris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login3 {
	WebDriver driver;

	public void enterPassword() throws InterruptedException {

		driver.findElement(By.id("txtUserName")).sendKeys("dakshitasharma");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);

	}

}
