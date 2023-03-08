package atomBankModules;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortgagesRemortgages {
	@Test(priority = 4)
	public void mormovemenu() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.atombank.co.uk/");
		

		WebElement t3 = driver.findElement(By.xpath("//a[@href='/mortgages/'][1]"));
		
		t3.click();
		//WebElement t4 = driver.findElement(By.xpath("//h1[text()='First time buyer mortgages with Atom']"));
		//Thread.sleep(1000);
		//t4.click();

		//Select s = new Select(t3);
		//s.selectByValue("Remortgage");
		


		//WebElement t5 = driver.findElement(By.xpath("//a[@href='/mortgages/moving-home/'][1]"));
		//t5.click();
		//driver.close();

	}


}
