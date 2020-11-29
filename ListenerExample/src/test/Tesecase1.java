package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Tesecase1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/vachalapgmail/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		EventFiringWebDriver eventRecorder = new EventFiringWebDriver(driver);
		
		ListenerClass listenrclass = new ListenerClass();
		
		eventRecorder.register(listenrclass);
		eventRecorder.navigate().to("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		
	}

}
