package coinyodha;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;


//@Listeners(IListenersClass.class)
public class Signup extends BaseTest
{
	@Test
	public void sign() throws Exception
	{
		driver.get("https://qa.coinyodha.com/fe/home");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Random");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Girl");
		Random ra=new Random();
		int number=ra.nextInt(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("randomgirl"+number+"@yopmail.com");
		driver.findElement(By.xpath("//input[@name='confirmEmail']")).sendKeys("randomgirl"+number+"@yopmail.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567889");
		driver.findElement(By.xpath("//input[@name='confirmphone']")).sendKeys("1234567889");
		driver.findElement(By.xpath("//select[@id='gender']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Street Address*']")).sendKeys("Road no1");
		driver.findElement(By.xpath("//select[@name='country']")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//select[@id='state']"));
		element.click();
		Select s=new Select(element);
		s.selectByValue("Alabama");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//select[@id='city']"));
		element1.click();
		Select s1=new Select(element1);
		s1.selectByValue("Abernant");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@formcontrolname='postalcode']")).sendKeys("00001");
		driver.findElement(By.xpath("//input[@placeholder='Select Date of Birth*']")).sendKeys("10/10/1999");
	}
}