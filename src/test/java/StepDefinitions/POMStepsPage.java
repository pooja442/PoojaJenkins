package StepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CartPage;
import Pages.SearchProductPage;

import Pages.miniTvPage;

import java.util.concurrent.TimeUnit;

public class POMStepsPage {
	WebDriver driver;
	CartPage open_cart;
	miniTvPage minitv;
	SearchProductPage searching;

	@Given("now chrome is open")
	public void now_chrome_is_on_open() {
		System.out.println("now chrome is open");
		try {
			System.setProperty(" webdriver.chrome.driver",
					"C:\\Users\\shrutisachan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		open_cart = new CartPage(driver);
		minitv = new miniTvPage(driver);
		searching= new SearchProductPage(driver);
	}

	@Given("user is on website")
	public void user_is_on_website() {
		driver.get("https://www.amazon.in");
		System.out.println("Inside pom=======");
	}

	@When("user clicks mini-Tv page")
	public void user_clicks_mini_tv_page() {
		minitv.clickMiniTv();

		//driver.findElement(By.cssSelector("a[href*='/minitv?ref_=nav_avod_desktop_topnav']")).click();
	}

	@Then("user is navigated to the mini-tv page")
	public void user_is_navigated_to_the_mini_tv_page() {
		System.out.println("user navigates to the mini-tv page");
		driver.quit();
	}



	@When("user clicks on Cart Page")
	public void user_clicks_on_cart_page() {
		//driver.findElement(By.id("nav-cart-count")).click();
		open_cart.clickCartPage();
	}

	@Then("user navigates to the Cart Page")
	public void user_navigates_to_the_cart_page() throws InterruptedException {
		System.out.println("user navigates to the cart page");
		driver.quit();

	}

	@When("user is searching for laptop")
	public void user_searches_for_laptop() {
		System.out.println("Search watches");
		searching.searchButton();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	}

	@Then("search results are displayed")
	public void search_results_for_laptop_are_displayed() {
		System.out.println("display laptop");
		searching.submitButton();
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		driver.quit();
	}
}