package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginStepDefinition {

static WebDriver driver;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

       driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
       driver.get("https://www.saucedemo.com/");
    }

    @When("User enter valid Username and Password")
    public void userEnterValidUsernameAndPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("click on Login Button")
    public void clickOnLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the user should see dashboard")
    public void theUserShouldSeeDashboard() {
        Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User see dashboard");

    }

    @And("close the browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
