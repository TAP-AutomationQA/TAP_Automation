package testNG_Collection;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNG_Suite3 extends TestNG_SuiteAnnotations{
	
	@BeforeMethod(alwaysRun = true)
	public void testBeforeMethod() {
		System.out.println("Before Method Successful");
	}
	@AfterMethod(alwaysRun = true)
	public void testAfterMethod() {
		System.out.println("After Method Successful");
	}

	@Test(groups = {"commercial","sprint1"})
	public void testMethod1() {
		TC01Sample tc = new TC01Sample();
		int result = tc.sumNumber(1, 2);
		Assert.assertEquals(result, 3);
		System.out.println(result);
		System.out.println("Sample Test 1  Successful");

	}

	@Test(groups = {"awards","sprint2"})
	public void testMethod2() {
		SoftAssert sa = new SoftAssert();
		TC01Sample tc = new TC01Sample();
		int result = tc.sumNumber(1, 2);
		sa.assertEquals(result, 3); //returned a fail result
//		System.out.println(result);
		sa.assertEquals(result, 3);
		System.out.println("Sample Test 2  Successful");
		sa.assertAll();

	}

	@Test(groups = {"starflights","sprint2"})
	public void testMethod3() {
		System.out.println("Sample Test 3  Successful");

	}

}
