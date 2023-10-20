package coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;
@Listeners(IListenersClass.class)
public class Giftcards extends BaseTest
{
	@Test
	public void card() throws Exception
	{
		Login l=new Login();
		l.log(driver);	
		driver.findElement(By.xpath("(//a[text()='Gift Cards'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='eventName'])[1]")).sendKeys("Bday");
		driver.findElement(By.xpath("(//input[@placeholder='First Name*'])[2]")).sendKeys("Random");
		driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys("Girl");
		driver.findElement(By.xpath("//input[@name='reciEmail']")).sendKeys("randomgirl@yopmail.com");
		driver.findElement(By.xpath("(//input[@placeholder='Phone*'])[2]")).sendKeys("833-269-1066");
		driver.findElement(By.xpath("//li[@class='active ng-star-inserted']")).click();
		driver.findElement(By.xpath("//li[text()='$50']")).click();
		driver.findElement(By.xpath("//label[@for='wallet']")).click();
		driver.findElement(By.xpath("//label[@for='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[text()='PURCHASE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}