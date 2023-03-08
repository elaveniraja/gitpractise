package nykaaXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brand {
	@Test 
	public void carogories()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		WebDriverWait wait = new WebDriverWait(driver,20);  // explicit wait
		WebElement brand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='brands']")));
		brand.click();

		 // WebElement s1 = driver.findElement(By.xpath("//a[text()='brands']"));
		 // s1.click();
	
		driver.close();
		


	}

}
