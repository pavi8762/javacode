package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(how = How.ID, using = "i-icon-profile")
	WebElement LoginIcon;
	
	@FindBy(how = How.ID, using = "signInLink")
	WebElement LoginLink;
	
	@FindBy(how = How.ID, using = "mobileNoInp")
	WebElement MobileNo;
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void LogintoApp(String Mobile) {
		
		LoginIcon.click();
		LoginLink.click();
		System.out.println(Mobile);
		driver.switchTo().frame(0);
		 MobileNo.sendKeys(Mobile);
	}

}
