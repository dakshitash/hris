package com.qait.com.qait.hris;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qait.com.qait.hris.Login1;
import com.qait.com.qait.hris.Login2;
import com.qait.com.qait.hris.Login3;

public class Hris {

	String url = "";
	Login1 obj1 = new Login1();
	Login2 obj2 = new Login2();
	Login3 obj3 = new Login3();

	@BeforeClass
	public void launchBrowser() {
		obj1.launchApplication(url);
	}

	@Test(priority = 0)
	public void checkForValidCredentials() throws InterruptedException {
		obj1.validCredentials();
	}

	@Test(priority = 1)
	public void checkForInvalidCredentials() throws InterruptedException {
		obj2.invalidCredentials();
	}

	@Test(priority = 2)
	public void checkForEnterPassword() throws InterruptedException {
		obj3.enterPassword();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		obj1.closeApplication();
	}

}
