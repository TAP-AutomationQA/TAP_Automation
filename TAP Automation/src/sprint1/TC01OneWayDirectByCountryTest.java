package sprint1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import indra.automation.*;

import pageobjectmodel.BookingSearchPage;
import pageobjectmodel.GlobalVariables;

public class TC01OneWayDirectByCountryTest {
	
	private WebDriver driver;
	
	private static final Logger log = LogManager.getLogger(TC01OneWayDirectByCountryTest.class.getName());
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown(ITestResult testresult) throws InterruptedException, IOException {
		Thread.sleep(3000);
		if (testresult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Failed: " + testresult.getName());
			String fileName = getDateToString() + ".png";
			String directory = System.getProperty("user.dir") + "//screenshots//";
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File(directory + fileName));
		}

		if (testresult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Successful: " + testresult.getName());
		}
		System.out.println("After Method Successful");
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.get(GlobalVariables.baseURL);
		BookingSearchPage.btnOneway(driver).click();;
		BookingSearchPage.txtFrom(driver).click();;
		BookingSearchPage.txtFrom(driver).sendKeys("SPAIN");
		Thread.sleep(3000);
		BookingSearchPage.autocomplete(driver).click();
		log.info("Test");
		
		
		BookingSearchPage.txtTo(driver).click();
		BookingSearchPage.txtTo(driver).sendKeys("PORTUGAL");
		Thread.sleep(3000);
		BookingSearchPage.autocomplete(driver).click();
		
	}
	
	public static String getDateToString() {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");  
        String strDate = dateFormat.format(date);
        return strDate;
	}
	

}
