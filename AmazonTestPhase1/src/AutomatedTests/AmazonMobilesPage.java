package AutomatedTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonMobilesPage {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@type,'checkbox') and contains(@name,'s-ref-checkbox-Samsung')]")
	WebElement Samsungbrand;
	
	public AmazonMobilesPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void CheckSamsungbrand() {
		Samsungbrand.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}

}
