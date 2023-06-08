package TestNG;
import org.hexa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample extends LibGlobal{
	String[][] data = { {"karthicharun87@gmail.com","Arunsingh@1988"},
            {"ArunKarthick97","karthickArun@1988"},
            };

@DataProvider(name="login data")
private String[][] logInData() {
return data;

}

@Test(dataProvider="login data")
private void tc01(String userName,String userPass) {
LaunchBrowser("chrome");
maximizeWindow();
openAppUrl("https://www.facebook.com/");
WebElement uName = driver.findElement(By.id("email"));
uName.sendKeys(userName);
WebElement uPass = driver.findElement(By.id("pass"));
uPass.sendKeys("userPass");
WebElement button = driver.findElement(By.name("login"));
button.click();

}}
