package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PrimeNumberCheckerTest {
	@DataProvider(name = "prime number")
	public static Object[][] primeNumbers() {
		return new Object[][] { { 2, true }, { 3, true }, { 4, false }, { 5, true }, { 2, true }, { 3, true }, { 4, false }, { 5, true }, { 6, false }, { 7, true }, { 8, false }, { 9, false }, { 10, false }, { 1001, false }};
	}

	@Test(timeOut = 1000, dataProvider = "prime number", groups = { "qa" })
	public void test(int number, boolean expected) {
		System.out.println(number + (PrimeNumberChecker.validate(number) ? " - Prime number" : " - Not prime number"));
		assertThat(expected, equalTo(PrimeNumberChecker.validate(number)));
	}
}