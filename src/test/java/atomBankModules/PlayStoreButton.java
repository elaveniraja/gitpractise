package atomBankModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayStoreButton {
@Test(priority = 1)
		public void playStore()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atombank.co.uk/");
		WebElement t1 = driver.findElement(By.xpath("//a[@class='play-store-download__Download-sc-44b779-0 hivKgq'][1]"));
		t1.click();
		
		driver.navigate().back();
		driver.close();
		}
	
		
		
	}
	
	


