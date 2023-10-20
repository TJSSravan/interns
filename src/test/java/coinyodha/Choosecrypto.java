package coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;

@Listeners(IListenersClass.class)
public class Choosecrypto extends BaseTest
{
	@Test
	public void choose() throws Exception
	{
		Login l=new Login();
		l.log(driver);		
		WebElement element= driver.findElement(By.xpath("//select[@name='sleectedCrypto']"));
		Select s=new Select(element);
		s.selectByValue("ltc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}