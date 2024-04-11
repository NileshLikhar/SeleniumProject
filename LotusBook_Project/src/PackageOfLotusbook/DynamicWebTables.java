package PackageOfLotusbook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		List<WebElement> allCompanyNo = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		
		System.out.println("All companies listed " +allCompanyNo.size());
		
	}

}
