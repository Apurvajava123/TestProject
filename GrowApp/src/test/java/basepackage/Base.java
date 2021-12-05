package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.opera.OperaDriver;


public class Base {
	public WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\automation files\\chrome96 latest\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	return driver;
	}
	
	
	public WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opera.driver","C:\\Users\\user\\Downloads\\automation files\\opera latest\\operadriver_win64\\operadriver.exe");
	WebDriver driver=new OperaDriver();
	return driver;
	}
}
