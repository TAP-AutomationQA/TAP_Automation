package testNG_Collection;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_SuiteAnnotations{
	

	@BeforeClass
	public void beforeClass() {
		System.out.println("Jusmiyo");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("susmaryosep");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Nak ng tokwa");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("ambot");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Juskopo");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("InAy ko po");
	}

}
