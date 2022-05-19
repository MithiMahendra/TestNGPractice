package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void personnelLoan() {
		System.out.println("This is Personnel Loan");
	}
	@BeforeTest
	public void homeLoan() {
		System.out.println("This is Home Loan");
	}
}
