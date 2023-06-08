package TestNG;

import org.pageobjectmodel.*;

import org.hexa.LibGlobal;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook extends LibGlobal {
	long currentTimeMillis;
	long endTimeMillis;
	
	@BeforeClass
	private void before() {
		LaunchBrowser("chrome");
		maximizeWindow();
		openAppUrl("https://www.facebook.com");
		

	}
	@AfterClass
	private void after() {
		//quitBrowser();
	}
	@BeforeMethod
	private void beforeMethod() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);

	}@AfterMethod
	private void afterMethod() {
		long endTimeMillis = System.currentTimeMillis();
		System.out.println(endTimeMillis);
		
	}
	@Test
	private void logIn() {
		LoginPage lp = new LoginPage();
		enterValue(lp.getTxtUserName(), "karthickarun87@gmail.com");
		enterValue(lp.getTxtUserPass(), "Arunsingh@1988");
		clickElement(lp.getBtnLogin());
		
		

	}
	
	
	

}
