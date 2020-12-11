package AutomatedTests;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductsPage {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//span[@class='a-size-medium a-color-base a-text-normal']")
	List<WebElement> listofproducts;
	
	public AmazonProductsPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void listOfProducts()  {
		try {
		
		File f = new File("D:/Automation testing/Phase-1/Result/searchres.txt");
		FileWriter w = new FileWriter(f);
      for(int i=0; i<listofproducts.size();i++){
       	 String text =listofproducts.get(i).getText();
     	   	 System.out.println(text);
       	
    	 //PrintWriter out =new PrintWriter(w);
    	 BufferedWriter out = new BufferedWriter(w);
    	    out.write(text);
    	     out.flush();
          }
		}catch (Exception e1) {
        	e1.printStackTrace();
        }     
      
      
     
          }
        	 
	}
	


