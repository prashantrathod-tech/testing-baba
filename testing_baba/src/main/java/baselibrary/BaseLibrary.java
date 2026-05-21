package baselibrary;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import excel_Utility.ExcelReader;
import wait_Utility.Waits;

public class BaseLibrary implements Waits ,ExcelReader
{
	public static WebDriver driver;
   public void launchUrl() throws InterruptedException 
   
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		driver.getTitle();
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		driver.findElement(By.xpath("//a[text()='Practice']")).click();	
	}
   @Override
   public WebElement waitForElementClickable(By locator, int seconds) 
   {	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
	   return wait.until(ExpectedConditions.elementToBeClickable(locator));
   }
   @Override
   public WebElement waitForElementVisible(By locator, int seconds) 
   {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
	   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   }
   @Override
   public String getreadData(int sheetNum, int row, int col) {
	String path="C:\\Users\\Satya\\eclipse-workspace\\sdet\\testing_baba\\testdata\\Testdata.xlsx";
	String value="";
	try 
	{
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook book= new XSSFWorkbook(file);
	    XSSFSheet sheet=book.getSheetAt(sheetNum);
		value=sheet.getRow(row).getCell(col).getStringCellValue();
		
		
		
	} catch (Exception e) 
	{
		System.out.println("issue in get read data: "+e);
	}	   
	   return value;
   }
  
	}

