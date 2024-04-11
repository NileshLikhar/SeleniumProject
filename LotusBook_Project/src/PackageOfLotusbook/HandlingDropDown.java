package PackageOfLotusbook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> BirthDates = driver.findElements(By.xpath("//select[@title='Day']/option"));
		
		
		BirthDates.get(30).click();
		
		List<WebElement> BirthMonth = driver.findElements(By.xpath("//select[@title=\"Month\"]/option"));
		BirthMonth.get(3);
		
		
		//Finding and matched the value of the dropdown by sending key from keyboard
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
		
		Select select = new Select(YearDropdown);
		
		select.selectByValue("1998");
	}

}
