package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.hexa.*;
import org.junit.Assert;
import org.pageobjectmodel.*;

public class Rerun extends LibGlobal {
	@BeforeClass
	private void beforeClass() {
		LaunchBrowser("chrome");
		maximizeWindow();
		
		

	}
	@AfterClass
	private void afterClass() {
		closeBrowser();

	}
	@BeforeMethod
	private void before() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}
	@AfterMethod
	private void after() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}
	@Test
	private void tc001() {
		openAppUrl("https://www.flipkart.com");
		Assert.assertTrue(getUrl().contains("arun"));

	}
	@Test
	private void tc002() {
		LoginPage lp = new LoginPage();
		openAppUrl("https://www.facebook.com/");
		Assert.assertTrue(getUrl().contains("se"));
		lp.getTxtUserName().sendKeys("karthickArun87@gmail.com");
		lp.getTxtUserPass().sendKeys("Arunsingh@1988");
	
		

	}
	

}
