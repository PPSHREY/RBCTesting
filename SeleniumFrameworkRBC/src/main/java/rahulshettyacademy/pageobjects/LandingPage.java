package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
	//PageFactory
	
	@FindBy(xpath="//a[@aria-controls='mm-mortgages']")
	WebElement mortgage;
	
	
	
	
	public void hoverMortgages() {
		Actions ac = new Actions(driver);
		   ac.moveToElement(mortgage).build().perform();
	}
	
	public void goTo()
	{
		driver.get("https://www.rbcroyalbank.com/personal.html");
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
