package pages.objects;

import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import pages.base.BasePage;

public class HomePage extends BasePage{

	
	public void mouseOverNewCars() {
	mouseOver("newCarManu_XPATH");
		
	}
	
	public void clickFindNewCars() {
		click("findnNewCars_XPATH");
	}
	
	public void searchCars() {
		
	}
	
	public void gotoMaps() {
		 
	}
}
