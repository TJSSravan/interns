package egifts;


import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;

@Listeners(IListenersClass.class)
public class assertions extends BaseTest
{
	@Test
	public void assertion() throws Exception
	{
		driver.get("https://dev.365egifts.com/fe/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Logi']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("randomguy@yopmail.com");
		driver.findElement(By.xpath("(//input[@placeholder='password'])[1]")).sendKeys("randomguy");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='adidas']")).click();
		String title=driver.getTitle();
	}
}
