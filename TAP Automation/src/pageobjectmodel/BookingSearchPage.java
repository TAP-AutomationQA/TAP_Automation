package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BookingSearchPage {
	public static WebElement element= null;
	
	
	public static WebElement loginHeader(WebDriver driver) {
		element = driver.findElement(By.cssSelector("css=.header-fallback__user-name"));
		return element;
	}
	
	public static WebElement btnRoundtrip(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".segmented-control > li:nth-child(1) > button"));
		return element;
	}
	
	public static WebElement btnOneway(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".segmented-control > li:nth-child(2) > button"));
		return element;
	}
	
	public static WebElement btnMultiCity(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".segmented-control > li:nth-child(3) > button"));
		return element;
	}
	
	public static WebElement txtFrom(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#flight-search-from"));
		return element;
	}
	
	public static WebElement autocomplete(WebDriver driver) {
		element = driver.findElement(By.cssSelector("span > .bold"));
		return element;
	}
	
	public static WebElement recentSearches(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".autocomplete__options__item--last-search > span"));
		return element;
	}
	
	public static WebElement autocompleterow(WebDriver driver,int rownum) {
		element = driver.findElement(By.cssSelector(".autocomplete__results__item:nth-child("+rownum+")"));
		return element;
	}
	
	
	public static WebElement txtTo(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#flight-search-to"));
		return element;
	}
	
	public static WebElement lnktxtAdd(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".passengers-select__cta"));
		return element;
	}
	
	public static WebElement btnAddAdtPass(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".counter-input:nth-child(1) > .counter-input__add .icon"));
		return element;
	}
	
	public static WebElement btnAddChdPass(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".counter-input:nth-child(2) > .counter-input__add .icon"));
		return element;
	}
	
	public static WebElement btnAddInfPass(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".counter-input:nth-child(3) > .counter-input__add .icon"));
		return element;
	}
	
	public static WebElement lnktxtShowAdvSearch(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div[role='button'] > .link.link--advance-search"));
		return element;
	}
	
	public static WebElement btnSelectFlights(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".button-accent"));
		return element;
	}
	
	
//	Filters
	public static WebElement rbnAllCabins(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#cabinOptions-E"));
		return element;
	}
	public static WebElement rbnEconomyOnly(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#cabinOptions-Y"));
		return element;
	}
	public static WebElement rbnExecutiveOnly(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#cabinOptions-C"));
		return element;
	}
	public static WebElement chkCheckBagInc(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".col-4:nth-child(2) .form-field--row:nth-child(1) span"));
		return element;
	}
	public static WebElement chkOnlyRefFares(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".col-4:nth-child(2) .form-field--row:nth-child(2) span"));
		return element;
	}
	public static WebElement chkSearchDirFlgOnly(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".col-4:nth-child(3) .form-field--row:nth-child(1) span"));
		return element;
	}
	public static WebElement chkOprByTAPOnly(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".col-4:nth-child(3) .form-field--row:nth-child(2) span"));
		return element;
	}
	public static WebElement drpOutboundDeparture(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#departure-from-flight-0"));
		return element;
	}
	public static WebElement drpOutboundArrival(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#arrival-to-flight-0"));
		return element;
	}
	public static WebElement drpInboundDeparture(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#departure-from-flight-1"));
		return element;
	}
	public static WebElement drpInboundArrival(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#arrival-to-flight-1"));
		return element;
	}
	public static WebElement chkStudentDiscount(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".col-4:nth-child(1) > .app-checkbox-input span"));
		return element;
	}
	public static WebElement chkResidentDiscount(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".col-4:nth-child(2) > .app-checkbox-input span"));
		return element;
	}
	public static WebElement txtVoucher(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#promocode-or-voucher"));
		return element;
	}
	public static WebElement btnUseDiscount(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".button:nth-child(1)"));
		return element;
	}
	
	
//	Ancillaries
	public static WebElement btnRentACar(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search-types:nth-child(1) .search-types__icon > .icon"));
		return element;
	}
	public static WebElement btnBookATransfer(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search-types:nth-child(2) .search-types__icon > .icon"));
		return element;
	}
	public static WebElement btnBookAHotel(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search-types:nth-child(3) .search-types__icon > .icon"));
		return element;
	}
	public static WebElement btnParking(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search-types:nth-child(4) .search-types__icon > .icon"));
		return element;
	}
	public static WebElement btnToursAndActivities(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search-types:nth-child(5) .search-types__icon > .icon"));
		return element;
	}
	public static WebElement lnkAllBookingOptions(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search-types__label:nth-child(1)"));
		return element;
	}
	
//	Multicity Section
	public static WebElement txtMCFromFirstSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector("flight-search-from-0"));
		return element;
	}
	public static WebElement txtMCToFirstSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector("flight-search-to-0"));
		return element;
	}
	public static WebElement dtpMCFirstSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".trip-line:nth-child(2) .mobile-overlay-click"));
		return element;
	}
	
	public static WebElement txtMCFromSecondSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector("flight-search-from-1"));
		return element;
	}
	public static WebElement txtMCToSecondSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector("flight-search-to-1"));
		return element;
	}
	public static WebElement dtpMCSecondSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".trip-line:nth-child(3) .mobile-overlay-click"));
		return element;
	}
	
	public static WebElement txtMCFromThirdSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector("flight-search-from-2"));
		return element;
	}
	public static WebElement txtMCToThirdSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector("flight-search-from-2"));
		return element;
	}
	public static WebElement dtpMCThirdSegment(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".trip-line:nth-child(4) .mobile-overlay-click"));
		return element;
	}
	public static WebElement forwardArrowIcon(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".arrow-forward .icon"));
		return element;
	}

	public static WebElement selectDateMCCalendar(WebDriver driver,int Row,int Col) {
		element = driver.findElement(By.cssSelector("tr:nth-child("+Row+") > .daycell:nth-child("+Col+") > .datevalue"));
		return element;
	}
	
	
	
	
// Header
	
	public static WebElement btnBook(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".header-fallback__left .is-active"));
		return element;
	}
	
//	Message box Elements
	public static WebElement btnLeavePage(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".button-main-line"));
		return element;
	}
	
// Methods
	
	public static void selectOutboundDeparture(WebDriver driver,String TimeofDay) {
		
		try {
			element = drpOutboundDeparture(driver);
			element.click();
			Select sel = new Select(element);
			if (TimeofDay.equalsIgnoreCase("Morning")) {
				sel.selectByIndex(1);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Afternoon")) {
				sel.selectByIndex(2);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Evening")) {
				sel.selectByIndex(3);
			}
		} catch (Exception e) {
			System.out.println("Time of Day not Applicable");
		}
		
	}
	public static void selectOutboundArrival(WebDriver driver,String TimeofDay) {
		
		try {
			element = drpOutboundArrival(driver);
			element.click();
			Select sel = new Select(element);
			if (TimeofDay.equalsIgnoreCase("Morning")) {
				sel.selectByIndex(1);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Afternoon")) {
				sel.selectByIndex(2);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Evening")) {
				sel.selectByIndex(3);
			}
		} catch (Exception e) {
			System.out.println("Time of Day not Applicable");
		}
		
	}
	public static void selectInboundDeparture(WebDriver driver,String TimeofDay) {
		
		try {
			element = drpInboundDeparture(driver);
			element.click();
			Select sel = new Select(element);
			if (TimeofDay.equalsIgnoreCase("Morning")) {
				sel.selectByIndex(1);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Afternoon")) {
				sel.selectByIndex(2);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Evening")) {
				sel.selectByIndex(3);
			}
		} catch (Exception e) {
			System.out.println("Time of Day not Applicable");
		}
		
	}
	public static void selectInboundArrival(WebDriver driver,String TimeofDay) {
		
		try {
			element = drpInboundArrival(driver);
			element.click();
			Select sel = new Select(element);
			if (TimeofDay.equalsIgnoreCase("Morning")) {
				sel.selectByIndex(1);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Afternoon")) {
				sel.selectByIndex(2);
			}
			
			else if (TimeofDay.equalsIgnoreCase("Evening")) {
				sel.selectByIndex(3);
			}
		} catch (Exception e) {
			System.out.println("Time of Day not Applicable");
		}
		
	}
	
	
	
}
	


//	public static void clickLoginHeader(WebDriver driver) {
//		element = loginHeader(driver);
//		element.click();
//	}
//	
//	public static void clickOneway(WebDriver driver) {
//		element = btnOneway(driver);
//		element.click();
//	}
//	
//	public static void clickRoundtrip(WebDriver driver) {
//		element = btnRoundtrip(driver);
//		element.click();
//	}
//	
//	public static void clickFrom(WebDriver driver) {
//		element = driver.findElement(By.cssSelector("#flight-search-from"));
//		element.click();
//	}
//	
//	public static void typeTextFrom(WebDriver driver,String from) {
//		element = driver.findElement(By.cssSelector("#flight-search-from"));
//		element.sendKeys(from);
//	}
//	
//	
//	public static void clickTo(WebDriver driver) {
//		element = driver.findElement(By.cssSelector("#flight-search-to"));
//		element.click();
//	}
//	
//	public static void typeTextTo(WebDriver driver,String to) {
//		element = driver.findElement(By.cssSelector("#flight-search-to"));
//		element.sendKeys(to);
//	}
//	
//	public static void clickSelectFlights(WebDriver driver) {
//		element = selectFlights(driver);
//		element.click();
//	}
//
