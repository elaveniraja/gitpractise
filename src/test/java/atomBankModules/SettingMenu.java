package atomBankModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SettingMenu {
	@Test(priority = 2)
public void setting()
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atombank.co.uk/");
		
		WebElement t2 = driver.findElement(By.xpath("//a[@href='/savings/']"));
		t2.click();
		driver.close();
		
	}

}
