package step_definition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumberandregularexpressions {
	public WebDriver driver;

	@Given("Open browser and navigates to login page")
	public void open_browser_and_navigates_to_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}

//	@When("User enters email address as {string} into email field")
//	public void user_enters_email_address_as_into_email_field(String username) {
//		driver.findElement(By.id("input-email")).sendKeys(username);
//	}
	
	@When("^User enters email address as \"([^\"]*)\" into email field$")
	public void user_enters_email_address_as_into_email_field(String username) {
		driver.findElement(By.id("input-email")).sendKeys(username);
	}
	

//	@When("User enters password as {string} into password field")
//	public void user_enters_password_as_into_password_field(String password) {
//		driver.findElement(By.id("input-password")).sendKeys(password);
//	}
	@When("^User enters password as \"([a-z]+)\" into password field$")
	public void user_enters_password_as_into_password_field(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User should login successfully")
	public void User_should_login_successfully() {
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).isDisplayed());
	}


}
