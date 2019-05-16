package org.sample;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	static WebDriver driver;
	
	@Given("The user is in telecom Homepage")
	public void the_user_is_in_telecom_Homepage() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-11\\Desktop\\Manivannan\\selinium\\RSM\\Cucumber\\Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://www.demo.guru99.com/telecom/");
	   
	}

	@Given("The user add click on add customer")
	public void the_user_add_click_on_add_customer() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user is filling all the fields")
	public void the_user_is_filling_all_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Gomathy");
		driver.findElement(By.id("lname")).sendKeys("Kamalakannan");
		driver.findElement(By.id("email")).sendKeys("kgomathy1993@gmail.com");
	
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9710363908");
		
	}
	
	  
	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	

	@Then("The user should see the id is generated")
	public void the_user_should_see_the_id_is_generated()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		
		
	    
	}


}
