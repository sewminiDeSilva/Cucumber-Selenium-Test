# Selenium and Cucumber Login Automation 

This project demonstrates login automation using **Selenium** and **Cucumber** with a Behavior-Driven Development (BDD) approach. It was built by following a YouTube tutorial by **SDET Adda For QA Automation** on the **[YouTube Video Link](https://youtu.be/8fFtyN7bbpo?si=xjMxVH9fdS3uw6LU)**.

## Tools and Technologies Used:
- **Java**: The programming language used to write tests.
- **Selenium WebDriver**: For automating web interactions.
- **Cucumber**: For writing test scenarios in Gherkin language.
- **Maven**: For project management and dependencies.
- **TestNG**: For running the tests and managing test configurations.

## Setup and Execution

### Prerequisites:
1. **Java 8 or higher** must be installed on your machine.
   - You can download and install Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. **Maven** must be installed.
   - You can install Maven by following the guide [here](https://maven.apache.org/install.html).
3. **IDE**: You will need an IDE like **IntelliJ IDEA**, **Eclipse**, or any IDE that supports Java.

### Steps to Run:
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/selenium-cucumber-login-automation-tutorial.git
   ```

2. Navigate to the project directory:
   ```bash
   cd selenium-cucumber-login-automation-tutorial
   ```

3. Install project dependencies using Maven:
   ```bash
   mvn clean install
   ```

4. Run the tests with **TestNG**:
   - If you are using **IntelliJ IDEA** or **Eclipse**, right-click on the `TestNG` XML file (usually named `testng.xml`) and select **Run**.
   - Alternatively, run the following command in the terminal to execute the tests:
   ```bash
   mvn test -DsuiteXmlFile=testng.xml
   ```

   After running the tests, **Cucumber** will generate a test report located in the `target/cucumber-reports` directory.

## Features:
- Login automation using **Selenium**.
- Test scenarios written in **Cucumber's Gherkin language**.
- **TestNG** for running and managing the tests.
- Generates an HTML report after test execution.

## Screenshots:
Below are some screenshots of the test execution and generated report:

### Test Execution:
![image](https://github.com/user-attachments/assets/0b4f07eb-69c9-4a4a-8f4a-e5bd86550496)


### Generated Cucumber Report:
![image](https://github.com/user-attachments/assets/72ee58bd-a7db-4905-8dc6-d3bc541368fc)


## Credit:
This project was created by following the tutorial from **SDET Adda For QA Automation**. You can watch the full tutorial here: (https://youtu.be/8fFtyN7bbpo?si=xjMxVH9fdS3uw6LU).

