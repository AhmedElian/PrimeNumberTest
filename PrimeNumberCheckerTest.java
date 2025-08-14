import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumberCheckerTest {

    @Test(dataProvider = "testData", dataProviderClass = ReadCSV.class)
    public void testPrimeNumbers(String description, int number, boolean expected) {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.isPrime(number);
        Assert.assertEquals(result, expected, description);
    }
}
