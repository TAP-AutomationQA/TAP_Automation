package sprint2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectmodel.BookingSearchPage;
import pageobjectmodel.GlobalVariables;

public class TC01LoginUsingEmailTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.get(GlobalVariables.baseURL);
		driver.findElement(By.cssSelector(".booking-type-selector li:nth-child(2) > button")).click();
	    driver.findElement(By.cssSelector(".header-fallback__user > .header-fallback__action")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#login")).sendKeys("szhou5@tap.pt");
	    driver.findElement(By.cssSelector("#login-password")).sendKeys("Test1234");
	    driver.findElement(By.cssSelector(".login-action")).click();
	    WebDriverWait wait = new WebDriverWait(driver,50);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header-fallback__icon:nth-child(3) use")));
	    
	    driver.findElement(By.cssSelector(".header-fallback__user .header-fallback__icon--arrow > .icon")).click();
		
	}
}
