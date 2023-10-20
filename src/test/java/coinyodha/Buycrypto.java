package coinyodha;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;


@Listeners(IListenersClass.class)
public class Buycrypto extends BaseTest
{
	@Test
	public void buy() throws Exception
	{
		Login l=new Login();
		l.log(driver);
		driver.findElement(By.xpath("//div[@class='btn btn-teal click-btn']")).click();
		driver.findElement(By.xpath("//select[@name='selectedCurrency']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("50");
		/*driver.findElement(By.xpath("//button[text()=' Place Order ']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
