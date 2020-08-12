package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}

	 WebDriver driver;
	 public static WebElement element= null;
	

	public WebElement waitForElement(WebElement element, int timeout) {
		WaitUtility.element = element;
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("Element with locator: " + element + " Present");
		} catch (Exception e) {
			System.out.println("Element with locator: " + element + " not Present");
		}
		return element;
	}
	
	
	
	public static WebElement explicitWait(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.cssSelector(""));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element.toString())));
		return element;
	}

}
