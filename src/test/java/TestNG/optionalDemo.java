package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optionalDemo {
	@Test
	@Parameters("message")
	public void arun(@Optional("optional parameter selected") String message) {
		System.out.println(message);
		

	}
	
}
	