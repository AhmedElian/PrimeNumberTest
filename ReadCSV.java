import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    @DataProvider(name = "testData")
    public Object[][] getCSVTestData() throws IOException {
        List<Object[]> data = new ArrayList<>();
        
            InputStream isThread = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("data/PrimeNumberTest.csv");
            

            BufferedReader buffR = new BufferedReader(new InputStreamReader(isThread));
            String line;
            boolean firstLine = true; // skip header

            while ((line = buffR.readLine()) != null) {
                if (firstLine) { 
                    firstLine = false; 
                    continue; 
                }

                String[] values = line.split(",");
                String description = values[0].trim();
                int number = Integer.parseInt(values[1].trim());
                boolean expected = Boolean.parseBoolean(values[2].trim());

                data.add(new Object[]{description, number, expected});
            }
          
        return data.toArray(new Object[0][]);
    }
}