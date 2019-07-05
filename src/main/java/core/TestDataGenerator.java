package core;

public class TestDataGenerator {
	int length = 0, result = 0;
	// static int max = 1001;
	static int max = 11;

	public static void main(String[] args) {
		for (int i = 2; i <= max; i++) {
			System.out.println("{" + i + ", " + PrimeNumberChecker.dr(i) + "}" + (i < max ? "," : ""));
		}
	}
}