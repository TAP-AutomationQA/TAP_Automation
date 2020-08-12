package sprint1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectmodel.BookingSearchPage;
import pageobjectmodel.GlobalVariables;

public class TC56MulticityRecentSearchesTest {
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
		BookingSearchPage.btnMultiCity(driver).click();
		Thread.sleep(10000);
		
		BookingSearchPage.txtMCFromFirstSegment(driver).click();
		BookingSearchPage.txtMCFromFirstSegment(driver).sendKeys("LIS");
		BookingSearchPage.txtMCToFirstSegment(driver).click();
		BookingSearchPage.txtMCToFirstSegment(driver).sendKeys("FAO");
		BookingSearchPage.forwardArrowIcon(driver).click();
		BookingSearchPage.selectDateMCCalendar(driver, 3, 4);
		
		BookingSearchPage.txtMCFromSecondSegment(driver).click();
		BookingSearchPage.txtMCFromSecondSegment(driver).sendKeys("FAO");
		BookingSearchPage.txtMCToSecondSegment(driver).click();
		BookingSearchPage.txtMCToSecondSegment(driver).sendKeys("OPO");
		BookingSearchPage.selectDateMCCalendar(driver, 4, 4);
		
		BookingSearchPage.txtMCFromThirdSegment(driver).click();
		BookingSearchPage.txtMCFromThirdSegment(driver).sendKeys("OPO");
		BookingSearchPage.txtMCToThirdSegment(driver).click();
		BookingSearchPage.txtMCToThirdSegment(driver).sendKeys("LIS");
		BookingSearchPage.selectDateMCCalendar(driver, 5, 4);
		
		BookingSearchPage.btnSelectFlights(driver).click();
		Thread.sleep(10000);
		
		BookingSearchPage.btnBook(driver).click();
		BookingSearchPage.btnLeavePage(driver).click();
		
		BookingSearchPage.txtMCFromFirstSegment(driver).click();
		BookingSearchPage.txtMCFromFirstSegment(driver).clear();
		BookingSearchPage.recentSearches(driver).click();
		Thread.sleep(3000);	
		
	}
}
