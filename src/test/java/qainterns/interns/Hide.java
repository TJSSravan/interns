package qainterns.interns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hide 
{
	@Test
	public void hide() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
