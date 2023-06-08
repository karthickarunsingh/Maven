package TestNG;

import org.testng.annotations.Test;

public class PriortySample {
	@Test(priority=-20)
	private void logIn() {
		

	}
	@Test(priority=-5)
	private void searchHotel() {
		

	}
	//To ignore the particular test case
	//(enabled=false)
	@Test//(enabled=false)
	private void selectHotel() {
		

	}
	@Test(priority=10)
	private void bookHotel() {
		

	}
	@Test(priority=50)
	private void bookingConformation() {
		

	}
	//To run the particular test case in multiple time 
	//invoCationCount
	@Test(priority=100,invocationCount=5)
	private void helloArun() {
		
	}
	

}
