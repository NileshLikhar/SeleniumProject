package PackageOfLotusbook;

import org.testng.annotations.*;
public class TestNG4 {

	@Test(invocationCount = 4)
	public void a() {
		System.out.println("Test case a");
	}
	
	@Test(enabled = true)
	public void b() {
		System.out.println("Test case b");
	}
	
	@Test(enabled = false)
	public void c() {
		System.out.println("Test case c");
	}
	
	@Test
	public void d() {
		System.out.println("Test case d");
	}
}
