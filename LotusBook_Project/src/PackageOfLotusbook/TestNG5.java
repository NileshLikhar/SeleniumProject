package PackageOfLotusbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void A() {
		Assert.assertTrue(3 > 12);
		System.out.println("Hello A Test Case");
	}
	
	@Test(dependsOnMethods = "A")
	public void B() {
		System.out.println("Hello B Test Case");
	}
}
