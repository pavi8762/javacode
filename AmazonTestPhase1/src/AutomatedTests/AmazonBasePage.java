package AutomatedTests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBasePage {

	private static WebDriver driver;
	private static Object pstmt;
	
	
	 public static void main(String[] args )  {
	try {
		File f = new File("D:/Automation testing/Phase-1/Result/searchres.txt");
		 
	System.setProperty("webdriver.chrome.driver","C:/Webdrivers/chromedriver.exe");
    driver = new ChromeDriver();
	
    String baseUrl = "http://www.amazon.in";
    driver.get(baseUrl);
    
    driver.manage().window().maximize();
    Thread.sleep(4000);
   
    
    AmazonHomePage home =new AmazonHomePage(driver);
    home.clickOnMobiles();
    
    AmazonMobilesPage mobiles = new AmazonMobilesPage(driver);
    mobiles.CheckSamsungbrand();
    
    AmazonProductsPage products = new AmazonProductsPage(driver);
    products.listOfProducts();
	    
    DatabaseConnection db = new DatabaseConnection();
    
		db.Connection();
	 }
		catch (Exception e1) {
        	e1.printStackTrace();
        }
    
    
    
    
    
    
  
}
}
