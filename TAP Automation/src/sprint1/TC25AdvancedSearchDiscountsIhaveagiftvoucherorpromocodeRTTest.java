package sprint1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectmodel.BookingSearchPage;
import pageobjectmodel.GlobalVariables;

public class TC25AdvancedSearchDiscountsIhaveagiftvoucherorpromocodeRTTest {
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
		BookingSearchPage.btnRoundtrip(driver).click();;
		BookingSearchPage.txtFrom(driver).click();
		BookingSearchPage.txtFrom(driver).sendKeys("LIS");
		Thread.sleep(3000);
		BookingSearchPage.autocomplete(driver).click();

		BookingSearchPage.txtTo(driver).click();
		BookingSearchPage.txtTo(driver).sendKeys("MAD");
		Thread.sleep(3000);
		BookingSearchPage.autocomplete(driver).click();
		
		BookingSearchPage.lnktxtShowAdvSearch(driver).click();
		BookingSearchPage.txtVoucher(driver).click();
		BookingSearchPage.txtVoucher(driver).sendKeys("VCHDL19293287671294");
		BookingSearchPage.btnUseDiscount(driver).click();
		
		
	}
}
