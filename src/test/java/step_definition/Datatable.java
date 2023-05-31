package step_definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatable {
	public WebDriver driver;
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("(//a[@class=\"list-group-item\"])[2]")).click();
	    
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable registrationDetails) {
		List<List<String>> data = registrationDetails.asLists(String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(2));
		driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get(3));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get(4));
		driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get(5));
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

}
