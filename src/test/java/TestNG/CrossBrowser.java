package TestNG;
import org.hexa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser extends LibGlobal {
	@Parameters({"browserName"})
	@Test
	private void crossTesting(String browserName) {
		if(browserName.equals("chrome")) {
			System.out.println("chrome Browser");
			LaunchBrowser("chrome");
		}else if(browserName.equals("firefox")) {
			System.out.println("firefox browser");
			LaunchBrowser("firefox");
		}else if (browserName.equals("edge")) {
			System.out.println("edge browser");
			LaunchBrowser("edge");
		}else {
			System.out.println("invalid browser");
		}
		
		maximizeWindow();
		openAppUrl("https://www.facebook.com");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("karthickarun87@gmail.com");
		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys("Arunsingh@1988");
		WebElement btnLog = driver.findElement(By.name("login"));
		btnLog.click();
		
		

	}

}
