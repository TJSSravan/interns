package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Notifications 
{
	@Test
	public void notif() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		driver.findElement(By.xpath("//a[@id='dropdownNotification']")).click();
		driver.quit();
	}
}
