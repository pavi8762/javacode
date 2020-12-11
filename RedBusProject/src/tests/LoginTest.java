package tests;

import java.io.FileInputStream;
<<<<<<< HEAD

import java.io.FileNotFoundException;
=======
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
<<<<<<< HEAD
import org.testng.annotations.Listeners;
=======
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
import org.testng.annotations.Test;

import pages.LoginPage;

<<<<<<< HEAD
@Listeners(ListenerClass.class)

public class LoginTest extends Baseclass {
=======
public class LoginTest extends BaseClass{
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b
	
	XSSFWorkbook Workbook;
	XSSFSheet sheet1;
	
	@BeforeTest
	public void fetchdata() throws IOException {
		
		FileInputStream fis = new FileInputStream("exceldata.xlsx");
		Workbook = new XSSFWorkbook(fis);
<<<<<<< HEAD
		sheet1 = Workbook.getSheetAt(0);
		
		
		
		
	}
	@Test
	public void login() {
		
		
		LoginPage loginpage = new LoginPage(driver);
		
		String MobileNo =  sheet1.getRow(0).getCell(0).getStringCellValue();
		loginpage.LogintoApp(MobileNo);
		
		
	}
=======
		sheet1= Workbook.getSheetAt(0);
		;
		
				
	}
	
	
	@Test
	public void login() {
		
				
		LoginPage loginpage = new LoginPage(driver);
		
		String MobileNo = sheet1.getRow(0).getCell(0).getStringCellValue();
		loginpage.LogintoApp(MobileNo);
		
		
			}
>>>>>>> 2be4fc2a80d975f64059bc29a03ea43232e05d0b

}
