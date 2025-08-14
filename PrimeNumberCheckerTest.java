import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrimeNumberCheckerTest {

    @Test(dataProvider = "testData", dataProviderClass = ReadCSV.class)
    public void testPrimeNumbers(String description, int number, boolean expected) {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        Reporter.log("Starting Test With Number: " + number, true);
        boolean result = checker.isPrime(number);
        Reporter.log("Checking If The Number Is Prime: " + expected, true);
        Assert.assertEquals(result, expected, description);
        Reporter.log("Test Passed For Number: " + number , true);
        System.out.println("----------------------------------------------------------------------");
    }
}