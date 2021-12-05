package test.pack;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.Base;
import pomPack.HomePage;
import pomPack.LoginPage;



public class TOVerifyHomePage extends Base {
	WebDriver driver;
	LoginPage l;
	HomePage h;
	
	@BeforeTest
	@Parameters("browser")
	public void toLaunchTheBrowser(String browser) {
		
		if(browser.equals("Chrome")) {
			System.out.println(browser);
			driver=openChromeBrowser();
		}if(browser.equals("Opera")) {
		   driver=	openOperaBrowser();
		}
		
	}
	
	
	@BeforeClass
	public void toLaunchTheBrowser() {
		
        driver.get("https://selfcare.ucnindia.net/Customer/Default.aspx");
        l=new LoginPage(driver);
        h=new HomePage(driver);
        
	}
	
	@BeforeMethod
	public void toLoginThePage(){
		l.sendusername();
		l.sendpassword();
		l.taponlogin();
		//Utils.screenshot(driver);
	   // UtilityClass.screenshot(driver);
		}
	
	@Test
	public void loginPageVerification() {
		String s=driver.getCurrentUrl();
	    System.out.println(s);
	    //Utils.exclesheet();
	    //UtilityClass.exclesheet();
	}
	
	@AfterMethod
	public void toLogOutUcn() {
		h.logoutmethod();
	}
	
	@AfterClass
	public void toCloseTheBrowser() {
		l=null;
		h=null;
	}
	
	@AfterTest
	public void toClean() {
		driver.close();
		System.gc();
	}
	
}
