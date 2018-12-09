package com.syntax.cucumberproject.test.stepdifinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^I open Browser$")
	public void i_open_Browser() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Given("^I navigate to FreeCam$")
	public void i_navigate_to_FreeCam() throws Throwable {
		String url= "https://www.freecrm.com/index.html";
	   driver.get(url);
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("shokriyan");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Kunduz1234");
	    Thread.sleep(2000);
	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Login']"));
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
//	   boolean logo = driver.findElement(By.xpath("//td[@class='logo_text']")).isDisplayed();
//		Assert.assertTrue(logo);
		
		String title=driver.getTitle();
		String ExpectedTitle= "CRMPRO";
		Assert.assertEquals(title, ExpectedTitle);
	   
	   driver.close();
	}

	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("hdhhsgiyan");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("jdjlsdhk");
	    Thread.sleep(3000);
	}

	@Then("^I see error message$")
	public void i_see_error_message() throws Throwable {
	    boolean logo = driver.findElement(By.xpath("//a[@class='navbar-brand']//img[@class='img-responsive']")).isEnabled();
		Assert.assertTrue(logo);
		
		driver.close();
	}




}
