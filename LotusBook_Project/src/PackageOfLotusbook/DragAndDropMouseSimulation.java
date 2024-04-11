package PackageOfLotusbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseSimulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inventam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement drag1 = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		WebElement drop1 = driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		Thread.sleep(2000);

		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag1, drop1).perform();
	}

}
