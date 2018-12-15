package stepdifinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtills.BaseClass;

public class SignupSteps extends BaseClass {

	@Given("^I click SignUp$")
	public void i_click_SignUp() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Up")).click();
			}

	@When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_credentials_and(String firstName, String lastNmae , String email) throws Throwable {
		
		WebElement dropdown = driver.findElement(By.id("payment_plan_id"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Free Edition");
		driver.findElement(By.name("first_name")).sendKeys(firstName);
		driver.findElement(By.name("surname")).sendKeys(lastNmae);


	}

	@When("^I check conditions and click submit$")
	public void i_check_conditions_and_click_submit() throws Throwable {

	}

	@Then("^I enter comapny information \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_comapny_information_and(String arg1, String arg2) throws Throwable {

	}

	@Then("^I click on continue$")
	public void i_click_on_continue() throws Throwable {

	}

	@Then("^I click on Complete Registeration$")
	public void i_click_on_Complete_Registeration() throws Throwable {

	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {

	}

	
}
