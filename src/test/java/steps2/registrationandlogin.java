package steps2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import hooks.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registrationandlogin {
	public WebDriver driver;
	@Before
	public void Launch_the_browser_and_enter_URL() {
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

	@Given("User navigates to login page")

	// Launch the browser

	public void User_navigates_to_login_page(){
		//Assert.assertTrue(driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).isDisplayed());
		System.out.println("user is in login page");
	}

	// Registration

	@Given("User clicks on registration option")
	public void User_clicks_on_registration_option() {
		driver.findElement(By.xpath("(//a[@class=\"list-group-item\"])[2]")).click();
	}

	@When("User enters {string},{string},{string},{string},{string},{string} in registration details")
	public void user_enters_in_registration_details(String first_name, String last_name, String email, String mobile_no,
			String password, String confirm_password) {
		driver.findElement(By.id("input-firstname")).sendKeys(first_name);
		driver.findElement(By.id("input-lastname")).sendKeys(last_name);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(mobile_no);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirm_password);
	}

	@When("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
		driver.findElement(By.name("agree")).click();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Success')]")).isDisplayed());

	}

	// Login

	@Given("User is in login page")
	public void user_is_in_login_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='account-login']/ul[1]/li[3]/a[1]")).isDisplayed());
	}

	@When("User enters valid email address as {string} into email field")
	public void user_enters_valid_email_address_as_into_email_field(String username) {
		driver.findElement(By.id("input-email")).sendKeys(username);
	}

	@When("User enters valid password as {string} into password field")
	public void user_enters_valid_password_as_into_password_field(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

//	// search
//
//	@Given("User is on login page")
//	public void user_is_on_login_page(WebDriver driver) {
//		Assert.assertTrue(driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).isDisplayed());
//	}
//
//	@When("User enters valid product {string} into Search box field")
//	public void user_enters_valid_product_into_search_box_field(String product_name) {
//		driver.findElement(By.name("search")).sendKeys(product_name);
//	}
//
//	@When("User clicks on Search button")
//	public void user_clicks_on_search_button() {
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//	}
//
//	@Then("User should get valid product displayed in search results")
//	public void user_should_get_valid_product_displayed_in_search_results() {
//		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
//	}
//
//	@Then("User should close the browser")
//	public void user_should_close_the_browser() {
//		driver.quit();
//	}
//
}
