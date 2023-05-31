//package step_definition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class demo_steps {
//	public WebDriver driver;
//	@Given("I visit the website as a guest user")
//	public void i_visit_the_website_as_a_guest_user() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.amazon.in/");
//
//	}
//	@When("I select the books option from the search dropdown")
//	public void i_select_the_books_option_from_the_search_dropdown() {
//		WebElement element=driver.findElement(By.id("searchDropdownBox"));
//		Select st = new Select(element);
//		st.selectByVisibleText("Books");
//	}
//
//	@When("I click on search icon option")
//	public void i_click_on_search_icon_option() {
//		driver.findElement(By.id("nav-search-submit-button")).click();
//	}
//
//	@Then("I should see the page having  as Books is getting displayed")
//	public void i_should_see_the_page_having_as_books_is_getting_displayed() {
//	String value=driver.findElements(By.linkText("Books")).get(0).getText();
//		Assert.assertEquals(value, "Books");
//		
//	}
//
//	}
//
//
