package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch3 extends GoogleBase{
	WebDriver driver;
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
	launchBrowser();
		
	}
	@When("I enter search {string}")
	public void i_enter_search(String string) {
		  
		
	   	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		WebElement searchBtn;
		searchBtn = driver.findElement(By.name("btnK"));
		//searchBtn.click();
		searchBtn.submit(); //To use "Submit", There has to be Type = Submit somewhere in the Locator search.
	  
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement resultStats;
		resultStats = driver.findElement(By.id("result-stats"));
		 String results = resultStats.getText();
		 
		 System.out.println("=============");
		 System.out.println(results);
		 System.out.println("=============");		 
	  
	} 


}
 