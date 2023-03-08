package atomBankModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortgagesMenu {
@Test(priority = 3)
	public void mortgages()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atombank.co.uk/");
		WebElement t3 = driver.findElement(By.xpath("//a[@href='/mortgages/'][1]"));
		t3.click();
		driver.close();
	
		
		
	}
}
