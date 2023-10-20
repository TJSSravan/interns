package qainterns.interns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Youtube
{
	@Test
	public void youtube() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Thread.sleep(2000);
		element.sendKeys("GunturKaaram");
		element.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/watch?v=V-n_w4t9eEU&pp=ygUMR3VudHVyS2FhcmFt'])[2]")).click();
		Thread.sleep(10000);
		driver.close();
	}
}
