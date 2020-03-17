package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By alrt = By.xpath("//i[@class='icon icon_close']//*[local-name()='svg']");
	public WebElement alertClose(){
		return driver.findElement(alrt);
	}
	
	By st = By.id("icon_showtimes");
	public WebElement showTimeIcon(){
		return driver.findElement(st);
	}
	
	

}
