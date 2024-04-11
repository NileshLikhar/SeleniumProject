package PackageOfLotusbook;

import org.testng.annotations.*;

public class OrderOfTestNG {

	@Test
	public void Test1() {
		System.out.println("Hello Test Case 1");
	}
	
//	@Test
//	public void Test2() {
//		System.out.println("Hello Test Case 2");
//	}
	@BeforeSuite
    public void Test3_1() {
		System.out.println("Hello Test Case 2.1");
	} 
	
	@AfterSuite
	public void Test3() {
		System.out.println("Hello Test Case 3");
	}
	
	@BeforeTest
	public void Test4() {
		System.out.println("Hello Test Case 4");
	}
	
	@AfterTest
	public void Test5() {
		System.out.println("Hello Test Case 5");
	}
	
	@BeforeClass
	public void Test6() {
		System.out.println("Hello Test Case 6");
	} 
	
	@AfterClass
	public void Test7() {
		System.out.println("Hello Test Case 7");
	}
	
	@BeforeMethod
	public void Test8() {
		System.out.println("Hello Test Case 8");
	}
	
	@AfterMethod
	public void Test9() {
		System.out.println("Hello Test Case 9");
	}
}
