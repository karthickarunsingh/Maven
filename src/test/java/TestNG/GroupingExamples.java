package TestNG;

import org.testng.annotations.Test;

public class GroupingExamples {
	@Test(groups= {"Toyota"})
	private void camry() {
		System.out.println("Toyota camry - petrol");

	}
	@Test(groups= {"Toyota"})
	private void altis() {
		System.out.println("Toyota Altis - diesel");

	}
	@Test(groups= {"Toyota"})
	private void crysta() {
		System.out.println("Toyota crysta - diesel");

	}
	@Test(groups= {"Toyota"})
	private void landCruiser() {
		System.out.println("Toyota LC - Diesel");

	}
	@Test(groups= {"Maruthi"})
	private void alto() {
		System.out.println("Maruthi alto - petrol");

	}
	@Test(groups= {"Maruthi"})
	private void ciaz() {
		System.out.println("Maruthi ciaz - petrol");
	}
	@Test(groups= {"Maruthi"})
	private void brezza() {
		System.out.println("Maruthi brezza - petrol");

	}
	@Test(groups= {"Maruthi"})
	private void boleno() {
		System.out.println("Maruthi boleno - petrol");

	}
	@Test(groups= {"Hyundai"})
	private void creta() {
		System.out.println("Hyundai creta - petrol");

	}
	@Test(groups= {"Hyundai"})
	private void verna() {
		System.out.println("Hyundai verna - petrol");

	}
	@Test(groups= {"Hyundai"})
	private void santafee() {
		System.out.println("Hyundai santafee - petrol");

	}
	@Test(groups= {"Hyundai"})
	private void tusson() {
		System.out.println("Hyundai tusson - petrol");
	}

}
