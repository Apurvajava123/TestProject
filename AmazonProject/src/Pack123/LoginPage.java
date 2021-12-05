package Pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@type='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement contineu;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void sendusername() throws InterruptedException {
		Thread.sleep(3000);
		username.sendKeys("apurvad06@gmail.com");
	}
	
	public void allactionlogin() {
		
		contineu.click();
		password.sendKeys("Apurvad06@123");
		signin.click();
	}

}
