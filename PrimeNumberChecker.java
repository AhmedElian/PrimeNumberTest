public class PrimeNumberChecker {
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int counter = 2; counter <= Math.sqrt(number); counter++) {
            if (number % counter == 0) return false;
        }
        return true;
    }
}
