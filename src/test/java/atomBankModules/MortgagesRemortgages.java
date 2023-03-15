package atomBankModules;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortgagesRemortgages {
	@Test
	public void mortgage ()
	{
	
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 
		driver.get("https://www.atombank.co.uk/");
		
		WebElement mor = driver.findElement(By.xpath("//a[@href='/mortgages/'][1]"));
	
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/mortgages/'][1]")));
		
		Actions actions = new Actions(driver);
        actions.moveToElement(mor).perform();

		//WebElement t3 = driver.findElement(By.xpath("//a[@href='/mortgages/'][1]"));
		//t3.click();
		
		
		WebElement t4 = driver.findElement(By.xpath("//a[normalize-space()='First time buyer']"));
		
		
		t4.click();

		//Select s = new Select(t3);
		//s.selectByValue("Remortgage");
		


		//WebElement t5 = driver.findElement(By.xpath("//a[@href='/mortgages/moving-home/'][1]"));
		//t5.click();
		driver.close();

	}


}
