package PackageOfLotusbook;

import org.testng.annotations.*;
public class TestNG3 {

	@Test(priority = -1)
	public void a() {
		System.out.println("Test case a");
	}
	
	@Test(priority = -2)
	public void b() {
		System.out.println("Test case b");
	}
	
	@Test(priority = 0)
	public void c() {
		System.out.println("Test case c");
	}
	
	@Test(priority = 1)
	public void d() {
		System.out.println("Test case d");
	}
}
