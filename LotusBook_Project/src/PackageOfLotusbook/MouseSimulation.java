package PackageOfLotusbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		//Right Click
		WebElement button1 = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
		Actions new1 = new Actions(driver);
		new1.contextClick(button1).perform();
		
		Thread.sleep(2000);
		//Double CLick
		WebElement button2 = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
		Actions new2 = new Actions(driver);
		new2.doubleClick(button2).perform();
		
		
	}

}
