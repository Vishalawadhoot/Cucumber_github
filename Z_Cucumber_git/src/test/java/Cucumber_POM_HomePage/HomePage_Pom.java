package Cucumber_POM_HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Pom {
	
	@FindBy(xpath = "//body/div[2]//div[@class='panel wrapper']//div//ul//li[2]/a")
	private WebElement signin;
	
	@FindBy(xpath= "//input[@title='Email']")
	private WebElement emailtf;
	
	@FindBy(xpath = "//input[@title='Password']")
	private WebElement passtf;
	
	@FindBy(xpath = "//body//div[@class='page-wrapper']//main//div[@class='columns']//div[@class='actions-toolbar']//div//button")
	private WebElement signinbutton;
	
	
	WebDriver driver;
	public HomePage_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void clicksignin()
	{
		signin.click();
	}
	
	public void enteremail()
	{
		emailtf.sendKeys("batman007@gmail.com");
	}
	public void enterps()
	{
		passtf.sendKeys("batman@007");
	}
	public void clicksignbutton()
	{
		signinbutton.click();
	}

}
