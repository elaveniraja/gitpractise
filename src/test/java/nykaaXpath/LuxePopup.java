package nykaaXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LuxePopup {
	@Test
	
public void skin()
{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.navigate().to("https://www.nykaa.com/sp/pay-day-sale/pay-day-sale?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gclid=Cj0KCQiA0oagBhDHARIsAI-BbgdLaMKHGRluuFBVO73qiSKlO8RW850GVbtpUMbe7wN7j-lYJHk4cwEaArAFEALw_wcB");
		WebElement skin = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/skin-native-desktop/skin']"));
		
		skin.click();
		driver.close();
		
		
	
}
}
