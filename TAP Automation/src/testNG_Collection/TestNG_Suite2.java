package testNG_Collection;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestNG_Suite2  extends TestNG_SuiteAnnotations{
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("Before Method Successful");
	}
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("After Method Successful");
	}

	@Test
	public void testMethod1() {
		TC01Sample tc = new TC01Sample();
		int result = tc.sumNumber(1, 2);
		Assert.assertEquals(result, 3);
		System.out.println(result);
		System.out.println("Sample Test 1  Successful");

	}

	@Test
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

	@Test
	public void testMethod3() {
		System.out.println("Sample Test 3  Successful");

	}

}
