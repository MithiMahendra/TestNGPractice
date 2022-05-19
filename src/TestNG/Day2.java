package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
@Test
public void mortageLoan() {
	System.out.println("This is Mortage Loan");
}
@AfterTest
public void bikeLoan() {
	System.out.println("This is bike loan");
}
}
