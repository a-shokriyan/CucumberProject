package stepdifinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtills.BaseClass;

public class SignUpWithDT extends BaseClass {

	@When("^I provide the following details$")
	public void i_provide_the_following_details(DataTable signTable) throws InterruptedException {

		List<Map<String, String>> maps = signTable.asMaps(String.class, String.class);

		for (Map<String, String> map : maps) {

			Thread.sleep(3000);
			driver.findElement(By.linkText("Sign Up")).click();

			WebElement dropdown = driver.findElement(By.id("payment_plan_id"));
			Select sel = new Select(dropdown);
			sel.selectByVisibleText(map.get("Edition"));
			driver.findElement(By.name("first_name")).sendKeys(map.get("firstName"));
			driver.findElement(By.name("surname")).sendKeys(map.get("lastNmae"));
			driver.findElement(By.name("email")).sendKeys(map.get("email"));
			driver.findElement(By.name("email_confirm")).sendKeys(map.get("confirmEmail"));
			driver.findElement(By.name("username")).sendKeys(map.get("userName"));
			driver.findElement(By.name("password")).sendKeys(map.get("password"));
			driver.findElement(By.name("passwordconfirm")).sendKeys(map.get("confirmPassword"));

		}
	}

	@When("^Checked the terms and conditions button$")
	public void checked_the_terms_and_conditions_button() throws Throwable {
		WebElement chkagreebtn = driver.findElement(By.xpath("//input[@name='agreeTerms']"));
		if (!chkagreebtn.isSelected()) {
			chkagreebtn.click();
		}
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
		driver.findElement(By.xpath("//div[@class='myButton']")).click();

	}
	
	@Given("^I check for company information page$")
	public void i_check_for_company_information_page() throws Throwable {
	    String text=driver.findElement(By.xpath("//div[@class='text_orange']")).getText();
	    Assert.assertEquals(text, "Your company information and profile detail");
	}

	@When("^I enter comapny information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_comapny_information_and_and(String company, String phone, String fax) throws Throwable {
	   driver.findElement(By.id("company_name")).sendKeys(company);
	   driver.findElement(By.id("phone")).sendKeys(phone);
	   driver.findElement(By.id("fax")).sendKeys(fax);
	}

	@When("^I enter rest of information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_rest_of_information_and_and(String webSite, String email, String description) throws Throwable {
		 driver.findElement(By.id("website")).sendKeys(webSite);
		   driver.findElement(By.id("company_email")).sendKeys(email);
		   driver.findElement(By.id("service")).sendKeys(description);
	}

	@When("^I enter address \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_address_and_and_and(String address, String city, String state, String zipCode) throws Throwable {
		 driver.findElement(By.id("address")).sendKeys(address);
		   driver.findElement(By.id("city")).sendKeys(city);
		   driver.findElement(By.id("state")).sendKeys(state);
		   driver.findElement(By.id("postcode")).sendKeys(zipCode);
	}

	@Then("^I select country$")
	public void i_select_country() throws Throwable {
	   WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
	   Select dropdown= new Select(country);
	   dropdown.selectByVisibleText("United States of America");
	}

	@Then("^I click checkbox for same billing address$")
	public void i_click_checkbox_for_same_billing_address() throws Throwable {
	  WebElement billAdress = driver.findElement(By.xpath("//input[@value='checked']"));
	   if (!billAdress.isSelected()) {
		   billAdress.click();
		}
	}

	@Then("^I click on continue button$")
	public void i_click_on_continue_button() throws Throwable {
		driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();

	}



}
