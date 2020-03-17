package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class showPage {
WebDriver driver;
	public showPage(WebDriver driver) {
	this.driver = driver;
}
	By drop = By.cssSelector("select[id='showtimes-movie-title-filter']");
	public WebElement movies(){
		return driver.findElement(drop);
	}
}
