package TestNG;

import org.testng.annotations.Test;

public class Dependencies {
	
	@Test(enabled = true)
	private void engineStart() {
		System.out.println("Engine Started");

	}
	@Test(dependsOnMethods="engineStart")
	private void firstGear() {
		System.out.println("First gear");

	}
	@Test(dependsOnMethods="firstGear")
	private void secondGear() {
		System.out.println("Second Gear");

	}
	@Test(dependsOnMethods="secondGear")
	private void thirdGear() {
		System.out.println("Third Gear");

	}
	@Test(dependsOnMethods="firstGear",invocationCount=5)
	private void musicOn() {
		System.out.println("Music On");

	}
	

}
