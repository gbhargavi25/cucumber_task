package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	public WebDriver driver;

	@Before(order=1)
	public void open_browser() {
		System.out.println("launch the browser");
	}
	//using tags
	@Before("@validProduct and @invalidProduct")
	public void homepage() {
		System.out.println("launch the home page");
	}
	@Before(order=2)
	public void open_url() {
		System.out.println("open url");
	}
	@Before(order=3)
	public void search() {
		System.out.println("search the product");

	}
	@After(order=2)
	public void logout() {
		System.out.println("logout from the application");
	}
	@After(order=1)
	public void tear_down() {
		System.out.println("close the browser");
	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("@@@@@@@2Before step method@@@@@@");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("@@@@@@@@@After step method@@@@@@@@");
		
	}
}
