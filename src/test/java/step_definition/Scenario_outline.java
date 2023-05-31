//package step_definition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class Scenario_outline {
//	public WebDriver driver;
//
//	@Given("User navigates to login page")
//	public void user_navigates_to_login_page() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//
//	}
//
//	@When("User enters valid email address {string} into email field")
//	public void user_enters_valid_email_address_into_email_field(String username) {
//		driver.findElement(By.id("input-email")).sendKeys(username);
//	}
//
//	@When("User enters valid password {string} into password field")
//	public void user_enters_valid_password_into_password_field(String password) {
//		driver.findElement(By.id("input-password")).sendKeys(password);
//	}
//
//	@When("User clicks on Login button")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//	@Then("User should get successfully logged in")
//	public void user_should_get_successfully_logged_in() {
//		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).isDisplayed());
//	}
//
//
//	@When("User enters valid product {string} into Search box field")
//	public void user_enters_valid_product_into_search_box_field(String string) {
//		driver.findElement(By.name("search")).sendKeys("HP");
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
//}
