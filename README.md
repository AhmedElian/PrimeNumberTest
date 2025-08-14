🔢 Prime Number Test – Java + TestNG
------------------

📌 Overview

This project is a Java TestNG-based automated testing suite for prime number validation. 

It verifies whether numbers are prime by running multiple scenarios using a CSV data provider, 

including negative numbers, zero, primes, non-primes, and edge cases.

------------------

✨ Features

✅ Valid Prime Number verification 

❌ Non-prime Number handling  

⚠️ Edge Case Testing (negative numbers, zero, one)  

📂 Data-Driven Testing using CSV

------------------

📂 Project Structure

📁 src

├── .gitignore                    # Files/folders ignored by git  

├── README.md                     # Project documentation  

├── PrimeNumberChecker.java       # Prime number logic  

├── PrimeNumberCheckerTest.java   # TestNG Test Cases  

├── ReadCSV.java                  # CSV DataProvider for tests  

├── data/PrimeNumberTest.csv      # CSV test data  

├── testng.xml                    # TestNG test suite configuration  

└── pom.xml                       # Maven Project Object Model  

------------------

🛠️ Technologies Used

  - Java 8+  

  - TestNG Framework  

  - Maven  

  - IDE (IntelliJ IDEA / Eclipse / VS Code)

------------------

📦 Installation & Running Tests

1- Clone the repository:

  - git clone https://github.com/yourusername/PrimeNumberTestProject.git
    
2- Open the project in your IDE (IntelliJ / Eclipse / VS Code)

3- Run the TestNG suite:

  - Option 1: Run PrimeNumberCheckerTest.java directly from your IDE

  - Option 2: Using Maven: mvn clean test

  - Option 3: Run via testng.xml from IDE: Right-click testng.xml → Run As → TestNG Suite

------------------

📊 Test Data Coverage (CSV)

Description	| Number	| Expected

Negative number -1	| -1 |	❌ false

Zero 0 |	0	| ❌ false

Smallest prime 2	| 2	| ✅ true

Odd prime 3	| 3	| ✅ true

Even non-prime 4	| 4	| ❌ false

Large prime 17	| 17	| ✅ true

Non-prime 15	| 15	| ❌ false

Edge case 1	| 1	| ❌ false

------------------

⚠️ Disclaimer

This project is for educational purposes only.

It is not intended for production use.

------------------
⭐ If you like this project, consider giving it a star on GitHub!
------------------
