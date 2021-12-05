package Pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
   WebDriver driver;
   Actions act;
	@FindBy (xpath="//input[@type='text']")
	private WebElement searchtab;
	
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement accountdropdown;
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchbutton;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement logout;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		act=new Actions(driver);
		PageFactory.initElements(driver,this);	
		}
	
	public void clickonsearch() {
		
		searchtab.sendKeys("oneplus");
		searchbutton.click();
		
	}
	public void apurva() {
		act.moveToElement(accountdropdown).build().perform();
		act.moveToElement(logout).click().build().perform();
	}
	public void signout() {
		
		logout.click();
	}

}
