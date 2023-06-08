package TestNG;
import org.pageobjectmodel.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample extends LoginPage {
	
	
	@BeforeClass
	private void beforeClass() {
		LaunchBrowser("chrome");
		maximizeWindow();
		openAppUrl("https://www.facebook.com/");

	}

	@Parameters({"username","password"})
	@Test
	private void parameterTest(String x,String y) {
		System.out.println(x);
		System.out.println(y);
		LoginPage lp = new LoginPage();
		enterValue(lp.getTxtUserName(), x);
		enterValue(lp.getTxtUserPass(),y);
		lp.getBtnLogin().click();
		
		
		
	}
	
	

}
