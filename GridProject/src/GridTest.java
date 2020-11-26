import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GridTest {
	public static void main(String[] args) throws MalformedURLException{
		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setBrowserName("Chrome");
		capability.setPlatform(Platform.WIN10);
		
		URL HubURL = new URL("http://192.168.1.109:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(HubURL,capability);
		
		driver.get("https:www.facebook.com");
		driver.close();
		
		
	}

}
