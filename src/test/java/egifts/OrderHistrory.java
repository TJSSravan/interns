package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderHistrory 
{
	@Test
	public void history() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		driver.findElement(By.xpath("//span[text()='Order History']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
