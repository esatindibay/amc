package academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.showPage;
import resources.base;

public class home extends base{
	WebDriver driver;
	@BeforeTest
	public void start(){
		driver = init();
		driver.get("https://www.amctheatres.com/");
	}
	@Test
	public void HomePageTest() throws InterruptedException{
		LandingPage l = new LandingPage(driver);
		l.alertClose().click();
		Assert.assertTrue(l.showTimeIcon().isDisplayed());
		l.showTimeIcon().click();
		Thread.sleep(2000L);
		showPage sp = new showPage(driver);
		Select s = new Select(sp.movies());
		s.selectByIndex(5);
	}
	@AfterTest
	public void tear(){
		driver.close();
	}


}
