package PackageOfLotusbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	//Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	
	//Thread.sleep(2000);
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	//click on Create new account button
	driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='1']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='2']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='-1']")).click();
	
	}

}
