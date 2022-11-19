package rahulshettyacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class Mortgages extends AbstractComponent{

	
	WebDriver driver;

	public Mortgages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath = "//a[text()='Buy Your First Home']")
	WebElement BuyFHome;
	
	@FindBy(xpath = "//a[text()='Mortgage Payment Calculator']")
	WebElement MortgagePC;
	
	public void clickBuyFHome()
	{
		BuyFHome.click();
	}
	
	public void clickmortgage() {
		MortgagePC.click();
	}
	
	
}
