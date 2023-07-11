package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
public class Loginpage {
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement closePopup;
			
	
	public void intialization() {
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
	}
	
	public void login() {
		
	}

}
