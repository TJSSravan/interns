package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindaFriend 
{
	@Test
	public void find() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		driver.findElement(By.xpath("//a[text()='Friends']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Geeta");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.quit();
	}
}
