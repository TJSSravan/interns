package coinyodha;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;

@Listeners(IListenersClass.class)
public class CHistory extends BaseTest
{
	@Test
	public void history() throws Exception
	{
		
		Login l=new Login();
		l.log(driver);
		driver.findElement(By.xpath("(//span[text()='History'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='All Transaction ']")).click();
		//search by orderid
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("367726369");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		//search by amount
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}