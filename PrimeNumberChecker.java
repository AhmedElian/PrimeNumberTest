public class PrimeNumberChecker {
	public boolean isPrime(int number) {
		if (number <= 1)
			return false;
		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;
		int maxCheck = (int) Math.sqrt(number);
		for (int oddCheck = 3; oddCheck <= maxCheck; oddCheck += 2) {
			if (number % oddCheck == 0)
				return false;
		}
		return true;
	}
}