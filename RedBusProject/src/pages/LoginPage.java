package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
<<<<<<< HEAD
=======
import org.openqa.selenium.support.How;
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
<<<<<<< HEAD
	//---------------------- Web Elements ------------------
	@FindBy(id="i-icon-profile")
	WebElement LoginIcon;
	
	@FindBy(id="signInLink")
	WebElement LoginLink;
	
	@FindBy(id="mobileNoInp")
	WebElement MobileNo;

	
	// ----------------------- Methods -------------------
=======
	@FindBy(how = How.ID, using = "i-icon-profile")
	WebElement LoginIcon;
	
	@FindBy(how = How.ID, using = "signInLink")
	WebElement LoginLink;
	
	@FindBy(how = How.ID, using = "mobileNoInp")
	WebElement MobileNo;
	
	
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
<<<<<<< HEAD

		
	}
	
	
=======
		
	}
	
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
	public void LogintoApp(String Mobile) {
		
		LoginIcon.click();
		LoginLink.click();
<<<<<<< HEAD
		
		System.out.println(Mobile);
		driver.switchTo().frame(0);
		MobileNo.sendKeys(Mobile);
		
	}
=======
		System.out.println(Mobile);
		driver.switchTo().frame(0);
		 MobileNo.sendKeys(Mobile);
	}

>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
}
