package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {
	WebDriver driver;
	
	By search_product= By.id("twotabsearchtextbox");
	By submit_button= By.id("nav-search-submit-button");
	
	public SearchProductPage(WebDriver driver) {
		this.driver=driver;
	}

	public void searchButton() {
		driver.findElement(search_product).sendKeys("Iphone");
	}
	
	public void submitButton() {
		driver.findElement(submit_button).click();
	}
	

}
