package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	  WebDriver driver;
		@FindBy (xpath="//a[@id='lbklogout']")
		private WebElement logout;
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
	    public void logoutmethod() {
		   logout.click();
	}
	
}
public void apurva(){

}
