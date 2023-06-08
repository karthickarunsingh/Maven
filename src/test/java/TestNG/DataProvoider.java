package TestNG;
import org.hexa.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvoider extends LibGlobal {
	
	String[][] data={
		{"Arun@gmail.com","Arun@123"},
		{"karthickarun87@gmail.com","singh@1988"},
		{"karthicksingh87@gmail.com","Arunsingh@1988"},
		{"karthickarun87@gmail.com","Arunsingh@1988"}};
	
	
	@DataProvider(name="login data")
	private String[][] logIn() {
	
		return data;
	}
	
	@Test(dataProvider="login data")
	private void fbLogin(String uName,String uPass) {
		
		LaunchBrowser("chrome");
		maximizeWindow();
		openAppUrl("https://www.facebook.com/");
		
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(uName);
		
		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys(uPass);
		
		WebElement logBtton = driver.findElement(By.name("login"));
		logBtton.click();

	}
	
	
	}


