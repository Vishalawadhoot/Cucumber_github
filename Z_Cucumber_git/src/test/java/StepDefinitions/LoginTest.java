package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber_POM_HomePage.HomePage_Pom;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public WebDriver driver;
	HomePage_Pom login;
	
	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter url")
	public void enter_url() {
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		login = new HomePage_Pom(driver);
		login.clicksignin();
		login.enteremail();
		login.enterps();

	}

	@When("Click on enter")
	public void click_on_enter() {
		login.clicksignbutton();

	}

	@Then("user is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
		
	}

	@When("when user click on whats new")
	public void when_user_click_on_whats_new() {
		driver.findElement(By.xpath("//a[@class='level-top ui-corner-all' and @id='ui-id-3']")).click();
	}

	@Then("whats new page will be displayed")
	public void whats_new_page_will_be_displayed() {
		System.out.println("what's new page is displyed");
		driver.close();
	}

	@When("when user click on sale")
	public void when_user_click_on_sale() {
		driver.findElement(By.xpath("//a[@class='level-top ui-corner-all' and @id='ui-id-8']")).click();
	}

	@Then("sale page will be displayed")
	public void sale_page_will_be_displayed() {
		System.out.println("sale page is displyed");
		driver.close();

	}
	

	
	
//	public WebDriver driver;
//	@Given("Browser is open")
//	public void browser_is_open() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().maximize(); 
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@When("Enter url")
//	public void enter_url() {
//
//		driver.get("https://www.facebook.com");
//	}
//
//	@And("Enter username and password")
//	public void enter_username_and_password() {
//
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9060403054");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rukiaririkata007");
//
//	}
//
//	@And("Click on enter")
//	public void click_enter() {
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//	}
//	@Then("user is logged in")
//	public void user_is_logged_in() {
//		System.out.println("User is logged in");
//		driver.close();
//	}

}
