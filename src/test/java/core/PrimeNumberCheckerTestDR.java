package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PrimeNumberCheckerTestDR {
	@DataProvider(name = "prime number")
	public static Object[][] primeNumbers() {
		return new Object[][] {

				{ 2, false }, { 3, false }, { 4, true }, { 5, false }, { 2, false }, { 3, false }, { 4, true }, { 5, false }, { 6, true }, { 7, false }, { 8, true }, { 9, true }, { 10, true }, { 1001, true } };
	}

	@Test(timeOut = 1000, dataProvider = "prime number", groups = { "qa" })
	public void test(int number, boolean expected) {
		System.out.println(number + (PrimeNumberChecker.validate(number) ? " - Prime number" : " - Not prime number"));
		assertThat(expected, equalTo(PrimeNumberChecker.validate(number)));
	}
}