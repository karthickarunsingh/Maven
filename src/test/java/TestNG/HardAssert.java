package TestNG;
import org.hexa.*;
import org.pageobjectmodel.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssert extends LibGlobal {
	
	@Parameters()
	@Test()
	private void logIn() {
		LaunchBrowser("chrome");
		maximizeWindow();
		openAppUrl("https://www.facebook.com/");
		Assert.assertTrue(getUrl().contains("face"));
		
		LoginPage lp = new LoginPage();
		lp.getTxtUserName().sendKeys("karthickarun87@gmail.com");
		lp.getTxtUserPass().sendKeys("Arunsingh@1999");
		lp.getBtnLogin().click();
		
		
		
		

	}

}
