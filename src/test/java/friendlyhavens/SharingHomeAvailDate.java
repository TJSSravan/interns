package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SharingHomeAvailDate 
{
	@Test
	public void shome() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		driver.findElement(By.xpath("//a[text()='Dates']")).click();
		driver.findElement(By.xpath("//a[@href='https://qa.friendlyhavens.com/homes/8/2023/-/2']")).click();
		driver.quit();
	}
}
