package com.qait.com.qait.hris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login2 {
	WebDriver driver;

	public void invalidCredentials() {

		driver.findElement(By.className("icon-lock")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("dakshitasharma");
		driver.findElement(By.id("txtPassword")).sendKeys("dsdsdsds");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.className("icon-lock")).click();
		// Thread.sleep(2000);

	}
}
