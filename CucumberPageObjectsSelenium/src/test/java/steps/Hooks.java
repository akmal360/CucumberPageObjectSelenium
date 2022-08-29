package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class Hooks {

	
	
	public WebDriver driver;
	
	@Before
	public void setup() {
		SeleniumDriver.setupDriver();
	}
	
	
	@After
	public void tearDown() {
		SeleniumDriver.tearDown();
	}
}
