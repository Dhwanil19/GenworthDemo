package stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScript {

	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable {


		driver.get("https://www.facebook.com");
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		driver.findElementById("email").sendKeys(uname);
		driver.findElementById("pass").sendKeys(pass);
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		driver.findElementById("loginbutton").click();
	}



}
