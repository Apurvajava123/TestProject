package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
	
	@FindBy (xpath="//input[@name='txtUserName']")
	private WebElement username;


    @FindBy (xpath="//input[@name='txtPassword']")
    private WebElement password;
    
    @FindBy (xpath="(//input[@type='submit'])[1]")
    private WebElement clickonlogin;
    
    public LoginPage(WebDriver driver) {
     PageFactory.initElements(driver, this);
     this.driver=driver;
    }
    
    public void sendusername() {
    	username.sendKeys("ANKUSHSHRINATH");
    }
    public void sendpassword() {
    	password.sendKeys("ANKUSHSHRINATH");
    }
    public void taponlogin() {
    	clickonlogin.click();
    }
}
