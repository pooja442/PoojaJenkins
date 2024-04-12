package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;
	By open_Cart= By.id("nav-cart-count");
	
	public CartPage(WebDriver driver) {
		this.driver= driver;
	}



	

	
	
	public void clickCartPage() {
		driver.findElement(open_Cart).click();
	}
	
	
}
