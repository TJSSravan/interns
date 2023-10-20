package coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;
@Listeners(IListenersClass.class)
public class WithdrawC extends BaseTest
{
	@Test
	public void withdraw() throws InterruptedException
	{
		Login l=new Login();
		l.log(driver);
		driver.findElement(By.xpath("//span[text()='Withdraw']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Amount*']")).sendKeys("50");
		driver.findElement(By.xpath("//button[text()='Review your cheque Details']")).click();
		driver.findElement(By.xpath("//button[text()='Withdraw']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
