package casestudy.scenario1;
import org.junit.Assert;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.interactions.Actions;

 
import io.cucumber.java.en.Given;
 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 

public class sc4 {
	
	 
	WebDriver driver;
	 
	@Given("User is in the Homepage")
	 
	public void user_is_in_the_Homepage() {
	 
	System.setProperty("webdriver.chrome.driver", "C:\\kavi\\Driver\\drivers\\chromedriver_win32\\chromedriver.exe");
	 
	driver=new ChromeDriver();
	 
	driver.get("http://10.232.237.143:443/TestMeApp/");
	 
	driver.manage().window().maximize();

	}
	 
	@Given("User searches for a product as {string}")
	 
	public void user_searches_for_a_product_as(String string) {
	 
	driver.findElement(By.id("myInput")).sendKeys("Head"); 

	}

	 
	@When("User clicks on find details")
	 
	public void user_clicks_on_find_details() {
	 
	Actions act=new Actions(driver);
	 
	act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/form/input"))).click().build().perform(); 

	}

	 
	@When("Products page is displayed")
	 
	public void products_page_is_displayed() {
	 
	Actions act1=new Actions(driver);
	 
	act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"))).click().build().perform();

	}

	 
	@Then("Login page is displayed")
	 
	public void login_page_is_displayed() {
	 
	Assert.assertEquals(driver.getTitle(),"Login");


	}


}
