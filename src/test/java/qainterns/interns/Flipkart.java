package qainterns.interns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart 
{
	@Test
	public void flipkart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("WaterBottle");
		element.submit();
		Thread.sleep(3000);
		driver.close();
	}
}
