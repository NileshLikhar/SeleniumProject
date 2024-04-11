package PackageOfLotusbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAndAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//First way: using pixels
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 450)");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -300)");

		//Second Way: Using locate the element
		Thread.sleep(2000);
		WebElement demo = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
		
		js.executeScript("arguments[0].scrollIntoView();", demo);
		
		
		//Third Way: Scrolling to the Bottom of the site 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
