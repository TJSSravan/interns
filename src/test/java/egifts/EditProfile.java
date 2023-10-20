package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditProfile 
{
	@Test
	public void edit() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		driver.findElement(By.xpath("//span[@class='john-txt']")).click();
		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
