package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.objects.HomePage;
import utils.SeleniumDriver;

public class CarWaleSteps {
	
	HomePage homePage=new HomePage();
	
	
	@Given("user navigates to carwala website")
	public void user_navigates_to_carwala_website() {
		
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testurl"));
	}	

	@When("user mouseover to new cars")
	public void user_mouseover_to_new_cars() {
	     homePage.mouseOverNewCars();
	}

	@Then("user clicks on Findnewcars")
	public void user_clicks_on_findnewcars() {
	   homePage.clickFindNewCars();
	}

	@And("user click on Toyota car")
	public void user_click_on_toyota_car() {
	    
	}

	@And("user validate car titels as Toyota Cars")
	public void user_validate_car_titels_as_toyota_cars() {
	   
	}
}
