package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout 
{
	@Test
	public void out() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		driver.findElement(By.xpath("//span[@class='john-txt']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
