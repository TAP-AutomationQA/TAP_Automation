package testNG_Collection;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import functionlibrary.CustomFunction;

public class TestNG_Suite4 extends TestNG_SuiteAnnotations {

	private WebDriver driver;
	private String baseURL;

	CustomFunction customFunction;

	@BeforeClass
	public void setUp() {

	}

	@AfterClass
	public void closeDown() {
		driver.quit();
	}

	@BeforeMethod
	public void testBeforeMethod() {
		driver = new ChromeDriver();
		baseURL = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	// ITest Result
	@AfterMethod
	public void testAfterMethod(ITestResult testresult) throws IOException {

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

	}

	@Test
	public void testMethod1() throws InterruptedException {

		System.out.println("test");

	}

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	public static String getDateToString() {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");  
        String strDate = dateFormat.format(date);
        return strDate;
	}

}
