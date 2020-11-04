package AutomatedTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[1]")
	WebElement Mobiles;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMobiles()  {
		Mobiles.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
