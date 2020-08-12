package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShotUtility {
	
	private WebDriver driver;

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

	
	public static String getDateToString() {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");  
        String strDate = dateFormat.format(date);
        return strDate;
	}
}
