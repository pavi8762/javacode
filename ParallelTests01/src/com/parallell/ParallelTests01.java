package com.parallell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelTests01 {

	WebDriver driver;
	@Test(groups="Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:/Webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(groups="Chrome", dependsOnMethods="LaunchChrome")
	public void TryFacebook1() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("vachala.p@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pavithra8762");
		driver.findElement(By.name("login")).click();
	}
	
	@Test(groups="Firefox")
	public void LaunchFirefox() {
		System.setProperty("webdriver.gecko.driver", "C:/Webdrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String ActTitle = driver.getTitle();
		//Assert.assertEquals("Facebook",ActTitle);
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("FB title", ActTitle);
		
	}
	
	@Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
	public void TryFacebook2() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("vachala.p@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pavithra8762");
		driver.findElement(By.name("login")).click();
		System.out.println(Thread.currentThread().getId());
		
	}
}


