package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.showPage;
import resources.base;



	@RunWith(Cucumber.class)
	public class stepDefinition extends base{
WebDriver driver;
	    @Given("^User is on AMC landing page$")
	    public void user_is_on_amc_landing_page() throws Throwable {
	     driver = init();
	     driver.get("https://www.amctheatres.com/");
	     
	    }

	    @When("^User login into showtimes$")
	    public void user_login_into_showtimes() throws Throwable {
	      LandingPage lp = new LandingPage(driver);
	      lp.alertClose().click();
	    
	    }

	    @Then("^Show page is executed$")
	    public void show_page_is_executed() throws Throwable {
	    	   LandingPage lp = new LandingPage(driver);
	    	  lp.showTimeIcon().click();
	    }

	    @And("^Selected film is exhibited and browser closed$")
	    public void selected_film_is_exhibited_and_browser_closed() throws Throwable {
	       showPage sp = new showPage(driver);
			Select s = new Select(sp.movies());
			s.selectByVisibleText("1917");
			driver.close();
	    }

	}

