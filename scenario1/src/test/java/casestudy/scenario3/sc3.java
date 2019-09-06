package casestudy.scenario3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
public class sc3 {
	


	WebDriver driver;
	@Given("log in")
	public void log_in() {
	System.setProperty("webdriver.chrome.driver","C:\\kavi\\Driver\\drivers\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();


	}

	@When("user {string}")
	public void user(String string) {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
	}

	@And("pass {string}")
	public void pass(String string) {
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@And("click login")
	public void click_login() {
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@And("enter product {string}")
	public void enter_product(String string) {
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	}

	@Then("click find items")
	public void click_find_items() {
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
	}


	}

