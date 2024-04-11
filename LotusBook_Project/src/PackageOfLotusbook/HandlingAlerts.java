package PackageOfLotusbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scrolling to the element
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0, 450)");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);

		//Accepting the Alert
		driver.switchTo().alert().accept();
		System.out.println("Alert is Accepted");
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		System.out.println("Alert is Dismissed");

		
		
		

		
	}

}
