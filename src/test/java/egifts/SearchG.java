package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchG 
{
	@Test
	public void search() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='form-control me-2']")).sendKeys("adidas");
		driver.quit();
	}
}
