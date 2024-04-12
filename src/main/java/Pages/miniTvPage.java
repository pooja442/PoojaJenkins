package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class miniTvPage {
	
	WebDriver driver;
	By mini_Tv= By.cssSelector("a[href*='/minitv?ref_=nav_avod_desktop_topnav']");
	
	
	public miniTvPage(WebDriver driver) {
		this.driver= driver;
	}

	
	
	public void clickMiniTv() {
		driver.findElement(mini_Tv).click();
	}

}
