package coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseTest;

public class practice extends BaseTest
{
	@Test
	public void click() throws Exception
	{
		driver.get("https://www.demo.prolegion.com/");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("stesting1986+2@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Advait@02");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
		driver.navigate().back();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		String JobName="test-3oct";
		driver.findElement(By.xpath("(//span[@class=\"hover:shadow-md cursor-pointer py-4 items-center rounded-md flex justify-start pl-4\"])[4]")).click();
		Thread.sleep(3000);
		try
		{
			WebElement a=driver.findElement(By.xpath("//th[text()='test3october']"));
			boolean Status = a.isDisplayed();
			if(Status)
			{
				a.click();
			}
		}
		catch(NoSuchElementException e)
		{
			driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			Thread.sleep(2000);
			WebElement a=driver.findElement(By.xpath("//th[text()='test3october']"));
			a.click();
		}
	}
}
