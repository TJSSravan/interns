package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseTest;

public class highlight extends BaseTest
{
	@Test
	public void ap() throws Exception
	{
		driver.get("https://dev.365egifts.com/fe/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement d= driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]. setAttribute('style','border:2px solid red; background:yellow')", d);
	}
}
