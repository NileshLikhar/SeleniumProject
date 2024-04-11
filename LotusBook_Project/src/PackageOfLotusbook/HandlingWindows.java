package PackageOfLotusbook;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 450)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		
		Set<String> AllWindow = driver.getWindowHandles();
		
		System.out.println(AllWindow);
		
		Iterator<String> abc = AllWindow.iterator();
		
		String win1 = abc.next();
		String win2 = abc.next();
		
		//Print the Title of Parent Window
		driver.switchTo().window(win1);
		System.out.println("Parant window ID "+win1);
		
		//Print the Title of Parent Window
		driver.switchTo().window(win2);
		System.out.println("Child window ID "+win2);
			
		driver.close();
		driver.quit();
	}

}
